package s1.abstracttest;
/*
* 1.abstract不能用来修饰：属性、构造器等结构
 * 2.abstract不能用来修饰私方法、静态方法、final的方法、final的类*/
public class EmployeeTest {
    public static void main(String[] args) {
        CommonEmployee commonEmployee1 = new CommonEmployee("张全蛋",9854,500);
        Manager manager1 = new Manager("库克",1,5000,50000);

        commonEmployee1.work();
        manager1.work();
    }

}
abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}
class Manager extends Employee{
private double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理者管理员工，提高公司运行效率");
    }
}
class CommonEmployee extends Employee{

    public CommonEmployee() {
    }

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override

    public void work() {
        System.out.println("员工在一线车间生产产品");
    }
}