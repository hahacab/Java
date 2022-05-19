public class AccountTest {
    public static void main(String[] args) {
        var custom1 = new Customer("Jane","Smith");
        var account1 = new Account(1000,2000,1.23);
        custom1.setAccount(account1);
        printCustomInfo(custom1);
        custom1.getAccount().deposit(100);
        printCustomInfo(custom1);
        custom1.getAccount().withdraw(960);
        printCustomInfo(custom1);
        custom1.getAccount().withdraw(2000);
        printCustomInfo(custom1);
    }
    public static void printCustomInfo(Customer customer){
        System.out.printf("""
                        %s %s's account id = %d
                        balance is $%f
                        annualInterestRate is %f%%
                        
                        """,
                customer.getFirstName(),
                customer.getLastName(),
                customer.getAccount().getId(),
                customer.getAccount().getBalance(),
                customer.getAccount().getAnnualInterestRate());
    }
}
class Account{
    private int id;
    private double balance;//余额
    private double annualInterestRate;//利率

    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance =balance;
        this.annualInterestRate = annualInterestRate;
    }

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
    public void withdraw (double amount){//取钱
        if (amount>balance)
            System.out.println("Sorry,your balance is not enough!");
        else {
            balance-=amount;
            System.out.println("Withdraw "+amount+" Succeed!");
        }
    }
    public void deposit (double amount){//存钱
        balance+=amount;
        System.out.println("Deposit "+amount+" Succeed!");
    }
}
class Customer{
    private final String firstName;
    private final String lastName;
    private Account account;
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}