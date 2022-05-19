package s3;

import s4.GenerateException;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s =new Student();
            s.register(-1001);
            System.out.println(s);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}
class Student{
    private int id;
    public void register(int id) throws Exception {
        if (id>0){
            this.id = id;
        }else {
//            System.out.println("您输入的数据非法！");
            //手动抛出异常对象
//            throw new RuntimeException("你输入的数据非法");
            throw new GenerateException("你输入的数据非法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}