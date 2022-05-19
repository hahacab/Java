import java.util.ArrayList;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        ArrayList<Custom> customArrayList = new ArrayList<>(20);
        var custom = new Custom("雷航","男",20,"15837697919","2659171235@qq.com");
        custom.setId(1);
        customArrayList.add(custom);
        boolean tap = true;
        mainView(tap,customArrayList);
    }

    public static void mainView(boolean tap,ArrayList<Custom> customArrayList) {
        while (tap) {
            System.out.println("""
                                 
                                 -----------------客户信息管理软件-----------------
                                    
                                                         1 添 加 客 户
                                                         2 修 改 客 户
                                                         3 删 除 客 户
                                                         4 客 户 列 表
                                                         5 退 出
                                    
                                                         请选择(1-5)：
                    """);
            Scanner scanner = new Scanner(System.in);
            int in = scanner.nextInt();
            switch (in) {
                case 1 -> SecondaryView.addCustom(customArrayList);
                case 2 -> SecondaryView.changeCustom(customArrayList);
                case 3 -> SecondaryView.removeCustom(customArrayList);
                case 4 -> SecondaryView.customList(customArrayList);
                case 5 -> tap = false;
                default -> System.out.println("错误的命令，请输入0~5");
            }
        }
    }
}
