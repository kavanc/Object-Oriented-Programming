import java.util.Scanner;
public class Stars {
    public static void main(String[] args) {

        //Scanner class called
        Scanner input = new Scanner(System.in);
        final int MAX_ROWS = 10;
        //user input to decide what program to be called
        System.out.println("Pick a star pattern a,b,c or d.");
        String str = input.nextLine();
        //while loop to pick the program
        // individual star classes called within each if statement
        while (str.equals("a") || str.equals("b") || str.equals("c") || str.equals("d")) {

            if (str.equals("a")) {
                StarsA.first();
            }
            if (str.equals("b")) {
                StarsB.second();
            }
            if (str.equals("c")) {
                StarsC.third();
            }
            if (str.equals("d")) {
                 StarsD.fourth();
            }


            break;
        }
    }

    //two for loops used to display first star pattern
    //first for loop picks the amount of stars
    //second for loop displays the stars
    public static class StarsA {
        static void first() {
            int j;
            int i;
            for (i = 10; i > 0; i--) {
                for (j = i; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
    // the outer loop dictates the row
    // the first inner loop dictates the spaces
    // the second inner loop dictates the stars
    public static class StarsB {
        static void second(){
            int k, l, m;
            final int MAX_ROWS = 10;
            for(k = 1; k <= 10; k++){
                for (m =10-k; m>=0; m--) System.out.print(" ");
                for (l = k; l > 0; l--) System.out.print("*");
                System.out.print("\n");
            }
        }
    }
    //the outer loop dictates the row
    // the first inner loop dictates the spaces
    // the second inner loop dictates the stars
    public static class StarsC {
        static void third() {
            final int MAX_ROWS = 10;
            int k;
            int l;
            int m;
            for(k =MAX_ROWS;k >0;k--){
                for (m=10-k; m > 0; m--) {
                    System.out.print(" ");
                }

                for (l = k; l > 0; l--) System.out.print("*");
                System.out.print("\n");
            }
        }
    }


    public static class StarsD {
        static void fourth() {
            final int MAX_ROWS = 10;
            int j;
            int i;
            int k;
            int rows = MAX_ROWS / 2;
            int counter = rows  - 1;
            //these three for loops create the first half of the star design
            //the outer loop dictates the number of rows
            // the first inner for loop dictates the spacing
            //the second inner for loop dictates the number of stars
            for(i =0;i <5;i++) {
                for (k = 0; k < counter; k++) {
                    System.out.print(" ");
                }
                for (j = 0; j < (2 * i)+1; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                counter--;
            }
                counter = 0;
            //these three for loops create the second half of the star pattern
            //the outer for loop dictates the number of rows
            // the first inner for loop dictates the spacing
            //the second inner for loop dictates the number of stars
            for(i =rows;i > 0;i--)
            {
                for (k=0; k < counter; k++){
                    System.out.print(" ");
                }
                for (j = 0; j < (2*i)-1; j++) {
                    System.out.print("*");
                    }
                System.out.print("\n");
                counter++;
             }
        }
    }
}