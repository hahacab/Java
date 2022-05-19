package s2.java8;

public class ManTest {
    public static void main(String[] args) {
        Man man =new Man();
        man.help();
        //"我该怎么办呢？"
        //"老妈，我来救你了"
        //"媳妇，别怕，我来了"
    }

}
interface Filial {// 孝顺的
    default void help() {
        System.out.println("老妈，我来救你了");
    }
}
interface Spoony {// 痴情的
    default void help() {
        System.out.println("媳妇，别怕，我来了");
    }
}
class Man implements Filial, Spoony {
    @Override
    public void help() {
        System.out.println("我该怎么办呢？");
        Filial.super.help();//"老妈，我来救你了"
        Spoony.super.help();//"媳妇，别怕，我来了"
    }
}