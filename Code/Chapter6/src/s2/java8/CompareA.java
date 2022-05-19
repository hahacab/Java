package s2.java8;

public interface CompareA {
    default void method1(){//静态方法
        System.out.println("CompareA:北京");
    }
    default void method2(){//静态方法
        System.out.println("CompareA:上海");
    }
    default void method3(){//默认方法
        System.out.println("CompareA:广州");
    }
}

