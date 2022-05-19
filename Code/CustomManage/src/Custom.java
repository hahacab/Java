public class Custom {

    private  int id;
    private String name;
    private String sex;
    private int age;
    private String telephoneNum;
    private String mail;


    public Custom(){}

    public Custom(String name,String sex,int age,String telephoneNum,String mail){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.telephoneNum = telephoneNum;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public String getMail() {
        return mail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String toString() {
        return String.format("\n%-4d\t%-8s\t%-4s\t%-4d\t%-12s\t%-20s\t",getId(),getName(),
                getSex(),getAge(),getTelephoneNum(),getMail());
    }
}
