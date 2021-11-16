# java学习笔记 学习springboot之前需要学习SSM，学习springCloud
## 常用快捷键  
1. 调整格式全选后ctr+alt+l  
   
   > 格式不对问题：由于自己安装了google-java-format，当安装了其他代码格式化插件会导致代码缩进为2个空格
2. 在要输出的变量后输.soutv，就可以了  
3. ctrl+alt+t try-catch快捷键  
4. alt +enter 快速创间对象快捷键
5. Ctrl+Shift+Alt+N;知道类名查找类，通过类名查找类
6. ctrl+p new 对象时构造函数使用的提示功能
7. 在整个项目中查找关键词 ctrl+shift+r
尚硅谷学习 数据结构、常用算法、常用设计模式、JVM  
[java面试1](https://mp.weixin.qq.com/s/-xFSHf7Gz3FUcafTJUIGWQ)

## 1.杂记  
### 1.1 新建的项目为什么会有out文件夹，而且颜色也不一样？  
#### 是由IntelliJ IDEA从.class文件重新创建的源代码  
#### 下载bilibili视频，下载的是后先选择一个需要存放视频的位置
```python
pip install you-get
you-get https://www.bilibili.com/video/BV13U4y1n7SH?spm_id_from=333.851.b_7265636f6d6d656e64.4
```
#### pip install faker生产假数据
### 1.2 jdk  
#### zeal在windows下使用,使用迅雷下载需要加速一下
1. [参考连接1](https://blog.csdn.net/DickDiShuiShiChuan/article/details/112283732)
2. [文档下载查询地址](http://api.zealdocs.org/v1/docsets)
### 异或操作加密解密m^n^n = m
m异或n得到Z  
Z在异或n又得到m

### 1.3 常用命令行
1. dir列出当前目录下的文件以及文件夹
2. md创建目录
3. rd删除目录
4. cd进入指定目录
5. cd..退回到上一级目录
6. cd/ 退回到根目录
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
### 3.2 引用数据类型
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
&ensp;&ensp;这里虽然没报错，是因为自动类型提升，不加L它其实是int类型  
整数默认是int类型，小数默认是double
```java
long a = 114;
```
```java
float a = 32.3f;
float g = (float)323.4//强制类型转换
```

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
### 3.3 数据类型间的运算规则
#### 自动类型提升
结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型  
byte、char、short --> int --> long --> float --> double   
特别的：当byte、char、short三种类型的变量做运算时（包括自己和自己做运算），结果为int型
```java
byte bb = 2;
byte cc = 2;
short i = bb + cc;//编译不通过
```
#### 强制类型转换（自动类型提升的逆运算）注意会精度损失
```java
long l1 = 123l;
short s2 = (short)l1;
```

### 3.4  String属于引用数据类型
String可以和8种基本数据类型做运算，但运算只能是连接运算：+  
注意运算的结果为strign类型，+号前后只要有一个是String那么结果就是String类型的  

## 4. 进制
### 二进制 以0B开头
### 十进制
### 八进制 以0开头
### 16进制 以0x开头  
## 5. 运算符
### 5.1 i++ ++i 自增自减运算符
```java
int a = 2;
int b = 9;
int c = a + b++;
int c = a + --b ;
```
#### 注意点：自增自减一不会改变变量本省的数据类型  
    利用这一点可以做到byte、short的加一  
```java
short a = 3;
short b = a + 1; //编译不通过，因为这里结果为int不能转换为short，可以short b = (short)(a + 1)
short b = ++a;
```
    byte也是一样的可以
```java
byte a = 127;
byte b = ++a;
此时结果为-128，用计算机原理解释就是01111111加上一过后就是10000000=-128
```
### 5.2 连续赋值也不会改变数据类型
&ensp;&ensp;例如
```java
byte a = 3;
 a += 4;这里编译没问题
```
&ensp;&ensp;面试题  
```java
int a = 10;
a += (a++) + (++a);
此时a=12
```
### 5.3 逻辑与 短路与 逻辑或 短路或（& && | ||）  
&ensp;&ensp;短路与&&，表示只要从左到右出现满足条件的，就不再后面的执行，配合自增自减考察
```java
int x = 1;
int y = 1;
if(x++==2 & ++y==2){
    x = 7
        }
System.out.println("x："+x)
System.out.println("y："+y)
```
```java
int x = 1;
int y = 1;
if(x++==2 && ++y==2){
    x = 7
        }
System.out.println("x："+x)
System.out.println("y："+y)
```
### 5.4 & | ^ ~ 与、或、异或、取反运算
&ensp;&ensp;例如 12&5 =4 12|5=13 12^5=9  
### 5.5 三目运算符   
&ensp;&ensp;只有两个分支选择的时候最好用这个，比如比较两个数的大小。嵌套也可以表示右多个分支的情况。  
&ensp;&ensp;凡是可以用三目运算符的地方都可以使用if-else替换，反之不成立。  
&ensp;&ensp;既可以使用三元运算符又可以使用if-else结构，优先使用三元运算符，三元运算符效率高。  
### 5.6 流程控制（分支结构、循环结构、顺序结构）
&ensp;&ensp;if-else 三种结构（if()、if-else、if-else-else.....）  
```java
String ss = "ss";
char c = ss.charAt(0)
```

### 5.7 循环结构 for while do--while
&ensp;&ensp;do-while:要先执行一次再循环，如果不需要先执行一次再循环和while、for一样。  
&ensp;&ensp;闰年：两种情况。1、能被4整除且不能被100整除.2、世纪年份情况时，被400整除时闰年。闰年2月有29天，就这一个月多一天，闰年366天  

### 5.8 水仙花数、最小公倍数、最大公约数、质素 的代码  
## 6. 数组  
### 6.1 数组的复制和赋值区别
### 6.2 数组在内存中的图解
### 6.3 二分查找，前提：数组必须是有序的  
### 6.4 冒泡排序、快速排序、堆排序、归并排序  
## 7. 面向对象  
### 7.1 面向过程POP面向对象OOP  
&ensp;&ensp;二者都是一种思想，面向对象是相对与面向过程而言的。面向过程，强调的是功能行为，以函数为最小单位，考虑怎么做。  
&ensp;&ensp;面向对象，将功能封装进对象，强调具备了功能的对象，以类/对象为最小单位，考虑谁来做。  
&ensp;&ensp;面向对象更加强调运用人类在日常的思维中采用的思想方法与原则，如抽象、分类、继承、聚合、多态等。  
### 7.2 面向对象三大特征  
封装、继承、多态  
### 7.3 类和对象是面向对象的核心概念  
&ensp;&ensp;类是对一类事务的描述，是抽象的、概念上的定义。  
&ensp;&ensp;对象是实际存在的该类事务的每个个体，因而也称为实例。  
&ensp;&ensp;万事万物皆对象  
一、设计类，其实就是设计类的成员  
属性 = 成员变量 = field = 域、字段  
方法 = 成员方法 = 函数 =实例化类  
二、类和对象的使用（面向对象思想落地的实现）  
1. 创建类，设计类的成员。  
2. 创建类的对象。  
3. 通过“对象.属性”或“对象.方法”调用对象的结构  
   引用类型的变量，只可能存储两类值：null和地址值  
   
### 8 方法重载 方法的参数列表一定不相同  
#### 8.1 定义：在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同即可  
1. ”两同一不同“：同一个类、相同方法名；参数列表不同，参数个数不同，参数类型不同。  
2. 举例：Arrays类中重载的sort() / binarySearch()  
3. 判断是否是重载：跟方法的权限修饰符、返回值类型、形参变量名、方法体都没关系  
4. 在通过对象调用方法时，如何确定某一个指定的方法：方法名 ---> 参数列表  
在每次System.out.println()方法时，也是方法的重载，里面放字符串它调用的就是输出字符，放数字里面输出的就是数字  
###9 jdk 5.0新增的内容 可变形参  
1. 具体使用   
   1.1 可变个数形参的格式：数据类型 ... 变量名  
   1.2 当调用可变个数形参的方法时，传入的参数个数可以是：0个、1个、2个......  
   1.3 可变个数形参的方法与本类中方法名相同，参数不同的方法之间构成重载   
   1.4 可变个数形参的方法与本类中方法名相同，参数类型也相同的数组之间不构成重载  
   1.5 可变个数形参在方法的形参中，必须声明在末尾  
   1.6 可变个数形参在方法的形参中，最多只能声明一个可变形参
   
```java 
     public void show(String ... strs){
        System.out.println("String ... strs");
        System.out.println(strs); [Ljava.lang.String;@1b6d3586
        System.out.println(strs[0]);fsda
    }
    
    day09OverloadTest.show("fsda","fasdfs");
```
### 10 方法的形参的传递机制：值传递
1. 形参：方法定义时，声明的小括号内的参数  
   实参：方法调用时，实际传递给形参的数据  
2. 值传递机制：  
如果参数是基本数据类型，此时实参赋给形参的是真是存储的数据值。  
如果参数是引用数据类型，此时实参赋给形参存储数据的地址值。  
### 11.封装  
#### 11.3 封装性的体现  
|访问修饰符|同一个类|同包|不同包，子类|不同包，非子类|
| ---- | ---- | ---- | ---- | ---- |
| private |yes||||
|缺省|yes|yes|||
|protected|yes|yes|yes||
|public|yes|yes|yes|yes|

1. Java规定的四种权限（从大到小）：private、缺省、protected、public  
2. 4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类    
3. 具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类  
   修饰类的话。只能使用：缺省、public
   总结封装性：Java提供了四种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性的大小  
### 12. 类的结构之三：构造器（或构造方法、construction），前面两个类的结构时属性和方法  
一、构造器的使用  
&ensp;&ensp;创建对象  
```java
//创建类的对象：new + 构造器
Person p = new Person();
```
### 说明  
1. 如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器  
2. 定义构造器的格式：权限修饰符 类名（形参列表）{}  
3. 一个类中定义的多个构造器，彼此构成重载  
4. 一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器  

### 属性赋值的先后  
1. 默认初始化  
2. 显式初始化  
3. 构造器中赋值  
4. 通过“对象.方法”或“对象.属性”的方式赋值

### javabean  
1. javabean是一种Java语言写成的可重用组件。  
2. 所谓JavaBean，是指符合如下标准的Java类。  
   类是公共的。  
   有一个无参的构造器。  
   有属性，且有对应的get、set方法。  
3. 用户可以使用JavaBean将功能、处理、值、数据库访问和其他任何可以用
   Java代码创造的对象进行打包，并且其他的开发者可以通过内部的jsp页面、servlet、
   其他javabean、applet程序或者应用来使用这些对象。用户可以认为JavaBean提供了一种随时随地的
   复制和粘贴的功能，而不用关系任何改变。  

&ensp;&ensp;默认没有写出来的构造器的权限修饰符和类的权限修饰符一致。  
### this 关键字
1. this关键字的使用：  
   this可以用来修饰、调用：属性、方法、构造器  
2. this修饰属性和方法：  
   this理解为：当前对象  
   2.1 在类的方法中，我们可以使用”this.属性“或”this.方法“的形式，调用当前属性和方法。但是，
   通常情况下，我们都选择省略”this.“。特殊情况下，如果方法的形参和类的属性，同名时，我们必须显式的使用”this.变量“的方式，表明此变量是属性，而非形参。  
   2.2 在类的构造器中，我们可以使用”this.属性“或”this.方法“的形式，调用当前正在创建的对象的属性或方法。但是，
   通常情况下，我们都选择省略”this.“。特殊情况下，如果构造器的形参和类的属性，同名时，我们必须显式的使用”this.变量“的方式，表明此变量是属性，而非形参。  
3. this调用构造器  
   3.1 我们在类的构造器中，可以显式的使用”this（形参列表）“的方式，调用指定的类的其他构造器  
   3.2 构造器中不能通过”this（形参列表）“方式调用自己，相当于递归，没有出口了  
   3.3 如果一个类中有N个构造器，则最多有N-1构造器中使用了this(形参列表)  
   3.4 规定：”this(形参列表)“必须声明在当前构造器的首行  
   3.5 构造器内部，最多只能声明一个”this(形参列表)“，用来调用其他的构造器  
### 12. 面向对象的特征之二：继承性  
1. 继承性的好处：  why?
   1.1 减少了代码的冗余，提高了代码的复用性  
   1.2 便于功能的扩展  
   1.3 为之后多态性的使用，提供了前提  
2. 继承性的格式： class A extends B{}
   A:子类、subclass。  
   B：父类、superclass。  
   2.1 体现：一旦子类继承父类B以后，子类A中就获得了父类B中声明的结构：属性、方法。  
   特别的，父类中声明为private的属性或方法，子类继承父类以后，任然认为获取了父类中私有的结构
   只是因为封装性的影响，使得子类不能直接调用父类的结构而已。  
   2.2 子类继承父类以后，还可以声明自己特有的属性或方法：实现功能的拓展。  
   子类和父类的关系，不同与子集和集合的关系
3. Java中关于继承性的规定：  
   3.1 一个类可以被多个子类继承。  
   3.2 Java中类的单继承性，一个类只有有一个父类。  
   3.3 子父类是相对的概念。  
   3.4 子类直接继承的父类，称为：直接父类。间接继承的父类称为：简介父类。  
   3.5 子类继承父类以后，就获取了直接父类以及所有间接父类中声明的属性和方法。  
   4 
   4.1 如果我们没有显式的声明一个类的父类的话，则此类继承于Java.lang.Object类。  
   4.2 所有的Java类（除Java.lang.Object类之外）都直接或间接的继承于Java.lang.Object类。  
   4.3 意味着，所有的Java类具有java.lang.Object类声明的功能。  
### 注意：项目二中，数组中元素的删除，删除元素过后，该元素后面的元素需要后移。  
### 13 方法的重写(override/overwrite)  
&ensp;&ensp;定义：在子类中可以根据需要对从父类中继承来的方法进行改造，也称为方法的重置、覆盖。在程序执行时，
子类的方法将覆盖父类的方法。  
&ensp;&ensp;要求:  
1. 子类重写的方法必须和父类被重写的方法具有相同的方法名称、参数列表。  
2. 子类重写的方法的返回值类型不能大于父类被重写的方法的返回值类型。  
3. 子类重写的方法使用的访问权限不能小于父类被重写的方法的访问权限。——> 子类不能重写父类中声明为private权限的方法。  
4. 子类方法抛出的异常不能大于父类被重写方法的异常。  

#### 1. 重写：子类继承父类后，可以对父类中同名同参数的方法，进行覆盖操作  
#### 2. 应用：重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名同参数的方法时，实际执行的时子类重写父类的方法  
#### 3. 重写的规定：
         方法的声明：权限修饰符 返回值类型 方法名（形参列表）throws{
            方法体
         }
         约定俗成：子类中的叫重写的方法，父类中的叫被重写的方法。  
         1. 子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同。  
         2. 子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符。
         >-特殊情况：子类不能重写父类中声明为private权限的方法。
         3. 返回值类型：
         >-父类被重写的方法的返回值类型时void，则子类重写的方法的返回值类型只能是void
         >-父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或者A类的子类。  
         >-父类被重写的方法的返回值类型是基本数据类型(比如，double)，则子类重写的方法的返回值类型必须是相同的基本数据类型（必须也是double）。  
         4. 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型（具体放到异常处理时候讲）
**************************************************************************
         子类和父类中的同名同参数的方法要么都声明为非static的（考虑重写），要么都声明为static的（不是重写）。静态的方法不能被覆盖，是随着类的加载而加载的
### 14. super关键字的使用  
1. super理解为：父类的  
2. super可以用来调用：属性、方法、构造器  
3. super的使用  
   3.1 我们可以在子类的方法或构造器中。通过使用“super.属性”或“super.方法”的方式，显示的调用
   父类中声明的属性或方法。但是，通常情况下，我们习惯省略“super.”  
   3.2 特殊情况：当子类和父类中定义了同名的属性时，我们要想在子类中调用父类中声明的属性，则必须显示的
   使用“super.属性”的方式，表面调用的是父类中声明的属性。  
   3.3 特殊情况下：当子类重写了父类中的方法以后，我们想在子类的方法中调用父类中被重写的方法时，则必须显示
   的使用“super.属性”的方式，表面调用的是父类中被重写的方法。  
   3.4 super调用构造器。
       1. 我们可以在子类的构造器中显示的使用“super(形参列表)”的方式，调用父类中声明的指定构造器  
       2. “super(形参列表)”的使用，必须声明在子类构造器的首行！  
       3. 我们在类的构造器中，针对于“this(形参列表)”或“super(形参列表)”只能二选一，不能同时出现。  
       4. 在构造器的首行，没有显式的声明“this(形参列表)”或“super(形参列表)”，则默认调用的是父类中空参的构造器。  

1. 一罐800克奶粉，330元  --> 0.4125元/克
2. 每天喂2~3次，一次240ml,假设喂3次，一天3 * 240ml=3 * 8勺=24勺  假设一天喂两次2 * 240=2 * 8 =16勺
3. 100ml奶液=14.1克奶粉+90ml水
4. 240ml水 配 8平勺 === 30ml水配 1平勺  === 90ml配 3平勺 ==> 14.1克 === 3勺  ===> 4.7克/勺
最后： 一天多少克？ -->  3勺14.1克，一天24勺，一天8 * 14.1=112.7克/天  由1得-->0.4125 * 112.7 = 46.48元/天（一天喂三次）  
一天喂两次的情况 ： 4.7 * 16 =   75.2 克/天 ==> 75.2 * 0.4125 = 31.02元/天 31.02 * 30 = 930.6 
###   一罐可以吃多少天？800/112.7 = 7.09849天  
###   一个月奶粉钱：46.48*30=1494元
一天喂两次，就是一天喂240 * 3 =2 * 8 =16勺 = 720ml大概1000元  
一天喂三次，就是一天喂240 * 2 =3 * 8 =24勺 = 480ml大概1500元  
### 15 子类对象实例化全过程
1. 从结果上来看：（继承性）  
   子类继承父类后，就获取了父类中声明的属性或方法。  
   创建子类的对象，在堆空间中，就会加载所有父类中声明的属性。
2. 从过程上来看：   
   当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用其父类的构造器，进而调用父类的父类的构造器，...
   直到调用了java.lang.Object类中空参的构造器为止。正因为加载过所有的父类的构造器，所以才可以看到内存中有
   父类中的结构，子类对象才可以考虑进行调用。  
   明确：虽然创建子类对象时，调用了父类的构造器，但是自始至终就创建过一个对象，即为new的子类对象。  
### 16 面向对象特征之三---多态性
   1. 理解多态性：可以理解为一个事物的多种形态。  
   2. 何为多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）  
   3. 多态的使用：虚拟方法调用  
      有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法  
      总结：编译，看左边；运行，看右边。  
   4. 多态性的使用前提：1.类的继承关系。2.方法的重写  
   5. 对象的多态性，只适用于方法，不适用于属性（编译和运行时都看左边）  
面试题：多态是编译时行为还是运行时行为？运行时行为   
### 17 小结：方法的重载与重写  
1. 二者的定义细节：略  
2. 从编译和运行的角度看：重载，是指允许存在多个同名方法，而这些方法的参数不同。编译器根据方法不同的参数表，
对同名方法的名称做修饰。对于编译器而言，这些同名方法就成了不同的方法。他们的调用地址在编译期就绑定了。
Java的重载是可以包括父类和子类的，即子类可以重载父类的同名不同参数的方法。  
所以：对于重载而言，在方法调用之前，编译器就已经确定了所要调用的方法，这称为“早绑定”或“动态绑定”。  
而对于多态，只有等到方法调用的那一刻，编译器才会确定所要调用的具体方法，这称为“晚绑定”或“动态绑定”  
引用Bruce Eckel的话：“不要犯傻，如果它不是晚绑定，它就不是多态。”  
### 18 每日一题day13  
1. 什么是多态性？什么是虚拟方法调用？  
Person p = new Man()  
对象的多态性：父类的引用指向子类的对象。或者子类的对象赋给父类的引用    
多态性指的的是对象的多态性：左边声明一个变量（主要针对类类型的），右边得去赋一个值了，这时候得new一个对象了，new的对象体现为多种形态的
可以去new任何person类子类的对象，右边的对象体现的是多种形态，所以叫对象的多态性。  
虚拟方法调用：编译时看左边，运行时看右边。==>当我们通过变量名去调用子父类中同名同参数的方法时，编译的时候我们认为调用的是父类中声明
的方法，当我们真正解释运行的时候执行的是子类重写的方法.  
### 19 instanceof关键字的使用
#### a instanceof A:判断对象a是否是类A的实例。如果是，返回true，如果不是，返回false.  
#### 使用情景：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行instanceof的判断，一旦返回true，就向下转向。如果返回false,不进行向下转型。  
### 20 多态性练习题 package learncodeday13.test2 FieldMethodTest  
练习：  
1.若子类重写了父类的方法，就意味着子类里定义的方法彻底覆盖了父类里的同名方法，
系统将不可能把父类里的方法转移到子类中：编译看左边，运行看右边。  
2.对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量，
这个实例变量依然不可能覆盖父类中定义的实例变量：编译运行都看左边。  
### 21 java.lang.Object  
1. Object类是所有Java类的根父类。
2. 如果在类的声明中未使用extens关键字指明其父类，则默认该父类为Java.lang.Object
3. Object类中的功能（属性、方法）就具有通用性。  
属性：无  
方法： equals()/toString()/getClass()/hashCode()/clone()/finalize()  
wait()、notify()、notifyAll() 
4.Object类只声明了一个空参的构造器。  
### 22 面试题:==和equals（）区别
一、回顾==的使用：
#### ==：运算符  
1. 可以使用在基本数据类型变量和引用数据类型变量中  
2. 如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定类型要相同，考虑自动类型提升）（Boolean不参与比较编译报错,剩余的7中基本数据类型都可以比较）  
   如果比较的是引用数据类型变量：比较两个对象的地址值是否相等。即两个引用是否指向同一个实体。  
   补充： == 符号使用时，必须保证符号两边类型一致    
#### equals()方法的使用：
1. 是一个方法，而非运算符  
2. 只能适用于引用数据类型  
3. Object类中equals（）的定义：
```java
    public boolean equals(Object obj) {
        return (this == obj);
    }
    说明：Object类中定义的equals（）和==的作用是相同的：比较两个对象的地址是否相等。即两个引用是否指向同一个实体  
```
4. 像String、Date、File、包装类等都重写了Object类中的equals（）方法。重写以后，比较比较的不是两个引用的地址是否相同，
   而是比较两个对象的”实体内容“是否相同。那么，我们就需要对Object类中的equals（）进行重写  
   5.通常情况下，我们自定义的类如果使用equals（）的话，也通常是比较两个对象的”实体内容“是否相等。那么，
   我们就需要对Object类中的equals()进行重写  
   

### 23 计算机在任何情况下都是存储的二进制而且是二进制补码[原码、反码、补码](https://www.cnblogs.com/wqbin/p/11142873.html)  
机器数是带符号的，在计算机用一个数的最高位存放符号, 正数为0, 负数为1.  
#### 原码、反码、补码
正数的原码、反码、补码都一样，负数补码是反码加一  
### 24 Object类中toString()的使用  
1. 当我们输出一个对象的引用时，实际上就是调用当前对象的toString()  
2. Object类中toString()的定义：
```java
public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```
3. 像String、date、file、包装类等都重写了Object类中的toString()方法，使得在调用对象的toString()
s时，返回”实体内容“信息。
4. 自定义类可以重写toString()方法，当调用此方法时，返回对象的”实体内容“。  
### 25 java中的JUnit单元测试  
1. 创建Java类，进行单元测试。
   此时的Java类要求：1：此类时public的。2：此类提供公共的无参构造器  
2. 此类中声明单元测试方法。
   此时的单元测试方法：方法的权限时public，没有返回值，没有形参。
   3.此单元测试方法上需要声明注解：@Test,并在单元测试类中导入import org.junit.Test;  
### 26 包装类的使用：  
1.Java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征。  
2.掌握的：基本数据类型、包装类、String三者之间的相互转换。  
```java
class Orders{
    boolean aBoolean;
    Boolean aBoolean2;
}
```
要知道这两个的默认值false、null。  

#### jdk5新特性，自动装箱与自动拆箱
```java
    public void test3(){
//        int num = 10;
//        //基本数据类型==》包装类的对象
//        method(num);

        //自动装箱：基本数据类型 --->包装类
        int num2 = 10;
        Integer in2 = num2;

        boolean b1 = true;
        Boolean b2 = b1;

        //自动拆箱： 包装类 --->基本数据类型
        System.out.println(in2.toString());
        int num3 = num2;

    }
```
#### 基本数据类型、包装类 --- 》String类型  
```java
int num1 = 10;
           //方式1 连接运算
           String str1 = num1 + "";
           //方式2 调用String的valueOf()
           float f1 = 12.3f;
           String str2 = String.valueOf(f1);
           Double d1 = new Double(12.4);
           String str3 = String.valueOf(d1);
           System.out.println(str1);
           System.out.println(str2);
           System.out.println(str3);
```

### 27 static 关键字的使用  
1.static：静态的  
2.static可以用来修饰：属性、方法、代码块、内部类  
3.使用static修饰属性：静态变量（或类变量）  
&ensp;&ensp;3.1 属性：按是否使用static修饰，又分为：静态属性 vs 非静态属性（实例变量）    
      实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。当修改其中一个对象中的非静态
属性时，不会导致其他对象中同样属性值的修改。   
      静态变量: 我们创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，
会导致其他对象调用此静态变量时，时修改过了的。  
&ensp;&ensp;3.2 static修饰属性的其他说明：
      一、静态变量随着类的加载而加载。  
      二、静态变量的加载要早于对象的创建。  
      三、由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中。
      四、类和对象能否调用实例变量和类变量

|  | 类变量  | 实例变量 |
|  ----  |  ----  |  ----  |
| 类 | yes | no |
| 对象 | yes | yes |

4.使用static修饰方法：  
&ensp;&ensp;4.1 随着类的加载而加载，可以通过“类.静态方法”的方式进行调用  
&ensp;&ensp;4.2 类和对象对静态方法的访问？

|  | 静态方法  | 非静态方法 |
|  ----  |  ----  |  ----  |
| 类 | yes | no |
| 对象 | yes | yes |

&ensp;&ensp;4.3 静态方法中，只能调用静态的方法或属性。  
非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性  
5.static注意点：  
&ensp;&ensp;5.1 在静态方法内，不能使用this关键字、super关键字。  
&ensp;&ensp;5.2 关于静态属性和静态方法的使用，大家都从生命周期的角度去理解。  
6.开发中，如何确定一个属性是否要声明为static的？  
>属性是可以被多个对象所共享的，不会随着对象的不同而不同的。
> 类中的常量也常常声明为static

开发中，如何确定一个方法是否要声明为static的？  
>操作静态属性的方法，通常设置为static  
>工具类中的方法，习惯上声明为static的。比如Math、Arrays、Collections  

### 28 单例模式 懒汉式和饿汉式
1.所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。  
2.如何实现？  懒汉式vs饿汉式  
3 区分饿汉式和懒汉式  
>饿汉式：坏处：对象加载时间过长。  
> 好处：饿汉式是线程安全的  
>懒汉式：好处：延迟对象的创建。  
>目前的写法坏处：线程不安全。 （到多线程内容时，再修改）  
```java
package learncodeday14;

/**
 * @author: chenwei
 * @date: 2021/7/15 17:41
 * 饿汉式单例模式
 */
public class Singleton {
    public static void main(String[] args){
        Bank bank = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank == bank2);
    }
}
class Bank{
    //1.私有化类的构造器

    private Bank(){

    }
    //2.内部创建类的对象
    //3.要求此对象也必须声明为静态的

    private static Bank instance = new Bank();

    //3.提供公共的静态方法，返回类的对象

    public static Bank getInstance(){
        return instance;
    }
}
```
```java
package learncodeday14;

/**
 * @author: chenwei
 * @date: 2021/7/15 17:57
 * 懒汉式
 */
public class Singleton2 {
    public static void main(String[] args){
        Order order = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order == order2);
    }
}
class Order{
    //1.私有化构造器

     private Order(){
     }
     //2.声明当前类对象，没有初始化。懒。
    //4.此对象也必须声明为static

     private static Order instance = null;

     //3.声明public、static的返回当前类对象的方法

     public static Order getInstance(){
         if (instance == null){
             instance = new Order();
         }
         return instance;
     }
}
```

### 29 main()方法的使用  
1.main()方法作为程序的入口  
2.main()方法也是一个普通的静态方法  
3.main()方法可以作为我们与控制台交互的方式。（之前：使用Scanner）  
### 30 类的成员之四：代码块（或初始化块）  
1.代码块的作用：用来初始化类、对象  
2.代码块如果有修饰的话，只能使用static  
3.分类：静态代码块vs非静态代码块  
4.静态代码块  
>内部可以有输出语句  
> 随着类的加载而执行，而且只执行一次  
> 作用：初始化类的信息  
> 如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行  
> 静态代码块的执行要优先于非静态代码块  
> 静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构

5.非静态代码块  
>内部可以有输出语句  
> 随着对象的创建而执行
> 而且每创建一个对象，就执行一次非静态代码块  
> 作用：可以再创建对象时，对对象的属性等进行初始化  
> 如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行  
> 非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法  

对属性可以赋值的位置：
> 1.默认初始化  
> 2.显式初始化  
> 3.构造器中初始化  
> 4.有了对象以后，可以通过“对象.属性”或“对象.方法”的方式，进行赋值  
> 5.再代码块中赋值  

### 31 属性赋值的先后顺序  
> 1.默认初始化  
> 2.显式初始化  
> 3.在代码块中赋值  
> 4.在构造器中初始化  
> 5.有了对象以后，可以通过“对象.属性”或“对象.方法”的方式，进行赋值
> 2和3谁写在前面谁先执行，后买的生效  

### 32 final关键字 最终的  
> 1.可以用来修饰的结构：类、方法、变量  
> 2.final用来修饰一个类：此类不能被其他类所继承。比如String类、System类、StringBuffer类 
> 3.final用来修饰方法： 表面此方法不可以被重写。比如Object类  
> 4.final用来修饰变量：此时的“变量”就称为是一个常量  
>  4.1 final修饰属性：可以考虑赋值的位置有：显式初始化（大写了，ctrl+shift+s）、代码块中初始化、构造器中初始化、  
>  4.2 final修饰局部变量：尤其是使用final来修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个形参。
> 一旦赋值以后，就只能在方法体内使用此形参，但不能进行重新赋值。  
> static final 用来修饰属性：全局常量   

### 33 static关键字  
1. abstract：抽象的  
2. abstract可以用来修饰的结构：类、方法  
3. abstract修饰类：抽象类  

> 1. 此类不能实例化，就是不能用此类new对象  
> 2. 抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）  
> 3. 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作  

4. abstract修饰方法：抽象方法  
> 1. 抽象方法只有方法的声明，没有方法体  
> 2. 包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的  
> 3. 若子类重写了父类中的所有的抽象方法后，此子类方可实例化，若子类没有重写父类中的所有抽象方法，则此子类也是一个抽象类，需要使用abstract修饰   

5. abstract使用上的注意点：  
> 1. abstract不能用来修饰：属性、构造器等结构  
> 2. abstract不能用来修饰私有方法、静态方法、final的方法、final的类  

6. 创建抽象类的匿名子类对象  
```java
        Person person = new Person() {
            @Override
            public void sayName() {
                System.out.println("heoo");
            }
        };
```

### 34. 接口
1. 接口的使用  
   1.1. 接口使用interface类定义  
   1.2. Java中，接口和类是并列的两个结构  
   1.3. 如何定义接口：定义接口中的成员  
>  JDK7及以前，只能定义全局常量和抽象方法   
>>  全局常量：public static final的  
>>  抽象方法：public abstract的  

>JDK8:除了定义定义全局常量和抽象方法之外，还可以定义静态方法、默认方法  

   1.4. 接口中不能定义构造器！意味着接口不可以实例化  
   1.5. Java开发中，接口通过让类去实现实现(implements)的方式来使用。
   如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化。
   如果实现类没有覆盖了接口中的所有抽象方法，则此实现类仍为一个抽象类。  
   1.6. java类可以实现多个接口 --->弥补了Java单继承性的局限性  
         格式：class AA extends BB implements CC,DD,EE  
   1.7. 接口与接口之间可以继承，而且可以多继承  
   1.8. 接口的具体使用，体现多态性  
   1.9. 接口，实际上可以看做是一种规范  

```java
/**
 * @author: chenwei
 * @date: 2021/7/17 0:49
 */
public class InterfaceTest {
}
interface Flyable{
  // 全局常量
  /**
   * 最大速度
   * */
  public static final int MAX_SPEED = 7900;
  //省略了public static final

  int MIN_SPEED = 1;
    /**
     * 抽象方法
     * */
  public abstract void fly();

  /**
   * 停，省略了public abstract
   * */
  void stop();

  //public Flyable(){}Interface abstract methods cannot have body
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("plane fly");
    }

    @Override
    public void stop() {
        System.out.println("plane stop");
    }
}
class Bullet implements Flyable, Attackable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}
interface Attackable{
  /**
   * 攻击
   * */
  void attack();
}
```

> 面试题：抽象类与接口有哪些异同？  
> 接口和抽象类的区别：
>>（1）抽象类可以有构造方法，接口中不能有构造方法。  
>>（2）抽象类中可以有普通成员变量，接口中没有普通成员变量  
>>（3）抽象类中可以包含静态方法，接口中不能包含静态方法  
>>（4）一个类可以实现多个接口，但只能继承一个抽象类。  
>>（5）接口可以被多重实现，抽象类只能被单一继承  
>>（6）如果抽象类实现接口，则可以把接口中方法映射到抽象类中作为抽象方法而不必实现，而在抽象类的子类中实现接口中方法  
> 
> 接口和抽象类的相同点：  
>> (1) 都可以被继承  
>> (2) 都不能被实例化  
>> (3) 都可以包含方法声明  
>> (4) 派生类必须实现未实现的方法

### 代理模式
```java
/**
 * @author: chenwei
 * @date: 2021/7/17 22:46
 * 代理模式
 * 先定义一个明星类，再有真是明星（就是被代理类）和代理类，他们去实现Star，
 * 代理类帮明星完成其他操作，当要唱歌时由明星自己完成，
 * 看似都由代理类完成了所有操作，但唱歌的操作是在代理里面传递了一个明星过去完成的。
 */
public class StaticProxyTest {
    public static void main(String[] args){
        Star star = new Proxy(new RealStar());
        star.confer();
        star.signContract();
        star.bookTicked();
        star.sing();
        star.collectMoney();
    }
}

interface Star{
  /**
   * 面谈
   * */
  void confer();
  /**
   * 签合同
   * */
  void signContract();
  /**订票 */
  void bookTicked();

  /**唱歌 */
  void sing();

  /** 收钱*/
  void collectMoney();
}
//被代理类

class RealStar implements Star{
    @Override
    public void confer() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicked() {

    }

    @Override
    public void sing() {
        System.out.println("明星唱歌~~~~~");

    }

    @Override
    public void collectMoney() {

    }
}
//代理类

class Proxy implements Star{
    private RealStar realStar;
    public Proxy(RealStar realStar){
        this.realStar = realStar;
    }

    @Override
    public void confer() {
        System.out.println("经纪人面谈");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人面谈");
    }

    @Override
    public void bookTicked() {
        System.out.println("经纪人订票");
    }

    @Override
    public void sing() {
        realStar.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("经纪人收钱");
    }
}
```
```java
/**
 * @author: chenwei
 * @date: 2021/7/17 22:34
 * 代理模式
 */
public class NetWorkTest {
    public static void main(String[] args){
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}
interface NetWork{
  /**
   * 浏览
   * */
  public void browse();
}

//被代理类

class Server implements NetWork{
    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}
//代理类

class ProxyServer implements NetWork{
    private NetWork work;
    public ProxyServer(NetWork work){
        this.work = work;
    }
    public void check(){
        System.out.println("联网之前的检查工作");
    }
    @Override
    public void browse() {
        check();
        work.browse();
    }
}
```
### 面向对象的设计原则(总共六个：工厂模式可以三个原则)  
1. OCP(开闭原则) 一个软件的实体应当对拓展开放，对修改关闭  
2. DIP(依赖倒转原则，dependence inversion principle):要针对接口编程，不要针对实现编程。  
3. LOD(迪米特法则，Law of demeter)
### 工厂模式
1. 无工厂模式
```java
/**
* @author: chenwei
* @date: 2021/7/17 23:39
* 无工厂模式
  */
  public class FactoryTest1 {
  public static void main(String[] args){
  Car a = new Audi();
  Car b = new Byd();
  a.run();
  b.run();
  }
  }
  interface Car{
  /**
   * 跑 */
     void run();
     }
     class Audi implements Car{
     @Override
     public void run() {
     System.out.println("audi running");
     }
     }
     class Byd implements Car{
     @Override
     public void run() {
     System.out.println("byd running");
     }
     }
```
2. 简单工厂模式(用来圣餐同一等级结构中的任意产品。(对于增加新的产品，需要修改已有代码))  
> 对于增加新产品，不修改代码的话，是无法拓展的。违反了开闭原则（对拓展开放；对修改封闭）
```java
/**
 * @author: chenwei
 * @date: 2021/7/17 23:59
 * 简单工厂模式
 * 缺点：对于增加新产品，不修改代码的话，是无法拓展的。违反了开闭原则（对拓展开放；对修改封闭）
 * 造的事儿通过工厂帮我造好，自己不直接造对象
 */
public class FactoryTest2 {
    public static void main(String[] args){
        Car a = CarFactory.getCar("audi");
        a.run();
        Car b = CarFactory.getCar("byd");
        b.run();
        Car c =CarFactory.getCar("chen");
        c.run();
    }
}
interface Car2{
    /**
     * 跑 */
    void run();
}
class Audi2 implements Car2{
    @Override
    public void run() {
        System.out.println("audi running");
    }
}
class Byd2 implements Car2{
    @Override
    public void run() {
        System.out.println("byd running");
    }
}
class CarFactory{
    //方式1

    public static Car getCar(String type){
        String audi = "audi";
        String byd = "byd";
        if (audi.equals(type)){
            return new Audi();
        }else if(byd.equals(type)){
            return new Byd();
        }else {
            return null;
        }
    }
//    //方式2
//
//    public static Car getAudi(){
//        return new Audi();
//    }
//    public static Car getByd(){
//        return new Byd();
//    }
}
```
3. 工厂方法模式  
4. 抽象工厂模式

### java面试题  
#### 1. [collection和collections的区别](https://www.cnblogs.com/cathyqq/p/5279859.html)  
### java8接口的新特性  在接口中，除了jdk7中定义全局常量(static final默认省略)和抽象方法(abstract默认省略)之外，还可以定义静态方法和默认方法  
```java
package learncodeday15.stage20;

/**
 * @author: chenwei
 * @date: 2021/7/19 19:57
 */
public class Java8 {
    public static void main(String[] args){
        SubClass subClass = new SubClass();
        //知识点1：接口中定义的静态方法，只能通过接口来调用
        //subClass.method1();
        //知识点2：通过实现类的对象，可以调用接口中默认的方法
        //如果实现类重写了接口中的默认方法，调用时，任然调用的是重写以后的方法
        subClass.method2();
        //知识点3：如果子类（实现类）,继承的父类和实现的接口中声明了同名同参数的方法，那么子类在
        //没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法。 ---> 类优先原则

        //知识点4：如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，
        //那么在实现类没有重写此方法的情况下，报错。--->接口冲突。
        //这就需要我们必须在实现类中重写此方法
        subClass.method3();
    }
}
class SubClass extends SuperClass implements Java8Test,Java8Test2{
    @Override
    public void method2() {
        System.out.println("$$$$$$$$");
    }

    @Override
    public void method3() {
        System.out.println("实现类实现多个接口，接口中的方法又相同时必须重写");
    }
    //知识点5：如何在子类（或实现类）的方法中调用父类、接口中被重写的方法
    public void myMethod(){
        method3();//调用自己定义的重写的方法
        super.method3();//调用父类中声明的
        Java8Test.super.method3();
        Java8Test2.super.method3();
    }
}
```
### 类的内部成员之五：内部类  
1. Java允许将一个类A声明在另一个类B中，则类A就是内部类，类称为外部类  
2. 内部类的分类(类比变量，成员变量和属性、局部变量): 成员内部类(静态、非静态) VS局部内部类(方法内、代码块内、构造器内)  
[成员变量和属性的区别](https://blog.csdn.net/sinat_34137390/article/details/82149259)  
3. 成员内部类：  
   一方面，作为内部类的成员：  
   > 调用外部类的结构  
   > 可以被static修饰  
   > 可以被4种不同的权限修饰  
   另一方面，作为一个类：  
   > 类内可以定义属性、方法、构造器等  
   > 可以被final修饰，表示此类不能被继承。言外之意，不使用final，就可以被继承  
   > 可以被abstract修饰
   
```java
package learncodeday15.stage20.innerclass;

/**
 * @author: chenwei
 * @date: 2021/7/19 23:17
 */
public class InnerClassTest {
    public static void main(String[] args){
        //创建Dog实例(静态的成员内部类):
        Person.Dog dog = new Person.Dog();
        dog.show();
        //创建Bird实例(非静态的成员内部类):
//        Person.Dog dog = new Person.Dog();错误的，要有外部的实例才可以
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();

        System.out.println("*******");
        bird.display("黄鹂鸟");
    }
}
class Person{
    String name = "小明";
    int age;
    public void eat(){
        System.out.println("人：吃饭");
    }

    //静态成员内部类

    static class Dog{
        String name;
        int age;
        public void show(){
            System.out.println("卡拉 is a dog");
            //静态加载块，不能调用eat()方法
//            eat();
        }
    }
    //非静态成员内部类

    class Bird{
        String name = "杜鹃";
        public void sing(){

            System.out.println("我是一只小小鸟");
            eat();//这里省略了
            Person.this.eat();
        }
        public void display(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Person.this.name);//外部类的属性
        }
    }
}

```
4. 关注如下的3个问题  
   4.1. ===  
   4.2. 如何在成员内部类中区分调用外部类的结构  
   4.3. 开发中局部内部类的使用  
```java
package learncodeday15.stage20.innerclass;

import learncodeday15.stage20.CompareObj;

/**
 * @author: chenwei
 * @date: 2021/7/20 0:37
 */
public class InnerClassTest1 {
    //开发中很少见

    public void method(){
        //局部内部类

        class Aa{

        }
    }

    //返回一个实现了Compareable接口的类的对象

    public CompareObj getCompareable(){
        //创建一个实现了Compareable接口的类：局部内部类
        //方式一：有名

//        class MyCompareable implements CompareObj{
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyCompareable();
        //方式二无名

        return new CompareObj() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
```
### day16每日一题  
1. abstract能修饰哪些结构？修饰后，有哪些特点？final、static呢？  
2. 接口是否能继承接口？抽象类是否能实现(implements)接口？抽象类是否能继承非抽象的类？  
3. 声明抽象类，并包含抽象方法。测试类中创建一个继承抽象类的匿名子类的对象  
4. 抽象类和接口有哪些共同点和区别  

### 异常
1. finally 是可选的。  
2. 使用try将可能出现异常代码包装起来，在执行过程中，一丹出现异常，
   就会生成一个对应异常类的对象，根据此对象的类型，去catch中进行匹配。
3. 一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。
   一旦处理完成，就跳出当前的try-catch结构(在没有写finally的情况)。继续执行其后的代码。  
4. catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓。
   catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类的上面。否则，报错  
5. 通常的异常对象处理的方式1.String getMessage() 2.printStackTrace()  
6. 在try结构中声明的变量，在出了try结构以后，就不能再被调用  

>体会：1使用try-catch-finally处理编译时异常，使得程序在编程时就不报错，但是运行时仍可能报错
 相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现。  
  体会：2开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally了。
  针对于编译时异常，我们说一定要考虑异常的处理。

  异常处理的方式二：throws+异常类型  
  1. throws + 异常类型 卸载方法的声明出。指明此方法执行时，可能会抛出的异常类型。
    一旦当方法执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throw类型时
    就会被抛出。异常代码后续的代码，就不会再执行！  
  2. 体会：try-catch-finally:真正的将异常处理掉了。
    throws的方式只是将异常抛给了方法的调用者。并没有真正将异常处理掉。
  3. 开发中如何选择使用try-catch-finally，还是使用throws?  
    3.1.1 如果父类中被重写的方法throws方式处理异常，则子类重写的方法也不能使用throws，
    意味着如果子类重写的方法中有异常，必须使用try-catch-finally方式处理   
    3.2.2：执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的
    我们建议这几个方法使用throws的方式进行处理。而执行的方法a可以考虑使用try-catch-finally的方式进行处理。  

### 如何自定义一个异常类？
1. 继承于现有的异常结构，RuntimeException,Exception  
2. 提供全局常量：serialVersionUID  
3. 提供重载的构造器   
```java
class Ecdef extends RuntimeException{
    static final long serialVersionUID = -7034897190745766939L;
    public Ecdef(String message) {
        super(message);
    }
    public Ecdef() {
    }
}
```

### 面试题，throws(声明异常)和throw(抛出异常)的区别是什么？(上游排污，下游治污)  

## 项目3 
### super只能调用父类中的指定方法，但想调用父类的父类，甚至父类的父类的父类时，并且子类多次需要调用时。  
规范的解决办法就是在父类的父类中重写写一份，给子类调用，而不是super.的方式调用
```java
    public Programmer(int id, String  name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
        }

public Programmer() {
        }
```
## 多线程  
### 程序、进程、线程的理解   
1. 程序：为完成特定任务，用某种编程语言编写的一系列指令的集合。即一段静态代码，静态对象。  
2. 进程：是程序的一次执行过程，或是正在运行的一个程序。  
3. 线程：进程可进一步细化为线程，是一个程序内部的一条执行路径
   （线程作为调度和执行的单位，每个线程拥有独立的运行栈和程序计数器，线程的切换的开销小）
   （若一个进程同一时间并行执行多个线程，就是支持多线程的）
   （一个进程中的多个线程共享相同的内存单元/内存地址空间->他们从同一堆中分配对象，可以访问相同的变量和对象。这就使得线程间通信更简便、高效。但多个线程操作共享的系统资源可能就会带来安全隐患）  
### 并行、并发  
### (java线程有六种状态)[https://blog.csdn.net/qq_22771739/article/details/82529874]
1. 新建、运行、阻塞、等待、超时等待、结束
1. 并行：多个cpu同时执行多个任务  
2. 并发：一个cpu（采用时间片）同时执行多个任务。比如秒杀、多个人同时做一件事  
### 何时需要多线程  
1. 程序需要同时执行两个或多个任务时。 
2. 程序需要实现一些需要等待的任务时，如用户输入、文件读写操作、网络操作、搜索等。
3. 需要一些后台运行的程序时。
```java
package day18thread;

import org.junit.Test;

/**
 * @author: chenwei
 * @date: 2021/7/30 0:32
 * @description:多线程的创建方式：方式一：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run() --> 将此线执行的操作声明在run中
 * 3.创建Thread类的子类对象
 * 4.通过此对象调用start()
 * 例子，编译100以内的所有偶数
 */
public class ThreadTest extends Thread{//1.继承Thread类
    //2重写run方法
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if (i%2==0){
                System.out.println(i + Thread.currentThread().getName());
            }
        }
    }
    public static void main(String[] args){
        //3.创建Thread类的子类对象
        ThreadTest threadTest = new ThreadTest();
        //4.通过此对象调用start，启用当前线程，调用当前线程的run
        threadTest.start();
        //问题一：我们不能通过run()的方式来启动线程
        //threadTest.run();
        //问题二：再启动一个线程，遍历100以内的偶数。不可以让已经start()的线程去执行。会报IllegalThread
        //threadTest.start();

        //如下操作仍然是在main线程中执行
        for (int i=0;i<=100;i++){
            if (i%2==0){
                System.out.println(i+"ooooooooooooooooo" +Thread.currentThread().getName());
            }
        }
    }
}

```

```java
package day18thread;

/**
 * @author: chenwei
 * @date: 2021/7/30 15:21
 * @description: 创建遍历一百以内的偶数，和创建100以内的奇数两个线程
 */
public class ThreadTestHomeWork1 {
    public static void main(String[] args){
        //通过构造函数方式设置线程名字
        TheadTestOuShu theadTestOuShu = new TheadTestOuShu("theadTestOuShu");
        TheadTestJiShu theadTestJiShu = new TheadTestJiShu();
        theadTestJiShu.setPriority(Thread.MIN_PRIORITY);
        theadTestOuShu.setPriority(Thread.MIN_PRIORITY);

        /**
         * 测试Thread中的常用方法
         * 1. start() 启动当前线程；调用当前线程的run
         * 2. run() 通常需要重写Thread类中的run方法，将创建的线程要执行的操作声明在此方法中
         * 3. currentThread() 静态方法，返回执行当前代码的线程
         * 4. getName() 获取当前线程的名字
         * 5. setName() 设置当前线程的名字
         * 设置线程的名字有两种方式，1是通过setName()方式 2是通过创建线程时的构造方法
         * 6. yield()释放当前cpu执行权
         * 7. 在线程a种调用线程b的join()，此时线程a进入阻塞状态，知道线程b完全执行完以后，线程a才结束阻塞状态
         * 8. stop() 此方法已过时，当执行此方法，强制结束当前线程
         * 9. sleep(long milliime) 让当前线程睡眠millitime毫秒，既是阻塞millimite毫秒，在指定的millitime内，当前线程时阻塞状态
         * 10. isAlive() 判断当前线程是否存活
         *
         * 线程的优先级
         * 1.
         * MIN_PRIORITY :1
         * MAX_PRIORITY : 10
         * NORM_PRIORITY : 5  -->默认优先级
         * 2. 如何获取和设置当前线程的优先级
         * setPriority()
         * getPriority()
         * 说明:高优先级的线程要抢占低优先级线程的cpu执行权。但是只是从概率上讲，高优先级的线程高概率的情况下被执行。
         *      并不意味着只有当高优先级的线程执行完以后，低优先级的线程才执行。
         *
        * */

        theadTestJiShu.setName("线程-奇数");
        Thread.currentThread().setName("main线程");
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        theadTestJiShu.start();
        theadTestOuShu.start();
        for (int i=0;i<=100;i++){
            System.out.println(i + Thread.currentThread().getName() + " "+Thread.currentThread().getPriority());
            if (i==20){
                try {
                    theadTestOuShu.join();
                    System.out.println("到偶数了 theadTestOuShu.join();");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(theadTestOuShu.isAlive());

        //如果这个方法只使用一次，有经验的程序员都是采用创建匿名子类的方式
        //创建Thread类的匿名子类对象
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<=100;i++){
                    if (i%2 != 0){
                        System.out.println(i + Thread.currentThread().getName() +  " "+Thread.currentThread().getPriority());
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<=100;i++){
                    if (i%2 == 0){
                        System.out.println(i + Thread.currentThread().getName() +  " "+Thread.currentThread().getPriority());
                    }
                }
            }
        }.start();

    }
}
class TheadTestJiShu extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if (i%2 != 0){
                System.out.println(i + Thread.currentThread().getName() +  " "+Thread.currentThread().getPriority());
            }
            if (i%3 == 0){
                yield();
            }
        }
    }
}
class TheadTestOuShu extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
//            if (i%2 == 0){
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(i + Thread.currentThread().getName() + Thread.currentThread().getPriority());
//            }
            System.out.println(i + Thread.currentThread().getName() +  " "+Thread.currentThread().getPriority());
        }
    }

    //通过构造函数方式设置线程名字
    public TheadTestOuShu(String name) {
        super(name);
    }
}
```
```java
package day18thread;

/**
 * @author: chenwei
 * @date: 2021/7/30 18:43
 * 创建多线程的方式二：实现Runnable接口
 * 1. 创建一个实现了Runnel接口的类
 * 2. 实现类去实现Runnal中的抽象方法:run
 * 3.创建实现类的对象
 * 4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5. 通过Thread类的对象调用start
 * 6. 比较创建线程的两种方式。
 *     开发中：优先选择：实现Runnable接口的方式
 *     原因： 1.实现的方式没有类的单继承的局限性 2.实现的方式更适合处理多个线程有共享数据的情况
 *     联系：public class Thread implements Runnable 相同点：两种方式都需要重写run，将线程要执行的逻辑声明在run中
 *
 * 例子：创建三个窗口卖票，总票数为100张，使用Runnable接口的方式
 * 1. 问题：卖票过程中，出现了重票、错票 -->出现了线程安全问题
 * 2. 问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
 * 3. 如何解决：当一个线程在操作ticket的时候，其他线程不能参与进来。直到线程a操作完ticket时，
 *            其他线程才可以开始操作ticket。这种情况即使线程a出现了阻塞，也不能被改变。
 * 4. 在Java中，我们通过同步机制，来解决线程的安全问题
 *    说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类从当
 *
 * 方法一：同步代码块
 * synchronized(同步监视器){需要被同步的代码}
 * 说明： 1. 操作共享数据的代码，即为需要被同步的代码，
 *       2. 共享数据：多个线程共同操作的变量。比如，ticket就是
 *       3. 同步监视器：俗称锁。任何一个类的的对象，都可以充当锁。要求多个线程必须要用同一把锁。
 *       补充：在实现Runnable接口创建多线程的方式中，我们可以考虑使用this充当同步监视器
 *  方法二：同步方法
 *
 *   5.同步的方法，解决了线程的安全问题。--好处
 *     操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低。
 *
 *
 */
public class ThreadTestTicket {
  public static void main(String[] args) {
//    Windows windows1 = new Windows("windows1");
//    Windows windows2 = new Windows("windows2");
//    Windows windows3 = new Windows("windows3");
//    windows1.start();
//    windows2.start();
//    windows3.start();

        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        thread1.setName("线程1");
        Thread thread2 = new Thread(myThread);
        thread2.setName("线程2");
        Thread thread3 = new Thread(myThread);
        thread3.setName("线程3");
        thread1.start();
        thread2.start();
        thread3.start();
  }
}

class Windows extends Thread {
  private static int ticket = 100;
  private static Object object = new Object();

  public Windows(String name) {
    super(name);
  }

  @Override
  public void run() {
    while (true) {
      synchronized (object) {
        if (ticket > 0) {
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(getName() + " 还有票,票号为：" + ticket);
          ticket--;
        }else {
          break;
        }
      }
    }
  }
}

class MyThread implements Runnable {
  private int ticket = 100;

  @Override
  public void run() {
    while (true) {
      synchronized (this){
        if (ticket>0){
          System.out.println("还有票 " + Thread.currentThread().getName() + " 剩余 ： " + ticket);
          ticket--;
        }else {
          break;
        }
      }
    }
  }
}
```
```java
package day18thread;

/**
 * @author: chenwei
 * @date: 2021/7/31 1:43
 */
public class ThreadTestTicket2 {
  public static void main(String[] args) {
    WindowsTicket windowsTicket = new WindowsTicket();
    Thread thread1 = new Thread(windowsTicket);
    Thread thread2 = new Thread(windowsTicket);
    Thread thread3 = new Thread(windowsTicket);
    thread1.setName("窗口1 ");
    thread2.setName("窗口2 ");
    thread3.setName("窗口3 ");
    thread1.start();
    thread2.start();
    thread3.start();
  }
}

class WindowsTicket implements Runnable {
  private int ticket = 1000;
  Object object = new Object();

  @Override
  public void run() {
    while (true) {
      synchronized (object) {
        if (ticket > 0) {
          System.out.println(Thread.currentThread().getName() + " 剩余： " + ticket);
          ticket--;
        }else {
            break;
        }
      }
    }
  }
}
```
```java
package day18thread;

/**
 * @author: chenwei
 * @date: 2021/7/31 17:08
 * @description : 使用同步方法解决实现Runnable接口的线程安全问题
 * 关于同步方法的总结：
 * 1. 同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 * 2. 非静态的同步方法，同步监视器是:this
 *     静态的同步方法，同步监视器是：当前类本身
 */
public class WindowTest3 {
  public static void main(String[] args) {
      //实现Runnable接口的线程安全问题
//      ThreadTest3 threadTest3 = new ThreadTest3();
//      Thread thread1 = new Thread(threadTest3);
//      Thread thread2 = new Thread(threadTest3);
//      Thread thread3 = new Thread(threadTest3);
//      thread1.start();
//      thread2.start();
//      thread3.start();

      ThreadTest4 threadTest41 = new ThreadTest4();
      threadTest41.start();
      ThreadTest4 threadTest42 = new ThreadTest4();
      threadTest42.start();
      ThreadTest4 threadTest43 = new ThreadTest4();
      threadTest43.start();


  }
}
class ThreadTest3 implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            method();
        }
    }
    private synchronized void method(){
        if (ticket>0){
            System.out.println("还有票： " + ticket + " " +Thread.currentThread().getName());
            ticket--;
        }
    }
}
class ThreadTest4 extends Thread{
    private static int ticket = 100;
    @Override
    public void run() {
        while (true){
            method();
        }
    }
    private static synchronized void method(){
//    private synchronized void method(){ 此种是错误的s
        if (ticket>0){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("还有票： " + ticket + " " +Thread.currentThread().getName());
            ticket--;
        }
    }
}
```
### synchronized和lock的异同
```java
package day18thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: chenwei
 * @date: 2021/8/1 0:37
 * @description: 解决线程安全的方式三：Lock锁 ---jdk 5.0新增
 * 1. 面试题：synchronized和lock的异同
 * 相同：两者都可以解决线程安全问题
 * 不同：synchronized机制在执行完相应的同步代码以后，自动释放同步监视器
 *       lock需要手动的启动同步(lock())，同时结束同步也需要手动实现(unlock())
 * 2. 优先使用顺序：lock->同步代码块（已经进入了方法体，分配了相应资源）->同步方法（在方法体之外）
 *
 * 面试题：如何解决线程安全问题？有几种方式？
 */
public class ThreadTestVideo13 {
  public static void main(String[] args) {
      WindowsTickets windowsTickets = new WindowsTickets();
      Thread thread1 = new Thread(windowsTickets);
      Thread thread2 = new Thread(windowsTickets);
      Thread thread3 = new Thread(windowsTickets);
      thread1.start();
      thread2.start();
      thread3.start();
  }
}
class WindowsTickets implements Runnable{
    private int ticket =100;
    ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                //1. 上锁
                reentrantLock.lock();
                if (ticket>0){
                    System.out.println("剩余票数为： " + ticket + Thread.currentThread().getName());
                    ticket--;
                }else {
                    break;
                }
            } finally {
                //2.调用解锁方法解锁
                reentrantLock.unlock();

            }
        }
    }
}
```
### 练习题
```java
package day18thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: chenwei
 * @date: 2021/8/1 1:25
 * @description: 描述
 */
public class ThreadHomeworkVideo142 {
  public static void main(String[] args) {
      Account account = new Account(10000);
      Customer c1 = new Customer(account);
      Customer c2 = new Customer(account);
      c1.setName("c1");
      c2.setName("c2");
      c1.start();
      c2.start();

  }
}
class Account{
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public void deposit(double amt){
//    public synchronized void deposit(double amt){ 方法一 这里的this指定是？一定要注意不能是多个 这是使用的同一个this  account
        if (amt>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = balance + amt;
            System.out.println("deposite successful balance is " + balance +" " + Thread.currentThread().getName());
        }
    }
}
class Customer extends Thread{
    private Account account;
    public Customer(Account account){
        this.account = account;
    }

    //方式二 这里式用继承Thread类,所以创建的ReenTrantLock一定要加Static
    static ReentrantLock r = new ReentrantLock();
    @Override
    public void run() {
        for (int i=0;i<3;i++){

            try {
                r.lock();
                account.deposit(1000);
            } finally {
                r.unlock();
            }
        }
    }
}
```
### 线程间的通信
```java
package day18thread;

/**
 * @author: chenwei
 * @date: 2021/8/2 0:29
 * @description: 线程通信的例子，使用两个线程答应1-100，线程一线程二交替打印
 * 涉及到的三个方法：
 * wait()一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器。
 * notify():一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait()，就唤醒优先级高的
 * notifyAll():一旦执行此方法，就唤醒所有被wait的线程
 *
 * 说明：
 * 1. wait notify notifyAll三个方法必须使用在同步代码块或同步方法中。
 * 2. wait notify notifyAll三个方法的调用者必须是同步代码块或同步方法中的同步监视器，否则，会出现IllegalMonitorStateException异常
 * 3. wait notify notifyAll三个方法是定义在java.lang.Object中的
 */
public class ThreadCommunicationTest {
  public static void main(String[] args) {
      Count count = new Count();
      Thread thread1 = new Thread(count);
      thread1.setName("线程1");
      Thread thread2 = new Thread(count);
      thread2.setName("线程2");
      thread1.start();
      thread2.start();
  }
}
class Count implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                notify();

                if (number<=100){
                    System.out.println("number is : " + number + Thread.currentThread().getName());
                    number++;
                }else {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
```
### 创建多线程的方式3 实现Callable接口的方式
```java
package day18thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: chenwei
 * @date: 2021/8/6 0:40
 * @description: 创建多线程的方式：实现callable方法 ---jdk5.0新增
 * 如何理解实现callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大？
 * 1.call()可以有返回值
 * 2.call()可以抛出异常，被外面的操作捕获，获取异常信息
 * 3.Callable支持泛型
 */
public class ThreadMethod3 {
  public static void main(String[] args) {
      //3。创建Callable实现类的对象
      NumberThread numberThread = new NumberThread();
      //4.将此callable实现类的对象作为参数传递到FutureTask构造器中，创建FutureTask对象
      FutureTask futureTask = new FutureTask(numberThread);
      //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用
      Thread thread = new Thread(futureTask);
      thread.start();
      try {
          //6.获取callable中call的返回值
          //get返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
          Object o = futureTask.get();
          System.out.println("sum is : " + o );
      } catch (InterruptedException e) {
          e.printStackTrace();
      } catch (ExecutionException e) {
          e.printStackTrace();
      }
  }
}
//1.创建一个实现Callable的实现类
class NumberThread implements Callable{

    //2.实现call方法，将此线程需要执行的操作声明在call中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i=0;i<=100;i++){
            if (i%2==0){
                System.out.println(i);
                sum =sum + i;
            }
        }
        return sum;
    }
}
```
### 创建多线程的方式4 线程池的方式
```java
package day18thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: chenwei
 * @date: 2021/8/6 1:11
 * @description: 创建线程的方式4 线程池 真正开发中都是先用的线程池，因为那几个好处
 * 使用线程池的好处：
 * 1.提高响应速度（减少了创建新线程的时间）
 * 2.降低资源消耗(重复利用线程池中的线程，不需要每次都创建)
 * 3.便于线程管理(corePoolSize:核心线程的大小 maximumPoolSize:最大线程数 keepAliveTime:线程没有任务时最多保持多长时间后会终止)
 *
 * 面试题：创建多线程有几种方式？
 *
 * */
public class ThreadPool {
  public static void main(String[] args) {
      //1.提供指定数量的线程池
      ExecutorService executorService = Executors.newFixedThreadPool(10);
    // 设置线程池的属性
        System.out.println(executorService.getClass());
      ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
      threadPoolExecutor.setCorePoolSize(15);

      //2.执行指定的线程的操作，需要提供实现Runnable接口或Callable接口实现类的对象(Runnable用execute,Callable用submit)
      //适用于runnable接口
      executorService.execute(new ThreadPoolRunnable());
      executorService.execute(new ThreadPoolRunnable2());
      //3.关闭连接池
      executorService.shutdown();
      //适用于callable接口
      //executorService.submit();
  }
}
class ThreadPoolRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if (i%2 == 0){
                System.out.println(Thread.currentThread().getName()+  " " + i);
            }
        }
    }
}
class ThreadPoolRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if (i%2 != 0){
                System.out.println(Thread.currentThread().getName()+  " " + i);
            }
        }
    }
}
```
### javap命令[Java字节码指令手册](https://www.cnblogs.com/xpwi/p/11360692.html)
```shell
javap -c ExamTest > ExamTest.txt
```
### day20 每日一题
1. 画图说明线程的生命周期，以及各状态切换使用到的方法等[图片参考链接](https://www.cnblogs.com/hejing-swust/p/8038263.html)  
   创建、就绪、运行、阻塞、死亡  
   1.1 初始状态   
   一、实现Runnable接口和继承Thread可以得到一个线程类，new一个实例出来，线程就进入了初始状态  
   1.2 可运行状态  
   一、可运行状态只是说你资格运行，调度程序没有挑选到你，你就永远是可运行状态。  
   二、调用线程的start()方法，此线程进入可运行状态。  
   三、当前线程sleep()方法结束，其他线程join()结束，等待用户输入完毕，某个线程拿到对象锁，这些线程也将进入可运行状态。  
   四、当前线程时间片用完了，调用当前线程的yield()方法，当前线程进入可运行状态。  
   五、锁池里的线程拿到对象锁后，进入可运行状态。  
   1.3 运行状态  
   一、线程调度程序从可运行池中选择一个线程作为当前线程时线程所处的状态。这也是线程进入运行状态的唯一一种方式。  
   1.4 死亡状态  
   一、当线程的run()方法完成时，或者主线程的main()方法完成时，我们就认为它死去。这个线程对象也许是活的，但是，它已经不是一个单独执行的线程。线程一旦死亡，就不能复生。  
   二、在一个死去的线程上调用start()方法，会抛出java.lang.IllegalThreadStateException异常。  
   1.5 阻塞状态  
   一、当前线程T调用Thread.sleep()方法，当前线程进入阻塞状态。  
   二、运行在当前线程里的其它线程t2调用join()方法，当前线程进入阻塞状态。  
   三、等待用户输入的时候，当前线程进入阻塞状态。  
2. 同步代码块中涉及到同步监视器和共享数据，谈谈你对同步监视器和共享数据的理解，以及注意点。  
```java
    synchronized (同步监视器){
      //操作共享数据的代码(不能包多了，也不能包少了)
    }
```
一、同步方法中的同步监视器是谁？答：见上面的笔记：分为非静态的同步方法(同步监视器是this)。。。静态的同步方法(当前类本身)   
3. sleep()和wait()的区别？  
   **wait()只能声明在同步代码块或同步方法中**
   一、每个对象都有一个锁来控制同步访问，Synchronized关键字可以和对象的锁交互，来实现同步方法或同步块。
   sleep()方法正在执行的线程主动让出CPU（然后CPU就可以去执行其他任务），
   在sleep指定时间后CPU再回到该线程继续往下执行(注意：sleep方法只让出了CPU，**而并不会释放同步资源锁**！！！ 是本线程内不会释放线程对象锁)  
   二、 **sleep()方法可以在任何地方使用；wait()方法则只能在同步方法或同步块中使用**  
   三、**sleep()是线程线程类（Thread）的方法**，调用会暂停此线程指定的时间，但监控依然保持，不会释放对象锁，
   到时间自动恢复；**wait()是Object的方法**，调用会放弃对象锁，进入等待队列， 
   待调用notify()/notifyAll()唤醒指定的线程或者所有线程，
   才会进入锁池，不再次获得对象锁才会进入运行状态；  
   
## day20 常用类  
### 字符串相关的类  
#### String 字符串，使用一对""引起来表示。  
1. String类声明为final的，不可被继承，就是说该有的方法都写好了，不需要你去拓展  
2. String实现了Serializable接口，表示字符串是可以被序列化的。String实现了Comparable接口，表示String可以比较大小。  
3. String内部定义了final char[] value 用于存放字符串数据  
4. String 代表不可变的字符序列。简称不可变性。  
   4.1 当对字符串重新赋值时，需要重写内存区域赋值，不能使用原有的value进行赋值。  
   4.2 当对现有的字符串进行链接操作时，也需要重写指定内存区域赋值，不能使用原有的value进行赋值。  
   4.3 当调用String的replace方法修改指定的字符或者字符串时，也需要重写指定内存区域赋值，不能使用原有的value进行赋值。  
5. 通过子面量的方式(区别于new)给一个字符串赋值，此时的字符串值声明在方法区的字符串常量池中  
6. 字符串常量池中是不会存储相同内容的字符串的  
#### 字符串的创建  
1. 通过字面量的方式  
2. 通过new + 构造器的方式
> 面试题：String s4 = new String("JavaEE");方式创建对象，在内存中创建了几个对象？  
> 答：两个，一个是堆空间new的结构，一个是char[]对应的常量池中的数据："JavaEE"   
```java
String s1 = "abc";
String s2 = new String();
String s3 = new String(String original);
String s4 = new String(char value[]);
String s5 = new String(char value[], int offset, int count);
```
```java
public class StringTest2 {
  public static void main(String[] args) {
    //通过字面量定义的方式：此时s1s和2的数据JavaEE声明在方法区中的字符串常量池中。
    String s1 = "JavaEE";
    String s2 = "JavaEE";
    //通过new + 构造器的方式:此时s3和s4的保存的地值，是数据在堆空间中开辟空间以后对应的地址值
    String s3 = new String("JavaEE");
    String s4 = new String("JavaEE");
    System.out.println(s1 ==s2);
    System.out.println(s1 ==s3);
    System.out.println(s1 ==s4);
    System.out.println(s3 ==s4);
    //需要能画内存图
    Person person1 = new Person("chenwei",24);
    Person person2 = new Person("chenwei",24);
    System.out.println(person1.name.equals(person2.name));//重写写过equals比较的是值是否相等
    System.out.println(person1.name==person2.name);
    person1.name = "hei";
    System.out.println(person1.name==person2.name);
  }
}
class Person{
  public String name;
  public int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
```
#### 两个结论
1. 常量和常量的拼接结果在常量池。且常量池中不会存在相同内容的常量  
2. 只要其中一个有变量，结果就在堆空间中，和new一样  
3. String调用intern方法时，强制要求返回的值一定要是在常量池中去声明  
```java
public class StringTest3 {
  public static void main(String[] args) {
    String s1 = "javaee";
    String s2 = "hadoop";
    String s3 = "javaeehadoop";
    String s4 = "javaee" + "hadoop";
    String s5 = s1 + "hadoop";
    String s6 = "javaee"+ s2;
    String s7 = s1 + s2;
    String s8 = (s1 + s2).intern();//放回值得到的s8使用的是常量池中已经存在的"javahadoop"
    System.out.println(s3 == s4);
    System.out.println(s3 == s5);
    System.out.println(s3 == s6);
    System.out.println(s3 == s7);
    System.out.println(s5 == s6);
    System.out.println(s5 == s7);
    System.out.println(s6 == s7);
    System.out.println(s3 == s8);
  }
}
```
#### 一道java关于String不可变性和值传递机制的面试题  
> 基本数据类型传递的是数据  
> 引用数据类型传递的是地址值(不要记引用类型把地址传过去，把里面的值该了原来的也改了，这个是错的，比如这个String不可改)
```java
/**
 * @author: chenwei
 * @date: 2021/8/9 2:25
 * @description: 这是一道面试题 String的不可变性和值传递机制考察
 * 基本数据类型传递的是数据
 * 引用数据类型传递的是地址值(不要记引用类型把地址传过去，把里面的值该了原来的也改了，这个是错的，比如这个String不可改)
 */
public class StringTest4 {
    String str = new String("good");
    char[] ch = {'t','e','s','t'};
    public void exchange(String str , char[] ch){
        str = "test ok";
        ch[0] = 'b';
    }
  public static void main(String[] args) {
        StringTest4 ex = new StringTest4();
        ex.exchange(ex.str,ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
  }
}
```

#### 其他练习 [java实现单循环链表](https://www.cnblogs.com/sang-bit/p/11610181.html)  

#### String常用方法1  
1. int length() 返回字符串的长度 return value.length()  
2. char charAt(int index) 返回某索引处的字符 return value[index]  
3. boolean isEmpty() 判断是否是空字符串：return value.length()  
4. String toLowerCase() 使用默认语言环境，将String中的所有字符转换为小写  
5. String toUpperCase() 使用默认语言环境，将String中的所有字符转换为大写  
6. String trim() 返回字符串的副本，忽略前导空白和尾部空白  
7. boolean equals(Object obj) 比较字符串的内容是否相同  
8. boolean equalsIgnoreCase(String anotherString) 与equals方法类似，忽略大小写  
9. String concat(String str) 将指定字符串连接到此字符串结尾。等价于"+"  
10. int compareTo(String anotherString) 比较两个字符串的大小  
11. String substring(int beginIndex) 返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符  
12. String substring(int beginIndex,int endIndex) 返回一个新字符串，它是此字符串从beginindex开始截取到endindex(不包含)的一个子字符串  
```java
public class StringMethodTest {
    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.concat(s2));
        String s3 = "abc";
        String s4 = new String("def");
        System.out.println(s3.compareTo(s4));//涉及到字符串排序
        String s5 = "我家在重庆市黔江区";
        String s6 = s5.substring(3);
        System.out.println(s5);
        System.out.println(s6);
        String s7 = s5.substring(6,8);
        System.out.println(s7);
    }
    @Test
    public void test1(){
        String s1 = "Helloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
        //System.out.println(s1.charAt(10));
        //s1= "";
        System.out.println(s1.isEmpty());
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        s2 = s1.toUpperCase();
        System.out.println(s2);
        String s3 = "  hel  lo wor   ld   ";
        String s4 = s3.trim();
        System.out.println(s4);
    }
}
```
#### String常用方法2  
13. boolean endswith(String suffix) :测试此字符串是否以指定的后缀字符串结束
14. boolean startswith(String prefix) :测试此字符串是否以指定的前缀字符串结束
15. boolean startswith(String prefix,String suffix) :测试此字符串从从指定索引开始的子字符串是否以指定前缀开头
16. boolean contains(CharSequence s):当且仅当此字符串包含指定的char值序列时，返回true
17. int indexOf(String str):返回指定子字符串在此字符串中第一次出现处的索引
18、int indexOf(String str,int fromIndex):返回指定子字符串在此字符串中第一次出现处的索引，从指定索引开始
19. int lastIndexOf(String str):返回指定子字符串在此字符串中最右边出现处的索引
20. int lastIndexOf(String str,int fromIndex) 返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始
注：indexOf和lastIndexOf方法如果未找到都是返回-1
```java
public class StringMethod2Test {
  public static void main(String[] args) {
      String str1 = "helloworld";
      boolean b1 = str1.endsWith("rld");
      System.out.println(b1);
      boolean he = str1.startsWith("He");
      System.out.println(he);
      boolean ll = str1.startsWith("ll", 2);
      System.out.println(ll);
      String str2 = "wor";
      System.out.println(str1.contains(str2));
      System.out.println(str1.indexOf("lo"));
      //此方法可以用来找某个字符串出现了几次
      System.out.println(str1.indexOf("lo", 5));
      String str3 = "hellorworld";
      System.out.println(str3.lastIndexOf("or"));
      System.out.println(str3.lastIndexOf("or",6));
      //什么情况下，indexOf(str)和lastIndexOf(str)返回值相同？
      //情况一：存在唯一一个str。情况二：不存在str都返回-1
  }
}
```
#### String常用方法3
* 1. String replace(char oldChar,char newChar):返回一个新的字符串，它是通过用newChar替换此字符串中出现的所有oldChar得到的。
* 2. String replace(CharSequence target,CharSequence replacement):使用指定的子面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
* 3. String replaceAll(String regex,String replacement):使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
* 4. String replaceFirst(String regex,String replacement):使用给定的replacement替换此字符串所有匹配给定的正则表达式的第一个子字符串。
*
* 5. boolean matches(String regex):告知此字符串是否匹配给定的正则表达式。
*
* 6. String[] split(String regex):根据给定正则表达式的匹配拆分此字符串。
* 7. String split(String regex,int limit):根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放在最后一个元素中
```java
public class StringMethodTest3 {
  public static void main(String[] args) {
  String str1 = "重庆市黔江区五里乡重庆";
  String str2 = str1.replace("庆","喜");
  System.out.println(str1);
  System.out.println(str2);
  String str3 = str1.replace("重庆","上海");
  System.out.println(str3);
  String str4 = "534hello52world25235java23542mysql26565";
  String string = str4.replaceAll("\\d+",",");
  System.out.println(string.replaceAll("^,|,$",""));
  String str5 = "13235325324534";
  boolean match = str5.matches("\\d+");
  System.out.println(match);
  String tel = "0571-4534289";
  //判断这是否是一个杭州的固定电话
  boolean result = tel.matches("0571-\\d{7,8}");
  System.out.println(result);
  System.out.println("***********");
  String str6 = "hello|world|java|mysql";
  String[] strs = str6.split("\\|");
  for (int i=0;i<strs.length;i++){
    System.out.println(strs[i]);
  }
    String str7 = "hello.world.java.mysql";
  String[] strs2 = str7.split("\\.");
  for (int i=0;i<strs2.length;i++){
    System.out.println(strs2[i]);
  }
  }
}
```
#### String与基本数据类型、包装类之间的转换
* String ---> 基本数据类型、包装类：调用包装类的静态方法：parseXXX(str)
* 基本数据类型、包装类 ---> String：调用String重载的valueOf(xxx)
```java
public class StringMethodTest4 {
  public static void main(String[] args) {
    String str1 = "123";
    int i = Integer.parseInt(str1);
    String str2 = String.valueOf(i);
    String str3 = i + "";
    //只要有变量参与了都是在堆里
    System.out.println(str3 == str1);
  }
}
```
#### 消炎药常识
1. 常用的消炎药种类是有很多的，一般情况下指的消炎药是抗生素或者抗病毒的药物，对于病毒或者细菌感染所造成的炎症都具有一定的消炎作用。
   > 1. 比如出现了病毒性感染，需要使用利巴韦林、蒲地蓝消炎口服液、蓝芩口服液、四季抗病毒合剂或者达菲进行消炎治疗，效果都是比较好的。 尤其是达菲，适用于流感病毒造成的炎症。
   > 2. 如果是抗生素类的消炎药，种类是有很多的，比如比较常用的是青霉素类抗生素，像阿莫西林或者阿莫西林克拉维酸钾，
   > 还有头孢类抗生素，比如头孢氨苄、头孢羟氨苄、头孢拉定、头孢克肟或者头孢克洛。还有大环内酯类的抗生素，像阿奇霉素、罗红霉素或者红霉素，这些药物消炎作用都是比较好的，需要根据具体的感染类型，选择合适的消炎药。
#### String、StringBuffer、StringBuilder三者之间的异同
1. String ： 不可变的字符序列；底层使用char[]存储
2. StringBuffer : 可变的字符序列；线程安全的，效率低；底层使用char[]存储
3. StringBuilder : 可变的字符序列；JDK5.0新增的，线程不安全的，效率高；底层使用char[]存储

** 源码分析：
* String str = new String();//char[] value = new char[0];
* String str = new String("abc");//char[] value = new char[]{'a','b','c'};
*
* StringBuffer sb = new StringBuffer();//char[] value = new char[16];底层创建了一个长度是16的字符数组
* sb.append('a');//value[0]='a';
* sb.append('b');//value[1]='b'; 
* StringBuffer sb = new StringBuffer("abc");//char[] value = new char["abc".length() + 16];底层创建了一个长度是16 + "abc".length()的字符数组
*
1. 问题 System.out.println(sb.length());是多少？  
*       这里的length里面是用count实现，实际表示的是里面有多少个字符，所以不用管16，里面是多少个字符就是多少
2. 问题 **扩容问题**； 如果要添加的数据底层数组放不下了，那就需要扩容底层数组
*      默认情况下：扩容为原来容量的2倍+2，同时将原有数组中的元素复制到新的数组中。
*      如果直到开发中需要多次追加，则可以考虑下面的，固定一定容量，就免去复制数组，节省空间和时间
*      指导意义 : 开发中建议大家使用：StringBuffer(int capacity) 或 StringBuilder(int capacity)
```java
public class StringBufferStringBuilderTest {
  public static void main(String[] args) {
    StringBuffer stringBuffer = new StringBuffer("abc");
    stringBuffer.setCharAt(0,'p');
    System.out.println(stringBuffer);
    System.out.println(stringBuffer.length());

    StringBuilder stringBuilder = new StringBuilder("def");
  }
}
```
#### StringBuffer的常用方法，StringBuilder一样
1. StringBuffer append(xxx) : 提供了很多的append方法，用于字符串的拼接
2. StringBuffer delete(int start, int end) : 删除指定位置的内容
3. StringBuffer replace(int start, int end,String str) : 把[start,end)位置替换为str
4. StringBuffer insert(int offset, xxx) : 在指定位置插入xxx
5. StringBuffer reverse() : 把当前字符序列逆转

6. public int indexOf(String str) 找出str首次出现的位置
7. public String substring(int start,int end) 返回一个从start开始到end索引结束的左闭右开区间的子字符串
8. public int length()
9. public char charAt()
10. public void setCharAt(int n,char ch)
* 总结：
*      增：append
*      删：delete
*      改：setCharAt replace
*      查：charAt
*      插：insert
*      长度：length
*      遍历:for + charAt / toString
```java
public class StringBufferMethod1 {
  public static void main(String[] args) {
    StringBuffer stringBuffer = new StringBuffer("abc");
    stringBuffer.append(1);
    stringBuffer.append('1');
    System.out.println(stringBuffer);
    //注意是左闭右开
    stringBuffer.delete(2,4);
    System.out.println(stringBuffer);
    stringBuffer.replace(2,4,"chenwei");
    System.out.println(stringBuffer);
    stringBuffer.insert(2,false);
    System.out.println(stringBuffer);
    stringBuffer.reverse();
  }
}
```
#### 对比String、StringBuffer、StringBuilder三者的效率
1. 从高到低排序：StringBuilder > StringBuffer > String
```java
public class StringEffective {
  public static void main(String[] args) {
      long startTime = 0L;
      long endTime = 0L;
      int N = 20000000;
      String str = "";
      StringBuilder builder = new StringBuilder("");
      StringBuffer buffer = new StringBuffer("");
      //开始对比
//      startTime = System.currentTimeMillis();
//      for (int i=0;i<N;i++){
//          str = str + i;
//      }
//      endTime = System.currentTimeMillis();
//      System.out.print("str");
//      System.out.println(endTime - startTime);

      startTime = System.currentTimeMillis();
      for (int i=0;i<N;i++){
          builder.append(String.valueOf(i));
      }
      endTime = System.currentTimeMillis();
      System.out.print("builder");
      System.out.println(endTime - startTime);

      startTime = System.currentTimeMillis();
      for (int i=0;i<N;i++){
          buffer.append(String.valueOf(i));
      }
      endTime = System.currentTimeMillis();
      System.out.print("buffer");
      System.out.println(endTime - startTime);
  }
}
```
#### String与StringBuffer、StringBulder之间的转换
1. String ---> StringBuffer、StringBulder 调用StringBuffer、StringBulder的构造器
2. StringBuffer、StringBulder ---> String 1、调用String构造器 2、StringBuffer、StringBulder的toString()方法
#### JVM中字符串字符串常量池存放位置的说明
1. jdk1.6 字符串常量池存储在方法区(永久区)
2. jdk1.7 字符串常量池存放在堆空间
3. jdk1.8 字符串常量池存放在方法区(元空间)
### jdk8 之前日期时间API
#### 获取系统当前时间
1. Long currentTime = System.currentTimeMillis(); 返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差 称为时间戳
#### java.util.Date类与java.sql.Date类
1. sql.Date类是util.Date类的子类
> java.util.Date类  
>         -------------java.sql.Date
* 1. 两个构造器的使用
>      构造器一：Date() 创建当前时间的Data对象
>      构造器二：创建指定毫秒数的Date对象

* 2. 两个方法的使用
>      >toString //显示当前时间的年月日时分秒
>      >getTime //获取当前date对象的时间戳，具体到毫秒

* 3. java.sql.Date对应着数据库中的日期类型的变量
> 如何实例化  
> sql.Date  --->  util.Date 子转父，可强转   
> util.Date  --->  sql.Date  通过毫秒数  
```java
    public void dateTimeTest(){
        //构造器一：Date() 创建当前时间的Data对象
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());
        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1628860522707L);
        System.out.println(date2.toString());
        //创建java.sql.Date对象
        java.sql.Date date = new java.sql.Date(1628860522707L);
        System.out.println(date);
        //如何将util.Date  转换为--->  sql.Date   通过毫秒数
        Date date3 = new Date();
        java.sql.Date date4 = new java.sql.Date(date3.getTime());
        System.out.println(date4);
    }
```
#### java.text.SimpleDateFormat类
```java
/**
 * @author: chenwei
 * @date: 2021/8/15 1:07
 * @description: jdk8之前的日期时间API测试
 * 1. System类中的currentTimeMillis();
 * 2. java.util.Date和java.sql.Date
 * 3. simpleDateFormat
 * 4. Calender
 *
 * SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
 * 注意这里后面的yyyy和dd写成大写的会有问题，为什么呢？
 * 直接记忆MM为什么大写吧，因为和分钟minute的m冲突，所以月份要大写
 *
 * simpleDateFormat的使用：simpleDateFormat对日期Date类的格式化和解析
 * 1. 两个操作
 * 1.1 格式化：日期 --> 字符串
 * 1.2 解析： 格式化的逆过程，字符串 --> 日期
 *
 * 2. simpleDateFormat的实例化
 * SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY-MM-dd hh-mm-ss");//指定日期格式的实例化
 * SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
 */
public class TestDataSimpleDateFormat {
  public static void main(String[] args) throws ParseException {
      //实例化simpleDateFormat
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

      //格式化：日期 --> 字符串
      Date date = new Date();
      System.out.println("date = " + date);

      String s = simpleDateFormat.format(date);
      System.out.println("s = " + s);

      //解析：格式化的逆过程，字符串-->日期
      String str = "19-12-03 上午 11:66";
      Date date1 = new Date();
      date1 = simpleDateFormat.parse(str);
      System.out.println("date1 = " + date1);

      System.out.println("\"******************\" = " + "******************");
      //格式化
      SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY-MM-dd hh-mm-ss");
      System.out.println("simpleDateFormat1.format(date1) = " + simpleDateFormat1.format(date1));
      //解析
      Date date2 = simpleDateFormat1.parse("2019-12-03 12-06-00");
      System.out.println("date2 = " + date2);
      Date date3 = new Date();
      System.out.println(simpleDateFormat1.format(date3));
      //练习1 将字符串“2020-09-08”转换为java.sql.Date
      String s1 = new String("2020-09-08");
      SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
      Date date4 = simpleDateFormat2.parse(s1);
      java.sql.Date sqlDate = new java.sql.Date(date4.getTime());
      System.out.println("sqlDate = " + sqlDate);
      //练习2 三天打鱼两天晒网 1990-09-08 xxxx-xx-xx打鱼还是筛网？
      /*
      * 关键计算到那一天的总天数，关于计算总天数的问题，考虑使用毫秒数解决问题，获取毫秒数相减
      * 计算天数 (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 *24) + 1
      * 总天数%5 == 1,2,3 打鱼
      * 总天数%5 == 4，0 筛网
      * */
  }
}
```
#### Calender类 Calendar日历类（抽象类）的使用
```java
public class TestCalendar {
  public static void main(String[] args) {
      /*
      * 1. 实例化
      * 方式一、 创建其子类（GregorianCalendar）的对象
      * 方式二、 调用其静态方法GetInstance()
      * 2. 常用方法
      * get()
      * set()
      *
      * */
      Calendar instance = Calendar.getInstance();
      GregorianCalendar gregorianCalendar = new GregorianCalendar();

      //get()方法
      int days = instance.get(Calendar.DAY_OF_MONTH);
    System.out.println("days = " + days);
    System.out.println("DAY_OF_YEAR = " + instance.get(Calendar.DAY_OF_YEAR));

    //set方法
    //这里set过后将Calendar对象本身就改了
    instance.set(Calendar.DAY_OF_MONTH,10);
    System.out.println(
        "instance.get(Calendar.DAY_OF_MONTH) = " + instance.get(Calendar.DAY_OF_MONTH));
    //add方法,虽然没有减，但是可以把参数修改为负的就相当于是减了
      instance.add(Calendar.DAY_OF_MONTH,9);
      instance.add(Calendar.DAY_OF_MONTH,-1);
    System.out.println(
        "instance.get(Calendar.DAY_OF_MONTH) = " + instance.get(Calendar.DAY_OF_MONTH));

    //getTime() 日历类  --> date
      Date d = instance.getTime();
    System.out.println("d = " + d);
    //setTime() date --> 日历类
      Date date = new Date();
      instance.setTime(date);
    System.out.println(
        "instance.get(Calendar.DAY_OF_MONTH) = " + instance.get(Calendar.DAY_OF_MONTH));
  }
}
```
#### jdk8中日期时间api
##### LocalDate、LocalTime、LocalDateTime的使用
1. LocalDateTime的使用频率相较LocalDate、LocalTime使用频率更高  
2. 类似于Calendar类  
```java
public class TestLocalDate {
  public static void main(String[] args) {
      //now()获取当前的日期、时间、时间+日期
      LocalDate localDate = LocalDate.now();
      LocalTime localTime = LocalTime.now();
      LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("localDate = " + localDate);
    System.out.println("localTime = " + localTime);
    System.out.println("localDateTime = " + localDateTime);

    //of()设置指定的年、月、日、时、分、秒。没有偏移量
      LocalDateTime of = LocalDateTime.of(2021, 10, 3, 3, 3, 3);
      System.out.println(of);

    // getXxx() 获取某个属性
    System.out.println(localDateTime.getDayOfMonth());
    System.out.println(localDateTime.getDayOfWeek());
    System.out.println(localDateTime.getMonth());
    System.out.println(localDateTime.getMinute());

    //体现不可变性,这里对比calendar类的可变性，calendar没有返回值，而这里有返回值所以也可以看出不可变性
      //withXxx()设置相关属性，类似于Calendar的set
      LocalDate localDate1 = localDate.withDayOfMonth(22);
    System.out.println(localDate);
    System.out.println(localDate1);

    //LocalDate、LocalTime、LocalDateTime是一样的
      LocalDateTime localDateTime1 = localDateTime.withHour(2);
    System.out.println(localDateTime1);
    System.out.println(localDateTime);

    //不可变性，
      //plus加
      LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
    System.out.println(localDateTime);
    System.out.println(localDateTime2);

      //不可变性，
      //minus
      LocalDateTime localDateTime3 = localDateTime.minusDays(5);
    System.out.println(localDateTime);
    System.out.println(localDateTime3);
  }
}
```
##### Instant 瞬时的使用  
1. 类似于java.util.Date类
```java
public class TestInstant {
  public static void main(String[] args) {
      //now()对应本初子午线的标准时间
      Instant instant = Instant.now();
    System.out.println(instant);
    //添加时间的偏移量
      OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
    System.out.println(offsetDateTime);
    //toEpochSecond() 获取对应的毫秒数，和Date一样的 获取自1970年1月1日0时0分0秒的毫秒数
      long toEpochSecond = offsetDateTime.toEpochSecond();
    System.out.println(toEpochSecond);

    //ofEpochMilli()通过给定的毫秒数，获取Instant实例 --> Date(Long long )
      Instant instant1 = Instant.ofEpochMilli(toEpochSecond);
    System.out.println(instant1);

  }
}
```
##### 格式化或解析时间、日期DateTimeFormatter的使用  
1. 实例化
> 方式一：预定义标准格式 三种DateTimeFormatter.ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME   
> 方式二：本地化的相关格式 DateTimeFormatter.ofLocalizedDateTime();  
> DateTimeFormatter.ofLocalizedDate();  
> DateTimeFormatter.ofLocalizedTime();    
> 重点 方式三: 自定义的格式   
```java
public class TestDateTimeFormatter {
  public static void main(String[] args) {
      //实例化
      //方式一：预定义标准格式 三种DateTimeFormatter.ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
      DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
      //创建一个LocalDateTime用于格式化
      //格式化 LocalDateTime --> String
      LocalDateTime localDateTime = LocalDateTime.now();
      String str_isoLocalDateTime = isoLocalDateTime.format(localDateTime);
      System.out.println("str_isoLocalDateTime"+str_isoLocalDateTime);
    System.out.println(localDateTime);
    //解析 String --> LocalDateTime TemporalAccessor由于不知道是LocalDateTime还是LocalDate还是LocalTime，这里是一个接口形式呈现的，是一个多态形式
      TemporalAccessor parse = isoLocalDateTime.parse("2021-08-15T20:41:29.065");
    System.out.println(parse);

    //方式二:本地化的相关格式 DateTimeFormatter.ofLocalizedDateTime();DateTimeFormatter.ofLocalizedDate();DateTimeFormatter.ofLocalizedTime()
      //FormatStyle.LONG/FormatStyle.SHORT/FormatStyle.FULL
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
      //2021年8月16日 上午01时37分38秒
      String format = dateTimeFormatter.format(LocalDateTime.now());
    System.out.println(format);

    System.out.println("********** DateTimeFormatter.ofLocalizedDate()");
      DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      //2021年8月16日 星期一
      String format1 = dateTimeFormatter1.format(LocalDate.now());
    System.out.println(format1);

    // 重点：方式三 自定义的格式
    System.out.println("方式3 重点");
      DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
      //解析
      String str_2 = dateTimeFormatter2.format(LocalDateTime.now());
      System.out.println(str_2);
    System.out.println(LocalDateTime.now());
    // 格式化
    System.out.println("格式化");
      String s = "2010-03-01 12:12:12";
      TemporalAccessor parse1 = dateTimeFormatter2.parse(s);
    System.out.println(s);
    System.out.println(parse1);
  }
```

## day22
### 复习
1. jdk8之前和jdk8中日期、时间相关的类分别有哪些？
   >java.util.Date和java.sql.Date -> Instant
   > SimpleDateFormat -> DateTimeFormat
   > Calendar -> LocalTime、LocalDate、LocalDateTime
2. 将字符串“2021-03-06”转换为对应的java.sql.Date对象 
   > 方式一
   > SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd")
   > java.sql.Date = date = sdf.parse(“2021-03-06”)
   **************************
   > 方式二
   > DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd")
3. 解释何为编码解码？何为日期时间的格式化、解析
4. 自定义Person类，包含姓名年龄，如下，如何实现自然排序（按姓名从小到大）
5. 提供定制排序涉及到的接口的实现类对象，并按Person类的年龄从大到小排序
### 日期时间API的迭代
1. 第一代jdk1.0 Date  
2. jdk1.1 Calendart类，一定程度上替换Date
3. jdk1.8提出了新的一套PAI  
## 枚举类和enmu,以及注解的使用
### 枚举类
```java
public enum Status {
    FREE,BUSY,NO;
}
```
#### 主要内容
1. 如何自定义枚举类
2. 如何使用关键字enmu定义枚举类
3. Enum类的主要方法
4. 实现接口的枚举类
#### 枚举类的使用
1. 类的对象只有有限个，确定的。如一下
>星期、性别、季节、支付方式、就职状态
2. 当需要定义一组常量时，强烈建议使用枚举类

#### 一、 枚举类的使用
1. 枚举类的理解：类的对象只有有限个，确定的。我们称此类为枚举类
2. 当需要定义一组常量时，强烈建议使用枚举类
3. 如果枚举类中只有一个对象，则可以作为单例模式的实现方式
#### 二、 如何定义枚举类
1. 方式一、jdk5.0之前自定义枚举类
2. 方式二、jdk5.0之后，可以使用enum关键字定义枚举类
#### 三、enum类中的常用方法
1. values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
2. valueOf(String str)方法可以把一个字符串转为对应的枚举类型对象，要求字符串必须是枚举类型对应
3. toString()返回当前枚举类对象常量的名称
#### 四、使用enum关键字定义的枚举类实现接口的情况
1. 实现接口，在enum类中实现抽象方法
2. 让枚举类的对象分别实现接口中的抽象方法
### 注解annotation
1. 注解(annotation)概述
2. 常见的annotation示例
3. 自定义annotation
4. JDK中的元注解
5. 利用反射获取注释信息(在反射部分涉及)
6. JDK中注解的新特性
#### 1. 注解的理解
1. jdk5.0新增的功能
2. Annotation其实就是代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取，并执行相应的处理。通过使用Annotation。
   程序员可以在不改变原逻辑的情况下，在源文件中嵌入一些补充信息。
3. 在JavaSe中，注解的使用目的比较简单，例如标记过时的功能，忽略警告等。在JavaEE/Android中注解占据了更重要的角色，
   例如用来配置应用程序的任何切面，代替旧版JavaEE中所遗留的繁冗代码和XML配置
4. 框架 = 注解 + 反射机制 + 设计模式
#### 2. Annotation的使用示例
1. 示例一：生成文档相关的注解
2. 示例二：在编译时进行格式检查(JDK内置的三个基本注解)
   @Override:限定重写父类方法，该注解只能用于方法
   @Deprecated:用于表示所修饰的元素(类、方法等)已过时。通常时因为所修饰的结构危险或存在更好的选择
   @SuppresWarnings:抑制编译器警告
3. 提示：跟踪代码依赖性，实现替代配置文件功能
#### 3. 如何自定义注解：参照@SuppresWarnings注解的定义
1. 注解声明为@interface
2. 内部定义成员，通常使用value表示
3. 可以指定成员的默认值
4. 如果自定义注解没有成员，表明是一个表示作用
5. 如果注解有成员，在使用注解时，需指定成员的值。
6. 自定义注解必须配上注解的信息处理流程(使用反射)才有意义。
7. 自定义注解通常都会指明两个元注解，Retention、Target
8. 代码举例

```java
import javax.swing.text.Element;
import java.lang.annotation.ElementType;

@Inherited
@Repeatable(value = MyAnnotation.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARMETER, CONSTRUCTOR, ElementType.LOCAL_VARIABL, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
public @interface MyAnnotation {
   String value() default "hello";
}
```
#### 4. 如何获取注释信息：通过反射来获取调用。
1. 前提：要求此注解的元注解Retention中声明的生命周期为RUNTIME
#### 5. JDK8中注解的新特性：可重复注释，类型注解
##### 5.1 可重复注解：
   1. 在MyAnnotation上声明@Repeatable,成员值为MyAnnotations.class  
   2. MyAnnotation的Target和Retention等元注解于MyAnnotation相同  
#####5.2 类型注解：
   1. ElementType.TYPE_PARAMETER表示该注解能写在类型变量的声明语句中，如泛型声明  
   2. ElementType.TYPE_USE表示该注解能写在使用类型的任何语句中  
## day23 java集合
1. 集合框架概述
2. Collection接口方法
3. Iterator迭代器接口
4. Collection子接口 List
5. Collection子接口 Set
6. Map接口
7. Collections工具类
### 集合框架概述
1. 集合、数组都是对多个数据进行存储操作的结构，简称Java容器
> 说明：此时的存储，主要指的是内存层面的存储，不涉及到持久化存储(txt,mysql,数据等)  
#### 数组
2. 数组在存储多个数据方面的优点：
> 一旦初始化后长度就固定了
> 1. 数组一旦定义好，其元素的类型也就确定了。我们也就只能操作指定类型的数据了。  
> 2. 比如String[] str;int[] arr;等
3. 数组在存储多个数据方面的缺点：
> 1. 一旦初始化后长度就不能修改。  
> 2. 数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不便，同时效率不高。 
> 3. 获取数组中实际元素的需求，数组没有实际的属性或方法可用  
> 4. 数组存储数据的特点：有序、可重复。对于无序，不可重复的需求，不能满足。  
#### 集合框架
1. Collection接口：单列集合，用来存储一个一个的对象，
> 1. list接口：存储有序的、可重复的数据。 --> "动态"数组  
>> ArrayList、LinkedList、Vector
> 2. Set接口：存储无序的、不可重复的数据 --> 高中所讲的集合
>> HashSet、LinkedHashSet、TreeSet
2. Map接口：双列集合：用来存储一对(key-value)一对的数据
>> HashMap、LinkedHashMap、TreeMap、HashTable、Properties
##### Collection接口下的常用方法 Collection collection = new ArrayList();这也算是一个面试题，15个常用方法
1. add(E e)  添加元素 确保此集合包含指定的元素。
2. addAll(Collection<? extends E> c) 将指定集合中的所有元素添加到此集合。
3. clear() 从此集合中删除所有元素
4. contains(Object o) 如果此集合包含指定的元素，则返回 true 。
5. containsAll(Collection<?> c) 如果此集合包含指定 集合中的所有元素，则返回true。
6. equals(Object o) 将指定的对象与此集合进行比较以获得相等性
7. hashCode() 返回此集合的哈希码值
8. isEmpty() 如果此集合不包含元素，则返回 true 。
9. iterator()返回此集合中的元素的迭代器。
10. remove(Object o)从该集合中删除指定元素的单个实例（如果存在）（可选操作）。
11. removeAll(Collection<?> c)删除指定集合中包含的所有此集合的元素（可选操作）。 此调用返回后，此集合将不包含与指定集合相同的元素。
12. retainAll(Collection<?> c)仅保留此集合中包含在指定集合中的元素（可选操作）。 换句话说，从该集合中删除所有不包含在指定集合中的元素。
13. 	size()
14. toArray(T[] a)返回包含此集合中所有元素的数组; 返回的数组的运行时类型是指定数组的运行时类型。
##### 迭代器的使用
```java
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
```
##### forEach循环遍历集合或数组
```java
        for (Object c : collection){
            System.out.println(c);
        }
```
1. 一道面试题 String 是一个引用，修改它不会改变原有的值
```java
        //foreach遍历面试题
        String[] str = new String[]{"fsd","sdaf","asdf"};
        //会改变
        for (int i=0;i<str.length;i++){
            str[i] = "ffff";
        }
        //不会改变
        for (String s : str){
            s = "fffff";
        }
        for (String s:str ) {
            System.out.println(s);
        }
```
#### ArrayList、LinkedList、Vector的底层实现和异同
1. ArrayList：作为list接口的主要实现类；线程不安全的，效率高；底层使用Object[] elementData
2. LinkedList: 对于频繁的插入、删除操作，使用此类比ArrayList效率高；底层使用双向链表存储数据
3. Vector:作为List接口的古老实现类；线程安全的，效率低；底层使用Object elementData
#### 面试题 ArrayList、LinkedList、Vector三者的异同
1. 三个类都实现了List接口，存储数据的特点相同：存储有序的、可重复的数
2. 不同：见上底层实现
#### ArrayList源码分析 jdk7和8底层不同 
##### jdk7中
1. ArrayList arrayList = new ArrayList();//底层创建了长度是10的Object[]数组elementData
   arrayList.add(123) --> elementData[0] = new Integer(123)
   arrayList.add(1) 如果此次添加导致底层elementData数组容量不够则扩容，默认情况下扩容为原来的1.5倍，同时需要将原有的数据赋值到新的数组中
2. 结论：建议开发中使用带参的构造器： ArrayList arrayList = new ArrayList(int capacity); 以免重复复制数组导致效率低
##### jdk8中 当添加元素的时候才把容量设置为10，相当于饿汉式和懒汉式的区别
1. ArrayList arrayList = new ArrayList();//底层Object[] elementData = 初始化为{},并没有创建长度为10的数组
   arrayList.add(123) 第一次调用add()时，底层才创建了长度为10的数组，并将数据123添加到elementData中，
   后续的添加出发扩容机制于jdk7一样
##### 小节
1. jdk7中的ArrayList的对象的创建类似于单例的饿汉式，而jdk8中的ArrayList的对象的创建类似于单例的懒汉式，延迟了数组的创建，节省内存。
#### LinkedList源码分析
1. LinkedList linkedList = new LinkedList();内部声明了Node类型的first和last属性，默认值为null
   list.add(012);将123封装到Node中，创建了Node对象。
   其中，Node定义为：体现了LinkedList的双向链表的说法
```java
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
```
#### Vector源码分析
1. jdk7和jdk8中通过构造器创建对象时，底层都创建了长度为10的数组，在扩容方面，默认扩容为原来的**两倍**
#### List接口中常用方法测试 List除了从Collection集合继承的方法外，List集合里添加了一些根据索引来操作集合元素的方法
1. void add(int index,Object ele) 在index位置插入ele元素
2. boolean addAll(int index,Collection eles) 从index位置开始将eles中的所有元素添加进来
3. Object get(int index) 获取指定index位置的元素
4. int indexOf(Object obj) 返回obj在集合中首次出现的位置
5. int lastIndexOf(Object obj) 返回obj在集合中最后一次出现的位置
6. Object remove(int index) 移除指定位置的元素，并返回此元素
7. Object set(int index,Object ele) 设置指定index位置的元素为ele
8. List subList(int fromIndex,int toIndex) 返回从fromIndex到toIndex位置的子集合
##### list的一道面试题
```java
    public void test6(){
        //remove()有两个，一个删除指定位置的元素，一个删除指定对象，当对象是数字时，要使用包装类
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.remove(2);
        arrayList.remove(new Integer(2));
        System.out.println(arrayList);
    }
```
### Set(存储无序的、不可重复的数据)接口中hashset、linkedHashSet、treeSet源码分析
#### 添加元素的过程，以hashSet为例子
1. 我们向hashSet中添加元素a,首先调用元素a所在类的hashcode方法，计算元素a的hash值，
   接着通过此hash值计算出在Hashset底层数组中存放的位置(即为索引位置)，判断数组此位置上是否已经有元素：
2. 如果此位置上没有其他元素，则元素a添加成功， --> 情况1
3. 如果此位置上有其他元素b(或以链表存在的多个元素)，则比较元素a与元素b的hash值：
   1. 如果hash值不同，则元素a添加成功。 --> 情况2
   2. 如果hash值相同，进而需要调用元素a所在类的equals方法：
      1. equals返回true，元素a添加失
      2. equals返回false，元素a添加成功 --> 情况3
4. 对于添加成功的情况2和3而言：元素a与已经存在指定位置上的数据以链表的方式存储。  
jdk7:元素a存放在数组中，指向原来的元素  
jdk8:原来的元素在数组中，指向元素a  
总结：七上八下     
hashSet底层：数组+链表存储      
#### linkedHashSet存储过程与hashSet一样
1. 在底层添加了首位指针，方便读取前后的元素 --> 如果需要频繁地遍历操作，那么优先选择linkedHashSet
#### treeSet
1. 向treeSet中添加的数据，相求是相同类的数据。
2. 两种排序方式：自然排序(实现Comparable接口)、和定制排序
3. 自然排序中，比较两个对象知否相等的标准为：compareTo()返回0,不再是equals()
   1. 注意：如果有多个属性，然而比较中只使用一个属性，那么这个属性相同的话添加到treeSet中就认为是同一个
      ，将不再添加进去，所以要比较整个对象的话需要重写Comparable方法，并且只有当每个元素都相等时才返回0；
##### treeSet 实现一个定制排序,外加一个自然排序 
```java
public class TestCollection3 {
    @Test
    public void treeSet(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    if (p1 == p2){
                        return 0;
                    }else {
                        if (p1.getName().equals(p2.getName())){
                            if (p1.getAge() == p2.getAge()){
                                return 0;
                            }else {
                                return p1.getAge() - p2.getAge();
                            }
                        }else {
                            return p1.getName().compareTo(p2.getName());
                        }
                    }
                }else {
                    throw new RuntimeException("不是同一个对象" + getClass().getName());
                }
            }
        };
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.add(new Person("陈伟",24));
        treeSet.add(new Person("陈伟",22));
        treeSet.add(new Person("陈伟",26));
        treeSet.add(new Person("陈伟",26));
        treeSet.add(new Person("陈大大",24));
        System.out.println(treeSet);
    }
}
```
##### 理解hashSet的面试题 hashcode equals 的理解
```java
public class InterviewTest {
  public static void main(String[] args) {
      HashSet hashSet = new HashSet();
      Person p1 = new Person("CHENWEI",33);
      Person p2 = new Person("CHENWEI",24);
      hashSet.add(p1);
      hashSet.add(p2);
      System.out.println(hashSet);

      p1.setName("chendada");
      hashSet.remove(p1);
      System.out.println(hashSet);

      hashSet.add(new Person("chendada",33));
      System.out.println(hashSet);

      hashSet.add(new Person("CHENWEI",33));
      System.out.println(hashSet);

  }
}
```
##### 面试题 在List内去除重复的数字，要求尽量简单
```java
    public static List d(List list){
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        return new ArrayList(hashSet);
    }
```
### 一、map的实现类结构
1. map 双列数据，存储key-value对的数据，---类似于高中的函数y=f(x)
   1. hashMap：作为map的主要实现类：线程不安全的，效率高；可以存储null的key和value
      ---- linkedHahMap:保证在遍历map元素时，可以按照添加的顺序实现遍历。
         原因：在原有的hashMap底层结构基础上，添加了指针，指向前一个元素和后一个元素。  
         对于频繁的遍历操作，此类的执行效率高于hashMap  
   2. treeMap:保证按照添加的key-value对进行排序，实现排序遍历。此时考虑key的自然排序或者定制排序，底层使用红黑树。
   3. Hashtable:作为古老的实现类；线程安全的，效率低；不能存储null的key-value  
      ----Properties:常用来处理配置文件。key-value都是String类型
#### HashMap的底层：
1. 数组+链表(jdk7及之前) 
2. 数组+链表+红黑树(jdk8)
#### 面试题
1. HashMap底层实现原理
2. HashMap和Hashtable的异同
3. CurrentHashMap 与 Hashtable的异同
###  二、map结构的理解
1. map中的key：无序的、不可重复的，使用set存储所有的key ---> key所在的类要重写equals()和hashcode() 以hashmap为例
2. map中的value：无序、可重复的，使用Collection存储所有的value ---> value所在的类要重写equals()
3. 一个键值对key-value构成了一个Entry对象
4. map中的entry：无序、不可重复的，使用set存储所有的entry
### 三、hashMap底层实现原理 jdk7为例
1. HashMap map = new HashMap(); 在实例化以后，底层创建了长度为16的一维数组entry[] table。  
   ...可能已经执行过多次put...  
   map.put(key1,value1):
   首先调用key1所在类的hashCode()计算key1的hash值，此hash值经过某种算法以后，得到在entry中存放的位置。  
   &emsp;&emsp;如果此位置上的数据为空，此时的key1-value1存放成功 ---> 情况1    
   &emsp;&emsp;如果此位置上的数据不为空，(意味着此位置上存在一个或多个数据(以链表形式存在)),比较key1和已经存在的一个或多个数据的hash值    
   &emsp;&emsp;&emsp;&emsp;如果key1的hash值与已经存在的数据的hash值都不相同，此时key1-value1添加成功。  ---> 情况2
   &emsp;&emsp;&emsp;&emsp;如果key1的hash值与已经存在的数据(key2-value2)的hash值相同，继续比较，调用key1所在类的equals方法    
   &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;如果equals返回false，：此时key1-value1添加成功  ---> 情况3
   &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;如果equals返回true，：使用value1替换value2    
2. 补充：情况2和情况3：此时key1-value1和原来的数据以链表的方式存储。
3. 在不断的添加过程中，会涉及到扩容问题，默认的扩容方式：扩容为原来的2倍，并将原有的数据复制过来。  
#### jdk8相较于jdk7在底层实现方面的不同：
1. new HashMap():底层没有创建一个长度为16的数组
2. jdk8底层的数组是：Node[],而非Entry[]
3. 首次使用put()方法时，底层创建长度为16的数组
4. jdk7底层结构只有：数组+链表。jdk8中底层结构：数组+链表+红黑树。  
   当数组的某一个位置上的元素以链表形式存在的个数 > 8且当前数组的长度>64时，
   此时此位置上的所有数据改为使用红黑树存储。
### LinkedHashMap底层实现原理 (需要频繁地遍历操作推荐使用此方法而不选择HashMap)
```java
    static class Entry<K,V> extends HashMap.Node<K,V> {
        Entry<K,V> before, after;//能够记录元素添加的先后顺序
        Entry(int hash, K key, V value, Node<K,V> next) {
            super(hash, key, value, next);
        }
    }
```
### map中定义的方法
#### 增、删除、修改操作
1. Object put(Object key,Object value) 将指定key - value添加到map中，如果存在key则是修改操作
2. void putAll(Map m) 将一个map集合放入另一个map中
3. Object remove(object key) 移除指定的key-value对，并返回value
4. void clear() 清空当前map中的所有数据 与map=null操作不同，区别Collection
#### 元素查询操作
1. Object get(Object key) 获取指定key对应的value
2. boolean containsKey(Object key) 是否包含指定key
3. boolean containsValue(Object value) 是否包含指定value
4. int size() 返回map中key-value的对数
5. boolean isEmpty()判断当前map是否为空
6. boolean equals(Object obj) 判断当前map和obj是否相等
#### 遍历操作
1. 遍历所有key Iterator iterator2 = map.keySet().iterator();
2. 遍历所有value Iterator iterator3 = map.values().iterator();
3. 遍历所有key value Iterator iterator = map.entrySet().iterator();
4. 总结：增、删、改、查、长度、遍历
### treMap两种排序方式
1. 向TreeMap中添加Key-value,要求key必须是由同一个类型创建的对象
2. 因为要按照key排序：自然排序，定制排序
3. 自然排序
### Properties:常用来处理配置文件。key-value都是String类型
```java
      Properties properties = new Properties();
      FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
      properties.load(fileInputStream);
      String name = properties.getProperty("name");
      String password = properties.getProperty("password");
      System.out.println("name:" + name);
      System.out.println("password:" + password);
```
### Collections和Collection的区别
1. Collections是一个操作Set、List、Map等集合的工具类
2. Collection
### Collection工具类常用方法
1. reverse(List) 反转List中元素的数据
2. shuffle(List) 对List进行随机排序
3. sort(List) 根据元素的自然顺序对指定的List集合按升序排序
4. sort(List, Comparator) 根据指定的Comparator产生的顺序进行排序
5. swap(List,int i,int j)对指定List的i和j进行互换

6. Object max(Collection):根据元素的自然排序，返回给定集合中最大的元素
7. Object max(Collection,Comparator):根据给定的Comparator来排序，返回给定集合中最大的元素
8. Object min(Collection):根据元素的自然排序，返回给定集合中最小的元素
9. Object min(Collection,Comparator):根据给定的Comparator来排序，返回给定集合中最小的元素
10. int frequency( Collection,Object) 返回指定集合中元素出现的次数
11. void copy(List dest,List src) 将src中的内容复制到dest中，注意dest的大小不能小于src，最好一样大并且初始值为null
12. boolean replace(List list,Object oldValue,Object newValue) 使用新值替换旧值
#### Collections类中提供了多个synchronizedXxx()方法，该方法可以使指定集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题
```java
      List list = new ArrayList();
      list.add("chen");
      list.add("wei");
      list.add(2354);
      List l = Collections.singletonList(list);
```
1. ArrayList和HashMap都是线程不安全的，如果程序要求线程安全我们可以将他们转换为线程安全的，Collections.singletonList(list);

## day25泛型
### 泛型的使用
1. 两个例子,集合中使用泛型，注意例子二中的Iterator写法，还有Entry
```java
public class Practice1 {
  public static void main(String[] args) {
      ArrayList<Integer> integers = new ArrayList<>();
      for (int i=0;i<100;i++){
          integers.add((int) (Math.random()*100 + 1));
      }
      Iterator<Integer> i = integers.iterator();
      while (i.hasNext()){
            System.out.println(i.next());
      }
  }
}
```
```java
public class Practice2 {
  public static void main(String[] args) {
      Map<String,Integer> map = new HashMap<String,Integer>();
      map.put("chenwei",23);
      map.put("chenqing",33);
      map.put("huangyuyao",24);
      map.put("zhoujianping",52);
      map.put("liwei",21);
      //泛型的嵌套
      Set<Map.Entry<String, Integer>> entries = map.entrySet();
      Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
      while (iterator.hasNext()){
          Map.Entry<String, Integer> next = iterator.next();
          System.out.print("key = "+next.getKey());
          System.out.println("  value = "+next.getValue());
      }
  }
}
```
#### jdk5.0新增 jdk7.0类型推断ArrayList<Integer> integers = new ArrayList<>();
#### 在集合中使用泛型的总结
1. 集合接口或集合类在jdk5.0时都修改为带泛型的结构
2. 在实例化集合时，可以指明具体的泛型类型
3. 指明完以后，在集合类或接口中凡是使用到定义类或接口时，内部结构(方法、构造器、属性等)使用到类的泛型时的位置，都指定为实例化时的类型
   比如add(E e) ---> 实例化以后 add(Integer i) 
4. 注意点：泛型额类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，使用包装类
5. 如果实例化时没有指定类型，那么默认为Object类型
#### 自定义泛型结构：泛型类、泛型接口
1. 泛型类可能有多个参数，此时应将多个参数一起放在尖括号内，比如<T1,T2,T3>
2. 泛型的构造器和普通的一样
3. 实例化后，操作原来泛型位置的结构必须与指定的泛型类型一致
4. 泛型不同的引用不能相互赋值
5. 泛型如果不指定，将被擦除，泛型对应的类型均按照Object处理，但不等价于Object。经验：泛型要使用一律都用。要不用，一律都不用
6. 如果泛型结构是一个接口或抽象类，则不可创建泛型类的对象。
7. jdk7.0，泛型的简化操作：类型推断ArrayList<Integer> integers = new ArrayList<>();
8. 泛型的指定中不能使用基本数据类型型，可以使用包装类替换。
9. 在类/接口上声明的泛型，在本类或接口中即代表某种类型，可以作为非静态属性的类型、非静态方法的参数类型、
非静态方法的返回值类型。但在静态方法中不能使用类的泛型。
> 说明：类的泛型是造对象的时候指定的，也就是实例化的时候，而静态结构早于对象的创建
> 相当于还没指定类型我这里就要用了，那肯定不行
10. 异常类不能使用泛型的 
11. 不能使用new E[] 。但是可以E[] elements = (E[])new Object[capacity]
12. 父类有泛型，子类可以选择保留泛型也可以选择指定泛型类型
>子类不保留父类的泛型：按需实现
>>没有类型 擦除
>>具体类型
> 子类保留父类的泛型：泛型子类
>>全部保留 
>> 部分保留  
结论：子类必须是“富二代”，子类处理指定或保留父类的泛型，还还可以增加自己的类型 
#### 小知识，父类中的一个方法为静态的，子类中这个方法也必须为静态的，父类中这个方法不是静态的，子类中这个方法也不能是静态的
#### 泛型方法的使用举例，使用在dao(database access object数据访问对象 )中的举例
1. Dao
```java
public class DAO<T> {
    //对于具体要继承的类，一继承就具体了；表的共性操作的dao
    //增加一条数据
    public void add(T t){
    }
    //删除一条数据
    public boolean delete(int index){
        return false;
    }
    //查找一条数据
    public T getIndex(int index){
        return null;
    }
    //查询多条
    public List<T> getForList(int index){
        return null;
    }
    //泛型方法，举例子获取表中一共有多少条记录，获取最大的员工入职时间
    public <E> E getValue(){
        return null;
    }
}
```
2. CustomerDao
```java
public class CustomerDao extends DAO<Customer>{
    //这里继承了DAO，里面的增删改查就具体为Customer的增删改查了
    //单独表的操作的dao
}
```
3. test
```java
public class DaoTest {
    @Test
    public void test1(){
        CustomerDao customerDao = new CustomerDao();
        customerDao.delete(1);
    }
}
```
#### 1. 泛型在继承中的体现
```java
    @Test
    public void test2(){
        /*
        * 泛型在继承方面的体现
        * 类A是类B的父类，G<A>和G<b>二者不具备子父类关系，二者是并列关系
        * 补充：类A是类B的父类，A<G> 是 B<G>的父类，接口也是一样的，
        * */
        Object o = null;
        String str = null;
        o=str;

        List<Object> listObj = null;
        List<String> listStr = null;
        //编译报错，这是错误的.listObj和listStr不是子父类关系
        //listObj = listStr

    }
```
#### 2. 泛型中使用通配符
```java
    @Test
    public void test3(){
        /*
        * 2. 通配符的使用
        * 通配符 ?
        * 类A是类B的父类，G<A>和G<b>二者没有关系，二者共同的父类是：G<?>
        * */
        List<Object> list= null;
        List<String> list1 =null;
        List<?> listf = null;
        listf = list;
        listf = list1;
    }
    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
```
#### 3. 使用通配符后数据的读取和写入要求
1. 添加（写入）：对于List<?>就不嫩向其内部添加数据。  
   除了添加null以外
2. 取（读取）：允许读取操作，去读的数据类型为Object  
#### 4. 有条件限制的通配符的使用 通配符中使用继承
```java
public class DaoTest {
    @Test
    public void test1(){
        CustomerDao customerDao = new CustomerDao();
        customerDao.delete(1);
    }
    @Test
    public void test2(){
        /*
        * 1. 泛型在继承方面的体现
        * 类A是类B的父类，G<A>和G<b>二者不具备子父类关系，二者是并列关系
        * 补充：类A是类B的父类，A<G> 是 B<G>的父类，接口也是一样的，
        * */
        Object o = null;
        String str = null;
        o=str;
        List<Object> listObj = null;
        List<String> listStr = null;
        //编译报错，这是错误的.listObj和listStr不是子父类关系
        //listObj = listStr
    }
    @Test
    public void test3(){
        /*
        * 2. 通配符的使用
        * 通配符 ?
        * 类A是类B的父类，G<A>和G<b>二者没有关系，二者共同的父类是：G<?>
        * */
        List<Object> list= null;
        List<String> list1 =null;
        List<?> listf = null;
        listf = list;
        listf = list1;
        /*
        * 添加（写入）：对于List<?>就不嫩向其内部添加数据。
        * 除了添加null以外
        *
        * 获取（读取）：允许读取操作，返回类型为Object
        * */
    }
    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test4(){
        /*
        * 有条件限制的通配符的使用。
        *  ? extends A:理解为小于等于。
        *               <?  extends A>可以作为G<A>和G<B>的父类，其中B是A的子类。
        *  ? super A:理解为大于等于。
        *               <?  super A>可以作为G<A>和G<B>的父类，其中B是A的父类。
        * */
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;
        ArrayList<Customer> list3 = new ArrayList<>();
        ArrayList<Person> list4 = new ArrayList<>();
        ArrayList<Object> list5 = new ArrayList<>();
        list1 = list3;
        list1 = list4;
        //list1 = list5;
        //list2=list3;
        list2=list4;
        list2=list5;
        //读取数据
        list1 = list4;
        Person person = list1.get(0);
        //Customer customer = list1.get(0);错误编译不过，多态的理解
        list2=list4;
        //这里接收只能写Object接收
        Object object = list2.get(0);
        //写入数据小于等于的extends不可以，大于等于的super可以 子类可以赋给父类，父类不能赋给子类，就看？表示的范围
        //list1.add(new Customer())错误，这里？表示的比Customer类还小的话就是错误的
        //对于super可以
        boolean add = list2.add(new Person());
        boolean add1 = list2.add(new Customer());
    }
}
```
## day25 io流
### 主体结构/目录
1. File类的使用
2. IO流原理及流的分类
3. 节点流(或文件流)
4. 缓冲流
5. 转换流
6. 标准输入、输出流
7. 打印流
8. 数据流
9. 对象流
10. 随机存储文件流
11. NIO.2中Path、Paths、File类的使用
### File类的使用
1. File类的一个对象，代表一个文件或一个文件目录（俗称文件夹）
2. File类声明在java.io包下
3. File类中涉及到关于文件或文件目录的创建、删除、重命名、修改时间、文件大小等方法，并未涉及文件写入或读取的操作。如果需要读取或写入文件内容，必须使用IO流来完成
4. 后续FiLe的对象常会作为参数传递到流的构造器中，指明读取写入的终点
#### 1. File类的使用
1.File(String FilePah)
2.File(String parentPath,String child)
3.File(File parentPath,String child)
```java
/**
 * @author: chenwei
 * @date: 2021/9/4 18:22
 * @description: File类的使用
 * 1. File类的一个对象，代表一个文件或一个文件目录（俗称文件夹）
 * 2. File类声明在java.io包下
 *
 * 路径分隔符和操作系统有关：
 * Windows和dos系统默认使用“\”来表示
 * UNIX和URL使用"/"来表示
 */
public class FileTest {
    /*
    * 如何创建File类的实例
    * 1.File(String FilePah)
    * 2.File(String parentPath,String child)
    * 3.File(File parentPath,String child)
    * */
    @Test
    public void test1(){
        //构造器1
        File file1 = new File("helleFile.txt");
        File file2 = new File("D:\\workspace\\TwoWeeksLearnJava\\src\\day25generic\\helleFile.txt");
        System.out.println(file1);
        System.out.println(file2);
        //构造器2
        File file3 = new File("D:\\workspace\\TwoWeeksLearnJava","src\\day25generic");
        System.out.println(file3);
        //构造器3
        File file4 = new File(file3,"helloFile.txt");
        System.out.println(file4);
    }
}
```
#### 2. File类的常用方法
1. file1.getAbsolutePath()
2. file1.getPath() 这里表示的是构造器那里的文件名，写的绝对路径就是绝对路径名，相对路径名称就是相对相对路径的名
3. file1.getName()
4. file1.getParent()
5. file1.length()
6. file1.lastModified()
7. File file1 = new File("helloFile.txt");
8. File file1 = new File("helloFile.txt");
9. String[] list = file3.list();关于文件路径的方法
10. File[] files = file3.listFiles();关于文件路径的方法
11. boolean b = file1.renameTo(file2);在我看来就是把一个文件剪切到另外一个位置了吧
    把文件命名到指定的文件路径  
    要想保证返回TRUE，需要file1在硬盘中存在file2在硬盘中不存在
```java
        File file1 = new File("helloFile.txt");
        File file2 = new File("D:\\io\\hedllFiles.txt");
        boolean b = file1.renameTo(file2);
```
#### 3. File类的常用方法
1. boolean isDirectory() 判断是否是文件目录
2. boolean isFile() 判断是否是文件
3. boolean exists() 判断是否存在 
4. boolean canWrite() 判断是否可写
5. boolean canRead() 判断是否可读
6. boolean isHidden() 判断是否隐藏
#### 4. File类中的常用方法 如果创建文件目录的上层目录不存在，就使用mkdirs()
1. boolean createNewFile() 创建文件。若文件存在，则不创建，返回false;
2. boolean mkdir() 创建文件目录。若文件目录存在，就不创建，若此文件目录的上层不存在，也不创建；
3. boolean mkdirs() 创建文件目录。如果上层文件目录不存在，一并创建；
## day26 io流
### 一、流的分类
1. 操作数据单位，字节流字符流
2. 数据的流向:输入流、输出流
3. 流的角色:节点流、处理流
### 二、流的体系结构 stream字节流，reader字符流 字节流：处理非文本文件，字符流：处理文本文件
|抽象基类|节点流(或文件流)|缓冲流(处理流的一种)
| ---- | ---- | ---- |
| InputStream | FileInputStream(read(byte[] buffer)) | BufferedInputStream(read(byte[] buffer)) |
|InputStream|FileInputStream(write(byte[] buffer,0,len))|BufferedInputStream(read(byte[] buffer))|
|Reader|FileReader(read(char[] cbuf))|BufferedReader(read(char[] cbuf))|
|Writer|FileWriter(write(char[] cbuf,0,len))|BufferedWriter(write(char[] cbuf,0,len))|
### 说明点：
1. read的理解：返回读入的一个字符。如果达到文件末尾，返回-1
2. 异常的处理：为了保证流资源一定可以执行关闭操作。需要使用tyr-catch-finally处理
3. 读的文件一定要要存在，否则会报FileNotFound异常
### 测试fileInputStream和fileOutputStream的使用
####
1. 对于文本文件(.txt,.java,.c,.cpp),使用字符流处理  
2. 对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt......)使用字节流处理  
需要知道如果只是对文件复制，不在内存层面看的话，用字符流也是可以的
### test3是最易错的   
```java
/**
 * @author: chenwei
 * @date: 2021/9/7 1:23
 * @description:
 * 一、流的分类
 * 1. 操作数据单位，字节流字符流
 * 2. 数据的流向:输入流、输出流
 * 3. 流的角色:节点流、处理流
 * 二、流的体系结构
 * 抽象基类        节点流(或文件流)    缓冲流(处理流的一种)
 * InputStream    FileInputStream  BufferedInputStream
 * InputStream    FileInputStream  BufferedInputStream
 * Reader         FileReader       BufferedReader
 * Writer         FileWriter       BufferedWriter
 */
public class Test1 {
    /*
    将iotest.txt文件的内容输出到控制台
    说明点：
    1. read的理解：返回读入的一个字符。如果达到文件末尾，返回-1
    2. 异常的处理：为了保证流资源一定可以执行关闭操作。需要使用tyr-catch-finally处理
    3. 读的文件一定要要存在，否则会报FileNotFound异常
    */
    @Test
    public void test1() throws IOException {
        //1. 实例化file类的对象，指明要操作的文件
        File file = new File("iotest.txt");
        //2. 提供具体的流
        FileReader fileReader = new FileReader(file);
        //3. 数据的读入
        int read = fileReader.read();
        while (read!=-1){
            System.out.print((char) read);
            read = fileReader.read();
        }
        //4. 流的关闭 一定要执行，只要new 了具体的流，就一定要关闭流，否则资源浪费。这里就有一个问题，使用throws 还是try-catch,这里就只能try-catch-finally了
        fileReader.close();
    }
    @Test
    public void test2(){
        FileReader fileReader = null;
        try {
            //1. 实例化file类的对象，指明要操作的文件
            File file = new File("iotest.txt");
            //2. 提供具体的流
            fileReader = new FileReader(file);
            //3. 数据的读入
            int read = fileReader.read();
            while (read!=-1){
                System.out.print((char) read);
                read = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流的关闭 一定要执行，只要new 了具体的流，就一定要关闭流，否则资源浪费。这里就有一个问题，使用throws 还是try-catch,这里就只能try-catch-finally了
            try {
                //如果在new file的时候出现异常，那么fileReader为null,直接close会出空指针异常
                if (fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test3(){
        File file = new File("iotest.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            char[] cbuf = new char[3];
            int len;
            while ((len = fileReader.read(cbuf)) != -1){
//                //1. 错误写法，每次cbuf都是3个字符，下次要读的重新写到cbuf内，当到末尾最后一次读的时候，后面剩余位置没有写入，就导致是上次的数据。类似于内存安全问题。
//                for (int i=0;i<cbuf.length;i++){
//                    System.out.print(cbuf[i]);
//                }

                for (int i=0;i<len;i++){
                    System.out.print(cbuf[i]);
                }
                //错误写法2,错误原因和上面类似，
//                String s = new String(cbuf);
//                System.out.println(s);
                //使用String的正确写法
//                String s = new String(cbuf,0,len);
//                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test4(){
        /*
        从内存中写出数据到磁盘中去
        说明；
        1. 输出操作，对应的File可以不存在。并不会报异常
        2. File对应的磁盘中的文件如果不存在，在输出的过程中，会自动创建此文件。
           File对应的磁盘中的文件如果存在：
                如果流使用的构造器是：FileWriter(file,false)或FileWriter(file)：对原有文件的覆盖
                如果流使用的构造器是：FileWriter(file,true):不会对原有文件的覆盖，而是在原有文件基础上追加内容

        */
        File file = new File("iotest.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            fileWriter.write("我是陈伟，你是谁呢？\n");
            fileWriter.write("我是陈大大，你是谁呢？\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test5(){
        File srcFile = new File("filetest/test1/childFolder4/iotest.txt");
        File desFile = new File("filetest/test1/childFolder4/iotest2.txt");
        FileReader reader = null;
        FileWriter fileWriter = null;
        try {
            reader = new FileReader(srcFile);
            fileWriter = new FileWriter(desFile);
            int read = reader.read();
            while (read!=-1){
                fileWriter.write((char) read);
                read = reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test6() {
        /*
        测试fileInputStream和fileOutputStream的使用
        结论
        1. 对于文本文件(.txt,.java,.c,.cpp),使用字符流处理
        2. 对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt......)使用字节流处理
        需要知道如果只是对文件复制，不在内存层面看的话，用字符流也是可以的
        */
        File srcFile = new File("filetest/test1/childFolder4/pic.jpeg");
        File desFile = new File("filetest/test1/childFolder4/pic2.jpeg");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(desFile);

            int read = fileInputStream.read();
            while (read!=-1){
                fileOutputStream.write(read);
                read = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Test
    public void test7(){
        File srcFile = new File("f://dist.zip");
        File descFile = new File("f://dist2.zip");
        long stratTime = System.currentTimeMillis();
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(descFile);
            byte[] readBytes = new byte[10240*4];
            int read = fileInputStream.read(readBytes);
            while (read!=-1){
                fileOutputStream.write(readBytes,0,read);
                read = fileInputStream.read(readBytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("复制完成！");
        }
        long endTime = System.currentTimeMillis();
        System.out.print((endTime - stratTime));

    }
    @Test
    public void test8(){
        //调用自己编写的方法实现文件的复制
    CopyFile.copyFileFromSrcToDesc("F:\\iotest.avi", "F:\\iotest2.avi",1024*1024*4);
    }
}
```
### 缓冲流
#### 处理流之一：缓冲流的使用
1.缓冲流
BufferedInputStream
BufferedInputStream
BufferedReader
BufferedWriter
2.缓冲流的作用
提升流的读取、写入速度  
提高读写速度的原因：内部提供了一个缓冲区
3. 处理流，就是"套接"在已有的流的基础上。
#### 实现非文本文件的复制
1. 造文件
2. 造流
   2.1 造节点流
   2.2 造缓冲流
3. 复制的细节 读入、写入
```java
            byte[] buffer = new byte[1024];
            int leng;
            while ((leng=bufferedInputStream.read(buffer))!=-1){
                bufferedOutputStream.write(buffer);
            }
```
4. 资源关闭，要关闭4个，这里要先关闭外层的缓冲流，再关节点流，就像先脱外面的衣服再脱里面的衣服
#### 实现非文本文件复制的具体代码
```java
    public  void test1() {
        //1.造文件
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File srcFile = new File("D:\\io\\streamtest.avi");
            File descFile = new File("D:\\io\\streamtest2.avi");
            //2.造流
            //2.1 造节点流
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(descFile);
            //2.2 造缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //3. 复制的细节 读入、写入
            byte[] buffer = new byte[1024];
            int leng;
            while ((leng=bufferedInputStream.read(buffer))!=-1){
                bufferedOutputStream.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 资源关闭，要关闭4个，这里要先关闭外层的缓冲流，再关节点流，就像先脱外面的衣服再脱里面的衣服
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //说明：关闭外层流的同时，内层流就在自动关闭了，不需要手动写，我们可以省略
//        fileInputStream.close();
//        fileOutputStream.close();
        }
    }
```
### 第二个处理流：转换流
1. 转换流：属于字符流  
    InputStreamReader:将一个字节的输入流，转换为字符的输入流  
    OutputStreamReader:将一个字符的输出流，转换为字节的输出流  
2. 作用：提供字节流与字符流之间的转换
3. 解码：字节、字节数组 ---> 字符串、字符数组  
   编码：字符串、字符数组 ---> 字节、字节数组
```
        FileInputStream fileInputStream = new FileInputStream("hello.txt");
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);//使用系统默认的字符集
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");//参数2指明了字符集，具体使用哪个字符集，取决于文件使用哪个字符集保存
        char[] chars = new char[20];
        int len;
        while ((len=inputStreamReader.read(chars))!= -1){
            String string = new String(chars, 0, len);
            System.out.println(string);
        }
        inputStreamReader.close();
```
2 综合使用InputStreamReader和OutputStreamReader
```        
//1. 造文件、造流
        File srcFile = new File("hello.txt");
        File descFile = new File("hellogbk.txt");

        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(descFile);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"gbk");
        //2. 读写过程
        char[] chars = new char[20];
        int leng;
        while ((leng=inputStreamReader.read(chars))!=-1){
            outputStreamWriter.write(chars,0,leng);
        }
        inputStreamReader.close();
        outputStreamWriter.close();
```
### 标准输入输出流
1. 标准的输入、输出流  
1.1 System.in:标准的输入流，默认从键盘输入  
System.out:标准的输出流，默认从键盘输出  
1.2 System类的setIn(InputStream is)/setOut(PrintStream ps)方式重新指定输入和输出的流  
1.3 联系：  
从键盘输入字符串，要求将读取到的整行字符串转为大写输出。然后继续进行输入操作，直至输入e,或者exit,退出程序
```
      InputStreamReader inputStreamReader = new InputStreamReader(System.in);字节流和字符流之间的转换
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      while (true){
          String s = bufferedReader.readLine();
          if (s.equalsIgnoreCase("e")||s.equalsIgnoreCase("exit")){
              System.out.print("program stop");
              break;
          }
          System.out.println(s.toUpperCase());
      }
      bufferedReader.close();
```
### 处理流-数据流
1. DataInputStream和DataOutPutStream
2. 作用：用于读取或写出基本数据类型的变量或字符串
3. 练习：将内存中的字符串、基本数据类型的变量写出得到文件中。注意：处理异常的话任然是try-catch
## day27
### 每日一考
### 1. 说明流的三种分类
1. 流向：输入流、输出流
2. 数据单位：字节流、字符流
3. 流的角色：节点流、处理流   
4. 注意点：处理流不一定作用在节点流上，比如buffered作用在转换流上，转换流包在节点流上
### RandomAccessFile 随机存取文件流
#### RandomAccessFile 随机存取文件流的使用：
1. RandomAccessFile直接继承于java.lang.object类，实现了DataInput和DataOutput接口
2. RandomAccessFile既可以作为输入流也可以作为输出流
3. 如果RandomAccessFile作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建，
4. 可以通过相关的操作，使用 RandomAccessFile 实现插入的操作  
   如果写出到的文件存在，则会对源文件内容进行覆盖(默认情况下从头覆盖)。  
   下面是一个例子：使用RandomAccessFile实现文件的复制操作  
```java
    public void test4(){
        /**
         * RandomAccessFile 随机存取文件流的使用：
         * 1. RandomAccessFile直接继承于java.lang.object类，实现了DataInput和DataOutput接口
         * 2. RandomAccessFile既可以作为输入流也可以作为输出流
         * 3. 如果RandomAccessFile作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建，
         * 4. 可以通过相关的操作，使用 RandomAccessFile 实现插入的操作
         *    如果写出到的文件存在，则会对源文件内容进行覆盖(默认情况下从头覆盖)。
         * 下面是一个例子：使用RandomAccessFile实现文件的复制操作
         * */
        RandomAccessFile randomAccessFile1 = null;
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile1 = new RandomAccessFile(new File("D:\\io\\randomaccessfile.avi"), "r");
            randomAccessFile = new RandomAccessFile(new File("D:\\io\\randomaccessfile2.avi"), "rw");
            byte[] bytes = new byte[1024];
            int leng;
            while ((leng=randomAccessFile1.read(bytes))!=-1){
                randomAccessFile.write(bytes,0,leng);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (randomAccessFile1 != null) {
                    randomAccessFile1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
```
```java
    public void test5() throws IOException {
        RandomAccessFile rw = new RandomAccessFile(new File("hello5.txt"), "rw");
        //将指针调到下表为3的位置，那么将会覆盖下表为3后面的内容写入多个个字节的位置的数据，后面没有写入的数据不会覆盖
        rw.seek(3);
        rw.write("xyz".getBytes());
        rw.close();
    }
```
```java
    public void test6() throws IOException {
        /**
         * 使用 RandomAccessFile 实现插入的操作
         * */
        RandomAccessFile rw = new RandomAccessFile(new File("hello5.txt"), "rw");
        //指针指向3的位置，在3的位置插入数据
        rw.seek(3);
        byte[] bytes = new byte[2];
        int leng;
        //读取下表3位置后面的数据到stringBuilder，用于存储
        StringBuilder stringBuilder = new StringBuilder((int) (new File("hello5.txt").length()));
        while ((leng=rw.read(bytes))!=-1){
            stringBuilder.append(new String(bytes,0,leng));
        }
        System.out.println(stringBuilder);
        rw.seek(3);
        rw.write("CHENWEI".getBytes());
        rw.write(stringBuilder.toString().getBytes());
        rw.close();
    }
```
#### RandomAccessFile 随机存取文件流的介绍
1. 该类的实例支持读取和写入随机访问文件。 随机访问文件的行为类似于存储在文件系统中的大量字节。 
   有一种游标，或索引到隐含的数组，称为文件指针 ; 输入操作读取从文件指针开始的字节，并使文件指针超过读取的字节。 
   如果在读/写模式下创建随机访问文件，则输出操作也可用; 输出操作从文件指针开始写入字节，并将文件指针提前到写入的字节。 
   写入隐式数组的当前端的输出操作会导致扩展数组。 文件指针可以通过读取getFilePointer方法和由设置seek方法。
2. 在这个类中的所有读取例程通常都是如果在读取所需的字节数之前到达文件结尾，则抛出一个EOFException （这是一种IOException ）。 
   如果任何字节由于除文件末尾之外的任何原因而无法读取，则抛出IOException以外的EOFException 。 
   特别地，如果流已经被关闭，则可以抛出IOException 。   
### 网络编程
#### 通信要素一:IP和端口号 
1. IP唯一的表示Internet上的计算机（通信实体）
2. 在Java中使用InetAddress代表IP
3. IP分类IPv4和IPv6；万维网、局域网
4. 域名：www.baidu.com www.mi.com
5. 本地回路地址127.0.0.1对应着localhost
6. 如何实例化InetAddress:两个方法：getByName(String name)、getLocalHost()
   两个常用方法：getHostName()/getHostAddress()
7. 端口号：正在计算机上运行的进程。
   要求：不同的进程有不同的端口
   范围：被规定为16位的整数0~35535
8. 端口号与IP地址的组合得出一个网络套接字：Socket
```java
  public static void main(String[] args) {
      try {
          InetAddress getByName = InetAddress.getByName("192.168.0.1");
          System.out.println(getByName);
          InetAddress byName = InetAddress.getByName("www.atguigu.com");
          System.out.println(byName);
          InetAddress byName2 = InetAddress.getByName("127.0.0.1");
          System.out.println(byName2);
      } catch (UnknownHostException e) {
          e.printStackTrace();
      }
  }
```
#### 处理流 -- 数据流 DataOut/InputStream
```
    @Test
    public void test1(){
        /**
         * 处理流-数据流
         * */
        DataOutputStream dataOutputStream = null;
        try {
            FileOutputStream outputStream = new FileOutputStream(new File("dataOutPutStream.txt"));
            dataOutputStream = new DataOutputStream(outputStream);
            String chenwei = new String("chenwei");
            int id = 34234;
            dataOutputStream.writeBytes(chenwei);
            dataOutputStream.flush();
            dataOutputStream.writeInt(id);
            dataOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
```
#### 序列化与反序列化
##### Person类需要满足一下条件才可以序列化
1. 需要实现接口：Serializable
2. 当前类提供一个全局常量：SerialVersionUID
3. 除了当前Person类需要实现Serializable接口之外，还需要保证其内部所有属性也必须是可序列化的(默认情况下，基本数据类是可序列化的)
   3.1. 补充：ObjectOutPutStream和ObjectInPutStream不能序列化static和transient修饰的成员
   3.2. 下面是序列化的过程，即是写入到文件中
   3.3. 面试可能问到的问题：为什么需要SerialVersionUID
```
    @Test
    public void test2(){
        /**
         * Person类需要满足一下条件才可以序列化
         * 1. 需要实现接口：Serializable
         * 2. 当前类提供一个全局常量：SerialVersionUID
         * 3. 除了当前Person类需要实现Serializable接口之外，还需要保证其内部所有属性也必须是可序列化的(默认情况下，基本数据类是可序列化的)
         * 补充：ObjectOutPutStream和ObjectInPutStream不能序列化static和transient修饰的成员
         * 下面是序列化的过程，即是写入到文件中
         * 面试可能问到的问题：为什么需要SerialVersionUID
         *
         * */
        ObjectOutputStream objectInputStream = null;
        try {
            Person chenwei = new Person("chenwei", 234);
            FileOutputStream fileOutputStream = new FileOutputStream(new File("ObjectOutPutStream.txt"));
            objectInputStream = new ObjectOutputStream(fileOutputStream);
            objectInputStream.writeObject(chenwei);
            objectInputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
```
#### 反序列化
```
    @Test
    public void test3() throws IOException, ClassNotFoundException {
        /**
         * 反序列化，就是从文件夹中读到内存中
         */
        FileInputStream fileInputStream = new FileInputStream(new File("ObjectOutPutStream.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        Person person = (Person) object;
        System.out.print(person);
    }
```
#### TCP网络编程
##### 练习1 客户端发送内容给服务器，服务器将内容打印到控制台。
```
    @Test
    public void client() {
        /**
         * 客户端
         * */
        OutputStream outputStream = null;
        Socket socket = null;
        try {
            //1. 创建socket对象，指明服务器端的ip和端口号
            InetAddress localHost = InetAddress.getByName("127.0.0.1");
            socket = new Socket(localHost, 8899);
            //2. 获取一个输出流，用于输出数据
            outputStream = socket.getOutputStream();
            //3. 写出数据的操作
            outputStream.write("chenwei".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 资源的关闭
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void server(){
        /**
         * 服务端
         * */
        ServerSocket serverSocket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        Socket accept = null;
        try {
            //1. 创建serverSocket对象，指明自己的端口号
            serverSocket = new ServerSocket(8899);
            //2. 调用accept()表示接收来自于客户端的socket
            accept = serverSocket.accept();
            //3. 获取输入流
            inputStream = accept.getInputStream();
            //4. 读取输入流中的数据，注意这里使用的是ByteArrayOutputStream，将字节流堆在一起，最后一起显示出来
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[5];
            int leng;
            while ((leng = inputStream.read(bytes))!=-1){
                byteArrayOutputStream.write(bytes,0,leng);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
        } finally {
            //5. 流的关闭
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
```
##### 练习2 客户端发送文件给服务端，服务端将文件保存在本地
```
    @Test
    public void client(){
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        Socket socket = null;
        BufferedOutputStream bufferedOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            socket = new Socket(inetAddress, 8988);

            OutputStream outputStream = socket.getOutputStream();
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            FileInputStream fileInputStream = new FileInputStream("D:\\io\\tcpTest.avi");
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            byte[] bytes = new byte[512];
            int leng;
            while ((leng = bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,leng);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void server(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            serverSocket = new ServerSocket(8988);
            socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            bufferedInputStream = new BufferedInputStream(inputStream);

            FileOutputStream fileOutputStream = new FileOutputStream("tcpTest001.avi");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] bytes = new byte[512];
            int leng;
            while ((leng = bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,leng);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
```
##### 练习3 从客户端发送文件给服务器，服务器保存到本地。并返回“发送成功”给客户端，并关闭相应的流
```
    @Test
    public void client(){
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        Socket socket = null;
        BufferedOutputStream bufferedOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            socket = new Socket(inetAddress, 8988);

            OutputStream outputStream = socket.getOutputStream();
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            FileInputStream fileInputStream = new FileInputStream("D:\\io\\tcpTest.avi");
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            byte[] bytes = new byte[512];
            int leng;
            while ((leng = bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,leng);
            }
            socket.shutdownOutput();

            inputStream = socket.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes1 = new byte[8];
            int leng1;
            while ((leng1=inputStream.read(bytes1))!=-1){
                byteArrayOutputStream.write(bytes1,0,leng1);
            }
            System.out.println(byteArrayOutputStream.toString());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void server(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            serverSocket = new ServerSocket(8988);
            socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            bufferedInputStream = new BufferedInputStream(inputStream);

            FileOutputStream fileOutputStream = new FileOutputStream("tcpTest001.avi");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] bytes = new byte[512];
            int leng;
            while ((leng = bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,leng);
            }

            //服务器给客户端的反馈，返回已经收到资料
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("图片已经收到，谢谢".getBytes());
            outputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
```
#### UDP网络编程 接收和发送都是用的DatagramSocket
```
    @Test
    public void send() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        //传输的数据，以byte[]的形式。
        String str = "wo shi chen wei";
        byte[] bytes = str.getBytes();
        //指定传输的地址
        InetAddress inetAddress = InetAddress.getLocalHost();
        //发送数据
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,inetAddress,8888);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
    @Test
    public void receive() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        byte[] bytes = new byte[200];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length);
        //接收数据
        datagramSocket.receive(datagramPacket);
        //获取datagramPacket中的数据
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        datagramSocket.close();
    }
```
#### URL网络编程 例子：通过URL地址下载图片保存在本地
```
    @Test
    public void test1(){
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            URL url = new URL("https://img.lianzhixiu.com/uploads/allimg/202105/9999/4e03dfd67e.jpg");
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.connect();
            //这下面没有使用缓冲流包这两个inputStream和fileOutputStream，正常情况下应该会使用缓冲流的吧
            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedInputStream = new BufferedInputStream(inputStream);

            FileOutputStream fileOutputStream = new FileOutputStream("mv.jpg");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] bytes = new byte[512];
            int leng;
            while ((leng=bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,leng);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
```
### day28 反射
1. java反射机制概述
2. 理解Class类，并获取Class实例
3. 类的加载与ClassLoader的理解
4. 创建运行时类的对象
5. 获取运行时类的完整结构
6. 调用运行时类的指定结构
7. 反射的应用：动态代理 
#### 每日一考
1. 一个IP对应着哪个类的对象？
   实例化这个类的两种方式是？
   两个常用的方法是？
2. 传输层的TCP协议和UDP协议的主要区别是？
3. 什么是URL？你能写一个URL吗？
4. 谈谈你对序列化机制的理解
5. 对象要想序列化，需要满足那几个条件？
#### 反射概述
##### 使用反射之前对Person类的操作 和 使用反射之后对Person类的操作对比
1. 找到指定的构造器
2. 通过构造器去创建对象
##### 通过反射，可以调用Person类的私有结构。比如：私有的构造器、方法、属性 注意需要declaredConstructor.setAccessible(true);
##### 一些问题
###### 1. 疑问一：通过直接new的方式或反射的方式都可以调用公共的结构，开发中到底用哪个？
1. 建议：直接new。
   什么时候会使用：反射的方式。反射的特征：动态性。
###### 2. 疑问二：反射机制与面向对象中的封装性是不是矛盾的？如何看待两个技术？
   不矛盾

###### 3. 关于Java.Lang.Class类的理解  
   3.1. 类的加载过程；
> 1. 程序经过javac.exe命令以后，会生产一个或多个字节码文件(.class结尾)  
> 2. 接着我们使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中。  
> 3. 此过程就称为类的加载。加载到内存中的类，我们就称为运行时类，此运行时类，就作为class的一个实例。  

   3.2. 换句话说：class的实例就对应着一个运行时类
   3.3. 加载到内存中的运行时类，会缓存一定的时间。在此时间之内，我们可以通过不同的方式来获取此运行时类。
```java
public class ReflectionTest {
    @Test
    public void test1(){
        //创建Person类的对象
        Person chenwei = new Person("chenwei", 24);
        //通过对象，调用其内部的属性、方法
        chenwei.age = 20;
        System.out.println(chenwei.toString());
        chenwei.show();
        //在Person类外部，不可以通过Person类的对象调用其内部私有结构
        //比如，name、showNation
    }
    //反射之后，对Person的操作
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class personClass = Person.class;
        //找到指定的构造器
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        //1. 通过构造器去创建对象
        Object chen = constructor.newInstance("chen", 24);
        Person person = (Person) chen;
        System.out.println(person.toString());
        //2. 通过反射，调用对象指定的属性、方法
        //调属性
        Field name = personClass.getDeclaredField("age");
        name.set(person,10);
        System.out.println(person.toString());
        //掉方法,这里getDeclaredMethod调用的show方法没有参数，有参数的写法是personClass.getDeclaredMethod("show"，参数);show.invoke(person，参数)
        Method show = personClass.getDeclaredMethod("show");
        show.invoke(person);
        System.out.println("*****************");
        //通过反射，可以调用Person类的私有结构。比如：私有的构造器、方法、属性
        //调用私有的构造器
        Constructor declaredConstructor = personClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Object jenny = declaredConstructor.newInstance("jenny");
        Person person1 = (Person) jenny;
        System.out.println(jenny.toString());
        //调用私有的属性
        Field name1 = personClass.getDeclaredField("name");
        name1.setAccessible(true);
        name1.set(person1,"li");
        System.out.println(person1.toString());
        //调用方法
        Method showNation = personClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = showNation.invoke(person1, "China").toString();
        System.out.println(nation);
    }

    /**
     疑问一：通过直接new的方式或反射的方式都可以调用公共的结构，开发中到底用哪个？
     建议：直接new。
     什么时候会使用：反射的方式。反射的特征：动态性。
     疑问二：反射机制与面向对象中的封装性是不是矛盾的？如何看待两个技术？
     不矛盾

     关于Java.Lang.Class类的理解
     1. 类的加载过程；
     程序经过javac.exe命令以后，会生产一个或多个字节码文件(.class结尾)
     接着我们使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中。
     此过程就称为类的加载。加载到内存中的类，我们就称为运行时类，此运行时类，就作为class的一个实例。
     2. 换句话说：class的实例就对应着一个运行时类
     3. 加载到内存中的运行时类，会缓存一定的时间。在此时间之内，我们可以通过不同的方式来获取此运行时类。
     */
    @Test
    public void test3() throws ClassNotFoundException {
        //获取class实例的三种方式,使用频率上方式三使用多
        //方式一：调用运行时类的属性：.class
        Class<Person> personClass = Person.class;
        System.out.println(personClass);
        //方式二：通过运行时类的对象，调用getClass()
        Person person = new Person();
        Class aClass = person.getClass();
        System.out.println(aClass);
        //调用Class的静态方法：forName(String classPath)
        Class aClass1 = Class.forName("day28reflection.Person");
        System.out.println(aClass1);

        System.out.println(personClass==aClass);
        System.out.println(personClass==aClass1);
        //方式四：使用类的加载器：ClassLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class aClass2 = classLoader.loadClass("day28reflection.Person");
        System.out.println(aClass2);
        System.out.println(personClass==aClass2);
    }

    @Test
    public void test4(){
        /**
         Class实例可以是哪些结构的说明：
        */
        Class<Object> objectClass = Object.class;
        System.out.println(objectClass);
        Class<Comparable> comparableClass = Comparable.class;//接口
        System.out.println(comparableClass);
        Class<String[]> aClass = String[].class;
        System.out.println(aClass);
        Class<int[][]> aClass1 = int[][].class;
        System.out.println(aClass1);
        Class<ElementType> elementTypeClass = ElementType.class;
        System.out.println(elementTypeClass);
        Class<Override> overrideClass = Override.class;//注解
        System.out.println(overrideClass);
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);
        Class<Void> voidClass = void.class;
        System.out.println(voidClass);
        Class<Class> classClass = Class.class;
        System.out.println(classClass);

        int[] a = new int[10];
        int[] b = new int[100];
        Class class1 = a.getClass();
        Class class2 = b.getClass();
    // 只要元素类型一样与维度一样，就是同一个class
    System.out.println((class1 == class2));
    }
}
```
#### 通过反射加载配置文件
##### ClassLoader的理解
1. 类加载器：系统类加载器、扩展类加载器、引导类加载器
2. 对于自定义类，使用类的加载器进行加载
3. 引导类加载器主要负责加载java的核心类库，无法加载自定义的类的
```
    public void test1(){
        //对于自定义类，使用类的加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        //sun.misc.Launcher$AppClassLoader@18b4aac2 系统类加载器
        System.out.println(classLoader);

        //调用系统类的加载器的getParent():获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        //看classLoader的上一层是谁？ sun.misc.Launcher$ExtClassLoader@28a418fc 扩展类加载器
        System.out.println(classLoader1);

        //调用扩展类加载器的getParent():无法获取引导类加载器，、
        //引导类加载器主要负责加载java的核心类库，无法加载自定义的类的
        ClassLoader classLoader2 = classLoader1.getParent();
        //获取不到引导类加载器，返回的是null，引导类加载器是c++执行，效率较高。引导类加载器是不能加载我们自定义的类
        System.out.println(classLoader2);

        //说明String是引导类加载器加载的
        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader2);
    }
```
##### 加载配置文件(两种方式)
1. 注意两种方式文件的默认根目录位置不一样，否则会找不到文件
```
    public void test2() throws IOException {
        Properties properties = new Properties();
        //此时的文件默认在当前module下，所以文件地址使用的是"src//jdbc.properties"
        //读取配置文件的方式一：
//        FileInputStream fileInputStream = new FileInputStream("src//jdbc.properties");
//        properties.load(fileInputStream);

        //读取配置文件的方式二：使用getClassLoader()，
        //配置文件默认识别为：当前module下的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(resourceAsStream);
        
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("user = " + user);
        System.out.println("password = " + password);
    }
```
#### 通过反射，调用运行时类的对象
##### newInstance()，调用此方法，创建对应的运行时类的对象。内部调用了运行时类的空参构造器  
要想此方法正常的创建运行时类的对象，要求：  
1. 运行时类必须提供空参的构造器
2. 空参的构造器的访问权限得够，通常设置为public.

##### 在javabean中要求提供一个public的空参的构造器。原因
1. 便于通过反射，创建运行时类的对象，百分之九十五都是调用newInstance()
2. 便于子类继承此运行时类时，默认调用super()时，保证父类有此构造器  
这里也是为什么JavaBean为什么要提供一个空参的权限为public的构造器。
后面许多的框架都需要使用反射创建javabean,都是需要使用空参的public的构造器  
另外一个方面：就是类构造器都省略了super()，这个也是调用父类的空参构造器，所以一般都需要提供空参的构造器
```
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        System.out.println(person);
```
#### 体会反射的动态性
1. 这里也可以体现java是动态性，通过反射体现的，编译和运行时，在运行时看到运行结果
```
    public void test2() throws InstantiationException, IllegalAccessException {
        //体会反射的动态性
        for(int i=0;i<100;i++){
            int number = new Random().nextInt(3);
            System.out.println(number);
            String classPath = "";
            switch (number){
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "day28reflection.Person";
                    break;
            }
            Object object = null;
            try {
                object = getInstance(classPath);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(object);
        }
    }

    public Object getInstance(String classPath) throws Exception {
        Class newInstanceTestClass = Class.forName(classPath);
        return newInstanceTestClass.newInstance();
    }
```
#### 提供构造丰富的Person类，获取运行时类的属性结构及其内部结构
##### 获取属性结构
1. getFields();获取当前运行时类及其父类中声明为public访问权限的属性
2. getDeclaredFields();获取当前运行时类中声明的所有属性。(不包含父类中声明的属性)
```
    public void test1() throws ClassNotFoundException {
        Class personClass = Class.forName("day28reflection.test.Person");
        //获取属性结构
        //getFields();获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = personClass.getFields();
        for (Field f : fields){
            System.out.println(f);
        }
        System.out.println("***********");
        //getDeclaredFields();获取当前运行时类中声明的所有属性。(不包含父类中声明的属性)
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field f : declaredFields){
            System.out.println(f);
        }
    }
```
##### 获取内部结构 
1. 获取权限修饰符getModifiers() 数据类型getType(); 变量名f.getName()
```
    public void test() throws ClassNotFoundException {
        //获取权限修饰符 数据类型 变量名
        Class personClass = Class.forName("day28reflection.test.Person");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field f : declaredFields){
            //1. 权限修饰符
            int modifiers = f.getModifiers();
            String string = Modifier.toString(modifiers);
            System.out.println("权限修饰符 ： "+string);
            //2. 数据类型
            Class type = f.getType();
            System.out.println("数据类型 : "+type.toString());
            //3. 变量名
            String name = f.getName();
            System.out.println("变量名 : "+name);
            System.out.println("------------------------");
        }
    }
```
##### 一道面试题，修改String的值，不能直接操作String，考察反射的使用
```
    public void test2() throws NoSuchFieldException, IllegalAccessException {
        String str = new String("chenwei");
        Class aClass = str.getClass();

        Field value = aClass.getDeclaredField("value");
        value.setAccessible(true);
        char[] chars = (char[]) value.get("chenwei");
        //这里有两种修改值得方法
        //方法一： 这里可以修改str的值
        chars[2] = 'o';
        System.out.println(str);
        //方法二： 此处此时修改的正常写法，并且记得修改长度
        value.set(str,new char[]{'w','s','c','w'});
        System.out.println(str);
        System.out.println(str.length());
    }
```
##### 获取运行时类的方法结构
```
    public void test1() throws ClassNotFoundException {
        Class personClass = Class.forName("day28reflection.test.Person");
        //getMethods() 获取当前运行时类及其父类中声明为public访问权限的方法
        Method[] methods = personClass.getMethods();
        for (Method m : methods){
            System.out.println(m);
        }

    // getDeclaredMethods() 获取当前运行时类中声明的所有方法。(不包含父类中声明的方法)
        System.out.println("--------------");
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method m : declaredMethods){
            System.out.println(m);
        }

    }
```
##### 获取运行时类的方法的内部结构 (框架=反射+注解+设计模式)
1. 获取 ： @Xxx(注解) 权限修饰符 返回值类型 方法名(参数类型1, 参数类型2,...) throws XxxException
```
    public void test3() throws ClassNotFoundException {
        /**
         @Xxx
         权限修饰符 返回值类型 方法名(参数类型1, 参数类型2,...) throws XxxException

        */
        Class personClass = Class.forName("day28reflection.test.Person");
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method m : declaredMethods){
            //获取方法声明的注解
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations){
                System.out.println(a);
            }
            //权限修饰符
            int modifiers = m.getModifiers();
            String string = Modifier.toString(modifiers);
            System.out.print("权限修饰符： "+string);

            // 返回值类型
            System.out.print(m.getReturnType()+" ");

            // 方法名
            System.out.println(m.getName());

            //参数列表
            Class[] parameterTypes = m.getParameterTypes();
            //如果有形参，则输出形参类型
            if (!(parameterTypes == null && parameterTypes.length == 0)){
                for (int i= 0;i<parameterTypes.length;i++){

                    System.out.println(parameterTypes[i] + "args_" + i + ",");
                }
            }
            System.out.println("***********************");
            //6. 抛出的异常
            Class[] exceptionTypes = m.getExceptionTypes();
            if (!(exceptionTypes==null&&exceptionTypes.length==0)){
                System.out.println("throws");
                for (int i=0;i<exceptionTypes.length;i++){
                    //这里写的代码没有抛出异常所以都没有
                    System.out.println(exceptionTypes[i].getName() + " exception_" + i);
                }
            }
        }
    }
```
#### 获取其他的一些结构
```
public class OtherTest {
    @Test
    public void test1() throws ClassNotFoundException {
        /*
        * 获取构造器
        * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        //getConstructors() 获取当前运行时类中声明为public的构造器
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor c : constructors){
            System.out.println(c);
        }
        System.out.println("****************");
        //getDeclaredConstructors() 获取当前运行时类中所有的构造器
        Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor c : declaredConstructors){
            System.out.println(c);
        }
    }
    @Test
    public void test2() throws ClassNotFoundException {
        /*
        * 获取运行时类的父类
        * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);
    }

    @Test
    public void test3() throws ClassNotFoundException {
        /*
         * 获取运行时类的带泛型的父类
         * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Type genericSuperclass = aClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    @Test
    public void test4() throws ClassNotFoundException {
        /*
         * 获取运行时类的带泛型的父类的泛型
         * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Type genericSuperclass = aClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
        //强转过后表明是带参数的
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        //获取实际类型的参数，就是获取泛型
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        //把Type强转为class
        System.out.println(((Class)actualTypeArguments[0]).getName());
    }
    @Test
    public void test5() throws ClassNotFoundException {
        /*
        * 获取运行时类的接口
        * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class i:interfaces){
            System.out.println(i);
        }
        System.out.println("------------------");
        //获取运行时父类的接口
        Class<?>[] interfaces1 = aClass.getSuperclass().getInterfaces();
        for (Class i:interfaces1){
            System.out.println(i);
        }
    }

    @Test
    public void test6() throws ClassNotFoundException {
        /*
         * 获取运行时类所在的包
         * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Package aPackage = aClass.getPackage();
        System.out.println(aPackage);
    }
    @Test
    public void test7() throws ClassNotFoundException {
        /*
         * 获取运行时类声明的注解
         * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation a: annotations){
            System.out.println(a);
        }
    }
}
```
#### 调用运行时类中的指定属性、方法、构造器
```
public class ReflectionTest {
    @Test
    public void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class aClass = Class.forName("day28reflection.test.Person");
        //创建运行时类的对象
        Person person = (Person) aClass.newInstance();
        System.out.println(person.toString());
        //getField() 获取指定属性 要求运行时类中属性声明为public 通常不使用此方法
        Field id = aClass.getField("id");
        /*
        * 设置当前属性的值
        * set():参数1：指明设置哪个对象的属性 参数2：将此属性值设置为多少
        * */
        id.set(person,5666);
        /*
        * 获取当前属性的值
        * get() 参数1：获取哪个对象的当前属性
        * */
        Integer o = (Integer) id.get(person);
        System.out.println(o);
        System.out.println(person);
    }
    @Test
    public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        /*
        * 如何操作运行时累的指定属性 ----需要掌握
        * */
        Class aClass = Class.forName("day28reflection.test.Person");
        //创建运行时类的对象
        Person person = (Person) aClass.newInstance();

        //1. getDeclaredField(String fieldName) 获取运行时类中指定变量名的属性，这里都可以拿到
        Field name = aClass.getDeclaredField("name");
        //2. 保证当前变量是可访问的
        name.setAccessible(true);
        //3. 获取、设置指定对象的属性
        name.set(person,"chenwei");
        System.out.println(person);
    }
    @Test
    public void test3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /*
        * 调用运行时类中的指定方法
        * */
        Class aClass = Class.forName("day28reflection.test.Person");

        Person person = (Person) aClass.newInstance();

        //1. 获取某个指定的方法 getDeclaredMethod()：参数1：指明获取的方法的名称 参数2：指明获取方法的形参列表
        Method show = aClass.getDeclaredMethod("showNation", String.class);
        //2. 保证当前方法时可访问的
        show.setAccessible(true);
        /*
        * 调用方法的invoke()参数1：方法的调用者 参数2：给方法形参赋值的实参
        * invoke()的返回值即为对应类中调用的方法的返回值。
        * */
        Object chen = show.invoke(person, "chen");
        System.out.println(chen);
        System.out.println("如何调用静态方法");
        Method showDetail = aClass.getDeclaredMethod("showDetail");
        showDetail.setAccessible(true);
        Object invoke = showDetail.invoke(Person.class);
        System.out.println(invoke);
    }
    @Test
    public void test4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /*
        * 调用运行时类中的指定构造器
        * */
        Class aClass = Class.forName("day28reflection.test.Person");

        //1. 获取指定构造器
        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class);
        //2. 保证此构造器是可访问的
        declaredConstructor.setAccessible(true);
        //3. 调用此构造器创建运行时类的对象
        Object o = declaredConstructor.newInstance("Tome");
        System.out.println(o);
    }
}
```
## day29
### 1. 每日一题
1. 写出获取Class实例的三种方式，最常用的是第三种方式，也是体现反射的动态性的方式。
```
1. Class c = Person.class
2. Person p = new Person()
Class c = p.getClass()
3. Class c = Class.forName(String classPath)
```
2. 谈谈你对Class类的理解
Class对应着加载到内存中的一个**运行时类**，
3. 创建Class对应运行时类的对象的通用方法，代码实现，以及这样操作，需要对应的运行时类构造器方面满足的要求
```
要求
1. 必须要有空参的构造器
2. 权限修饰符的权限要够。通常设置为public
```
4. 在工程module下的src下有名为jdbc.properties的配置文件，文件内容为name=tome,如何在程序中通过代码获取这个变量
5. 如何调用方法show()
```java
类声明如下：
package com.atguigu.com.java
class User{
    public void show(){
        System.out.println("我是一个中国人");
    }
}
```
6. 创建类的对象的三种方式(new + 构造器、调用静态方法创建对象(比如单例模式、工厂模式)、通过反射newInstance)
### 2. 反射的应用：动态代理
1. ioc容器：的常见方式：依赖注入
2. aop:原理：动态代理
3. 代理设计模式的原理：
   3.1 使用一个代理将对象包装起来，然后用该代理对象取代原始对象。任何对原始对象的调用都要通过代理。
   代理对象决定是否以及何时将方法调用转到原始对象上。
   3.2 之前为大家讲解过代理机制的操作，属于静态代理，特征是代理类和目标对象的类都是在编译期间确定下来，不利于程序的扩张。
   同时每一个代理类只能为一个接口服务，这样一来程序开发中必然产生过多的代理。最好可以通过一个代理类完成全部的代理功能。
4. 动态代理相比静态代理的优点：
   4.1 抽象角色中(接口)声明的所有方法都被转移到调用处理器一个集中的方法中处理，这样，我们可以更加灵活和统一的处理众多的方法
   4.2 一句话就是：一个代理类可以搞定其他的所有被代理类。比较灵活一些。
#### 1 静态代理的一个例子
1. 静态代理举例，一个接口，一个代理类和被代理类实现这个结构。
2. 特点：代理类和被代理类在编译期间，就确定下来了
```java
public class StaticProxyTest {
  public static void main(String[] args) {
      NikeFactory nikeFactory = new NikeFactory();
      ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nikeFactory);
      proxyClothFactory.produceCloth();
  }
}
interface ClothFactory{
    /**
     * 生产衣服
     * */
    void produceCloth();
}
//代理类
class ProxyClothFactory implements ClothFactory{
    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        clothFactory.produceCloth();
        System.out.println("代理工厂做一些收尾工作");
    }
}
//被代理类
class NikeFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("nike工厂生产一批运动鞋");
    }
}
```
#### 2 动态代理的例子
```java
public class ProxyTest {
  public static void main(String[] args) {
      SuperMan superMan = new SuperMan();
      //proxyInstance:代理类的对象
      Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
      //当通过代理类对象调用方法时，会自动的调用被代理类中的同名方法
      String belief = proxyInstance.getBelief();
      System.out.println(belief);
      proxyInstance.eat("火锅");
      //用另外一个例子说明动态性
      NikeFactory nikeFactory = new NikeFactory();
      ClothFactory clothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nikeFactory);
      clothFactory.produceCloth();
  }
}
interface Human{
    /**
     * 信仰
     * @return  返回信仰
     */
    String getBelief();

    /**
     * 吃东西
     * @param food:食物
     */
    void eat(String food);
}
class HumanUtil{
    public void method1(){
        System.out.println("调用HumanUtil方法一");
    }
    public void method2(){
        System.out.println("调用HumanUtil方法一");
    }
}
//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "i belied i can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("i like eat "+food);
    }
}
/**
 要想实现动态代理，需要解决的问题？
 问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象。
 问题二：当通过代理类的对象调用方法a时，如何动态的去调用被代理类中的同名方法a
 */
class ProxyFactory{
    /**
     * 调用此方法：返回一个代理类的对象，解决问题一
     * @param obj 被代理类的对象
     * */
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.bind(obj);
        Object o = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myInvocationHandler);
        return o;
    }
}
class MyInvocationHandler implements InvocationHandler{
    //需要使用被代理类的对象进行赋值
    private Object object;
    public void bind(Object object){
        this.object = object;
    }

    /**
     当我们通过代理类的对象，调用方法a时，就会调用如下的方法：invoke()
     将被代理类要执行的方法a的功能就声明在invoke()中
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method()：即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法，obj本身就是被代理类的对象
        HumanUtil humanUtil = new HumanUtil();
        humanUtil.method1();
        Object retrunValue = method.invoke(object,args);
        humanUtil.method1();
        //上述方法的返回值就作为当前类中的invoke()的返回值
        return retrunValue;
    }
}
```
### 3 java8新特性内容
1 Lambda表达式
2 函数式(Function)接口
3 方法引用与构造器引用
4 强大的Stream Api
5 Optional类
#### 1 Lambda表达式
1. 定义：Lambda是一个匿名函数，我们可以把Lambda表达式理解为是一段可以传递的代码(将代码像数据一样传递)。
   使用它可以写出更简介、更灵活的代码。作为一种更紧凑的代码风格，使java的语言表达能力得到了提升。
2. 具体的使用举例
   1. 举例：(o1,o2) -> Integer.compare(o1,o2)
   2. 格式：
   ->:lambda操作符 或箭头操作符
   ->左边：lambda形参列表 (其实就是接口中的抽象方法的形参列表)
   ->右边：lambda体 (其实就是重写的抽象方法的方法体)
   3. lambda表达式的使用：(分6种情况介绍)
   总结：
   -> 左边 lambda形参列表的数据类型可以省略(类型推断)；如果lambda形参列表只有一个参数，其一对()也可以省略
   -> 右边 lambda体应该使用一对{}包裹，如果lambda体只有一条执行语句(可能时return语句),可以省略这一对{}和return关键字(要省必须一起省)
   4. lambda表达式的本质；作为接口的实例
   5. 如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口。我们可以在接口上使用@FunctionalInterface注解，
      这样做可以检查是否是一个函数式接口。同时javadoc也会包含一条声明，说明这个接口是一个函数式接口。
3. 六种使用方式举例   
```java
public class LambdaTest {
    @Test
    public void test1(){
        /*
        * 语法格式一：无参，无返回值
        * */
        //提供一个实现Runnable接口的匿名实现类的对象
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北极天安门");
            }
        };
        r1.run();
        Runnable r2 = () -> System.out.println("我爱北京故宫");
        r2.run();
    }
    @Test
    public void test2(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare = comparator.compare(22, 32);
        System.out.println(compare);
        System.out.println("*************");
        //Lambda表达式的写法
        Comparator<Integer> comparator2 = (o1,o2) ->  Integer.compare(o1,o2);
        int compare1 = comparator2.compare(53, 412);
        System.out.println(compare1);
        //方法引用
        System.out.println("*************");
        Comparator<Integer> comparator3 = Integer::compare;
        int compare3 = comparator3.compare(53, 412);
        System.out.println(compare3);
    }
    @Test
    public void test3(){
        /**
         1. 举例：(o1,o2) -> Integer.compare(o1,o2)
         2. 格式：
         ->:lambda操作符 或箭头操作符
         ->左边：lambda形参列表 (其实就是接口中的抽象方法的形参列表)
         ->右边：lambda体 (其实就是重写的抽象方法的方法体)
         3. lambda表达式的使用：(分6种情况介绍)
         总结：
            -> 左边 lambda形参列表的数据类型可以省略(类型推断)；如果lambda形参列表只有一个参数，其一对()也可以省略
            -> 右边 lambda体应该使用一对{}包裹，如果lambda体只有一条执行语句(可能时return语句),可以省略这一对{}和return关键字(要省必须一起省)
         4. lambda表达式的本质；作为接口的实例
         */

        /*
        * 语法格式二：需要一个参数，但没有返回值
        * 提供接口匿名实现类的对象
        * */
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("谎言和誓言的区别是什么？");
        consumer.accept("************");
        Consumer<String> consumer2 =(String s) -> System.out.println(s);
        consumer2.accept("一个是听的人当真了，另一个是说的人当真了");

        /*
         * 语法格式三：数据类型可以省略，因为可以由编译器推断得出，称为"类型维护"
         * 提供接口匿名实现类的对象
         * */
        Consumer<String> consumer3 =(s) -> System.out.println(s);
        consumer3.accept("aaaaaaaaaaa");
        /*
         * 语法格式四：Lambda只需要一个参数时，参数的小括号可以省略
         * 提供接口匿名实现类的对象
         * */
        Consumer<String> consumer4 = s -> System.out.println(s);
        consumer4.accept("consumer4");

        /*
         * 语法格式五：Lambda需要两个或以上参数，多条执行语句，并且可以有返回值，
         * 提供接口匿名实现类的对象
         * */
        //没有使用Lambda表达式时的写法
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("多条执行语句1");
                System.out.println("多条执行语句2");
                return Integer.compare(o1,o2);
            }
        };
        int compare = c.compare(56, 52);
        System.out.println(compare);
        System.out.println("***************");
        //使用Lambda表达式时的写法
        Comparator<Integer> c2 = (o1,o2) -> {
                System.out.println("多条执行语句1");
                System.out.println("多条执行语句2");
                return Integer.compare(o1,o2);
        };
        int compare2 = c2.compare(56, 60);
        System.out.println(compare);
        /*
        * 语法格式六：当Lambda体只有一条语句时,return与大括号若有，都可以省略
        * */
        Comparator<Integer> c3 = (o1,o2) -> Integer.compare(o1,o2);
        int compare3 = c3.compare(56, 60);
        System.out.println(compare3);
    }
    @Test
    public void test4(){
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("test4");
    }
}
```
4. 函数式接口
```java
@FunctionalInterface
public interface MyInterface {
    /**
     * 自定义函数式接口
     * 这里使用注解表示是一个函数式接口，会对下面的方法校验是否满足函数式接口的定义
     * 只有一个抽象方法的接口就是函数式接口
     * lambda表达式要使用就一定依赖函数式接口
    */
    void method();
}
```
#### 强大的StreamApi
1. StreamApi相关概述 1. Stream关注的是对数据的运算，与cpu打交道 集合关注的是数据的存储，与内存打交道
2. 
* 一、Stream 不会自己存储元素
* 二、Stream 不会改变源对象。相反，他们会返回一个持有结果的新Stream
* 三、Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行
3. Stream执行流程
* 一、Stream 的实例化
* 二、一系列的中间操作(过滤、映射、。。。)
* 三、终止操作
4. 说明 
* 一、 一个中间操作链，对数据源的数据进行处理 
 *  二、 一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用
```java
public class StreamApiTest {
	List<String> stringList = new ArrayList<>();

	@Test
	public void test1() {
		for (int i = 0; i < 100; i++) {
			stringList.add("我是数字" + String.valueOf(i));
		}
		/**
		 * 创建Stream方式一：通过集合
		 * */
		for (String s : stringList) {
			System.out.println(s);
		}
		//default Stream<E> stream : 返回一个顺序流
		Stream<String> stream = stringList.stream();
		//default Stream<E> parallelStream : 返回一个并行流
		Stream<String> stream2 = stringList.parallelStream();
	}

	@Test
	public void test2() {
		/**
		 * 创建Stream方式二：通过数组
		 * */
		int[] arr = new int[]{1, 4, 5, 2, 1, 55, 1};
		//调用Arrays类的static <T> Stream<T> stream(T[] array):返回一个流
		IntStream stream = Arrays.stream(arr);
	}

	/**
	 * 创建Stream方式三：通过Stream的of()
	 */
	@Test
	public void test3() {
		Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
	}

	/**
	 * 创建Stream方式四：创建无线流
	 */
	@Test
	public void test4() {
		//迭代
		//public static<T> Stream<T> iterate(final T seed,final UnaryOperator<T> f)
		Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
		//生成
		//public static<T> Stream<T> generate(Supplier<T> s)
		Stream.generate(Math::random).limit(20).forEach(System.out::println);
	}

	/**
	 * 测试Stream的中间操作
	 */
	ArrayList<Employee> employeeArrayList = new ArrayList<>();

	@Test
	public void test5() {
		/**
		 * Stream的中间操作 一：赛选与切片
		 * filter(Predicate p) 接收Lambda，从流中排除某些数据
		 * limit(int n) 截断流，使其元素不超过指定数量
		 * skip(n) 跳过元素，返回一个扔掉了前n个元素的流，若流中元素不足n个，则返回一个空流，与limit(n)互补
		 * distinct() 筛选，通过流所生成元素的hashCode()和equals()去除重复元素
		 * */
		employeeArrayList.add(new Employee(1, "马云", 55, 5653));
		employeeArrayList.add(new Employee(2, "马化腾", 56, 5646));
		employeeArrayList.add(new Employee(3, "任正非", 46, 3463));
		employeeArrayList.add(new Employee(4, "刘德华", 50, 25235));
		employeeArrayList.add(new Employee(5, "成龙", 52, 2525));
		employeeArrayList.add(new Employee(6, "沈腾", 42, 6346));
		employeeArrayList.add(new Employee(7, "陈伟", 24, 2562));
		employeeArrayList.add(new Employee(8, "金晨", 26, 6666));

		Stream<Employee> stream = employeeArrayList.stream();

		//练习1：查询员工表中薪资大于5632.0的数据，
		stream.filter(employee -> employee.getSalary() > 5632.0).forEach(System.out::println);
		System.out.println("这些流必须重新创建，使用过了就不能再使用了");
		//练习2：得出前3条数据
		Stream<Employee> stream2 = employeeArrayList.stream();
		stream2.limit(3).forEach(System.out::println);
		System.out.println("这些流必须重新创建，使用过了就不能再使用了");
		//练习3：得出跳过前3条数据后的其他数据
		Stream<Employee> stream3 = employeeArrayList.stream();
		stream3.skip(3).forEach(System.out::println);
		System.out.println("这些流必须重新创建，使用过了就不能再使用,去重前的数据");
		//练习4：去除employeeArrayList中重复的元素
		employeeArrayList.add(new Employee(4, "刘德华", 50, 25235));
		employeeArrayList.add(new Employee(4, "刘德华", 50, 25235));
		employeeArrayList.add(new Employee(7, "陈伟", 24, 2562));
		for (Employee employee : employeeArrayList) {
			System.out.println(employee);
		}
		System.out.println("去重后的数据");
		employeeArrayList.stream().distinct().forEach(System.out::println);

		/**
		 * Stream的中间操作 二：映射
		 * map(Function f) 接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射为一个新元素
		 * mapToDouble(ToDoubleFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的DoubleStream
		 * mapToInt(ToIntFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的IntStream
		 * mapToLong(ToLongFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的LongStream
		 * flatMap(Function f) 接收一个函数作为参数,将流中每个流都换成另一个流，然后把所有流连接成一个流
		 * */
		System.out.println("Stream中间操作2 映射");
		//练习一：map(Function f) 将所有list<String> 中的所有元素换成大写
		List<String> stringList = Arrays.asList("aa", "bb", "cc", "dd");
		stringList.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		//练习二：获取员工姓名大于2的员工姓名，这里只要姓名哦
		System.out.println("获取员工姓名大于2的员工姓名，这里只要姓名哦");
		Stream<String> stringStream = employeeArrayList.stream().map(str -> str.getName());
		stringStream.filter(str -> str.length() > 2).forEach(System.out::println);

		//Stream里面放的Stream
		//当是集合里面套集合时，最好使用flatMap，不然写起来费劲，下面是不用flatMap和使用flatMap的对比
		System.out.println("不使用flatMap");
		Stream<Stream<Character>> streamStream = stringList.stream().map(StreamApiTest::fromStringToStream);
		streamStream.forEach(s -> {
			s.forEach(System.out::println);
		});
		//使用flatMap
		System.out.println("使用flatMap");
		Stream<Character> characterStream = stringList.stream().flatMap(StreamApiTest::fromStringToStream);
		characterStream.forEach(System.out::println);

	}

	/**
	 * 将字符串中的多个字符构成的集合转换为对应的Stream的实例
	 */
	public static Stream<Character> fromStringToStream(String str) {
		ArrayList<Character> characterArrayList = new ArrayList<>();
		for (Character character : str.toCharArray()) {
			characterArrayList.add(character);
		}
		return characterArrayList.stream();
	}

	/**
	 *  Stream的中间操作 三：排序
	 * */
	@Test
	public void test6() {
		//sorted() 自然排序，如果排序的是自己编写的类，那么要继承可排序接口
		List<Integer> integers = Arrays.asList(1, 5, 7, 3, 44, 22, 73, 25, 73);
		integers.stream().sorted().forEach(System.out::println);
		//sorted(Comparator c) 定制排序
		employeeArrayList.add(new Employee(1, "马云", 55, 5653));
		employeeArrayList.add(new Employee(2, "马化腾", 56, 5646));
		employeeArrayList.add(new Employee(3, "任正非", 46, 3463));
		employeeArrayList.add(new Employee(4, "刘德华", 42, 25235));
		employeeArrayList.add(new Employee(6, "沈腾", 42, 6346));
		employeeArrayList.add(new Employee(7, "陈伟", 24, 2562));
		employeeArrayList.add(new Employee(8, "金晨", 26, 6666));
		employeeArrayList.stream().sorted((e1,e2) -> {
			int i = e1.getAge() - e2.getAge();
			if (i!=0){
				return i;
			}else {
				return (int) (e1.getSalary()-e2.getSalary());
			}
		}).forEach(System.out::println);
	}

	/**
	 * 测试Stream的终止操作,匹配与查找、归约、收集
	 * */
	@Test
	public void test7(){
		/**
		 * 1. 匹配与查找
		 * allMatch(Predicate p) 检查是否匹配所有元素
		 * anyMatch(Predicate p) 检查是否至少匹配一个元素
		 * noneMatch(Predicate p) 检查是否没有匹配所有元素,比如检查是否有雷开头的元素
		 * findFirst() 返回第一个元素
		 * findAny() 返回当前流中任意元素
		 * */
		employeeArrayList.add(new Employee(1, "马云", 55, 5653));
		employeeArrayList.add(new Employee(2, "马化腾", 56, 5646));
		employeeArrayList.add(new Employee(3, "任正非", 46, 3463));
		employeeArrayList.add(new Employee(4, "刘德华", 42, 25235));
		employeeArrayList.add(new Employee(6, "沈腾", 42, 6346));
		employeeArrayList.add(new Employee(7, "陈伟", 24, 2562));
		employeeArrayList.add(new Employee(8, "金晨", 26, 6666));
		//检查是否·所有员工的年龄都大于10
		boolean b = employeeArrayList.stream().allMatch(employee -> employee.getAge() > 10);
		System.out.println(b);
		//检查是否存在员工的工资大于10000
		boolean b1 = employeeArrayList.stream().anyMatch(employee -> employee.getSalary() > 10000);
		System.out.println("b1 = " + b1);
		//检查是否存在姓雷的元素
		boolean lei = employeeArrayList.stream().noneMatch(employee -> employee.getName().startsWith("雷"));
		System.out.println("lei = " + lei);
		//返回第一个元素
		Optional<Employee> first = employeeArrayList.stream().findFirst();
		System.out.println("first = " + first);
		//返回当前流中任一元素
		Optional<Employee> any = employeeArrayList.stream().findAny();
		System.out.println("any = " + any);

		/**
		 * count() 返回流中元素的总个数
		 * max(Comparator c) 返回流中最大值
		 * min(Comparator c) 返回流中最小值
		 * forEach(Consumer c) 内部迭代
		 * */
		long count = employeeArrayList.stream().filter(employee -> employee.getAge() > 30).count();
		System.out.println("count = " + count);
		/*
		* 2. 归约(后面再仔细看吧)
		* */
	}

}

class Employee {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Employee() {
	}

	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", salary=" + salary +
				'}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return id == employee.id && age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, age, salary);
	}
}
```
#### Optional类：为了在程序中避免出现空指针异常而创建的
```java
public class OptionalTest {
	@Test
	public void test1(){
		Girl girl = new Girl();
		//of(T t):保证t是非空的
//		girl=null;
		Optional<Girl> optionalGirl = Optional.of(girl);
		System.out.println(optionalGirl);
	}
	@Test
	public void test2(){
		Girl girl = new Girl();
		girl=null;
		//ofNullable(T t)：t可以为null
		Optional<Girl> optionalGirl = Optional.ofNullable(girl);
		System.out.println(optionalGirl);
	}
	public String getGirl(Boy boy){
		return boy.getGirl().getName();
	}
	@Test
	public void test3(){
		Boy boy = new Boy();
		boy = null;
		String girl = getGirl(boy);
		System.out.println(girl);
	}
	//优化以后的getGirlName
	public String getGirl1(Boy boy){
		if (boy!=null){
			Girl girl = boy.getGirl();
			if (girl!=null){
				return girl.getName();
			}
		}
		return null;
	}
	//使用Optional类的getGirlName
	public String getGirl2(Boy boy){
		Optional<Boy> boyOptional = Optional.ofNullable(boy);
		//此时的boy1一定非空，如果为空的话用new Girl("赵大大"))代替
		Boy boy1 = boyOptional.orElse(new Boy(new Girl("赵大大")));

		Girl girl = boy1.getGirl();
		Optional<Girl> girlOptional = Optional.ofNullable(girl);
		//此时girl1一定非空，如果为空的话用new Girl("古渣渣")代替
		Girl girl1 = girlOptional.orElse(new Girl("古渣渣"));
		return girl1.getName();
	}
	@Test
	public void test5(){
		Boy boy = null;
		boy = new Boy();
		//这里需要再看看，这个null，new一个对象后，里面的属性为null,并不是他自己为null
		boy = new Boy(new Girl("chenlaoshi"));
		String girl2 = getGirl2(boy);
		System.out.println(girl2);
	}
	@Test
	public void test6(){
		Boy boy = new Boy();
		if (boy==null){
			System.out.println("boy==nunll");
		}else {
			System.out.println("boy!=nunll");
		}
	}
}
```

## 一些面试题

```java
package swordfingeroffer;

/**
 * @author: chenwei
 * @date: 2021/10/23 2:37
 * @description: 描述
 */
public class Interview3 {
	public static void main(String[] args) {
		SingleTone obj = SingleTone.getInstance();
		System.out.println("SingleTone.counter1="+SingleTone.counter1);
		System.out.println("SingleTone.counter2="+SingleTone.counter2);
	}
}
class SingleTone{
	private static SingleTone obj = new SingleTone();
	/*下面这两句不一样，执行*/
	public static int counter1;
	public static int counter2=0;
	private SingleTone(){
		counter1++;
		counter2++;
	}
	public static SingleTone getInstance(){
		return obj;
	}
}
```

