//Author: Kavan Chandra
//#: 100693831

//the Superclass Payments uses PaymentsInterface
public class Payments implements PaymentsInterface
{

    double balance;
    //the constructor Payments is used to give methods to child classes
    public Payments(double balance)
    {
        this.balance = balance;
    }
    @Override
    public double paymentinfo() {
        return 0;
    }
}
