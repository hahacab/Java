package s1.abstracttest;

public class TemplateTest {
    public static void main(String[] args) {
        subTemplate subTemplate = new subTemplate();
        subTemplate.spendTime();
    }
}
//计算某段代码执行所需呀的时间
abstract class Template{
    public void spendTime(){
        long start = System.currentTimeMillis();
        this.code();//不确定的部分
        long end = System.currentTimeMillis();

        System.out.println("花费的时间为："+(end-start));
    }

    public abstract void code();
}
class subTemplate extends Template{
    @Override
    public void code() {
        for (int i = 2;i<=1000;i++){
            boolean isFlag = true;
            for (int j=2;j<= Math.sqrt(i);j++){

                if (i%j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}