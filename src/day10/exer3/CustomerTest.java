package day10.exer3;

/**
 * Created by apple on 5/16/21 3:17 PM Done is better than perfect!!
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account acct = new Account(1000, 2000, 0.0123);

        customer.setAccount(acct);

        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        System.out.println("Customer[" + customer.getLastName() + "," + customer.getFirstName()
            + "] has a account: id is " + customer.getAccount().getId() + ",annualInterestRate is "
            + customer.getAccount().getAnnualInterestRate() * 100 + "% ,balance is "
            + customer.getAccount().getBalance());
    }
}
