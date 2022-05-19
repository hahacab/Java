import java.text.NumberFormat;
import java.time.*;//导入整个包或特定类 如：import java.time.LocalDate;
import java.util.Date;
//只能使用*号导入一个包，而不能使用 import java.*或 import java.*.*,导入以java为前缀的的所有包。

public class FactoryMethod {
    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x=0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));
        //完全限定名访问包的公共类
        java.time.LocalDate today = java.time.LocalDate.now();
        System.out.println(today);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);
        Date yesterday;

    }
}
