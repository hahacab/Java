package abstractTest;

import java.util.AbstractList;
import java.util.ArrayList;

public class abstractTest {
    public static void main(String[] args) {
        var employee1 = new Employee("Sala",5000,2001,3,6);
        System.out.println(employee1.toString());
        System.out.println(System.out);
        var staff = new ArrayList<Employee>();//ArrayList
        ArrayList<Employee> staff1 = new ArrayList<>(200);//菱形写法，
        // 把初始容量传递给ArrayList构造器
        staff.add(new Employee("Kate",10000,2012,3,18));
        staff.ensureCapacity(100);//将分配100个对象的内部数组
        System.out.println(staff.size());//staff.size() 返回数组列表中包含实际元素的个数
        staff.trimToSize();//trimToSize() 将存储块大小调整为保存当前元素数量所需要的存储空间。
        //应当在确认列表中不再向数组中添加任何元素时调用trimToSize.
        System.out.println(staff.get(0).toString());
        staff.set(0,new Employee("Tom",20000,2001,3,7));
        System.out.println(staff.get(0).toString());

    }
}
