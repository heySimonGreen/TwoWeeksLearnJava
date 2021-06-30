# java学习笔记 
尚硅谷学习 数据结构、常用算法、常用设计模式、JVM  
[java面试1](https://mp.weixin.qq.com/s/-xFSHf7Gz3FUcafTJUIGWQ)

## 1.杂记  
### 1.1 新建的项目为什么会有out文件夹，而且颜色也不一样？  
#### 是由IntelliJ IDEA从.class文件重新创建的源代码  
### 1.2 jdk  

### 1.3 常用命令行
1. dir列出当前目录下的文件以及文件夹
2. md创建目录
3. rd删除目录
4. cd进入指定目录
5. cd..退回到上一级目录
6. cd\ 退回到根目录
7. del删除文件
8. exit推出dos命令行

### 1.4 java语言的特性
    特点一：面向对象   
        两个基本概念：类、对象  
        三大特性：封装、继承、多态 
    特点二：健壮性 
        吸收了c/c++的优点，但去掉了其影响程序健壮性的部分（如指针、内存的申请与释放等），提供了一个相对安全的内存管理与访问机制  
    特点三：跨平台性
        跨平台性：通过Java语言编写的应用程序在不同的系统平台上都可以运行、”write once，run anywhere“
        原理：只要在需要运行Java应用程序的操作系统上，先安装一个Java虚拟机即可。由jvm来负责Java程序在该系统中的运行。
#### 1.4.2 JAVA两种核心机制  
##### 1.java虚拟机(java vital machine)
##### jvm是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据、内存、寄存器。
1. 对于不同的平台，有不同的虚拟机。
2. 只有某平台提供了对应的Java虚拟机，Java程序才可以在此平台上运行。
3. Java虚拟机机制屏蔽了底层运行平台的差别，实现了”一次编译，到处运行“
用户user -> 字节码文件 -> jvm -> 操作系统 -> 硬件  
jdk -> jre -> jvm
##### 2.垃圾收集机制（Garbage collection）  
1. 不再使用的内存空间应回收  
    1.1 在c/c++等语言中，有程序员负责回收无用的内存
    1.2 Java语言消除了程序员回收无用内存空间的责任；他提供一种系统级线程跟踪存储空间的分配情况。并在jvm空闲时，检查并释放那些可被释放的存储空间。
2. 垃圾回收在Java程序运行过程中自动进行，程序员无法精确控制和干预。  
3. Java程序还会出现内存泄漏和内存溢出问题吗？YES
### 1.5 JAVA语言的环境搭建
#### 1.5.1 什么是jdk,jre  
##### jdk(java development kit java开发工具包)
1. jdk是提供给Java开发人员使用的，其中包含了Java的开发工具，也包含了jre。所以安装了jdk，就不用再单独安装jre了
2. 其中的开发工具：编译工具（javac.exe）、打包工具（jar.exe）等  
#####jre(java runtime environment java运行环境)
1. 包括Java虚拟机（jvm java virtual machine）和Java程序所需的核心类库等，如果想要运行一个开发好的Java程序，计算机中只需要安装jre即可。  
**jdk = jre + 开发工具集（例如javac编译工具等）**  
**jre = jvm + javaSE标准类库**  
## 2. 代码执行顺序
&ensp;&ensp;静态代码块-->构造代码块-->构造函数-->局部代码块-->同步代码块
### 2.1 [构造方法，构造代码块](https://blog.csdn.net/Ximerr/article/details/115441000?utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control)  
&ensp;&ensp;在执行构造方法前会执行构造代码块  
### 2.2 在一个Java源文件中可以声明多个class，但是最多只能有一个类声明为public的  
&ensp;&ensp;而且要求声明为public的类的类名必须与源文件名相同  
&ensp;&ensp;要加public也只能加到和文件名同名的class前面  
&ensp;&ensp;编译的过程，编译以后，会生成一个或多个字节码文件。字节码的文件名与Java源文件的类名相同  
### 2.3 变量命名规范
&ensp;&ensp;包名：所有字母小写  
&ensp;&ensp;类名、接口名：多单词组成时，所有单词首字母大写，大驼峰  
&ensp;&ensp;变量名、方法名：多单词组成时，第一个字母小写，后面单词首字母大写，小驼峰  
&ensp;&ensp;常量命：所有单子字母大学，多个连接时中间用下划线链接  
## 3 数据类型 8种基本数据类型+应用数据类型
&ensp;&ensp;String时Java的数据类型，但不是基本数据类型，基本数据类型只有7种  
### 3.1 基本数据类型
    整型：byte 1 short 2 int 4 long 8
    浮点型：float 4 double 8
    字符型：char
    布尔型：boolean 
### 3.2 应用数据类型
    类（class）
    接口（interface）
    数组（array） 
### 整型：byte short int long
| 类型 | 占用存储空间  | 表数范围 |
|  ----  |  ----  |  ----  |
| byte |1字节=8bit位|-128~127|
| short |2字节|-2^15 ~ 2^15-1|
| int  |4字节|-2^31 ~ 2^31-1|
| long |8字节|-2^63 ~ 2^63-1|  
&ensp;&ensp;声明long型变量必须以l或者L结尾

### 浮点类型（表示带小数点的数值）：float double  
|  类型   | 占用存储空间  | 表数范围 |
|  ----  | ----  | ---- |
|  单精度float  | 4字节 | -3.403E38 ~ 3.403E38 |
| 双精度double  | 8字节 | -1.798E308 ~ 1.798E308 |  
&ensp;&ensp;定义float变量时必须以f或者F结尾，double不需要

&ensp;&ensp;float占四个字节，但比long8个字节存的数据范围还大，自然比int4个字节大哈，这是为什么？  
&ensp;&ensp;因为float内存种表示数是用一部分表示数，另一部分表示10的多少次方，而int都是拿来表示数  
### 字符型：char(1字符=2字节) char c1 = 'a'  
&ensp;&ensp;定义char类型变量，通常使用一对'',内部只能写一个字符。  
### 3.3 数据类型间的转换
