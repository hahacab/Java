package inheritance;

public class AccountTest {
    public static void main(String[] args) {
        var account1 = new Account(1,20000,4.5);
        account1.withdraw(30000);
        System.out.println("balance="+account1.getBalance());
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.println("balance="+account1.getBalance());
    }
}
