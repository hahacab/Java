package mankind;

public class Kids extends ManKind{
    private int yeasOld;
    public Kids(){
        super();
    }
    public Kids(int sex,int salary,int yeasOld){
        super(sex,salary);
        this.yeasOld = yeasOld;
    }

    @Override
    public void employed() {
        super.employed();
        System.out.println("but Kids should study and no job.");
    }

    public int getYeasOld() {
        return yeasOld;
    }

    public void setYeasOld(int yeasOld) {
        this.yeasOld = yeasOld;
    }

    public void printAge(){
        System.out.println("yearsOld="+yeasOld);
    }
}
