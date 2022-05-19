/*
编写教师类和学生类，并通过测试类创建对象进行测试
 */
public class Practice2 {
    public static void main(String[] args) {
        var stu1 = new Student("Kate",18,"communication engineering","football");
        var tea1 = new Teacher();
        stu1.say();
        tea1.say();
    }
}

//Student类
class Student{
    private String name;
    private int age;
    private String major;//专业
    private String interests;

    public Student(String aName,int aAge,
                   String aMajor,String aInterests){
        name =aName;
        age =aAge;
        major =aMajor;
        interests =aInterests;
    }
    public Student(){
    }
    public void say(){
        System.out.printf("\nname=%s,age=%d,major=%s,interest=%s.",name,age,major,interests);
    }
}
//Teacher类
class Teacher{
    private String name;
    private int age;
    private int teacherAge;//教龄
    private String course;//课程

    public Teacher(String aName,int aAge,
                   int aTeacherAge,String aCourse){
        name =aName;
        age =aAge;
        teacherAge=aTeacherAge;
        course=aCourse;
    }
    public Teacher(){
    }
    public void say(){
        System.out.printf("\nname=%s,age=%d,teacherAge=%d,course=%s.",name,age,teacherAge,course);
    }
}