// 36. Valid Sudoku

class Solution {
    public boolean isValidSudoku(char[][] board) {
    HashSet set = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            char num = board[i][j];
            if (num != '.')
                if (!set.add(num + "row" + i) ||
                    !set.add(num + "column" + j) ||
                    !set.add(num + "block" + i/3 + j/3))
                    return false;
        }
    }
    return true;
}
}
