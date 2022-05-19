package inheritance;

import java.util.Scanner;

public class Account {
    private int id;
    private double balance;
    private double  annualInterestRate;

    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public Account(){};

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }
    public void withdraw (double amount){
        if (amount>=0){
            if (amount<=balance){
                balance -= amount;
                System.out.println("取款成功！");
            }
            else {
                System.out.println("余额不足！");
                System.out.println("请重新输入取款金额");
                Scanner scanner = new Scanner(System.in);
                amount = scanner.nextDouble();
                withdraw(amount);
            }
        }
        else {
            System.out.println("无效的金额");
            System.out.println("请重新输入取款金额");
            Scanner scanner = new Scanner(System.in);
            amount = scanner.nextDouble();
            withdraw(amount);
        }
    }
    public void deposit(double amount){
        if (amount>=0)
        {
            balance+=amount;
            System.out.println("存款成功");
        }
        else {
            System.out.println("无效的金额");
            System.out.println("请重新输入存款金额");
            Scanner scanner = new Scanner(System.in);
            amount = scanner.nextDouble();
            deposit(amount);
        }
    }
}
