import java.util.Scanner;

/*
 一维数组的声明方式：
type var[] 或 type[] var；
例如：
int a[];
int[] a1;
double b[];
String[] c; //引用类型变量数组
 Java语言中声明数组时不能指定其长度(数组中元素的数)， 例如： int a[5]; //非法

一维数组的使用：数组元素的引用
定义并用运算符new为之分配空间后，才可以引用数组中的每个元素；
数组元素的引用方式：数组名[数组元素下标]
 数组元素下标可以是整型常量或整型表达式。如a[3] , b[i] , c[6*i];
数组元素下标从0开始；长度为n的数组合法下标取值范围: 0 —>n-1；如int a[]=new
int[3]; 可引用的数组元素为a[0]、a[1]、a[2]
每个数组都有一个属性length指明它的长度，例如：a.length 指明数组a的长
度(元素个数)
数组一旦初始化，其长度是不可变的

数组是引用类型，它的元素相当于类的成员变量，因此数组一经
分配空间，其中的每个元素也被按照成员变量同样的方式被隐式
初始化。例如：
public class Test {
public static void main(String argv[]){
int a[]= new int[5];
System.out.println(a[3]); //a[3]的默认值为0
}
}
对于基本数据类型而言，默认初始化值各有不同
对于引用数据类型而言，默认初始化值为null(注意与0不同！)

 Java中使用关键字new来创建数组
 如下是创建基本数据类型元素的一维数组

public class Test{
public static void main(String args[]){
int[] s;
s = new int[10];
for ( int i=0; i<10; i++ ) {
s[i] =2*i+1;
System.out.println(s[i]);
}
}
}
 */
public class OneDimensionalArray {
    public static void main(String[] args) {
//        OneDimensionalArray.staticInitialization();
//        OneDimensionalArray.implicitInitialization();
//        OneDimensionalArray.practices1();
        OneDimensionalArray.gradeByScore();
    }

    //动态初始化
    public static void dynamicInitialization() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        String[] name = new String[3];
        name[0] = "钱学森";
        name[1] = "邓稼先";
        name[2] = "袁隆平";
    }

    //静态初始化
    public static void staticInitialization() {
        byte[] arr = {1, 2, 3};
        String[] tangPoetry = {
                "侠客行",
                "李白",
                "赵客缦胡缨，吴钩霜雪明。",
                "银鞍照白马，飒沓如流星。",
                "十步杀一人，千里不留行。",
                "事了拂衣去，深藏身与名。",
                "闲过信陵饮，脱剑膝前横。",
                "将炙啖朱亥，持觞劝侯嬴。",
                "三杯吐然诺，五岳倒为轻。",
                "眼花耳热后，意气素霓生。",
                "救赵挥金槌，邯郸先震惊。",
                "千秋二壮士，烜赫大梁城。",
                "纵死侠骨香，不惭世上英。",
                "谁能书阁下，白首太玄经。",};
        for (int i = 0; i < tangPoetry.length; i++) {
            System.out.println(tangPoetry[i]);
        }
    }

    //隐式初始化
    public static void implicitInitialization() {
        int[] a = new int[5];
        //基本数据类型数组在显式赋值之前，Java会自动给他们赋默认值。
        System.out.println(a[3]); //a[3]的默认值为0
    }

    //练习1
    public static void practices1() {
        /*
        升景坊单间短期出租4个月，550元/月（水电煤公摊，网费35元/月），空调、卫生间、厨房齐全。
        屋内均是IT行业人士，喜欢安静。所以要求来租者最好是同行或者刚毕业的年轻人，爱干净、安静。
         */
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];//180 1382 0100
        }
        System.out.println("联系方式：" + tel);
    }

    //练习2
    public static void gradeByScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int sNum = scanner.nextInt();
        int maxSco = 0;
        int[] scores = new int[sNum];
        char[] grades = new char[sNum];
        System.out.println("请输入"+sNum+"个学生成绩：");
        //求最高分
        for (int i = 0; i < sNum; i++) {
            scores[i] = scanner.nextInt();
            if (scores[i] > maxSco) maxSco = scores[i];
        }
        System.out.println("最高分是：" + maxSco);
        //根据最高分求相应的等级
        for (int i = 0; i < sNum; i++) {
            if (scores[i] >= maxSco - 10) grades[i] = 'A';
            else if (scores[i] >= maxSco - 20) grades[i] = 'B';
            else if (scores[i] >= maxSco - 30) grades[i] = 'C';
            else grades[i] = 'D';
            System.out.printf("student %d score is %d grade is %c\n",
                    i,scores[i],grades[i]);
        }

    }
}
