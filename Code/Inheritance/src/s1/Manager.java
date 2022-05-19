package s1;
/*
*This program demonstrates inheritance
* @version 5.1.3 2022.5.12
* @author Lei Hang
 */
public class Manager extends Employee{//继承Employee
    private double bonus;//奖金

    public Manager(String name,double salary,int year,int month,int day,int bonus){
        super(name,salary,year,month,day);//使用super语法调用构造器语句，必须是子类构造器的第一条语句。
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;//使用super调用超类的方法
    }

    public static void main(String[] args) {

        Manager boss = new Manager("Crab boss",80000,2007,10,2,3000);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];

        staff[0] = boss;//子类对象赋值给超类
        staff[1] = new Employee("SpongeBob SquarePants",20000,2012,5,5);
        staff[2] = new Employee("Squidward Tentacles",50000,2008,6,7);

        for (Employee e : staff){
            System.out.println(e.getName()+" "+e.getSalary());
        }

        if (staff[1] instanceof Manager){
            boss = (Manager) staff[1];
        }
        for (Employee e : staff){
            System.out.println(e.getName()+" "+e.getSalary());
        }
    }
}
