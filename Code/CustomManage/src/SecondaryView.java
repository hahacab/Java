import java.util.ArrayList;
import java.util.Scanner;

public class SecondaryView {

    public static void addCustom(ArrayList<Custom> customArrayList) {
        System.out.println("-----------------添加客户-----------------");
        Custom cus = new Custom();
        setCustom(cus);
        cus.setId(customArrayList.size()+1);
        customArrayList.add(cus);
        System.out.println("-----------------添加完成-----------------");
    }

    public static void changeCustom(ArrayList<Custom> customArrayList) {
        System.out.println("-----------------修改客户-----------------");
        System.out.println("请输入客户编号");
        Scanner scanner = new Scanner(System.in);
        var num = scanner.nextInt()-1;
        if (num <= customArrayList.size()) {
            Custom custom;
            custom = customArrayList.get(num);
            setCustom(custom);
            System.out.println("-----------------修改完成-----------------");
        } else {
            System.out.println("没有编号为"+num+"的客户");
        }
    }
    public static void removeCustom(ArrayList<Custom> customArrayList){
        System.out.println("-----------------删除客户-----------------");
        customList(customArrayList);
        System.out.println("\n输入你想删除的客户编号");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num<=0||num>customArrayList.size()) System.out.println("错误的编号");
        else {
            customArrayList.remove(num-1);
            System.out.println("-----------------删除成功-----------------");
        }
    }

    public static void customList(ArrayList<Custom> customArrayList) {
        System.out.println("-----------------客户列表-----------------");
//        System.out.println("编号  姓名       性别    年龄   电话                   邮箱");
        System.out.printf("%-4s\t%-8s\t%-4s\t%-4s\t%-12s\t%-20s\t","编号","姓名","性别","年龄","电话","邮箱");
        var cus = new Custom();
        for (Custom custom : customArrayList) {
            cus = custom;
            System.out.printf(cus.toString());
        }
    }

    public static void setCustom(Custom custom) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("姓名" + " " + custom.getName());
        custom.setName(scanner.nextLine());

        System.out.println("性别"+" "+custom.getSex());
        setSex(custom);

        System.out.println("年龄" + " " + custom.getAge());
        custom.setAge(scanner.nextInt());

        System.out.println("电话"+" "+custom.getTelephoneNum());
        custom.setTelephoneNum(scanner.next());

        System.out.println("邮箱" + " " + custom.getMail());
        custom.setMail(scanner.next());
    }
    public static void setSex(Custom custom){
        Scanner scanner = new Scanner(System.in);
        String sex = scanner.nextLine();
        if (sex.equals("男")||sex.equals("女")) custom.setSex(sex);
        else setSex(custom);
    }
}
