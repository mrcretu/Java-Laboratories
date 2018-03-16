/* Lab 1 - Compulsory (1p) */

public class Lab1 {
    public static void main(String args[]) {
        /* 1) */
        System.out.print("Hello World!");
        /* 2) */
        String languages[] = {"C", "C++", "C#", "Go", "JavaScript", "Perl", "PHP", "Python", "Swift", "Java"};
        /* 3) */
        int n = (int) (Math.random() * 1_000_000); //generate random number multiplied with 1_000_000
        /* 4) */
        n *= 3;
        int number0 = Integer.parseInt("10101", 2);
        n += number0;
        int number1 = Integer.parseInt("FF", 16);
        n += number1;
        n *= 6;

        //System.out.print(n);

        /* 5) */
        int newR = 0;
        while (n != 0) {
            int uc = n % 10;
            newR += uc;
            n /= 10;
        }
        // newR = sum(newR --> digits)

        while (newR > 9) { //while newR has more than 1 digit
            int newS = 0;
            while (newR != 0) {
                int uc = newR % 10;
                newS += uc;
                newR /= 10;
            }
            newR = newS;
        }
        /* 6. */
        System.out.print("\n" + "Willy-nilly, this semester I will learn " + languages[newR] + ".");
    }

}
