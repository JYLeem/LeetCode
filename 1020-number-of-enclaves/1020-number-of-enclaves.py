class Solution:
    def numEnclaves(self, grid: list[list[int]]) -> int:
        rows, cols = len(grid), len(grid[0])
        mov = [(1,0), (-1,0), (0,1), (0,-1)]
        visited = [[False]*cols for _ in range(rows)] 
        ans = 0
        q = deque()

        for r in range(rows):
            for c in range(cols):
                if not visited[r][c] and grid[r][c] == 1:
                    q.append((r,c))
                    visited[r][c] = True
                    tmp = 1
                    flag = False

                    while q:
                        x,y = q.popleft()
                        if (x == 0 or y == 0 or x == rows-1 or y == cols-1):
                            flag = True
                        for dx, dy in mov:
                            nx = x + dx
                            ny = y + dy
                            if (0 <= nx < rows and 0 <= ny < cols and grid[nx][ny] == 1 and not visited[nx][ny]):
                                visited[nx][ny] = True
                                q.append((nx,ny))
                                tmp += 1
                    
                    if not flag:
                        ans += tmp


        return ans
        