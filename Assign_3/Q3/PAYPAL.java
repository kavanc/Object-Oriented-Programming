//Author: Kavan Chandra
//#: 100693831

//subclass PAYPAL is a child class of Payments and uses PaymentsInterface
public class PAYPAL extends Payments implements PaymentsInterface
{
    // the double balance represents the subtotal before the fee
    double balance;
    public PAYPAL(double balance)
    {
        super(balance);
        this.balance = balance;
    }

// this returns the value of the total with the fee
    @Override
    public double paymentinfo() {
       balance = Math.round(balance * 1.01);
        System.out.println("Paypal total is: " + balance);
        return balance;
    }
}
