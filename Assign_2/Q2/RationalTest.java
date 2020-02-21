
public class RationalTest {
    public static void main(String[] args){
        int value = 0;
        /*
        Two variables are created to hold the rational numbers.
         */
        RationalNumber val_1 = new RationalNumber(4,7);
        RationalNumber val_2 = new RationalNumber(5,9);
        /*
        The compareTo method is called to compare the two rationals.
         */
        value = val_1.compareTo(val_2);
        System.out.println("The first rational is " + val_1 + ", the second rational is " +  val_2 + ".");
        /*
        A switch statement is used to output what rational is larger or if they're equal.
         */

        switch (value){
            case 0: System.out.println("The values are equal");
                    break;
            case 1: System.out.println("The value " + val_1 + " is greater than " + val_2);
                    break;
            case -1: System.out.println("The value " + val_2 + " is greater than " + val_1);
                    break;
            default:break;
        }



    }
}
