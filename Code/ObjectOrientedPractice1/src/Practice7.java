public class Practice7 {
    public static void main(String[] args) {
        var pra7 = new Practice7();
        System.out.println(pra7.factoring(8));
        System.out.println(pra7.f2(2));
        System.out.println(pra7.f3(10));
        System.out.println(pra7.fibonacci(10));

    }
    public int factoring(int num){
        int factor=1;
        if (num>1) factor = num *factoring(num-1);
        return factor;
    }
    /*
    已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
的整数，求f(10)的值。
     */
public int f2(int num){
    if (num==0)return 1;
    if (num==1)return 4;
    else
        return 2*f2(num-1)+f2(num-2);
}
/*
已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
其中n是大于0的整数，求f(10)的值。

 */
    public int f3(int num){
        if (num==20)return 1;
        if (num==21)return 4;
        else
            return f3(num+2)-2*f3(num+1);
    }
    public int fibonacci(int num){
        if (num==1||num==2)return 1;
        else
            return fibonacci(num-1)+fibonacci(num-2);
    }
}
