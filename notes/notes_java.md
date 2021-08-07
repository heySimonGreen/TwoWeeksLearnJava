# java学习笔记 学习springboot之前需要学习SSM，学习springCloud
## 常用快捷键  
1. 调整格式全选后ctr+alt+l  
2. 在要输出的变量后输.soutv，就可以了  
3. ctrl+alt+t try-catch快捷键  
4. alt +enter 快速创间对象快捷键
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
   
