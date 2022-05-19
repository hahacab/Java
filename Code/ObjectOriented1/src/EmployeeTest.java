import java.time.LocalDate;
/*
@param variable description
@return description
@throws class description
@author leihang
@version 1.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //用三个 Employee 对象填充员工数组
        var staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker",75000,1987,12,15);
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tony Tester",40000,1990,3,15);

        //提升每人5%的薪水
        for (Employee e : staff)//for each循环，对元素集合的每个元素，执行循环中的语句
        {
            e.raiseSalary(5);
            e.setId();
        }

        //打印出每个员工对象的信息
        for (Employee e :staff)
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary()+",hireDay=" +
                    e.getHireDay());

        int n=Employee.getNextId();//调用静态方法
        System.out.println("Next available id ="+n);
        var harry = new Employee("Harry",50000,2019,5,20);
        System.out.println("salary="+harry.getSalary());
        tripleSalary(harry);
        System.out.println("salary="+harry.getSalary());
    }
    //3倍薪水
    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
    }
    //交换两个Employee对象,无效
//    public static void swap(Employee x,Employee y) {
//        Employee temp = x;
//        x=y;
//        y=temp;
//    }
}


class Employee{
    private static int nextId = 1;//static ,每个类只有一个这样的字段。

    private int id;
    //instance fields 实例字段
    private final String name;
    private double salary;
    private final LocalDate hireDay;//雇用时间

    //constructor
    public Employee(String n,double s,int year,int month,int day)
    {
        //宽容型方法，将null参数转换为适当的非null参数
//        if(n==null)name = "unknown";else name = n;
//        name = Objects.requireNonNullElse(n,"unknown");//java 9中提供的“宽容型”方法
        //严格型方法
//        name = Objects.requireNonNull(n,"The name cannot be null");
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }
    //无参数的构造器
    public Employee(){
        name = "";
        salary = 30000;
        hireDay = LocalDate.now();
    }

    //a method
    public String getName(){
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent/100;
        salary+=raise;
    }

    //设置id
    public void setId(){
        id = nextId;
        nextId++;
    }
    public int getId(){
        return id;
    }

    public static int getNextId(){
        return nextId;
    }

    public static void main(String[] args) {
        var tim = new Employee();//使用无参构造
        System.out.println("name="+tim.getName()+",id="+tim.getId()+",salary="+tim.getSalary()+",hireDay=" +
                    tim.getHireDay());
    }
}
