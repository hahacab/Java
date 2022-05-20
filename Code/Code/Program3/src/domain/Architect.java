package domain;

public class Architect extends Designer{
    private int stocks;

    public Architect(){};

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stocks) {
        super(id, name, age, salary, equipment, bonus);
        this.stocks = stocks;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" +
                getBonus() + "\t" + getStocks() + "\t" + getEquipment().getDescription();
    }

    public String getDescription(){
        return getMemberId() + "/" +getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t"
                +"架构师";
    }
}
