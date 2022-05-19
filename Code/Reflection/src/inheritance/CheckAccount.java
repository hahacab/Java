package inheritance;

public class CheckAccount extends Account{
    private double overdraft;
    public CheckAccount(int id,double balance,double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }
    public CheckAccount(){};

    @Override
    public void withdraw(double amount) {
        if (amount>=0){
            if(amount<=getBalance()){
                setBalance(getBalance()-amount);
                System.out.println("取款成功");
            }
            else if (amount>getBalance()){
                if (amount<=getBalance()+overdraft){
                    overdraft = overdraft-(amount-getBalance());
                    setBalance(0);
                }
                else System.out.println("超过可透支额的限额");
            }
        }
        else System.out.println("非法的金额");
    }
    public void printBalanceAndOverdraft(){
        System.out.println("Balance = "+getBalance()+",Overdraft = "+overdraft);
    }
}
