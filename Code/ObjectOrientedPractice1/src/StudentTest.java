public class StudentTest {
    public static void main(String[] args) {
        Student1 stu1 = new Student1("WangLin",20,"HPU","Computer Technology");
        stu1.showStuInfo();
    }
}
class Student1{
    private String name;
    private int age;
    private String school;
    private String major;

    public Student1(String aName,int aAge){
        this(aName,aAge,"Hpu");
    }
    public Student1(String aName,int aAge,String aSchool){
        name = aName;
        age = aAge;
        school = aSchool;
    }
    public Student1(String aName,int aAge,String aSchool,String aMajor){
        name = aName;
        age = aAge;
        school = aSchool;
        major = aMajor;
    }
    public void setName(String aName){
        name = aName;
    }
    public void setAge(int aAge){
        age = aAge;
    }
    public void setSchool(String aSchool){
        school = aSchool;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSchool() {
        return school;
    }
    public String getMajor() {
        return major;
    }
    public void showStuInfo(){
        System.out.printf("name=%s,age=%d,school=%s,major=%s.\n",name,age,school,major);
    }
}

