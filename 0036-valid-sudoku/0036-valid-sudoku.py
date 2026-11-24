class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:
        # 2차원 배열로 순환해서 돈다? 3x3 은 어떻게 해결할건가?
        # 모두 visited 배열 만들어서 확인 
        # String type 이기 때문에 int 로 바꿔줘야 하며, split 으로 나눠 줘야한다. 
        rows = [[False] * 9 for _ in range(9)]
        cols = [[False] * 9 for _ in range(9)]
        mat = [[False] * 9 for _ in range(9)]
        for r in range(9):
            for c in range(9):
                if '1' <= board[r][c] <= '9':
                    # row 확인  
                    if rows[r][int(board[r][c]) - 1]:
                        return False
                    rows[r][int(board[r][c]) - 1] = True
                    
                    # 3x3 확인
                    box = (r // 3) * 3 + (c // 3)
                    if mat[box][int(board[r][c]) - 1]:
                        return False
                    mat[box][int(board[r][c]) - 1] = True
            
                # col 확인
                if '1' <= board[c][r] <= '9':
                    if cols[int(board[c][r]) - 1][r]:
                        return False
                    cols[int(board[c][r]) - 1][r] = True
        return True