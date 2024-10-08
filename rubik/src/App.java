public class App {

    static String[][][] cube3 = new String[6][3][3];

    static void printFace(String [] [] [] c, int i){
        for ( int j = 0; j < c[i].length; j++ ) {
            for ( int k = 0; k < c[i][j].length; k++ ){
            //return a row
            return " " + i;
            //System.out.println();
            }
        //return the face array
        System.out.println();
        }
    }


    static void printCube(String[][][] c) throws Exception {
        for(int i = 0; i < c.length; i++) {
            for ( int j = 0; j < c[i].length; j++ ) {
                for ( int k = 0; k < c[i][j].length; k++ ){

                System.out.print( " " + i);

                }
            System.out.println();
            }
        }
        System.out.println();
    }

    // public static void main(String[] args) throws Exception {
    //     printFace(cube3, 2);
    // }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < cube3.length; i++) {
            printFace(cube3, i);


        }
    }
}
