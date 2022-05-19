public class Practice5 {
}

class Ovld {
    private int num1;
    private int num2;
    private String str1;

    public Ovld(int aNum1, int aNum2, String aStr1) {
        num1 = aNum1;
        num2 = aNum2;
        str1 = aStr1;
    }

    public static void mOL(int n1) {
        System.out.println(Math.pow(n1, 2));
    }

    public static void mOL(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public static void mOL(String str) {
        System.out.println(str);
    }

    public static int max(int n1, int n2) {
        return Math.max(n1, n2);
    }

    public static double max(double n1, double n2) {
        return Math.max(n1, n2);
    }

    public static double max(double n1, double n2, double n3) {
        return Math.max(n3, Math.max(n1, n2));
    }

    public static void main(String[] args) {
        mOL(2);
        mOL(3, 6);
        mOL("Happy Birthday");
        System.out.println(max(2, 5));
        System.out.println(max(2.6, 2.5));
        System.out.println(max(4.3, 6, 9));
        int[] arr = new int[10];
        System.out.println(arr);
        char[] arr1 = new char[10];
        System.out.println(arr1);
    }
}
