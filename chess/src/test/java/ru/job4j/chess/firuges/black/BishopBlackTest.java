package ru.job4j.chess.firuges.black;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Assert.assertEquals(bishopBlack.position(), Cell.A1);
    }
    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell expected = bishopBlack.copy(Cell.A2).position();
        Assert.assertEquals(expected, Cell.A2);
    }
    @Test
    public void testIsDiagonalFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell dest = Cell.C4;
        Assert.assertFalse(bishopBlack.isDiagonal(bishopBlack.position(), dest));
    }
    @Test
    public void testIsDiagonalTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell dest = Cell.C3;
        Assert.assertTrue(bishopBlack.isDiagonal(bishopBlack.position(), dest));
    }
    @Test
    public void bishopBlackWayC1ToG5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cells = bishopBlack.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(cells, expected);
    }




}