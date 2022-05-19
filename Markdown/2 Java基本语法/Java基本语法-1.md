# java基本语法-1

## 1 关键字和保留字

### 1.1 关键字

关键字(keyword)的定义和特点

> - 定义：被Java语言赋予了特殊含义，用做专门用途的字符串（单词）
> - 特点：关键字中所有字母都为小写
> - 官方地址： https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html

![image-20220425175904356](https://s2.loli.net/2022/04/25/BmFdSQVr651gUNk.png)

![image-20220425175936653](https://s2.loli.net/2022/04/25/LarTf4yhO6Vdp5R.png)

### 1.2 保留字

Java保留字：现有Java版本尚未使用，但以后版本可能会作为关键字使 用。自己命名标识符时要避免使用这些保留字

goto 、const

## 2 标识符(Identifier)

### 2.1 标识符 

### 2.2 标识符的命名规则

​    如果不遵循如下规则，编译不通过。需要大家严格遵守。

> 由26个英文字母大小写，0-9 ，_或 $ 组成 
>
> 数字不可以开头。 
>
> 不可以使用关键字和保留字，但能包含关键字和保留字。 
>
> Java中严格区分大小写，长度无限制。 
>
> 标识符不能包含空格。

### 2.3 Java中的名称命名规范

​    如果不遵守如下的规范，编译可以通过，建议大家遵守。

> Java中的名称命名规范：
> 包名：多单词组成时所有字母都小写：xxxyyyzzz
> 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
> 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个
> 单词首字母大写：xxxYyyZzz
> 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ

- 注意1：在起名字时，为了提高阅读性，要尽量有意义，“见名知意”。 

- 注意2：java采用unicode字符集，因此标识符也可以使用汉字声明，但是不建议使用。

```java
/*
标识符的使用
1 标识符
    凡是自己可以取名字的地方都可以叫标识符。比如：类名，变量名，方法名，接口名，包名...

2 标识符的命名规则
    如果不遵循如下规则，编译不通过。需要大家严格遵守。

    由26个英文字母大小写，0-9 ，_或 $ 组成 

    数字不可以开头。 

    不可以使用关键字和保留字，但能包含关键字和保留字。 

    Java中严格区分大小写，长度无限制。 

    标识符不能包含空格。

3 Java中的名称命名规范
    如果不遵守如下的规范，编译可以通过，建议大家遵守。

    Java中的名称命名规范：
    包名：多单词组成时所有字母都小写：xxxyyyzzz
    类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
    变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个
    单词首字母大写：xxxYyyZzz
    常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ

4 
    注意1：在起名字时，为了提高阅读性，要尽量有意义，“见名知意”。 

    注意2：java采用unicode字符集，因此标识符也可以使用汉字声明，但是不建议使用。

5
*/

class IdentifierTest{
    public static void main(String[] args) {
        // int myNumber = 1001;
        int mynumber = 1002;
        System.out.println(mynumber);

        // int 学号 = 1003;
        // System.out.println(学号);
        
    }
}

class Hello1_${

}

//数字不可以开头。 
// class 1Hello1_${
    
// }

class Static1{

}

class User{

}

class Account{

}


```



## 3 变量

### 3.1 变量的使用

- 变量的概念： 

> 内存中的一个存储区域 
>
> 该区域的数据可以在同一类型范围内不断变化 
>
> 变量是程序中最基本的存储单元。包含变量类型、变量名和存储的值 
>

- 变量的作用

> 用于在内存中保存数据 
>

- 使用变量注意

> Java中每个变量必须先声明，后使用 
>
> 使用变量名来访问这块区域的数据 
>
> 变量的作用域：其定义所在的一对{ }内 
>
> 变量只有在其作用域内才有效 
>
> 同一个作用域内，不能定义重名的变量

```java
/*
变量的使用
1 java定义变量的格式：数据类型 变量名 = 变量值；

2 说明
2.1 变量必须先声明，再使用。
2.2 变量都定义在其作用域内，在作用域内，它是有效的。换句话说，出了作用域后，就失效了。
2.3 同一个作用域内，不可以声明两个同名的变量或类
*/
class VariableTest{
    public static void main(String[] args) {
        //变量的定义
        int myAge = 12;
        //变量的使用
        System.out.println(myAge);

        // 编译错误：使用myNumber之前，并未定义过myNumber变量
        // System.out.println(myNumber);

        //变量的声明
        int myNumber;
        
        //编译错误：使用myNumber之前并未赋值过变量myNumber
        // System.out.println(myNumber);

        // 变量的赋值
        myNumber = 1001;

        System.out.println(myNumber);

        //编译错误：myClass不在作用域内
        // System.out.println(myClass);

        //编译错误：已在方法 main(String[])中定义了变量 myAge
        // int myAge = 22;

    }

    public void method(){
        int myClass = 1;
    
    }

    //编译错误: 已在程序包 未命名程序包中定义了类 VariableTest
    // class VariableTest{}
}
```



### 3.2 变量的类型

![image-20220425193344802](https://s2.loli.net/2022/04/25/Xn2zS1M3hVpqols.png)

#### 整型

整数类型：byte、short、int、long 

- Java各整数类型有固定的表数范围和字段长度，不受具体OS的影响，以保证java程序的可移植性。 

- java的整型常量默认为 int 型，声明long型常量须后加‘l’或‘L’ 

- java程序中变量通常声明为int型，除非不足以表示较大的数，才使用long

![image-20220425194353872](https://s2.loli.net/2022/04/25/bDxvwUusGrLWa2l.png) 

> 500MB 1MB = 1024KB 1KB= 1024B B= byte ? bit? 
>
> bit: 计算机中的最小存储单位。byte:计算机中基本存储单元。

#### 浮点型

浮点类型：float、double 

- 与整数类型类似，Java 浮点类型也有固定的表数范围和字段长度，不受具体操作 系统的影响。 

- 浮点型常量有两种表示形式：  十进制数形式：如：5.12 512.0f .512 (必须有小数点） 

- 科学计数法形式:如：5.12e2 512E2 100E-2 

- float:单精度，尾数可以精确到7位有效数字。很多情况下，精度很难满足需求。 double:双精度，精度是float的两倍。通常采用此类型。 

- Java 的浮点型常量默认为double型，声明float型常量，须后加‘f’或‘F’。

  | 类 型        | 占用存储空间 | 表数范围               |
  | ------------ | ------------ | ---------------------- |
  | 单精度float  | 4字节        | -3.403E38 ~ 3.403E38   |
  | 双精度double | 8字节        | -1.798E308 ~ 1.798E308 |

  #### 字符型

字符类型：char 

- char 型数据用来表示通常意义上“字符”(2字节) 

- Java中的所有字符都使用Unicode编码，故一个字符可以存储一个字 母，一个汉字，或其他书面语的一个字符。 

- 字符型变量的三种表现形式： 

> 字符常量是用单引号(‘ ’)括起来的单个字符。例如：char c1 = 'a'; char c2  = '中'; char c3 = '9'; 
>
> Java中还允许使用转义字符‘\’来将其后的字符转变为特殊字符型常量。 例如：char c3 = ‘\n’; // '\n'表示换行符 
>
> 直接使用 Unicode 值来表示字符型常量：‘\uXXXX’。其中，XXXX代表 一个十六进制整数。如：\u000a 表示 \n。 
>

- char类型是可以进行运算的。因为它都对应有Unicode码。

#### 布尔型

布尔类型：boolean

- boolean 类型用来判断逻辑条件，一般用于程序流程控制： 

> if条件控制语句； 
>
> while循环控制语句； 
>
> do-while循环控制语句； 
>
> for循环控制语句； 
>

- boolean类型数据只允许取值true和false，无null。 

> 不可以使用0或非 0 的整数替代false和true，这点和C语言不同。 
>
> Java虚拟机中没有任何供boolean值专用的字节码指令，Java语言表达所操作的 boolean值，在编译之后都使用java虚拟机中的int数据类型来代替：true用1表示，false 用0表示。———《java虚拟机规范 8版》

```java
/*
java定义的数据类型

1 变量按照数据类型来分

    1.1 基本数据类型：
        整形：byte \ short \ int \ long
        浮点型：float \ double
        字符型：char
        布尔型：boolean
    
    1.2 引用数据类型：
        类（class)
        接口（interface)
        数字（array)

2 变量在类中声明的位置
    2.1 成员变量
    2.2 局部变量

*/
public class VariableTest1 {
    public static void main(String[] args) {
        // 整型 ：byte（1字节=8bit) \ short(2字节) \ int(4字节) \ long(8字节)
        //byte 范围：-128~127
        byte b1 = 12;
        byte b2 = -128;

        // b2 = 128; //编译不通过，不兼容的类型: 从int转换到byte可能会有损失
        System.out.println(b1);
        System.out.println(b2);

        short s1 = 128;
        int i1 = 1234;

        //声明long型变量，必须以小写的"l"或大写的"L"结束
        //通常定义整型变量时，使用int型
        long l1 = 134514L;
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        //浮点型，表示带小数点的数值
        //float表示的数值范围比long还大

        double d1 = 123.3;
        System.out.println(d1);
        //声明float型变量，必须以小写的"f"或大写的"F"结束,不兼容的类型: 从double转换到float可能会有损失
        //通常定义浮点型时，使用double型
        float f1 = 114.514F;
        System.out.println(f1);

        //字符型：char(1字符=2字节)
        //定义char型变量，通常使用一对单引号'',内部只能使用一个字符
        char c1='a';
        c1 ='A';
        //编译不通过：错误: 不是语句
        // c1='Ab';
        System.out.println(c1);

        char c2='中';
        System.out.println(c2);
        //表示方式： 1.声明一个字符 2.转义字符 3.直接使用unicode值来表示字符型常量
        char c3 = '\n';//换行符
        c3 ='\t';//制表符   
        System.out.print("Hello "+c3);
        System.out.println("World!");

        char c4='\u0043';
        System.out.println(c4);

        //4.布尔型：boolean
        //只能取两个值之一：true、false
        boolean bb1 = true;
        System.out.println(bb1);

        boolean isMarried = true;
        if(isMarried){
            System.out.println("你不能参加\"单身\"party了!\\n很遗憾");
        }else{
            System.out.println("你可以多谈谈女朋友！");
        }
    }
}

```

#### 基本数据类型转换

![image-20220425213630821](https://s2.loli.net/2022/04/25/54NlQehT1ZoVnd2.png)  

## 4 运算优先级

![image-20220426211537173](https://s2.loli.net/2022/04/26/lPxkAVvDYXdg5U2.png) 