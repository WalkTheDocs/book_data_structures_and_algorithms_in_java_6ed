package book_data_structures_and_algorithms_in_java_6ed.common;

public class PredatoryCreditCard extends CreditCard {
    private double apr;
    private int callsToCharge;

    public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double rate) {
        super(cust, bk, acnt, lim, initialBal);
        apr = rate;
        callsToCharge = 0;
    }

    public void processMonth() {
        this.callsToCharge = 0; // reset callsToCharge every month.
        if (balance > 0) {
            double monthlyFactor = Math.pow(1 + apr, 1.0 / 12);
            balance *= monthlyFactor;
        }
    }

    /**
     * C-18
     * The PredatoryCreditCard class provides a processMonth( ) method that models
     * the completion of a monthly cycle. Modify the class so that once a customer
     * has made ten calls to charge during a month, each additional call to that
     * method in the current month results in an additional $1 surcharge.
     * 
     * @see processMont
     */
    @Override
    public boolean charge(double price) {
        this.callsToCharge++;
        boolean isSuccess = super.charge(price);
        if (!isSuccess)
            balance += 5;
        if (this.callsToCharge > 10)
            surcharge(1);
        return isSuccess;
    }

    /**
     * C-18
     * Have a separate surcharge method. If we were logging the charges like real
     * credit card, then any additional fees should show up as their own separate
     * charge.
     */
    private boolean surcharge(double price) {
        return super.charge(price);
    }
}
