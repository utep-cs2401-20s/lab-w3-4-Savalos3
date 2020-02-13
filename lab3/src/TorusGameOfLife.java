
public class TorusGameOfLife extends GameOfLife{

    private int[][] Previous;
    private int[][] Board;
    private int Size;
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
            if(Previous[i][j+1] == 1 ){ count++;}
            if(Previous[i+1][j] == 1 ){ count++;}
            if(Previous[i+1][j+1] == 1 ){ count++;}
            if(Previous[i+1][Size -1] == 1 ){ count++;}
            if(Previous[i][Size -1] == 1 ){ count++;}
            if(Previous[Size-1][Size-1] == 1 ){ count++;}
            if(Previous[Size-1][j] == 1 ){ count++;}
            if(Previous[Size-1][j+1] == 1 ){count++;}
        }
        if(i==0 && j!= 0 && j!= Size-1){
            if(Previous[i][j-1] == 1 ){ count++;}
            if(Previous[i+1][j-1] == 1 ){ count++;}
            if(Previous[i+1][j] == 1 ){ count++;}
            if(Previous[i+1][j+1] == 1 ){ count++;}
            if(Previous[i][j+1] == 1 ){ count++;}
            if(Previous[Size-1][j-1] == 1 ){ count++;}
            if(Previous[Size-1][j] == 1 ){ count++;}
            if(Previous[Size-1][j+1] == 1 ){count++;}
        }
        if(i == 0 && j == Size -1){
            if(Previous[i][j-1] == 1 ){ count++;}
            if(Previous[i+1][j-1] == 1 ){ count++;}
            if(Previous[i+1][j] == 1 ){ count++;}
            if(Previous[Size-1][j-1] == 1 ){ count++;}
            if(Previous[Size-1][j] == 1 ){ count++;}
            if(Previous[Size-1][0] == 1 ){ count++;}
            if(Previous[0][0] == 1 ){ count++;}
            if(Previous[1][0] == 1 ){ count++;}
        }
        if(i != 0 && j== 0 && i != Size -1){
            if(Previous[i-1][j] == 1 ){count++;}
            if(Previous[i-1][j+1] == 1 ){ count++;}
            if(Previous[i][j+1] == 1 ){ count++;}
            if(Previous[i+1][j+1] == 1 ){ count++;}
            if(Previous[i+1][j] == 1 ){ count++;}
            if(Previous[i-1][Size -1] == 1 ){ count++;}
            if(Previous[i][Size -1] == 1 ){ count++;}
            if(Previous[i+1][Size -1] == 1 ){ count++;}

        }
        if(i == Size - 1 && j ==0){
            if(Previous[i-1][j] == 1 ){count++;}
            if(Previous[i-1][j+1] == 1 ){ count++;}
            if(Previous[i][j+1] == 1 ){ count++;}
            if(Previous[i-1][Size -1] == 1 ){ count++;}
            if(Previous[i][Size -1] == 1 ){ count++;}
            if(Previous[0][Size -1] == 1 ){ count++;}
            if(Previous[0][0] == 1 ){ count++;}
            if(Previous[0][1] == 1 ){ count++;}

        }
        if(i == Size - 1 && j !=0 && j!= Size - 1){
            if(Previous[i][j-1] == 1 ){ count++;}
            if(Previous[i-1][j-1] == 1 ){ count++;}
            if(Previous[i-1][j] == 1 ){count++;}
            if(Previous[i-1][j+1] == 1 ){ count++;}
            if(Previous[i][j+1] == 1 ){ count++;}
            if(Previous[0][j-1] == 1 ){ count++;}
            if(Previous[0][j] == 1 ){ count++;}
            if(Previous[0][j+1] == 1 ){ count++;}

        }
        if(i == Size - 1 && j== Size - 1){
            if(Previous[i][j-1] == 1 ){ count++;}
            if(Previous[i-1][j-1] == 1 ){ count++;}
            if(Previous[i-1][j] == 1 ){count++;}
            if(Previous[0][j-1] == 1 ){ count++;}
            if(Previous[0][j] == 1 ){ count++;}
            if(Previous[0][0] == 1 ){ count++;}
            if(Previous[i][0] == 1 ){ count++;}
            if(Previous[i-1][0] == 1 ){ count++;}
        }
        if(i != 0 && j == Size -1){
            if(Previous[i+1][j] == 1 ){ count++;}
            if(Previous[i+1][j-1] == 1 ){ count++;}
            if(Previous[i][j-1] == 1 ){ count++;}
            if(Previous[i-1][j-1] == 1 ){ count++;}
            if(Previous[i-1][j] == 1 ){count++;}
            if(Previous[i-1][0] == 1 ){ count++;}
            if(Previous[i][0 == 1 ){ count++;}
            if(Previous[i+1][0] == 1 ){ count++;}
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
}
//        if(Previous[i+1][Size -1] == 1 ){ count++;}
//        if(Previous[i][Size -1] == 1 ){ count++;}
//        if(Previous[Size-1][Size-1] == 1 ){ count++;}
//        if(Previous[Size-1][j] == 1 ){ count++;}
//        if(Previous[Size-1][j+1] == 1 ){count++;}
//        if(Previous[i+1][j+1] == 1 ){ count++;}
//        if(Previous[i+1][j-1] == 1 ){ count++;}
//        if(Previous[Size-1][j-1] == 1 ){ count++;}
//        if(Previous[Size-1][0] == 1 ){ count++;}
//        if(Previous[0][0] == 1 ){ count++;}
//        if(Previous[1][0] == 1 ){ count++;}
//        if(Previous[0][1] == 1 ){ count++;}



