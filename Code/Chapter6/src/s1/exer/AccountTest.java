package s1.exer;
/*
编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，定义封装这些
属性的方法。账号要自动生成。编写主类，使用银行账户类，输入、输出3个储户的上述信息。
考虑：哪些属性可以设计成static属性。
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("ChggDGXANn1",100);
        System.out.println(account1);
        System.out.println(account2);
    }
}
class Account{
    private int accountId;
    private String password = "000000";
    private double balance;

    private static double interestRate;
    private static double minMoney = 1.0;
    private static int init = 1001;//用于自动生成id

    public Account(){
        accountId = init++;
    }

    public Account(String password,double balance){
        this();
        this.password = password;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}