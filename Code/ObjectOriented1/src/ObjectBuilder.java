import java.util.Random;

public class ObjectBuilder {
    public static void main(String[] args) {
        var message = new StringBuilder();
        System.out.println(message);
        //重载，多个方法有相同的名字，不同的参数，便出现了重载(overloading)
        var todolist = new StringBuilder("Todo:\n");
        System.out.println(todolist);
        var staff = new Employee1[3];

        staff[0] = new Employee1("Carl Cracker",75000);
        staff[1] = new Employee1(50000);
        staff[2] = new Employee1();
        for (Employee1 e:staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",id="+e.getId());
        }

    }
}
class Employee1{
    private static int nextId;

    private final int id;
    private String name = "";
    private double salary;
    //static initialization block
    static {
        var generate = new Random();
        //返回一个0~n-1的随机数
        nextId = generate.nextInt(10000);
    }
    //对象初始化块
    {
        id = nextId;
        nextId++;
    }
    //三个重载构造器
    public Employee1(String aName,double aSalary){
        name = aName;
        salary = aSalary;
    }
    public Employee1(double aSalary){
        //调用Employee1(String aName,double aSalary)构造器
        this("Employee #"+nextId,aSalary);
    }
    public Employee1(){
        //name初始化为 ""
        //salary初始化为 0
        //id值为对象初始化块
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
}
