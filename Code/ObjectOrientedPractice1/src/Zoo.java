class Animal {
    private int legs;//将属性legs定义为private，只能被Animal类内部访
    public void setLegs(int aLegs){
        if (aLegs!=0&&aLegs!=2&&aLegs!=4)
            System.out.println("Wrong legs number!");
        else legs = aLegs;
    }
    public void getLegs(){
        System.out.println(legs);
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void move(){
        System.out.println("Moving.");
    }
}
public class Zoo {
    public static void main(String args[]) {
        Animal xb = new Animal();
        xb.eat();
        xb.move();
        xb.getLegs();
        xb.setLegs(2);
        xb.getLegs();
    }
}