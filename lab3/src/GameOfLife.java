public class GameOfLife {

    private int[][] Previous;
    private int[][] Board;
    private int Size;

    public GameOfLife() {
    }

    public GameOfLife(int Size) {//, int[][] Board, int[][] Previous

        Board = new int[Size][Size];
        Previous = new int[Size][Size];

    }

    public GameOfLife(int[][] data) {
        Size = data.length;
        Previous = new int[Size][Size];
        Board = new int[Size][Size];
    }

    public void setPrevious(int[][] Previous) {
        this.Previous = Previous;
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

    public int[][] getBoard() {
        return Board;
    }

    public int getSize() {
        return Size;
    }

    public void oneStep() {
        Previous = Board;
        boolean f = false;
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                Board[i][j] = 1;
                int a = neighbors(i,j);
                if (a == 0) {
                    Board[i][j] = 0;
                }

            }
        }
    }

    public int neighbors(int i ,int j) {
        int count = 0;
        if(Board[i][j] == 0){
            if(Board[i][j+1] == 1 && Board[i][j+1] != Board[i][Size] ){ count++;}
            if(Board[i][j-1] == 1 && Board[i][j-1] != Board[i][-1]){ count++;}
            if(Board[i+1][j] == 1 && Board[i+1][j] != Board[Size][j]){ count++;}
            if(Board[i-1][j+1] == 1 && Board[i-1][j+1] != Board[-1][j] && Board[i-1][j+1] != Board[i][Size]){ count++;}
            if(Board[i-1][j-1] == 1 && Board[i-1][j-1] != Board[-1][j] && Board[i-1][j-1] != Board[i][-1]){ count++;}
            if(Board[i+1][j+1] == 1 && Board[i-1][j+1] != Board[i][Size] && Board[i-1][j+1] != Board[Size][j]){ count++;}
            if(Board[i+1][j-1] == 1 && Board[i-1][j+1] != Board[Size][j] && Board[i-1][j-1] != Board[i][-1]){ count++;}
             return count;
        }if(Board[i][j] == 1){
            if(Board[i][j+1] == 1 && Board[i][j+1] != Board[i][Size] ){ count++;}
            if(Board[i][j-1] == 1 && Board[i][j-1] != Board[i][-1]){ count++;}
            if(Board[i+1][j] == 1 && Board[i+1][j] != Board[Size][j]){ count++;}
            if(Board[i-1][j+1] == 1 && Board[i-1][j+1] != Board[-1][j] && Board[i-1][j+1] != Board[i][Size]){ count++;}
            if(Board[i-1][j-1] == 1 && Board[i-1][j-1] != Board[-1][j] && Board[i-1][j-1] != Board[i][-1]){ count++;}
            if(Board[i+1][j+1] == 1 && Board[i-1][j+1] != Board[i][Size] && Board[i-1][j+1] != Board[Size][j]){ count++;}
            if(Board[i+1][j-1] == 1 && Board[i-1][j+1] != Board[Size][j] && Board[i-1][j-1] != Board[i][-1]){ count++;}
            return count;
        }
        return count;
        }


    }
