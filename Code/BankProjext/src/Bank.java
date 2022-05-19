public class Bank {
    private Customer[] customer;
    private int numberOfCustomer;

    public Bank(){
        customer = new Customer[2000];
        numberOfCustomer = 0;
    }
    public void addCustomer(String f,String l){
        Customer newCus = new Customer(f, l);
        customer[numberOfCustomer] = newCus;
    }
    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        return customer[index];
    }
}
