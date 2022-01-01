package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer;

public class CreditCard {
    // Instance variables:
    private String customer;
    // name of the customer (e.g., ”John Bowman”)
    private String bank;
    // name of the bank (e.g., ”California Savings”)
    private String account;
    // account identifier (e.g., ”5391 0375 9387 5309”)
    private int limit;
    // credit limit (measured in dollars)
    protected double balance;

    // current balance (measured in dollars)
    // Constructors:
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
        // use a balance of zero as default
    }

    // Accessor methods:
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    /**
     * R-11
     * 
     * Modify the CreditCard class from Code Fragment 1.5 to include a method that
     * updates the credit limit.
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    // Update methods:
    public boolean charge(double price) {
        // make a charge
        double newBalance = price + balance;
        if (newBalance > limit) 
            // if charge would surpass limit
            // R-13: Need to be able to tell if my calculations were correct;
            throw new Error(String.format("Charge surpasses limit by $%,.2f for account %s", newBalance - balance, account));
        // refuse the charge
        // at this point, the charge is successful
        balance = newBalance;
        // update the balance
        return true;
        // announce the good news
    }

    /**
     * R-12
     * 
     * Modify the CreditCard class from Code Fragment 1.5 so that it ignores any re-
     * quest to process a negative payment amount.
     * 
     * Probably better to throw an error than to simply ignore it.
     */
    public void makePayment(double amount) {
        double newBalance = balance - amount;
        if (newBalance < 0) {
            printSummary(this);
            throw new Error(String.format("Overdrafted by $%d", Math.abs(newBalance)));
        } else {
            balance = newBalance;
        }
    }

    // Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("\nCustomer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance); // implicit cast
        System.out.println("Limit = " + card.limit + "\n");
        // implicit cast
    }

    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);

        /**
         * R-13
         * 
         * Modify the declaration of the first for loop in the main method in Code Frag-
         * ment 1.6 so that its charges will cause exactly one of the three credit cards
         * to attempt to go over its credit limit. Which credit card is it?
         * 
         * wallet[0] goes over its limit for i > 57
         */
        for (int val = 1; val <= 58; val++) {
            wallet[0].charge(3 * val);
            wallet[1].charge(2 * val);
            wallet[2].charge(val);
        }
        for (CreditCard card : wallet) {
            CreditCard.printSummary(card);
            // calling static method
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }
}