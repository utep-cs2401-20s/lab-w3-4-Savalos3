
public class TorusGameOfLife extends GameOfLife{

    public TorusGameOfLife() {
    }

    public TorusGameOfLife(int Size) {

        Board = new int[Size][Size];
        Previous = new int[Size][Size];

    }

    public TorusGameOfLife(int[][] data) {
        Size = data.length;
        Previous = new int[Size][Size];
        Board = new int[Size][Size];
        Board = data;
    }
    @Override
    public int neighbors(int i ,int j) {
        int count = 0;

        if(i==0 && j ==0){
            if(Board[i][j+1] == 1 ){ count++;}
            if(Board[i+1][j] == 1 ){ count++;}
            if(Board[i+1][j+1] == 1 ){ count++;}
            if(Board[i+1][Size -1] == 1 ){ count++;}
            if(Board[i][Size -1] == 1 ){ count++;}
            if(Board[Size-1][Size-1] == 1 ){ count++;}
            if(Board[Size-1][j] == 1 ){ count++;}
            if(Board[Size-1][j+1] == 1 ){count++;}
        }
        if(i==0 && j!= 0 && j!= Size-1){
            if(Board[i][j-1] == 1 ){ count++;}
            if(Board[i+1][j-1] == 1 ){ count++;}
            if(Board[i+1][j] == 1 ){ count++;}
            if(Board[i+1][j+1] == 1 ){ count++;}
            if(Board[i][j+1] == 1 ){ count++;}
            if(Board[Size-1][j-1] == 1 ){ count++;}
            if(Board[Size-1][j] == 1 ){ count++;}
            if(Board[Size-1][j+1] == 1 ){count++;}
        }
        if(i == 0 && j == Size -1){
            if(Board[i][j-1] == 1 ){ count++;}
            if(Board[i+1][j-1] == 1 ){ count++;}
            if(Board[i+1][j] == 1 ){ count++;}
            if(Board[Size-1][j-1] == 1 ){ count++;}
            if(Board[Size-1][j] == 1 ){ count++;}
            if(Board[Size-1][0] == 1 ){ count++;}
            if(Board[0][0] == 1 ){ count++;}
            if(Board[1][0] == 1 ){ count++;}
        }
        if(i != 0 && j== 0 && i != Size -1){
            if(Board[i-1][j] == 1 ){count++;}
            if(Board[i-1][j+1] == 1 ){ count++;}
            if(Board[i][j+1] == 1 ){ count++;}
            if(Board[i+1][j+1] == 1 ){ count++;}
            if(Board[i+1][j] == 1 ){ count++;}
            if(Board[i-1][Size -1] == 1 ){ count++;}
            if(Board[i][Size -1] == 1 ){ count++;}
            if(Board[i+1][Size -1] == 1 ){ count++;}

        }
        if(i == Size - 1 && j ==0){
            if(Board[i-1][j] == 1 ){count++;}
            if(Board[i-1][j+1] == 1 ){ count++;}
            if(Board[i][j+1] == 1 ){ count++;}
            if(Board[i-1][Size -1] == 1 ){ count++;}
            if(Board[i][Size -1] == 1 ){ count++;}
            if(Board[0][Size -1] == 1 ){ count++;}
            if(Board[0][0] == 1 ){ count++;}
            if(Board[0][1] == 1 ){ count++;}

        }
        if(i == Size - 1 && j !=0 && j!= Size - 1){
            if(Board[i][j-1] == 1 ){ count++;}
            if(Board[i-1][j-1] == 1 ){ count++;}
            if(Board[i-1][j] == 1 ){count++;}
            if(Board[i-1][j+1] == 1 ){ count++;}
            if(Board[i][j+1] == 1 ){ count++;}
            if(Board[0][j-1] == 1 ){ count++;}
            if(Board[0][j] == 1 ){ count++;}
            if(Board[0][j+1] == 1 ){ count++;}

        }
        if(i == Size - 1 && j== Size - 1){
            if(Board[i][j-1] == 1 ){ count++;}
            if(Board[i-1][j-1] == 1 ){ count++;}
            if(Board[i-1][j] == 1 ){count++;}
            if(Board[0][j-1] == 1 ){ count++;}
            if(Board[0][j] == 1 ){ count++;}
            if(Board[0][0] == 1 ){ count++;}
            if(Board[i][0] == 1 ){ count++;}
            if(Board[i-1][0] == 1 ){ count++;}
        }
        if(i != 0 && j == Size -1 && i != Size -1){
            if(Board[i+1][j] == 1 ){ count++;}
            if(Board[i+1][j-1] == 1 ){ count++;}
            if(Board[i][j-1] == 1 ){ count++;}
            if(Board[i-1][j-1] == 1 ){ count++;}
            if(Board[i-1][j] == 1 ){count++;}
            if(Board[i-1][0] == 1 ){ count++;}
            if(Board[i][0] == 1 ){ count++;}
            if(Board[i+1][0] == 1 ){ count++;}
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

}



