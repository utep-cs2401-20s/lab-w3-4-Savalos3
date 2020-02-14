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
        Board = data;
        Previous = Board;
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
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {

                int a = neighbors(i,j);
                if(Previous[i][j] == 1 ){
                    Board[i][j] = 0;
                    if (a == 2 || a == 3) {
                        Board[i][j] = 1;
                    }

                }else{
                    if (a == 3) {
                        Board[i][j] = 1;
                    }
                }
            }
        }
    }

    public int neighbors(int i ,int j) {
        int count = 0;

            if(i==0 && j ==0){
                if(Previous[i][j+1] == 1 ){ count++;}
                if(Previous[i+1][j] == 1 ){ count++;}
                if(Previous[i+1][j+1] == 1 ){ count++;}
            }
            if(i==0 && j!= 0 && j!= Size-1){
                if(Previous[i][j-1] == 1 ){ count++;}
                if(Previous[i+1][j-1] == 1 ){ count++;}
                if(Previous[i+1][j] == 1 ){ count++;}
                if(Previous[i+1][j+1] == 1 ){ count++;}
                if(Previous[i][j+1] == 1 ){ count++;}
            }
            if(i == 0 && j == Size -1){
                if(Previous[i][j-1] == 1 ){ count++;}
                if(Previous[i+1][j-1] == 1 ){ count++;}
                if(Previous[i+1][j] == 1 ){ count++;}
            }
            if(i != 0 && j== 0 && i != Size -1){
                if(Previous[i-1][j] == 1 ){count++;}
                if(Previous[i-1][j+1] == 1 ){ count++;}
                if(Previous[i][j+1] == 1 ){ count++;}
                if(Previous[i+1][j+1] == 1 ){ count++;}
                if(Previous[i+1][j] == 1 ){ count++;}
            }
            if(i == Size - 1 && j ==0){
                if(Previous[i-1][j] == 1 ){count++;}
                if(Previous[i-1][j+1] == 1 ){ count++;}
                if(Previous[i][j+1] == 1 ){ count++;}
            }
            if(i == Size - 1 && j !=0 && j!= Size - 1){
                if(Previous[i][j-1] == 1 ){ count++;}
                if(Previous[i-1][j-1] == 1 ){ count++;}
                if(Previous[i-1][j] == 1 ){count++;}
                if(Previous[i-1][j+1] == 1 ){ count++;}
                if(Previous[i][j+1] == 1 ){ count++;}
            }
            if(i == Size - 1 && j== Size - 1){
                if(Previous[i][j-1] == 1 ){ count++;}
                if(Previous[i-1][j-1] == 1 ){ count++;}
                if(Previous[i-1][j] == 1 ){count++;}
            }
            if(i != 0 && j == Size -1 && i != Size -1){
                if(Previous[i+1][j] == 1 ){ count++;}
                if(Previous[i+1][j-1] == 1 ){ count++;}
                if(Previous[i][j-1] == 1 ){ count++;}
                if(Previous[i-1][j-1] == 1 ){ count++;}
                if(Previous[i-1][j] == 1 ){count++;}
            }if(i != 0 && j != 0 && i != Size -1 && j!= Size -1){
            if(Previous[i][j+1] == 1 ){ count++;}
            if(Previous[i][j-1] == 1 ){ count++;}
            if(Previous[i+1][j] == 1 ){ count++;}
            if(Previous[i-1][j+1] == 1 ){ count++;}
            if(Previous[i-1][j-1] == 1 ){ count++;}
            if(Previous[i-1][j] == 1 ){count++;}
            if(Previous[i+1][j+1] == 1 ){ count++;}
            if(Previous[i+1][j-1] == 1 ){ count++;}
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
//5 evolution 5 neighbors // 5 onestep