
public class program16 {

    public static void main(String[] args) {
        int[] marks; // one dimensional array
        int[][] flats; // two dimensional array
        flats = new int[2][3]; // 2 rows (2 floors), 3 columns (3 houses)
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // displaying the twi dimensional array
        System.out.println("Printing a 2-D array using for loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
