import java.util.Arrays;

public class GOLTester {
    public static void main(String[] args) {

        int [][] ex ={ {0,1,0},
                       {0,1,0},
                       {0,1,0}
                                };
        GameOfLife x = new GameOfLife(ex);

        System.out.println(Arrays.deepToString(x.getPrevious()));


    }
}
//   Person[] people = new Person[3];

//            Person one = new Person("Jose" , "jose32@gmail.com");
//            Person two = new Person("Sarah", "Sarah13@gmail.com");
//            Person three = new Person("Charlie","Charlie2@gmail.com");

//            String[] array = new String[3];
//
//            array[0] = one.getName();
//            array[1] = two.getName();
//            array[2] = three.getName();
//
//            for(int i =0; i < 3; i++) {
//                System.out.println(array[i]);
//