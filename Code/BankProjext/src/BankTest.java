public class BankTest {
    public static void main(String[] args) {
        Bank pacificBank = new Bank();
        pacificBank.addCustomer("Michael","De Santa");
        Customer michael = pacificBank.getCustomer(0);
        Account account = new Account(5000);
        michael.setAccount(account);
        printBalance(michael);
        michael.getAccount().withdraw(200);
        michael.getAccount().deposit(100);
        michael.getAccount().withdraw(10000);
    }
    public static void printBalance(Customer customer){
        System.out.printf("""
                %s %s's account balance is %.2f
                
                """,
                customer.getFirstName(),
                customer.getLastName(),
                customer.getAccount().getBalance());
    }
}
