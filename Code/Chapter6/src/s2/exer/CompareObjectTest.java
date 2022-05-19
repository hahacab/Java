package s2.exer;
/*
定义一个接口用来实现两个对象的比较。
interface CompareObject{
public int compareTo(Object o); //若返回值是 0 , 代表相等; 若为正数，代表当
前对象大；负数代表当前对象小
}


定义一个测试类InterfaceTest，创建两个ComparableCircle对象，调用compareTo
方法比较两个类的半径大小。
}*/
public class CompareObjectTest {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(5);
        ComparableCircle comparableCircle2 = new ComparableCircle(5);
        System.out.println(comparableCircle1.compareTo(comparableCircle2));

        String str1 = new String("123");
        System.out.println(comparableCircle1.compareTo(str1));

    }
}
interface CompareObject{
    public int compareTo(Object o);
}
//定义一个Circle类，声明redius属性，提供getter和setter方法
class Circle{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
//定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。在
//ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半
//径大小。
class ComparableCircle extends Circle implements CompareObject {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (getClass() != o.getClass()) {
//            throw new RuntimeException("传入的数据类型不匹配");
        } else if (this == o) {
            return 0;
        }
//        return (int) (this.getRadius() - ((ComparableCircle) o).getRadius());
// 强转出现精度损失，导致结果错误。
        if (getRadius() < ((ComparableCircle) o).getRadius())return -1;
        else if (getRadius() > ((ComparableCircle) o).getRadius()) return 1;
        else return 0;
    }
}