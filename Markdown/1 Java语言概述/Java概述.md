# Java概述



## 1.人机交互方式

### 1.1 图形化界面

> GUI(Graphical User Interface GUI)
>
> 简单直观，易于上手。

### 1.2 命令行方式

> ### CLI(Command LIne Interface)
>
> ### 通过控制台，输入特定的指令。

------

## 2.常用的DOS命令

 dir : 列出当前目录下的文件以及文件夹 

 md : 创建目录  

 rd : 删除目录 

 cd : 进入指定目录 

 cd.. : 退回到上一级目录 

 cd: 退回到根目录 

del : 删除文件

 exit : 退出 dos 命令行 

补充：echo javase>1.doc


```shell
PS D:\> echo name=leihang,age=20.>aboutme.doc
name=leihang
age=20.>aboutme.doc
PS D:\> dir


    目录: D:\


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         2022/4/24     16:45                SteamLibrary


PS D:\> echo name=leihang,age=20>1.doc
name=leihang
age=20>1.doc
PS D:\> echo javase>1.doc
javase>1.doc
PS D:\> dir


    目录: D:\


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         2022/4/24     16:45                SteamLibrary
-a----         2022/4/24     18:45              0 新建 BMP 图像.bmp
-a----         2022/4/24     18:46              0 新建 Microsoft PowerPoint 演示文稿.pptx
-a----         2022/4/24     18:46              0 新建 Microsoft Word 文档.docx


PS D:\>
PS D:\> del '.\新建 BMP 图像.bmp'
PS D:\> dir


    目录: D:\


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         2022/4/24     16:45                SteamLibrary
-a----         2022/4/24     18:46              0 新建 Microsoft PowerPoint 演示文稿.pptx
-a----         2022/4/24     18:46              0 新建 Microsoft Word 文档.docx


PS D:\> del '.\新建 Microsoft PowerPoint 演示文稿.pptx'
PS D:\> del '.\新建 Microsoft Word 文档.docx'
PS D:\> dir


    目录: D:\


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         2022/4/24     16:45                SteamLibrary


PS D:\>
```

### 常用快捷键

> ← →：移动光标
>
>  ↑ ↓：调阅历史操作命令 
>
> Delete和Backspace：删除字符

-----

## 3.计算机语言的划分

### 3.1 语言演进

- 第一代语言

  > 机器语言：指令以二进制代码的形式存在

- 第二代语言

  > 汇编语言，使用助记符表示一条机器指令

- 第三代语言

  > C、Pascal、Fortran面向过程的语言
  >
  > C++面向过程/面向对象的语言
  >
  > Java跨平台的纯面向对象的语言
  >
  > .NET跨语言的平台
  >
  > Python、Scala…

  

### 3.2 Java简介

> Java是SUN(Stanford University Network，斯坦福大学网络公司 ) 1995年推出的一 门高级编程语言。 是一种面向Internet的编程语言。Java一开始富有吸引力是因为Java程序可以 在Web浏览器中运行。这些Java程序被称为Java小程序（applet）。applet使 用现代的图形用户界面与Web用户进行交互。 applet内嵌在HTML代码中。
>
> 从Java的应用领域来分，Java语言的应用方向主要表现在以下几个方面： • 企业级应用：主要指复杂的大企业的软件系统、各种类型的网站。Java的安全机制以及 它的跨平台的优势，使它在分布式系统领域开发中有广泛应用。应用领域包括金融、电 信、交通、电子商务等。
>
> • Android平台应用：Android应用程序使用Java语言编写。Android开发水平的高低 很大程度上取决于Java语言核心能力是否扎实。 • 大数据平台开发：各类框架有Hadoop，spark，storm，flink等，就这类技术生态 圈来讲，还有各种中间件如flume，kafka，sqoop等等 ，这些框架以及工具大多数 是用Java编写而成，但提供诸如Java，scala，Python，R等各种语言API供编程。 
>
> • 移动领域应用：主要表现在消费和嵌入式领域，是指在各种小型设备上的应用，包括手 机、PDA、机顶盒、汽车通信设备等。

### 3.3 Java语言的特点

> 特点一：面向对象 
>
> - 两个基本概念：类、对象 
>
> - 三大特性：封装、继承、多态 
>
> 特点二：健壮性 
>
> 吸收了C/C++语言的优点，但去掉了其影响程序健壮性的部分（如指针、内存的申请与 释放等），提供了一个相对安全的内存管理和访问机制 
>
> 特点三：跨平台性 
>
> 跨平台性：通过Java语言编写的应用程序在不同的系统平台上都可以运行。“Write  once , Run Anywhere” 原理：只要在需要运行 java 应用程序的操作系统上，先安装一个Java虚拟机 (JVM Java  Virtual Machine) 即可。由JVM来负责Java程序在该系统中的运行。

------

## 4 Java语言运行机制及运行过程

![image-20220424194926891](https://s2.loli.net/2022/04/24/vOA6UozkjFlWiQB.png)  
因为有了JVM，同一个Java 程序在三个不同的操作系统中都可以执行。这 样就实现了Java 程序的跨平台性。

> - Java虚拟机 (Java Virtal Machine) 
>
> - 垃圾收集机制 (Garbage Collection)

### 4.1 java文件运行

1. 将 Java 代码编写到扩展名为 .java 的文件中。

2. 通过 javac 命令对该 java 文件进行编译。 
3. 通过 java 命令对生成的 class 文件进行运行。

```shell
PS F:\java\Code\day01> javac .\HelloWorld.java
PS F:\java\Code\day01> java HelloChina
错误: 在类 HelloChina 中找不到 main 方法, 请将 main 方法定义为:
   public static void main(String[] args)
否则 JavaFX 应用程序类必须扩展javafx.application.Application
PS F:\java\Code\day01> javac .\HelloWorld.java
PS F:\java\Code\day01> java HelloChina
Hello World!
```

### 4.2 Java文件注释

```java
/*

1.Java规范的三种注释方式
单行注释
多行注释
文档注释（java特有）

2.单行注释和多行注释的作用
- 对所写程序进行解释说明，增强可读性，方便自己，方便别人
- 调试所写的代码

3.特点：单行注释和多行注释，注释了的内容不参与编译，换句话说，编译以后生成的.class结尾的字节码文件中不包含注释掉的信息。

4.文档注释的使用：
	文档注释的内容可以被JDK提供的工具 javadoc 所解析，生成一套以网页文件形式体现的该程序的说明文档。

5.多行注释不可以嵌套使用

对第一个java程序的总结
1.java程序编写-编译-运行的过程
编写：我们将编写的java代码保存在以".java"结尾的源文件中
编译：使用javac.exe命令编译java源文件，生成后缀名为".class"的字节码文件。 格式：javac 源文件名。java
运行：使用java.exe命令解释运行我们的字节码文件。 格式：java 类名 例如：java HelloWorld

2.在一个java源文件中可以声明多个class,但是最多只能有一个类声明为public。
而且要求声明为public的类的类名必须与源文件名相同。

3.程序的入口是main()方法，格式是固定的。

4.输出语句：
System.out.println();先输出数据，然后换行。
System.out.print();输出数据，不换行。

5.每一个执行语句都以";"结束。

6.编译的过程，编译以后，会生成一个或多个字节码文件，字节码文件的文件名与java源文件中的类名相同。
*/

/**
 文档注释
 @author lh
 @version v1.0
 这是这次课程的第一个java程序！
 */
public class HelloWorld{
    
    //单行注释，如下的main方法是程序的入口
    //main的格式是固定的
    
	/**
	 如下的main方法是程序的入口
	 */
	public static void main(String[] args){
        //单行注释，如下的语句表示输出到控制台
		System.out.println("Hello World!");
		System.out.print("Hello World!");
}

}
class Person{

}

class Animal{

}
```

### 4.3  javadoc解析

```shell
#以管理员权限运行，注意设置JAVA_HOME环境变量
PS F:\java\Code\day01> javadoc -d myHello -author -version HelloWorld.java
正在加载源文件HelloWorld.java...
正在构造 Javadoc 信息...
正在创建目标目录: "myHello\"
正在构建所有程序包和类的索引...
```

![image-20220424212344700](https://s2.loli.net/2022/04/24/IygV7JiS4hkTb9Q.png) 

双击打开`index.html`,网页如下

![image-20220424212450260](https://s2.loli.net/2022/04/24/qKjU1LIa8wQRPvk.png)

------

## 5 Java API文档

[文档下载地址](https://www.oracle.com/java/technologies/javase-jdk18-doc-downloads.html)

![image-20220424213537004](https://s2.loli.net/2022/04/24/OBID7oFhMeqYgRJ.png)

打开index.html

![image-20220424214515281](https://s2.loli.net/2022/04/24/dcBa9yxiSZr2RKA.png) 

网页中在右上的搜索框中搜索

![image-20220424214621622](https://s2.loli.net/2022/04/24/HreOmz5LhkSn1T7.png) 

------

## 6 总结

1.java程序编写-编译-运行的过程

编写：我们将编写的java代码保存在以".java"结尾的源文件中

编译：使用javac.exe命令编译java源文件，生成后缀名为".class"的字节码文件。 格式：javac 源文件名。java

运行：使用java.exe命令解释运行我们的字节码文件。 格式：java 类名 例如：java HelloWorld



2.在一个java源文件中可以声明多个class,但是最多只能有一个类声明为public。

而且要求声明为public的类的类名必须与源文件名相同。



3.程序的入口是main()方法，格式是固定的。



4.输出语句：

System.out.println();先输出数据，然后换行。

System.out.print();输出数据，不换行。



5.每一个执行语句都以";"结束。



6.编译的过程，编译以后，会生成一个或多个字节码文件，字节码文件的文件名与java源文件中的类名相同。

-----

## 7 良好的编程风格

- 正确的注释和注释风格

> 1.使用文档注释来注释整个类或整个方法。 
>
> 2.如果注释方法中的某一个步骤，使用单行或多行注释。 
>
- 正确的缩进和空白 
> 1.使用一次tab操作，实现缩进 
> 2.运算符两边习惯性各加一个空格。比如：2 + 4 * 5。
- 块的风格
> Java API 源代码选择了行尾风格

![image-20220424224425511](https://s2.loli.net/2022/04/24/Yq7E2Vpw6vrIOuP.png) 

## 8  常用的Java开发工具

### 8.1 文本编辑工具

> 记事本 
>
> UltraEdit 
>
> EditPlus  
>
> TextPad NotePad 



### 8.2 Java集成开发环境（IDE)： 

>  JBuilder 
>
> NetBeans 
>
> **`Eclipse`** 
>
> MyEclipse 
>
> **`IntelliJ IDEA`**

