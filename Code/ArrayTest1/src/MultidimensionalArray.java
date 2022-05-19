/*
 Java 语言里提供了支持多维数组的语法。
 如果说可以把一维数组当成几何中的线性图形，
那么二维数组就相当于是一个表格，像右图Excel
中的表格一样。
 对于二维数组的理解，我们可以看成是一维数组
array1又作为另一个一维数组array2的元素而存
在。其实，从数组底层的运行机制来看，其实没
有多维数组。

二维数组[][]：数组中的数组
格式1（动态初始化）：int[][] arr = new int[3][2];
定义了名称为arr的二维数组,二维数组中有3个一维数组,每一个一维数组中有2个元素
一维数组的名称分别为arr[0], arr[1], arr[2]
给第一个一维数组1脚标位赋值为78写法是：arr[0][1] = 78;

格式2（动态初始化）：int[][] arr = new int[3][];二维数组中有3个一维数组。
每个一维数组都是默认初始化值null (注意：区别于格式1）,可以对这个三个一维数组分别进行初始化
arr[0] = new int[3]; arr[1] = new int[1]; arr[2] = new int[2];
注：
int[][]arr = new int[][3]; //非法

格式3（静态初始化）：int[][] arr = new int[][]{{3,8,2},{2,7},{9,0,1,6}};
定义一个名称为arr的二维数组，二维数组中有三个一维数组
每一个一维数组中具体元素也都已初始化
第一个一维数组 arr[0] = {3,8,2};
第二个一维数组 arr[1] = {2,7};
第三个一维数组 arr[2] = {9,0,1,6};
第三个一维数组的长度表示方式：arr[2].length;
 注意特殊写法情况：int[] x,y[]; x是一维数组，y是二维数组。等价 int[] a;int[][] y;
 Java中多维数组不必都是规则矩阵形式
 */
public class MultidimensionalArray {
    public static void main(String[] args) {
//        MultidimensionalArray.practices1();
//        MultidimensionalArray.practice2();
//        MultidimensionalArray.practice3();
        MultidimensionalArray.practice4();
    }
    //多维数组使用
    public static void practices1() {
        int[][] arr1 = new int[3][2];//一个三行两列的二维数组
        System.out.println(arr1[0][0]);

        int[][] arr = new int[3][];//一个三行的二维数组
        arr[0] = new int[2];//第一个一维数组长度为2
        arr[1] = new int[3];//第一个一维数组长度为3
        arr[2] = new int[4];//第一个一维数组长度为4
    }
    //练习2
    public static void practice2() {
        int [][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i=0;i<3;i++){
            for (int j=0;j<arr[i].length;j++)
                sum+=arr[i][j];
        }
        System.out.println("sum="+sum);
    }

    //练习3
    public static void practice3() {
        int[] x,y[];
        x = new int[]{1,2,3};
        y = new int[][]{{5,6,7},{8,9,10}};
//        x[0] = y;
        y[0][0] = x[0];
        y[0] = x;
//        y[0][0] = x;
//        x[0][0] = y;


    }

    //练习4
    public static void practice4() {
        /*
        使用二维数组打印一个 10 行杨辉三角。
        【提示】
        1. 第一行有 1 个元素, 第 n 行有 n 个元素
        2. 每一行的第一个元素和最后一个元素都是 1
        3. 从第三行开始, 对于非第一个元素和最后一个元
        素的元素。即：yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
         */
        int[][] yangHui = new int[10][];
//        System.out.println(yangHui.length);
        for (int i=0;i<yangHui.length;i++){
            //给每个一维数组初始化
            yangHui[i] = new int[i+1];
            for (int j=0;j<=i;j++){
                if (j==0||j==i)yangHui[i][j]=1;
                else yangHui[i][j] = yangHui[i-1][j-1]+yangHui[i-1][j];
                System.out.print(yangHui[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
