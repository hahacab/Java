public class Practice6 {


}
class Circle1{
    private final double radius;
    public Circle1(double aRadius){
        radius=aRadius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        var cir1 = new Circle1(2.5);
        System.out.println(cir1.findArea());
    }
}
class PassObject{
    public void printAreas(Circle1 c,int time){
        System.out.printf("%-8s\t%-10s\n","Radius","Area");
        for (int i=1;i<=time;i++){
            c = new Circle1(i);
            System.out.printf("%-8.0f\t%-10f\n",(double)i,c.findArea());
        }
    }

    public static void main(String[] args) {
        var cir = new Circle1(2);
        PassObject po1 = new PassObject();
        po1.printAreas(cir,5);

    }
}
