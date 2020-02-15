public class GameOfLife {

    protected int[][] Previous;
    protected int[][] Board;
    protected int Size;

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
        Board = data;
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
        int[][] future =new int[Size][Size];
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                Previous[i][j] = Board[i][j];
                int a = neighbors(i,j);
                if(Board[i][j] == 1 ){
                    future[i][j] = 0;
                    if (a == 2 || a == 3) {
                        future[i][j] = 1;
                    }

                }else{
                    future[i][j] = 0;
                    if (a == 3) {
                        future[i][j] = 1;
                    }
                }

            }
        }
        Board = future;
    }

    public int neighbors(int i ,int j) {
        int count = 0;

            if(i==0 && j ==0){
                if(Board[i][j+1] == 1 ){ count++;}
                if(Board[i+1][j] == 1 ){ count++;}
                if(Board[i+1][j+1] == 1 ){ count++;}
            }
            if(i==0 && j!= 0 && j!= Size-1){
                if(Board[i][j-1] == 1 ){ count++;}
                if(Board[i+1][j-1] == 1 ){ count++;}
                if(Board[i+1][j] == 1 ){ count++;}
                if(Board[i+1][j+1] == 1 ){ count++;}
                if(Board[i][j+1] == 1 ){ count++;}
            }
            if(i == 0 && j == Size -1){
                if(Board[i][j-1] == 1 ){ count++;}
                if(Board[i+1][j-1] == 1 ){ count++;}
                if(Board[i+1][j] == 1 ){ count++;}
            }
            if(i != 0 && j== 0 && i != Size -1){
                if(Board[i-1][j] == 1 ){count++;}
                if(Board[i-1][j+1] == 1 ){ count++;}
                if(Board[i][j+1] == 1 ){ count++;}
                if(Board[i+1][j+1] == 1 ){ count++;}
                if(Board[i+1][j] == 1 ){ count++;}
            }
            if(i == Size - 1 && j ==0){
                if(Board[i-1][j] == 1 ){count++;}
                if(Board[i-1][j+1] == 1 ){ count++;}
                if(Board[i][j+1] == 1 ){ count++;}
            }
            if(i == Size - 1 && j !=0 && j!= Size - 1){
                if(Board[i][j-1] == 1 ){ count++;}
                if(Board[i-1][j-1] == 1 ){ count++;}
                if(Board[i-1][j] == 1 ){count++;}
                if(Board[i-1][j+1] == 1 ){ count++;}
                if(Board[i][j+1] == 1 ){ count++;}
            }
            if(i == Size - 1 && j== Size - 1){
                if(Board[i][j-1] == 1 ){ count++;}
                if(Board[i-1][j-1] == 1 ){ count++;}
                if(Board[i-1][j] == 1 ){count++;}
            }
            if(i != 0 && j == Size -1 && i != Size -1){
                if(Board[i+1][j] == 1 ){ count++;}
                if(Board[i+1][j-1] == 1 ){ count++;}
                if(Board[i][j-1] == 1 ){ count++;}
                if(Board[i-1][j-1] == 1 ){ count++;}
                if(Board[i-1][j] == 1 ){count++;}
            }if(i != 0 && j != 0 && i != Size -1 && j!= Size -1){
            if(Board[i][j+1] == 1 ){ count++;}
            if(Board[i][j-1] == 1 ){ count++;}
            if(Board[i+1][j] == 1 ){ count++;}
            if(Board[i-1][j+1] == 1 ){ count++;}
            if(Board[i-1][j-1] == 1 ){ count++;}
            if(Board[i-1][j] == 1 ){count++;}
            if(Board[i+1][j+1] == 1 ){ count++;}
            if(Board[i+1][j-1] == 1 ){ count++;}
            }
            return count;
    }
    public void evolution(int x) {

        while (x > 0){
            oneStep();
            x--;
        }
    }
}