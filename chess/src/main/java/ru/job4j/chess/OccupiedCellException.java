package ru.job4j.chess;

public class OccupiedCellException extends Exception {
    public OccupiedCellException(String format) {
        super(format);
    }
}
