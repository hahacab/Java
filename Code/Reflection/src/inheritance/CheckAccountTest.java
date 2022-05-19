package inheritance;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,4.5,5000);
        checkAccount.printBalanceAndOverdraft();
        checkAccount.withdraw(5000);
        checkAccount.printBalanceAndOverdraft();
        checkAccount.withdraw(18000);
        checkAccount.printBalanceAndOverdraft();
        checkAccount.withdraw(3000);
        checkAccount.printBalanceAndOverdraft();
    }
}
