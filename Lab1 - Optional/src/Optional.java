import java.math.BigInteger;

public class Optional {

    public static void main(String args[]) {

        long startTime = System.nanoTime();
        if (args.length < 1) {
            System.out.println("Numar insuficient de argumente!");
            System.exit(-1); // termina aplicatia
        }
        else validation(args[0]);

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;

        double seconds = (double)totalTime / 1000000000.0;
        System.out.print(seconds +" sec\n");

     }

     /* validare numar primit ca parametru */

     public static void validation(String x) {
         int n = Integer.parseInt(x);
         int[][] matrix = new int[n+2][n+2];
        if(n % 2 == 0) {
            System.out.println("Incorrect! The number is not an odd number!");
            System.exit(-1);
        }
        else System.out.println("The number it is correct!");

         if(n<10) { create_MagicSquare(n, matrix); print_MagicSquare(n,matrix); }
         else System.out.println(Integer.toString(n * (n * n + 1) / 2));
     }

     /* creare matrice MagicSquare dupa formula data */

     public static void create_MagicSquare(int n, int square[][]){


         for(int i = 1; i < n+1; i++) {
             for (int j = 1; j < n+1; j++) {
                 square[i][j] = n * ((i + j - 1 + n / 2) % n) + (i + 2 * j -2) % n + 1;
             }
         }
         verifyMatrix(n, square);
     }

     /* verificare calitate MagicSquare */
     public static void verifyMatrix(int n, int matrix[][]){
        int mConst =  n*(n*n+1)/2;

        int rowSum[] = new int [n];
        int columnSum[] = new int[n];

        int diagonalSum1 = 0;
        int diagonalSum2 = 0;

         for(int i = 1; i < n+1; i++) {
             for (int j = 1; j < n+1; j++) {
                rowSum[i-1] += matrix[i][j];
                columnSum[j-1] += matrix[j][i];
                if (i == j) diagonalSum1 += matrix[i][i];
             }
         }
         int i=1,j=n;
         while(i <= n &&  j >=1)
         {
             diagonalSum2 += matrix[i][j];
             i += 1; j -= 1;
         }
         int sumR = 0;
         int sumC = 0;

         for(int line = 0; line < n; line++){
             sumR += rowSum[line];
             sumC += columnSum[line];
         }
         /*System.out.println(diagonalSum1);
         System.out.println(diagonalSum2);
         System.out.println(mConst);*/

         if(sumR / n == mConst && sumC / n == mConst && diagonalSum1 == mConst && diagonalSum2 == mConst)
             System.out.println("The sum of the numbers in each row, column and diagonal is the same!" + "\n");

     }

     public static void print_MagicSquare(int n, int matrix[][]) {

         int ok = 1;

         int v_unicode = Integer.parseInt("25A0", 16);

         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n; j++) {

                 System.out.print(Character.toString((char) (9632 + matrix[i][j])) + " ");

             }
             System.out.println();
         }

     }
         //System.out.println("\u2501");

}
    /* n * (n * n + 1) / 2 */ //magic constant

