package enums;

import java.util.Scanner;

/*
*@version 5.197 2022/5/13
* @author Lei hang
 */
public class EnumTest {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size=" + size);
        System.out.println("abbreviation="+size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");
        var size1 = Size.valueOf(Size.class,"SMALL");
    }
}
enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private String abbreviation;

    private Size (String abbreviation){this.abbreviation = abbreviation;}

    public String getAbbreviation() {
        return abbreviation;
    }
}
