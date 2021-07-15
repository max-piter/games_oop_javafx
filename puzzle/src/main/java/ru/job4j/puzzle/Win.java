package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (checkVertical(board) && checkHorisontal(board)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }


    public static boolean checkHorisontal(int[][] board) {
        boolean rsl = true;
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
        return rsl;
    }

    public static boolean checkVertical(int[][] board) {
        boolean rsl = true;
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
        return rsl;
    }





}
