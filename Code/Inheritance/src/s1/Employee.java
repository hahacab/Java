package s1;


import java.time.LocalDate;

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

