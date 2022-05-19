package abstractTest;

import java.time.LocalDate;
import java.util.Objects;

class Employee extends Person{
    private double salary;
    private final LocalDate hireDay;//雇用时间

    //constructor
    public Employee(String name,double salary,int year,int month,int day)
    {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    //a method

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);//format字符串
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent/100;
        salary+=raise;
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;
        if (getClass()!=obj.getClass()) return false;
        Employee other = (Employee) obj;

        return getName().equals(other.getName())
                &&salary == other.salary
                &&hireDay == other.hireDay;
    }
    //hashCode方法
    public int hashCode() {
        return Objects.hash(getName(),salary,hireDay);
    }

    //toString

    @Override
    public String toString() {
        return getClass().getName()+
                "[name="+getName()+
                ",salary="+salary+
                ",hireDay="+hireDay+
                "]";
    }
}

