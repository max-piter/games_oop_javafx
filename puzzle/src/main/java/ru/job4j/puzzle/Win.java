package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        //проверяем горизонталь
        for (int i = 0; i < board.length; i++) {
                if (board[i][0] == 1) {
                    for (int k = 1; k < board.length; k++) {
                        if (board[i][k] != 1) {
                            rsl = false;
                            break;
                        }
                    }
                }
        }

        // проверяем вертикаль
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == 1) {
                for (int j = 1; j < board.length; j++) {
                    if (board[j][i] != 1) {
                        rsl = false;
                        break;
                    }
                }
            }
        }

        // если по всем краям нет удиниц
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] != 1) {
                if (board[i][0] != 1){
                    rsl = false;
                    break;
                }
            }
        }

        return rsl;
    }
}
