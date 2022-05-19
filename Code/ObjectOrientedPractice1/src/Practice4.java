import java.util.Random;

class Rectangle{
    private int width;
    private int height;

    public Rectangle(int aWidth,int aHeight){
        width = aWidth;
        height =aHeight;
    }
    public Rectangle(){

    }
    public int printRectangle(int width,int height){
        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                if (i==0||i==height-1||j==0||j==width-1)
                    System.out.print("*  ");
                else System.out.print("   ");
            }
            System.out.println();
        }
        return width*height;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 8);
        System.out.println(rect1.printRectangle(7, 5));
    }
}
class Stu{
    private int number;//学号
    private int state;//年级
    private int score;//分数

    public Stu(){
        var rand = new Random();
        number = rand.nextInt(1000)+1;
        state = rand.nextInt(9)+1;
        score = rand.nextInt(101);
    }
    public void printState3(){
        if (state==3)
            showStu();
    }
    public void showStu(){
        System.out.printf("number=%d,state=%d,score=%d\n",number,state,score);
    }
    //静态方法进行冒泡排序
    public static void bubbleSort(Stu[] stu){
        int len = stu.length;
        var temp = new Stu();
        for (int i=1;i<len;i++){
            for (int j=0;j<len-i;j++){
                if (stu[j].score>stu[j+1].score){
                    temp=stu[j];
                    stu[j]=stu[j+1];
                    stu[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("学生信息如下");
        var stu = new Stu[20];//构建学生对象数组
        for (int i=0;i<stu.length;i++) {
            stu[i] = new Stu();
            stu[i].showStu();
        }

        System.out.println("三年级学生信息如下");
        for (Stu value : stu) {
            value.printState3();
        }

        System.out.println("\n排序后结果如下");
        Stu.bubbleSort(stu);
        for (Stu value : stu) {
            value.showStu();
        }
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int aYear,int aMonth,int aDay){
        year = aYear;
        month =aMonth;
        day =aDay;
    }

    public void printDate(){
        System.out.printf("Birthday=%d,%d,%d\n",year,month,day);
    }

    public static void main(String[] args) {
        MyDate myBirthday = new MyDate(2001,7,2);
        var mySisterBirthday = new MyDate(2008,12,4);
        myBirthday.printDate();
        mySisterBirthday.printDate();
    }
}
