public class GameOfLife {

    public int[][] Previous;
    public int[][] Board;
    public int Size;

    public GameOfLife() {}

    public GameOfLife(int Size) {//, int[][] Board, int[][] Previous

        int[][] Board1 = new int [Size][Size];
        Board = Board1;
        int[][] Previous1 = new int [Size][Size];
        Previous = Previous1;

    }
    public GameOfLife(int[][] data) {
        Previous = data;
    }

    public void setPrevious(int[][] Previous) {
        this.Previous= Previous;
    }
    public void setBoard(int[][] Board) {
        this.Board = Board;
    }
    public void setSize(int Size) {
        this.Size = Size;
    }

    public int[][] getPrevious() {
        return Previous;
    }

    public int[][] getBoard(){
        return Board;
    }
    public int getSize() {
        return Size;
    }

}

