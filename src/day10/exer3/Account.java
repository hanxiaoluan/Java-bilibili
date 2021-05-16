package day10.exer3;

/**
 * Created by apple on 5/16/21 2:53 PM Done is better than perfect!!
 */
public class Account {
    private int id; // 账号
    private double balance; // 余额
    private double annualInterestRate;// 年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足，取款失败");
            return;
        }
        this.balance -= amount;
        System.out.println("成功取出:" + amount);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }
}
