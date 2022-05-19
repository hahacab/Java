package s2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest overrideTest = new OverrideTest();
        overrideTest.display(new SubClass());
    }
    public void display(SuperClass superClass){
        try {
            superClass.method();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
class SuperClass{
    public void method()throws IOException{

    }
}
class SubClass extends SuperClass{
    public void method()throws FileNotFoundException {
        //'s2.SubClass' 中的 'method()' 与 's2.SuperClass' 中的 'method()' 冲突

    }
}