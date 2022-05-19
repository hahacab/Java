public class Account {
    private double balance;

    public Account(double init_balance){
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }
    //取款
    public void withdraw(double amt) {
        if (amt > balance)
            System.out.println("Sorry,your balance is $" + getBalance() + ",not enough to $" + amt + "!");
        else {
            balance -= amt;
            System.out.println("Succeed,you withdraw $" + amt + " to your account!" +
                    "\nNow there is $" + getBalance() + "in your account.\n");
        }
    }
    //存款
    public void deposit(double amt){
        balance+= amt;
        System.out.println("Succeed,you deposit $" + amt + " to your account!" +
                "\nNow there is $" + getBalance() + "in your account\n");
    }
}
