// * *  *  * *        00 01 02 03 04
// * *                10 11
// * *  * *  * *      20 21 22 23 24 25
// * *                30 31
// * *  * *  *        40 41 42 43 44

public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[5][6];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 4) {
                    if(j != 5 )
                        letter[i][j] = " * ";
                    else{
                        letter[i][j] = "   ";
                    }
                } else if ( i == 2 ) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 1 ) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = " ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}