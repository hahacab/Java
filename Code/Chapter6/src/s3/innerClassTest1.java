package s3;

import s2.java8.CompareB;

public class innerClassTest1 {
    //开发中很少见
    public void method() {
        //局部内部类
        class AA {
        }
        ;
    }

    //返回一个实现了Comparable接口的类
    public Comparable getComparable() {
        //局部内部类
//        class MyComparable implements Comparable {
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
