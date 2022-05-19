package s2.java8;

public interface CompareB {
    default void method1(){//静态方法
        System.out.println("CompareB:北京");
    }
    default void method2(){//静态方法
        System.out.println("CompareB:上海");
    }
    default void method3(){//默认方法
        System.out.println("CompareB:广州");
    }
}
