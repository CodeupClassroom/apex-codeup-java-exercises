import oop.Person;

import java.util.List;

public class Cashier extends Person {
    List<TransactionItem> items;

    public Cashier(String fn, String ln, boolean isAlive, List<TransactionItem> items) {
        super(fn, ln, isAlive);
        this.items = items;
    }

    private double getTotalFromItems() {
        double transactionTotal = 0;
        for(TransactionItem item: this.items) {
            transactionTotal += item.getPrice();
        }
        return transactionTotal;
    }

    public boolean askCustomerForMoney(Customer customer) throws Exception {
        double transactionTotal = this.getTotalFromItems();
        double moneyFromCustomer = customer.giveTotal(transactionTotal);

        if(moneyFromCustomer == transactionTotal) {
            return true;
        } else {
            return false;
        }
    }
}
