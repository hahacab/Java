import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class HouseholdIncome {
    public static void main(String[] args) {
        HouseholdIncome.initializationFile();
        HouseholdIncome.userInterface();
    }

    public static void userInterface() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n家庭收支记账软件\n");
        System.out.println("1 收支记录");
        System.out.println("2 登记收入");
        System.out.println("3 登记支出");
        System.out.println("4 退出\n");
        System.out.println("请选择1~4");
        String inputNum = scan.nextLine();
        switch (inputNum) {

            case "1" -> HouseholdIncome.record();

            case "2" -> HouseholdIncome.editIncome();

            case "3" -> HouseholdIncome.editExpenditure();

            case "4" -> HouseholdIncome.exitFun();

            default -> {
                System.out.println("无效的字符，奖返回到主界面");
                HouseholdIncome.userInterface();
            }
        }
    }

    //查看收支
    public static void record() {
        //使用Scanner读取文件
        try {
            Scanner in = new Scanner(Path.of("myIncome.txt"), StandardCharsets.UTF_8);
            while (in.hasNextLine()) {
                String i = in.nextLine();
                System.out.println(i);
            }
            in.close();
            in = new Scanner(Path.of("myExpenditure.txt"), StandardCharsets.UTF_8);
            while (in.hasNextLine()) {
                String i = in.nextLine();
                System.out.println(i);
            }
            in.close();
            HouseholdIncome.userInterface();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //编辑收入
    public static void editIncome() {
        String fileName = "myIncome.txt";
        String inOrEx = "收入";
        HouseholdIncome.edit(fileName, inOrEx);
    }

    //编辑支出
    public static void editExpenditure() {
        String fileName = "myExpenditure.txt";
        String inOrEx = "支出";
        HouseholdIncome.edit(fileName, inOrEx);

    }

    //编辑账单
    public static void edit(String fileName, String inOrEx) {
        try {
            FileWriter fw = new FileWriter(fileName, StandardCharsets.UTF_8, true);
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入" + inOrEx + "项目");
            String program = scan.nextLine();

            System.out.println("请输入" + inOrEx + "金额");
            String cost = scan.nextLine();

            Date dNow = new Date();

            String item = String.format("|%-16s|%-16s|%-16tc\n",program,cost,dNow);
            System.out.println("确定记录吗？(default=y/n)");

            String confirm = scan.nextLine();
            if ("n".equals(confirm)) {
                System.out.println("放弃了本次记录！");
            } else {
                fw.append(item);
                System.out.println("记录成功!");
            }
            System.out.println("继续记录吗？(default=y/n)");
            fw.close();
            HouseholdIncome.recordContinue(inOrEx);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exitFun() {
        Scanner scan = new Scanner(System.in);
        System.out.println("确定退出吗？(default=y/n)");
        String confirm = scan.nextLine();
        if ("n".equals(confirm)) {
            HouseholdIncome.userInterface();
        }
    }

    public static void recordContinue(String inOrEx) {
        Scanner scan = new Scanner(System.in);
        String confirm = scan.nextLine();
        if ("n".equals(confirm)) {
            System.out.println("返回主界面");
            HouseholdIncome.userInterface();
        } else {
            if (Objects.equals(inOrEx, "收入")) HouseholdIncome.editIncome();
            else HouseholdIncome.editExpenditure();
        }
    }

    //初始化收支表，如果不存在，则创建收支表
    public static void initializationFile() {
        File file1 = new File("myIncome.txt");
        File file2 = new File("myExpenditure.txt");
        if (!file1.exists()||!file2.exists()){
            //创建收入表，并添加表头
            try {
                FileWriter fw = new FileWriter("myIncome.txt", StandardCharsets.UTF_8,true);
                String header = String.format("%-17s\n|%-16s|%-16s|%-32s\n","收入表","项目","金额","时间");
                fw.append(header);
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            //创建支出表，并添加表头
            try {
                FileWriter fw = new FileWriter("myExpenditure.txt", StandardCharsets.UTF_8,true);
                String header = String.format("%-17s\n|%-16s|%-16s|%-32s\n","支出表","项目","金额","时间");
                fw.append(header);
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}


