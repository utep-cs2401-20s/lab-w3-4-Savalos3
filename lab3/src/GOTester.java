import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class GOTester {

    @Test
    public void testGOM() { //Neighbors Game of life test cases

        int[][] A = {{1, 0, 1},
                     {1, 1, 0},
                     {1, 1, 1}};

        GameOfLife test = new GameOfLife(A);

        int i = 1;
        int j = 1;

        assertEquals(6, test.neighbors(i, j));
    }

    @Test
    public void testGOM1() {
        int[][] A = {{0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 1, 1, 1, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0}
        };
        GameOfLife test = new GameOfLife(A);

        int i = 1;
        int j = 3;

        assertEquals(5, test.neighbors(i, j));
    }

    @Test
    public void testGOM2() {
        int[][] A = {{1, 0, 1},
                     {0, 1, 0},
                     {0, 0, 1}};

        GameOfLife test = new GameOfLife(A);

        int i = 0;
        int j = 2;

        assertEquals(1, test.neighbors(i, j));
    }

    @Test
    public void testGOM3() {
        int[][] A = {{1, 0, 1, 0, 0},
                     {0, 1, 0, 0, 0},
                     {0, 0, 0, 1, 0},
                     {1, 0, 1, 1, 1},
                     {0, 0, 0, 0, 1}
        };
        GameOfLife test = new GameOfLife(A);

        int i = 3;
        int j = 3;

        assertEquals(4, test.neighbors(i, j));
    }

    @Test
    public void testGOM4() {
        int[][] A = {{1, 0, 1, 0, 0, 1 ,0},
                     {0, 1, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 0, 0},
                     {1, 0, 1, 1, 1, 0, 1},
                     {1, 1, 1, 0, 1, 1, 1},
                     {1, 1, 1, 1, 0, 0, 1},
                     {1, 1, 1, 1, 0, 1, 1}
        };
        GameOfLife test = new GameOfLife(A);

        int i = 5;
        int j = 1;

                assertEquals(8, test.neighbors(i, j));
    }
    @Test
    public void testGOM5() { // OneStep Game of life test cases
        int[][] A = {{0, 0, 1, 0},
                     {0, 1, 0, 0},
                     {1, 0, 0, 0},
                     {0, 0, 0, 0}
        };
        int[][] B = {{0, 0, 0, 0},
                     {0, 1, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0}
                                };
        GameOfLife test = new GameOfLife(A);
        test.oneStep();
        assertArrayEquals(B, test.getBoard());
    }
    @Test
    public void testGOM6() {
        int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0 ,0 ,0},
                     {0, 0, 0, 0, 1, 0, 0, 0, 0},
                     {0, 0, 0, 1, 1, 1, 0, 0, 0},
                     {0, 0, 1, 0, 1, 0, 1, 0, 0},
                     {0, 0, 1, 0, 1, 0, 1, 0, 0},
                     {0, 0, 0, 1, 1, 1, 0, 0, 0},
                     {0, 0, 0, 0, 1, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        int[][] B = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0 ,0 ,0},
                     {0, 0, 0, 1, 1, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 1, 0, 0, 0, 1, 0, 0},
                     {0, 0, 1, 0, 0, 0, 1, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 1, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        GameOfLife test = new GameOfLife(A);
        test.oneStep();
        assertArrayEquals(B, test.getBoard());
    }
    @Test
    public void testGOM7() {
        int[][] A = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 1, 1, 1, 0},
                     {0, 1, 1, 1, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}
        };
        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 0},
                     {0, 1, 0, 0, 1, 0},
                     {0, 1, 0, 0, 1, 0},
                     {0, 0, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}
        };
        GameOfLife test = new GameOfLife(A);
        test.oneStep();
        assertArrayEquals(B, test.getBoard());
    }
    @Test
    public void testGOM8() {
        int[][] A = {{0, 0, 0, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 0, 0, 0}
        };
        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 1, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 0, 0, 0}
        };
        GameOfLife test = new GameOfLife(A);
        test.oneStep();
        assertArrayEquals(B, test.getBoard());
    }
    @Test
    public void testGOM9() {
        int[][] A = {{1, 1, 0, 1, 1},
                     {0, 1, 1, 1, 0},
                     {0, 1, 0, 1, 1},
                     {1, 1, 1, 1, 0},
                     {0, 0, 0, 1, 1}
        };
        int[][] B = {{0, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0}
        };
        GameOfLife test = new GameOfLife(A);
        test.oneStep();
        assertArrayEquals(B, test.getBoard());
    }

    @Test
    public void testGOM10() { // Evolution Game of life test cases
        int[][] A = {{0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {1, 1, 0, 0}
        };
        int[][] B = {{0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0}
        };
        GameOfLife test = new GameOfLife(A);
        test.evolution(1);
        assertArrayEquals(B, test.getBoard());
    }


    @Test
    public void testGOM11() {
        int[][] A = {{0, 0, 1, 0, 0},
                     {0, 0, 1, 0, 0},
                     {1, 1, 1, 1, 1},
                     {0, 0, 1, 0, 0},
                     {0, 0, 1, 0, 0}
        };
        int[][] B = {{0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0}
        };
        GameOfLife test = new GameOfLife(A);
        test.evolution(2);
        assertArrayEquals(B, test.getBoard());
    }


    @Test
    public void testGOM12() {
        int[][] A = {{0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {1, 1, 0, 0},
                     {1, 1, 0, 0}
        };
        int[][] B = {{0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {1, 1, 0, 0},
                     {1, 1, 0, 0}
        };
        GameOfLife test = new GameOfLife(A);
        test.evolution(4);
        assertArrayEquals(B, test.getBoard());
    }


    @Test
    public void testGOM13() {
        int[][] A = {{0, 0, 1, 0, 1},
                     {0, 0, 1, 1, 1},
                     {0, 1, 0, 1, 1},
                     {1, 0, 1, 0, 0},
                     {0, 0, 0, 1, 1}
        };
        int[][] B = {{0, 0, 1, 0, 0},
                     {1, 1, 1, 0, 0},
                     {1, 0, 0, 0, 0},
                     {1, 0, 0, 1, 0},
                     {0, 1, 1, 1, 0}
        };
        GameOfLife test = new GameOfLife(A);
        test.evolution(3);
        assertArrayEquals(B, test.getBoard());
    }


    @Test
    public void testGOM14() {
        int[][] A = {{0, 0, 1, 0, 1, 0},
                     {0, 0, 1, 1, 1, 0},
                     {0, 1, 0, 1, 1, 0},
                     {1, 0, 1, 0, 0, 0},
                     {0, 0, 0, 1, 1, 0},
                     {1, 0, 0, 1, 1, 0}
        };
        int[][] B = {{0, 0, 0, 0, 1, 0},
                     {1, 0, 0, 0, 0, 1},
                     {1, 0, 0, 0, 1, 0},
                     {1, 0, 1, 0, 1, 0},
                     {0, 1, 1, 0, 1, 0},
                     {0, 1, 1, 0, 1, 0}
        };
        GameOfLife test = new GameOfLife(A);
        test.evolution(4);
        assertArrayEquals(B, test.getBoard());
    }

    @Test
    public void testTGOM() { //Neighbors Torus Game of life test cases

        int[][] A = {{1, 0, 1},
                     {1, 1, 0},
                     {1, 1, 1}};

        TorusGameOfLife test = new TorusGameOfLife(A);

        int i = 1;
        int j = 1;

        assertEquals(6, test.neighbors(i, j));
    }

    @Test
    public void testTGOM1() {
        int[][] A = {{0, 0, 1, 0, 0},
                     {0, 0, 1, 0, 0},
                     {1, 1, 1, 1, 1},
                     {0, 0, 1, 0, 0},
                     {0, 0, 1, 0, 0}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);

        int i = 1;
        int j = 2;

        assertEquals(4, test.neighbors(i, j));
    }

    @Test
    public void testTGOM2() {
        int[][] A = {{1, 1, 0, 1, 1},
                     {0, 1, 1, 1, 0},
                     {0, 1, 0, 1, 1},
                     {1, 1, 1, 1, 0},
                     {0, 0, 0, 1, 1}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);

        int i = 0;
        int j = 3;

        assertEquals(5, test.neighbors(i, j));
    }

    @Test
    public void testTGOM3() {
        int[][] A = {{1, 0, 1, 0, 0},
                     {0, 1, 0, 0, 0},
                     {0, 0, 0, 1, 0},
                     {1, 0, 1, 1, 1},
                     {0, 0, 0, 0, 1}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);

        int i = 4;
        int j = 4;

        assertEquals(4, test.neighbors(i, j));
    }

    @Test
    public void testTGOM4() {
        int[][] A = {{1, 0, 1, 0, 0, 1 ,1},
                     {0, 1, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 0, 0},
                     {1, 0, 1, 1, 1, 0, 1},
                     {1, 1, 1, 0, 1, 1, 1},
                     {1, 1, 1, 1, 0, 0, 1},
                     {1, 1, 1, 1, 0, 1, 1}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);

        int i = 0;
        int j = 5;

        assertEquals(3, test.neighbors(i, j));
    }
    @Test
    public void testTGOM5() { // OneStep Torus Game of life test cases
        int[][] A = {{0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 1, 1, 1, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0}
        };
        int[][] B = {{0, 0, 0, 0, 0},
                     {0, 0, 1, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 1, 0, 0},
                     {0, 0, 0, 0, 0}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);
        test.oneStep();
        assertArrayEquals(B, test.getBoard());
    }
    @Test
    public void testTGOM6() {
        int[][] A = {{1, 1, 1, 1},
                     {1, 0, 0, 1},
                     {1, 0, 0, 1},
                     {1, 1, 1, 1}
        };
        int[][] B = {{0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);
        test.oneStep();
        assertArrayEquals(B, test.getBoard());
    }
    @Test
    public void testTGOM7() {
        int[][] A = {{0, 0, 1, 0, 0},
                     {0, 0, 1, 0, 0},
                     {1, 1, 1, 1, 1},
                     {0, 0, 1, 0, 0},
                     {0, 0, 1, 0, 0}
        };
        int[][] B = {{0, 1, 1, 1, 0},
                     {1, 0, 0, 0, 1},
                     {1, 0, 0, 0, 1},
                     {1, 0, 0, 0, 1},
                     {0, 1, 1, 1, 0}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);
        test.oneStep();
        assertArrayEquals(B, test.getBoard());
    }
    @Test
    public void testTGOM8() {
        int[][] A = {{1, 0, 1, 0, 1},
                     {0, 0, 0, 1, 0},
                     {1, 0, 0, 1, 1},
                     {0, 0, 1, 0, 0},
                     {1, 0, 0, 0, 0}
        };
        int[][] B = {{1, 1, 0, 1, 1},
                     {0, 1, 1, 0, 0},
                     {0, 0, 1, 1, 1},
                     {1, 1, 0, 1, 0},
                     {1, 0, 0, 1, 1}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);
        test.oneStep();
        assertArrayEquals(B, test.getBoard());
    }
    @Test
    public void testTGOM9() {
        int[][] A = {{1, 1, 0, 1, 1},
                     {0, 1, 1, 1, 0},
                     {0, 1, 0, 1, 1},
                     {1, 1, 1, 1, 0},
                     {0, 0, 0, 1, 1}
        };
        int[][] B = {{0, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);
        test.oneStep();
        assertArrayEquals(B, test.getBoard());
    }

    @Test
    public void testTGOM10() { // Evolution Torus Game of life test cases
        int[][] A = {{0, 0, 1},
                     {1, 0, 0},
                     {1, 1, 1}};
        int[][] B = {{0, 0, 0},
                     {0, 0, 0},
                     {0, 0, 0}};
        TorusGameOfLife test = new TorusGameOfLife(A);
        test.evolution(2);
        assertArrayEquals(B, test.getBoard());
    }


    @Test
    public void testTGOM11() {
        int[][] A = {{1, 0, 1, 0},
                     {0, 1, 0, 1},
                     {1, 0, 1, 0},
                     {1, 1, 1, 1}
        };
        int[][] B = {{0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);
        test.evolution(1);
        assertArrayEquals(B, test.getBoard());
    }


    @Test
    public void testTGOM12() {
        int[][] A = {{1, 0, 0, 1},
                     {0, 1, 0, 0},
                     {1, 1, 1, 0},
                     {0, 1, 0, 1}
        };
        int[][] B = {{0, 0, 0, 0},
                     {1, 0, 1, 0},
                     {0, 0, 0, 0},
                     {1, 0, 1, 0}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);
        test.evolution(2);
        assertArrayEquals(B, test.getBoard());
    }


    @Test
    public void testTGOM13() {
        int[][] A = {{0, 0, 1, 0, 1},
                     {0, 0, 1, 1, 1},
                     {0, 1, 0, 1, 1},
                     {1, 0, 1, 0, 0},
                     {0, 0, 0, 1, 1}
        };
        int[][] B = {{0, 0, 1, 0, 1},
                     {1, 1, 1, 0, 1},
                     {1, 1, 1, 1, 1},
                     {0, 0, 0, 1, 1},
                     {1, 0, 1, 0, 0}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);
        test.evolution(3);
        assertArrayEquals(B, test.getBoard());
    }


    @Test
    public void testTGOM14() {
        int[][] A = {{0, 0, 1, 0, 1, 0},
                     {0, 0, 1, 1, 1, 0},
                     {0, 1, 0, 1, 1, 0},
                     {1, 0, 1, 0, 0, 0},
                     {0, 0, 0, 1, 1, 0},
                     {1, 0, 0, 1, 1, 0}
        };
        int[][] B = {{1, 1, 1, 1, 1, 1},
                     {1, 1, 1, 1, 1, 1},
                     {0, 0, 0, 1, 0, 1},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1},
                     {1, 0, 0, 0, 0, 1}
        };
        TorusGameOfLife test = new TorusGameOfLife(A);
        test.evolution(4);
        assertArrayEquals(B, test.getBoard());
    }

}

