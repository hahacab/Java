import java.util.Scanner;

/*
if语句三种格式：
1. if(条件表达式){
执行代码块；
}
2. if(条件表达式){
执行代码块1;
}
else{
执行代码块2;
}
3. if(条件表达式1){
执行代码块1;
}
else if (条件表达式2){
执行代码块2;
}
……
else{
执行代码块n;
}
分支结构：if-else使用说明
 条件表达式必须是布尔表达式（关系表达式或逻辑表达式）、布尔变量
 语句块只有一条执行语句时，一对{}可以省略，但建议保留
 if-else语句结构，根据需要可以嵌套使用
 当if-else结构是“多选一”时，最后的else是可选的，根据需要可以省略
 当多个条件是“互斥”关系时，条件判断语句及执行语句间顺序无所谓
当多个条件是“包含”关系时，“小上大下 / 子上父下”

 */
public class IfAndElseStructure {
    //if-else语句应用举例
    public static void main(String[] args) {
        int age = 75;
        if (age< 0) {
            System.out.println("不可能！");
        } else if (age>250) {
            System.out.println("是个妖怪！");
        } else {
            System.out.println("人家芳龄 " + age +" ,马马乎乎啦！");
        }

        //调用finalAward方法
        int testScore = 70;
        IfAndElseStructure.finalAward(testScore);

        //调用排序函数
        int num1=2;
        int num2=3;
        int num3=9;
        IfAndElseStructure.sortFromSmall(num1,num2,num3);

        //调用彩票函数
        int lotteryNum = 51;
        IfAndElseStructure.lottery(lotteryNum);

        //调用是否结婚函数
        IfAndElseStructure.marryOrNot();
    }
    /*if语句例题1
    岳小鹏参加Java考试，他和父亲岳不群达成承诺：
    如果：
    成绩为100分时，奖励一辆BMW；
    成绩为(80，99]时，奖励一台iphone xs max；
    当成绩为[60,80]时，奖励一个 iPad；
    其它时，什么奖励也没有。
    请从键盘输入岳小鹏的期末成绩，并加以判断
     */
    public static void finalAward(int testScore){
        if (testScore==100){
            System.out.println("奖励一辆BMW");
        } else if (testScore>80&&testScore<=99) {
            System.out.println("奖励一台iphone xs max");
        } else if (testScore>=60&&testScore<80) {
            System.out.println("奖励一个 iPad");
        }else {
            System.out.println("什么奖励也没有");
        }
    }

    /*if语句例题2
    编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
    对它们进行排序(使用 if-else if-else),并且从小到大输出。
     */
    public static void sortFromSmall(int a,int b,int c){
        int min,medium,max;
        min=a;
        medium=b;
        max=c;
        if (a<=c&&c<=b){
            medium=c;
            max=b;
        } else if (b<=c&&c<=a) {
            min=b;
            medium=c;
            max=a;
        }else if (b<=a&&a<=c) {
            min=b;
            medium=a;
        }else if (c<=a&&a<=b) {
            min=c;
            medium=a;
            max=b;
        }else if (c<=b) {
            min=c;
            max=a;
        }
        System.out.printf("%d %d %d",min,medium,max);
    }

    /*
    假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入
    一个两位数，然后按照下面的规则判定用户是否能赢。
    1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
    2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
    3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
    4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
    5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
    提示：使用(int)(Math.random() * 90 + 10)产生随机数。
    Math.random() : [0,1) * 90 [0,90) + 10 [10,100)  [10,99]
     */

    public static void lottery(int lotteryNum) {
        //生成随机中奖彩票号码
        int winningNum=(int)(Math.random()*90+10);

//        //测试用
//        int winningNum=65;
        //求出中奖号码的十位与百位。
        int win1=winningNum/10;
        int win2=winningNum%10;
        System.out.println("两位数彩票号码为："+winningNum);
        System.out.println("你的彩票号码为："+lotteryNum);
        if (lotteryNum==winningNum){
            System.out.println("奖金10 000美元");
        } else if (lotteryNum==win2*10+win1) {
            System.out.println("奖金 3 000美元");
        } else if (lotteryNum/10==win1||lotteryNum%10==win2) {
            System.out.println("奖金1 000美元");
        } else if (lotteryNum/10==win2||lotteryNum%10==win1) {
            System.out.println("奖金500美元");
        }else {
            System.out.println("彩票作废");
        }
    }

    /*
    if语句练习4
    大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出
    一定的条件：高：180cm以上；富：财富1千万以上；帅：是。
     如果这三个条件同时满足，则：“我一定要嫁给他!!!”
     如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
     如果三个条件都不满足，则：“不嫁！”
    Sysout(“身高: (cm))
    scanner.nextInt();
    Sysout(“财富: (千万))
    scanner.nextDouble();
    Sysout(“帅否: (true/false)) (是/否)
    scanner.nextBoolean(); scanner.next(); “是”.equals(str)
     */

    public static void marryOrNot() {
        //定义marryIndex判断符合条件的数目
        int marryIndex = 0;
        //定义一个Scanner接收输入的数据
        Scanner scan = new Scanner(System.in);
        System.out.print("身高(cm):");
        double height = scan.nextDouble();
        if (height > 180)marryIndex++;
        System.out.print("财富(千万)：");
        double wealth = scan.nextDouble();
        if (wealth > 1)marryIndex++;
        System.out.print("帅否(true/false)：");
        boolean appearance = scan.nextBoolean();
        if (appearance)marryIndex++;
        if (marryIndex==3){
            System.out.println("我一定要嫁给他!!!");
        } else if (marryIndex==0) {
            System.out.println("不嫁！");
        }else {
            System.out.println("嫁吧，比上不足，比下有余。");
        }
    }
}
