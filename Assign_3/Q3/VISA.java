//Author: Kavan Chandra
//#: 100693831

//subclass PAYPAL is a child class of Payments and uses PaymentsInterface
public class VISA extends Payments implements PaymentsInterface
{
    // the double balance represents the subtotal before the fee
    double balance;
    public VISA(double balance)
    {
        super(balance);

        this.balance = balance;
            balance *= 1.02;

    }


    // this returns the value of the total with the fee
    @Override
    public double paymentinfo() {
        balance= Math.round(balance * 1.02);
        System.out.println("Visa total is: " + balance);
        return balance;

    }
}
