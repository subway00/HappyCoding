public class NineNine {

    public static void main(String[] args) {
        int i , j;
        for (i = 1; i <= 9; i++) {

            for (j = 1; j <= 9; j++) {

                System.out.printf("%d * %d  =  %d    ", i, j, (i * j));
            }
            System.out.println("");
        }
    }
}
