public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle tri = new TriAngle(10,5);
        System.out.println("Area = "+tri.getHeight()*tri.getBase()*0.5);
    }
}
class TriAngle{
    private double base;
    private double height;
    public TriAngle(double aBase,double aHeight){
        base=aBase;
        height=aHeight;
    }
    public void setBase(double aBase){
        base = aBase;
    }
    public void setHeight(double aHeight){
        height = aHeight;
    }

    public double getBase(){
        return base;
    }

    public double getHeight() {
        return height;
    }
}