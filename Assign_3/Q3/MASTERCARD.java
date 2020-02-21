//Author: Kavan Chandra
//#: 100693831

//subclass MASTERCARD is a child class of Payments and uses PaymentsInterface
public class MASTERCARD extends Payments implements PaymentsInterface
{
    // the double balance represents the subtotal before the fee
    double balance;
    public MASTERCARD(double balance)
    {
        super(balance);
        this.balance = balance;

    }


    // this returns the value of the total with the fee
    @Override
    public double paymentinfo() {
       balance = Math.round(balance * 1.025);
        System.out.println("Mastercard total is: " + balance);
        return balance;
    }
}
