import java.util.ArrayList;

public class ExceptionHandlingLec {
    public static void main(String[] args) throws Exception {
//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[999]);
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (Exception e) {
//
//            System.out.println("Math still works!");
//        }
//
//        System.out.println("Finishing up. Goodbye!");
        ArrayList<TransactionItem> myItems = new ArrayList<>();
        myItems.add(new TransactionItem("Children's Tylenol", 4.99));

        Customer customer = new Customer("Douglas", "Hirsh", true, myItems);

        ArrayList<TransactionItem> cashierItems = new ArrayList<>();
        cashierItems.add(new TransactionItem("Microwave", 200.00));
        cashierItems.add(myItems.get(0));

        Cashier cashier = new Cashier("Ken", "Malibu", true, cashierItems);
        try {
            System.out.println("cashier.askCustomerForMoney(customer) = " + cashier.askCustomerForMoney(customer));
        } catch (Exception e) {
            cashier = new Cashier("Ken", "Malibu", true, myItems);
            System.out.println("cashier.askCustomerForMoney(customer) = " + cashier.askCustomerForMoney(customer));
        }

    }
}
