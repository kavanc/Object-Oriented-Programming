
public class RationalNumber {
    private int numerator, denominator;
    public RationalNumber(int numer, int denom){
        if(denom == 0) {
            denom = 1;
        }
        if (denom<0){
            numer = numer * -1;
            denom = denom * -1;
        }
        numerator= numer;
        denominator = denom;
        reduce();
    }


    private int getNumerator(){
        return numerator;
    }
    private int getDenominator(){
        return denominator;
    }
    private RationalNumber reciprocal(){
        return new RationalNumber(denominator,numerator);
    }
    public RationalNumber add(RationalNumber op2){
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

        return new RationalNumber(sum, commonDenominator);
    }
    public RationalNumber subtract(RationalNumber op2){
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

        return new RationalNumber(difference, commonDenominator);
    }
    private RationalNumber multiply(RationalNumber op2){
        int numer = numerator * op2.getNumerator();
        int denom = denominator * op2.getDenominator();

        return new RationalNumber(numer, denom);
    }
    public RationalNumber divide(RationalNumber op2){
        return multiply(op2.reciprocal());
    }
    public boolean isLike(RationalNumber op2){
        return (numerator == op2.getNumerator() && denominator == op2.getDenominator());
    }
    public String toString(){
        String result;
        if (numerator == 0){
            result= "0";
        }
        else {
            result = numerator + "/" + denominator;
        }
        return result;
    }
    private void reduce(){
        if (numerator != 0){
            int common = gcd(Math.abs(numerator), denominator);
            numerator = numerator/common;
            denominator = denominator / common;
        }
    }
    private int gcd(int num1, int num2){
        while (num1 != num2){
            if (num1>num2){
                num1 = num1 - num2;
            }else num2= num2 - num1;
        }
        return num1;
    }
    /*
    Up until this point is given in class
     */

    /*
     The double getDecimalEquivalent returns the
     denominator and numerator as double values to
     use in the compareTo method.
     */
    private double getDecimalEquivalent()
    {
        double val_1 = (double) denominator;
        double val_2 = (double) numerator;
        return (val_2 / val_1);

    }
    /*
    The compareTo method calculates the difference
    between two rationals using a tolerance of 0.0001.
    New variable from main class used to find the
    difference between rationals. If statement used to
    test whether difference is more or less than the
    tolerance. Inner if statement is used to test which
    value is larger.

     */

    public int compareTo(Object obj) {
        double tolerance=0.0001;
        RationalNumber myRational = (RationalNumber) obj;
        double result = getDecimalEquivalent() - myRational.getDecimalEquivalent();
        if(Math.abs(result) > tolerance) {
            //not equal
            if(getDecimalEquivalent() > myRational.getDecimalEquivalent()) {
                //bigger
                return 1;
            }
            else {
                //smaller
                return -1;
            }
        }
        else {
            //equal
            return 0;
        }
    }

}
