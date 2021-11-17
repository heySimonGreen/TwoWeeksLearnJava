[toc]

## 2021 11 15

登录内网看资料学习，研发部->中的培训资料、项目、程序。数据使用的是oracle。此java项目资料有问题，杨老师给了新的pb项目学习，后续学习PB112。

ftp://192.168.1.200/

admin syrj

登录svn下载代码运行，熟悉医疗系统的使用，需要先学习一下pb12,会使用pb12编写简单程序，能运行项目代码。

账号密码cw cw

http://47.108.86.168:8080/!/#

![image-20211115223312824](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211115223312824.png)

![image-20211115223323385](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211115223323385.png)



### 晚上 pb快速入门

#### 创建一个完整的应用程序

##### 功能描述：

在窗口上放一个命令按钮，点击时显示提示信息helloworld

##### 步骤5步

创建workspace

创建target

创建窗口

在按钮的click事件上编程

在application对象的open事件上编程

##### 演示程序功能

##### 编译形成执行文件

##### 部署，可以脱离开发环境运行



问题

1 创建窗口的时候没有lay界面。

解决，在菜单栏找到view -> layout 回复默认设置

2 完成这个应用程序后，编译形成可执行文件时报错

the dynamic link library pbdwo125.dll could not be found in the specified path。

解决：16日来打开软件发现打不开了。卸载软件后重新安装了一遍Pb12，卸载中需要将所有文件删除，否则删除过程中会报错。

破解pb12软件，将破解文件直接复制到安装目录下即可，替换安装目录下同文件名PBSYS125.DLL

## 11月16日

### 任务：

1. 学习PB,看ftp上的视频，争取今天将初级看完。**结果**：今天看了10个。视频有点多。。。
2. 继续看医疗培训业务ppt，病人在院诊疗图，自己要能自己讲出来。**结果**：流程基本完成。但是学习要求中了解病人在院门诊部分就诊和住院部分治疗整个过程会出现一些异常情况和处理；把握医疗工作、费用产生、物流信息它们之间的接口信息方式，**需要将pb学习完成运行项目实际操作**。

**病人在院诊疗图学习的要求：**

​		学习病人在院整个疾病的诊断、治疗过程，要理解病人在门诊和住院两个部分所有的业务操作流程，同时了解病人在院门诊部分就诊和住院部分治疗整个过程会出现一些异常情况和处理；把握医疗工作、费用产生、物流信息它们之间的接口信息方式。

### 问题：

在PB软件上的报错信息不能复制，所以每个错误都需要手打出来，顺便记录在笔记中。

编译。形成可执行文件。但离脱离开发环境部署还有一定距离。

#### 问题1

​		部署deploy new-> project->application 项目的时候填写完excutable file name ;还有project build overwrite -> rebuild选择full; libraries勾选PBD。会产生.exe文件和.pbd文件。这两个文件都是部署需要的文件。

这时候点击deploy提示 cannot create runtime when another painter is open。

##### 解决

​		在编辑窗口的时候没有关闭那个正在编辑的窗口，先在工程目录点击你刚编辑的窗口eg:w_hello。然后在又边编辑处点击close即可。

部署：可以脱离开发环境运行。解释声明是部署。需要哪些支撑文件。

E:\Symedsoft\PB12\Shared\PowerBuilder。昨天报错的pbdwo125.dll找不到，在这里的。今天重装后在这个文件夹看到了。

### 开发步骤：

编程，编译，部署

### 开发环境中的概念：

Workspace(pbw)、target(pbt)	、PBL、Application(可以有多个application，但只有一个起点窗口)、Window。所以拷贝项目的时候pbw、pbt、pbl这三个文件都要拷贝上。 

### 函数：shift+F1查看函数使用帮助文档

MessageBox()、Open()、SetNull()

Pos(str1,str2) :查找一个字符串在另一个字符串中首次出现的位置（起始位置为1,）

Pos(str1,str2,start) 从某处开始。返回值Integer.如果返回值是0代表没找到。

Left()函数：作用：得到指定字符串左侧若干个字符。语法：Left(str1,len)。返回值string

Right()函数：作用：得到指定字符串左侧若干个字符。语法：Left(str1,len)。返回值string

Mid()函数：作用：得到指定字符串左侧若干个字符。语法：Left(str1,len)。返回值string

Asc():作用：得到对应的ASCII;语法ASC(char);返回值：数字，对应的ASCII

Char():作用：得到和ASCII对应的字符;语法Char(char);返回值：字符

### 查看帮助文档：

按F1，即可打开帮助文档，查看函数等的使用方法。比如MessageBox函数，有功能描述、语法等。

shift + F1 使用具体的帮助文档

还有一个编译帮助文档。

pb开发环境，pb.ini文件，后续可以用来记录客户端的一些信息，后面会用到

### 编程概述：

#### 开发应用程序的步骤

#### 5个可编程对象概述

Application对象：程序执行的起点，全局编程

Window对象和控件：用户界面主要构成对象

menu对象：调度中心

UserObject对象：重用、封装

Function对象：重用

#### 和编程关系紧密相关的内容：

界面设计：常规设计，标准设计。

函数：600多个函数，常用70多个。

事件：常用事件，理解触发时机至关重要。

属性：常用属性。

sql语言：数据处理的基础。

#### PB的编程语言：

PowerScript、嵌入式SQL

#### 程序和事件的关系：

PB中所有程序的执行，都必须通过事件。

#### 编程规范性：

不区分大小写，但是规范首字母大写MessageBox()

### 第四讲：连接DB、DataBase画板及sql语言 这里连接数据库后面需要再看看，因为我的sqlanywhere好像没装，

#### 1 连接DB

连接方式：1 ODBC方式、2 厂家驱动方式 3 直连方式 4 JDBC方式

设置连接的三个层次：1 厂家客户端驱动 2 ODBC中DSN 3 PB中DB profile

#### 注释：

1 单行注释//

2 多行注释 /**/

#### 显示编译、隐式编译。显示编译ctrl + l

显示编译是编写代码后点击编译去编译

隐式编译是没有经过显示编译，直接保存，这时会隐式编译，如果将名称、注释等信息填写完，隐式没过，非常不友好，那些信息都得重新写。

### 第五讲：语言基础

#### 代码提示设置：

Design -> options -> autoscript ->Opthions 全部勾选 且 时间设为10毫秒.

一行书写多个语句的时候使用分号隔开 ；

#### 表示符:

长度：<=255；不区分大小写；不能是保留字；字母或下划线开头

指代词（只有四个指代词）：This Parent parentWindow（只能在菜单里使用） Super（子代码引用父代码属性的时候使用）

#### 续行和断句 &，一行写不下就需要断句了

只要不是在保留字中间短都可以

#### 标准数据类型

##### 字符型：

string、char

##### 数值型：

注意各类型的取值范围、和数据库同类型的数据精度是否匹配。类型有integer、long、double、real、decimal、UnsignedInteger、UndesignLong

##### 日期、时间型：

date、time、datetime

##### 布尔型：boolean

##### Blob型：Blob 大型文件，比如存放日志。

##### 系统对象类型：

create、destroy、Browser

Browser中查看所有的系统对象类型。菜单栏 -> Broswer -> System -> 右键选择 show hierachy (展示树状结构，这里可以看到按父子关系来归类，形成树状结构。更方便看系统对象类型。)

```pb
CommandButton Icb_temp
Icb_temp = Create CommandButton
/*系统对象类型必须释放，内存占用过多，影响系统运行*/
destroy Icb_temp
```

##### Any型：运行慢、编译时不做类型检查

#### 变量声明 在窗口的最下方，最右边 declare xxx	Variables

##### 作用范围：

###### 全局变量Global Variables：使用需要小心

整个Target下所有对象都可访问。

###### 实例变量：

Window、Application、Menu、UserObject范围内的变量。也只有这四个可以有实例变量。

这个窗口没有关，这个变量就可用。

###### 本地变量：

声明变量的事件或者函数内。

关闭pb12后默认打开上次编辑的项目设置：菜单栏的tools ->System Options -> workspace 勾选reopen workspace on startup 提高开发效率

这里可以看出命名规则：作用范围+类型_变量名称

比如声明全局变量 String gs_变量名称 global

比如声明实例变量 String is_变量名称 instance

比如声明本地变量 String ls_变量名称 lacol

##### 变量声明(注意声明时赋值的特性)

```
/*此时的时间是编译时的时间，运行的时候就不会变化了。	
在运行的时候决定取值的时候这种情况，我们实际上得到的值都是编译时候的取值，而不是运行时候的值。
得到的都是编译时的取值，而不是运行时的取值。
*/
Time lt_Now = Now()	
//string(Now())得到的值是运行的时候的值
MessageBox(string(lt_Now),string(Now()))

```

###### 格式：数据类型 变量名 [=初值]

###### 位置：程序开头

###### 规范：作用范围+类型_变量名称

###### 类型转换：eg:String（Now）

### 运算符和表达式：

#### 运算符：

算数运算符：+ - * / ^ 

关系运算符：< > = .... <>:不等于

逻辑运算符：not and or

联接运算符：+

运算符优先级：

#### 表达式和赋值

分支语句1：

![image-20211116172424751](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211116172424751.png)

分支语句2：

![语言基础-分支语句2](I:\Symedsoft\研发部\语言基础-分支语句2.PNG)

choose case 注意顺序性。

循环语句：

![语言基础-循环](I:\Symedsoft\研发部\语言基础-循环.PNG)

问题2 下面代码变量中的时间显示的是00:00:00，关键是前面运行的时候都没错，显示的是编译的时间，加了注释就编程0了？

解决：不知道怎么又没错了，显示了编译的时间。。。点击application的编译后时间没哟变。如果没有修改代码，点击编译也是编译上次编译后的代码，所以时间还是第一次编译的时间。需要修改代码后再编译。

```
Time lt_Now = Now()	
MessageBox('提示',String(lt_Now))
//string(Now())得到的值是运行的时候的值
MessageBox(string(lt_Now),string(Now()) + '时间')
```

### 晚上：

练习程序，视频10，使用函数、循环完成字符串截取操作

```pascal
Integer li_pos1			//第一个指针
Integer li_pos2  		//第二个指针
String ls_content  		//用户输入的内容
String ls_split			//分隔符
String ls_temp			//当前的单词

ls_content = sle_1.text
ls_split = sle_2.text
//异常，输入内容判断，
if ls_content ='' then
	MessageBox('提示','ls_content is empty')
	return
end if
if ls_split ='' then
	MessageBox('提示','ls_split is empty')
	return
end if

/*Left从字符串开头获取指定数目的字符串*/
if Left(ls_content,1) <> ls_split then ls_content = ls_split + ls_content
if Right(ls_content,1) <> ls_split then  ls_content = ls_content + ls_split

//MessageBox('提示',ls_content)

li_pos1 = Pos(ls_content,ls_split)
li_pos2 = Pos(ls_content,ls_split,li_pos1+1)

do while li_pos2 <> 0
	ls_temp = Mid(ls_content,li_pos1 + 1,li_pos2 - li_pos1 - 1)
	MessageBox('提示',ls_temp)
	li_pos1 = li_pos2
	li_pos2 = Pos(ls_content,ls_split,li_pos1+1)
loop
```

明天开始视频11学习

## 11月17日

### 一、任务：

1. 产品结构图的理解和学习，结合病人在院诊疗图，这三条线贯穿其中。
2. 继续学习pb12
3. 自己制作一个冒泡排序的例子。

### 二、产品结构图：

### 三、三条主线：

电子病历/病人信息、费用信息、物流信息。

#### 1 电子病历

（身份登记、门诊医生站、住院登记、护士工作站、医生工作站、检查/检验/手术/血库）

#### 2 费用信息

（门诊收费、护士工作站、后台划价、药品/检查/检验/手术、住院收费）

#### 3 物流信息

（临床药房、门诊药房、药库管理、器械库管理、高/低消耗品管理）

### 四、PB12。

视频11开始

ctrl + h 替换快捷键

昨天程序改进，更加灵活。

```pascal
Integer li_pos1			//第一个指针
Integer li_pos2  		//第二个指针
String ls_content  		//用户输入的内容
String ls_split			//分隔符
String ls_temp			//当前的单词

ls_content = sle_1.text
ls_split = sle_2.text
//异常，输入内容判断，
if ls_content ='' then
	MessageBox('提示','ls_content is empty')
	return
end if
if ls_split ='' then
	MessageBox('提示','ls_split is empty')
	return
end if

/*Left从字符串开头获取指定数目的字符串*/
if Left(ls_content,Len(ls_split)) <> ls_split then ls_content = ls_split + ls_content
if Right(ls_content,Len(ls_split)) <> ls_split then  ls_content = ls_content + ls_split

//MessageBox('提示',ls_content)

li_pos1 = Pos(ls_content,ls_split)
li_pos2 = Pos(ls_content,ls_split,li_pos1+Len(ls_split))

do while li_pos2 <> 0
	ls_temp = Mid(ls_content,li_pos1 + Len(ls_split),li_pos2 - li_pos1 - Len(ls_split))
	MessageBox('提示',ls_temp)
	li_pos1 = li_pos2
	li_pos2 = Pos(ls_content,ls_split,li_pos1+Len(ls_split))
loop

```

![循环语句2](I:\Symedsoft\研发部\循环语句2.PNG)

静态文本控件、单行输入框控件

#### 视频11 练习程序

##### 1 编写加密解密程序

加密

```pascal
String ls_text	//输入的文本框
String ls_temp	// 每个位置的数据
String ls_encodeText	// 接收加密后的数据
String ls_seed	//种子，加密解密的秘钥
Integer li_index		//记录循环的次数，每次的数据放在temp中，加密后在放入ls_encodeText

ls_text = sle_1.text	//接收输入的数据
//判断接收的数据是否为空
if ls_text = '' then
	MessageBox('提示','输入内容为空')
	return
end if
//将ls_seed的长度填充到和输入字符的长度一样，方便操作
ls_seed = '4242424124243464575688'
ls_seed = Fill(ls_seed,Len(ls_text))


//循环将ls_content的内容的asc码和ls_seed对应位置的数据相加，得到的数字转换为字符。实现加密
for li_index = 1 to Len(ls_text)
	ls_temp = Mid(ls_text,li_index,1)
	ls_temp = Char(Asc(ls_temp) + Integer(Mid(ls_seed,li_index,1)))
	ls_encodeText = ls_encodeText + ls_temp 
next	
	
//赋值，显示
st_2.text = ls_encodeText
sle_2.text = ls_encodeText
```

解密 类似加密

```pascal
String ls_content
String ls_temp
String ls_value
String ls_seed = '4242424124243464575688'
Integer li_index

ls_content = sle_1.text
if ls_content = '' then
	MessageBox('提示','content is empty')
	return
end if

ls_seed = Fill(ls_seed,Len(ls_content))

for li_index = 1 to Len(ls_content)
	ls_temp = Char(Asc(Mid(ls_content,li_index,1)) - Integer(Mid(ls_seed,li_index,1)))
	ls_value = ls_value + ls_temp
Next

st_4.text = ls_value
sle_3.text = ls_value
```





##### 2 打印99乘法表

~t 代表一个制表位

~r~n 代表一个换行符

多行编辑器控件：multilineedit

```pascal
String ls_value
Integer li_for1
Integer li_for2

for li_for1 = 1 to 9
	for li_for2 = 1 to li_for1
		ls_value = ls_value + String(li_for2) + ' * ' + String(li_for1) + '=' + String(li_for1*li_for2) +  '~t'
	Next
	ls_value = ls_value + '~r~n'
Next 

mle_1.text = ls_value

```

在字符串拼接的时候拼接等号时有问题，乘法表对齐没有对齐。拼接的时候最好不要用空格吧。‘=’ 不要' = '

```
 String(li_for1) + '=' + String(li_for1*li_for2)
```



3 ABCDE * A	= EEEEEE

##### 数据库连接问题：导入数据库失败

E:\oracle\product\10.2.0\db_1\network\ADMIN 杨老师发了一个文件，替换掉tnsnames.ora。还发了一个数据库工具

运行项目后 按s 查看数据库

pb12用管理员方式运行



下面的代码注释后可以进入系统。但数据为导入

```pascal
//IF f_gen_input_file(appinfo.sys_name, appinfo.input_cfg,ls_input) < 0 THEN
//   messagebox("提示", "更新输入法词库文件时出现了错误！")
//END IF
```

