import oop.Person;

import java.util.List;

public class Customer extends Person {
    List<TransactionItem> items;
    double estimatedTotal;

    public Customer(String fn, String ln, boolean isAlive, List<TransactionItem> items) {
        super(fn, ln, isAlive);
        this.items = items;
        this.estimatedTotal = calculateEstimatedTotal();
    }

    private double calculateEstimatedTotal() {
        double total = 0;
        for (TransactionItem item : this.items) {
            total += item.getPrice() * 1.1;
        }
        return total;
    }

    public double giveTotal(double totalRequest) throws Exception {
        if(totalRequest > this.estimatedTotal) {
            throw new Exception(String.format("$%.2f is too much, please review the transaction. I was thinking it should be $%.2f.", totalRequest, this.estimatedTotal));
        }

        return totalRequest;
    }
}
