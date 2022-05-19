package mankind;

public class KidsTest {
    public static void main(String[] args) {
        var kids = new Kids();
        kids.setSex(1);
        kids.setSalary(0);
        kids.setYeasOld(10);
        System.out.printf("sex=%d,salary=%d,yearsOld=%d\n",kids.getSex(),
                kids.getSalary(),kids.getYeasOld());
        kids.employed();
    }
}
