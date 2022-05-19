import classtest.Employee1;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Random;

/*
1.getClass返回一个Class类型的实例 Class c1 = string.classtest.getClass();
 */
public class getClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class的第一种方法
        var e1 = new Employee("Kate");
        Class c1 = e1.getClass();
        System.out.println(e1.getClass().getName()+" "+e1.getName());
        //
        var e2 = new Employee1("Lula");
        Class c2 = e2.getClass();
        System.out.println(c2.getName()+" "+e2.getName());

        //静态方法forName获得类名的Class对象
        String className = "java.util.Random";
        try {
            Class c3 = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //若T是任意的java类型(或void)关键字，T.class将代表匹配的类对象。
        Class c4 = Random.class;
        Class c5 = String.class;
        Class c6 = int.class;


        var c7 = Class.forName("java.util.Random");
        Objects obj = (Objects) c7.getConstructor().newInstance();
    }
}
