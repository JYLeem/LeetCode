class Solution:
    def solve(self, board: list[list[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        rows, cols = len(board), len(board[0])
        mov = [(1,0), (-1,0), (0,1), (0,-1)]
        visited = [[False] * cols for _ in range(rows)]
        q = deque()
        flag = False

        for i in range(rows):
            for j in range(cols):
                if not visited[i][j] and board[i][j] == 'O':
                    q.append((i, j))
                    visited[i][j] = True
                    tmp = []
                    flag = False

                    while q:
                        x,y = q.popleft()
                        tmp.append((x,y))
                        if x == 0 or x == rows-1 or y == 0 or y == cols-1:
                            flag = True
                        
                        for dx,dy in mov:
                            nx = x + dx
                            ny = y + dy
                            if (0 <= nx < rows and 0 <= ny < cols and not visited[nx][ny] and board[nx][ny] == 'O'):
                                q.append((nx,ny))
                                visited[nx][ny] = True
                                tmp.append((nx,ny))

                    if not flag:
                        for cx, cy in tmp:
                            board[cx][cy] = 'X'





        