//Author: Kavan Chandra
//#: 100693831

public class Driver {
//driver class calls Payments
    public static void main(String []args){
        // and makes a new visa, mastercard and paypal function
        Payments pay1 = new VISA(3465);
        Payments pay2 = new MASTERCARD(1955);
        Payments pay3 = new PAYPAL(935);
    // then calls for total from each respective function
        double v = pay1.paymentinfo();
        double m = pay2.paymentinfo();
        double pp = pay3.paymentinfo();
        // which is then added together
        double total_USD = v+m+pp;
        // then it is multiplied by 1.35 to get CAD
        double total_CAD = Math.round(total_USD*1.35);
        System.out.println("The total in USD is:" + total_USD);
        System.out.println("The total in CAD is:" + total_CAD);
    }
}
