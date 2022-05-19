package s1.main;

public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);
        show();
    }
    public static void show(){};
}
class Main{
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            args[i] = "args_"+i;
            System.out.println(args[i]);
        }
    }
}