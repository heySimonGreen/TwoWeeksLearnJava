[toc]

检索词：

问题；控件；函数；启动项目



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

UpperBound():作用：得到数组的长度

Timer(integer n): n - 间隔秒速 n=0，表示不再触发timer事件。

String(Var,Format)：Var可以使Date、Time、DateTime。Format是格式串，比如‘yyyy.mm.dd’、'hh:mm ss'、'yy年mm月dd日'

tab_1.selectedtab(inde) : 切换到指定的tabPage页上

idle(n) 设置空闲若干秒后，触发idle事件。

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

问题：

= 等号 在制表符 中使用 制表出现问题，不对齐。不要在字符串拼接时使用空格

在字符串拼接的时候拼接等号时有问题，乘法表对齐没有对齐。拼接的时候最好不要用空格吧。‘=’ 不要' = '

```
 String(li_for1) + '=' + String(li_for1*li_for2)
```



3 ABCDE * A	= EEEEEE

##### 问题：数据库

###### 1 导入数据库失败

E:\oracle\product\10.2.0\db_1\network\ADMIN 杨老师发了一个文件，替换掉tnsnames.ora。还发了一个数据库工具

运行项目后 按s 查看数据库

pb12用管理员方式运行



下面的代码注释后可以进入系统。但数据为导入

```pascal
//IF f_gen_input_file(appinfo.sys_name, appinfo.input_cfg,ls_input) < 0 THEN
//   messagebox("提示", "更新输入法词库文件时出现了错误！")
//END IF
```

冒泡排序：

```
Integer li_array[]
Integer li_i
Integer li_j
Integer li_k
Integer li_temp
String ls_arrayToString
Boolean flag

li_array = {4,18,5,3,9,55,2,1,5,2,552,5,2}
//得到数组长度的函数uppperBound(li_array)

for li_i = 1 to upperBound(li_array)
//	MessageBox(String(li_i),String(li_array[li_i]))
	ls_arrayToString = ls_arrayToString + String(li_array[li_i])
	if li_i <> upperBound(li_array) then ls_arrayToString = ls_arrayToString + ','
Next

MessageBox('arrayIs',ls_arrayToString)

for li_i = 1 to upperBound(li_array) - 1
	flag = false		//一次排序没有改变，就是有序
	for li_j = 1 to upperBound(li_array) - li_i
		if li_array[li_j] > li_array[li_j + 1] then
			flag = true
			li_temp = li_array[li_j]
			li_array[li_j] = li_array[li_j + 1]
			li_array[li_j + 1] = li_temp
		end if
	Next
	//如果为true则没序
	if flag=false then
		MessageBox('tips','已经有序')
//		break
	end if
	
	//显示每趟的排序结果
	//新遇到的函数：upperBound()得到数组的长度
	ls_arrayToString = ''
	for li_k = 1 to upperBound(li_array)
		ls_arrayToString = ls_arrayToString + String(li_array[li_k])
		if li_k <> upperBound(li_array) then ls_arrayToString = ls_arrayToString + ','
	Next
	MessageBox('arrayIs',ls_arrayToString)
	
Next

//For li_i = 1 to 10
//		If li_i = 4 Then
//				Break
//		end if
//next
```

### 问题 :break

1 在判断最佳情况有序的情况的退出循环break的使用，报错Invalid statement,但百度的break都是那么写的

## 11月18日

### 任务：

1 常见名称解释 + 医疗业务

2 pb学习

循环控制 continue exit halt halt close return

![循环控制](I:\Symedsoft\研发部\循环控制.PNG)



#### 一 语言基础之定制时间

##### 1 系统事件：

对象上已经提供的所有事件

##### 2 缺省事件：

初次打开时的事件

##### 3 自定义事件：

有消息映射的。窗口中选择 new event。Event name 开头用ue_开头，表示user event用户自定义事件

eg:新建一个自定义事件。右键点击起来框内文本改变。

##### 4 自定制事件：

无消息映射的，通过PostEvent(稍后触发)或者TriggerEvent(立即触发)函数触发。

事务：

缺省的全局事务对象是SQLCA，pb所有和数据库打交道的操作都要通过事务对象来完成。

### 二、[oracle数据库 安装环境变量配置](https://jingyan.baidu.com/article/7f766daff0ca364100e1d042.html)

问题：

按照他的方法配置了后。环境变量配置后反而运行不了。删除掉环境变量

1 TNS_ADMIN

三、pb看到的一些公众号

阳仔聊编程、powerbuilder、



his数据库表结构。杨老师发。

```sql
//病人主索引
select * from pat_master_index
//挂号主记录
//挂号相关 clinic
select * from clinic_master
//门诊相关outp
结账相关 acct

住院主记录
pat_visit
在院病人信息表
select * from pats_in_hospital

住院相关 inp

医嘱相关 orders

病案相关 mr
```



### 关于游标：

可以使用SQL返回多条数据，并逐条处理。

使用步骤：

1. 声明游标

2. 打开游标

3. 读取第一条数据

4. ```pascal
   do while 循环
   	逐条处理数据
   	
   	读取下一条
   Loop	
   ```

5. 关闭游标

这里设计到数据库，使用Navicat1连接mysql。替换杨老师的文件后登录只能从他的问题件中选择登录。

E:\oracle\product\10.2.0\db_1\network\ADMIN  下的文件替换内容 替换回去连接本地数据库

```
# tnsnames.ora Network Configuration File: D:\app\yangxiang\product\11.2.0\client_1\network\admin\tnsnames.ora
# Generated by Oracle configuration tools.

ORACLR_CONNECTION_DATA =
  (DESCRIPTION =
    (ADDRESS_LIST =
      (ADDRESS = (PROTOCOL = IPC)(KEY = EXTPROC1521))
    )
    (CONNECT_DATA =
      (SID = CLRExtProc)
      (PRESENTATION = RO)
    )
  )

LISTENER_ORCL =
  (ADDRESS = (PROTOCOL = TCP)(HOST = 192.168.0.142)(PORT = 1521))
#潼南中医院外网测试库 数据库用户名密码 system managertn his用户名密码 admin a
TN =
  (DESCRIPTION =
    (ADDRESS_LIST =
      (ADDRESS = (PROTOCOL = TCP)(HOST = 47.108.86.168)(PORT = 1529))
    )
    (CONNECT_DATA =
      (service_name = tnzyy)
    )
  )
#梁平妇幼保健院外网测试库 数据库用户名密码 system manager his用户名密码 fyadmin a
LP =
  (DESCRIPTION =
    (ADDRESS_LIST =
      (ADDRESS = (PROTOCOL = TCP)(HOST = 47.108.86.168)(PORT = 1529))
    )
    (CONNECT_DATA =
      (service_name = fy)
    )
  )
#公卫中心公司内网测试库 数据库用户名密码 hisuser hisuser123456 his用户名密码 admin 1
GW =
  (DESCRIPTION =
    (ADDRESS_LIST =
      (ADDRESS = (PROTOCOL = TCP)(HOST = 192.168.1.213)(PORT = 1521))
    )
    (CONNECT_DATA =
      (service_name = ORCL)
    )
  )
#急救中心外网测试库
JJZX =
  (DESCRIPTION =
    (ADDRESS_LIST =
      (ADDRESS = (PROTOCOL = TCP)(HOST = 183.230.7.2)(PORT = 2000))
    )
    (CONNECT_DATA =
      (service_name = ORCL)
    )
  ) 
#西藏武警医院公司内网测试库 数据库用户名密码 system manager his用户名密码 wangw a
XZ =
  (DESCRIPTION =
    (ADDRESS_LIST =
      (ADDRESS = (PROTOCOL = TCP)(HOST = 192.168.1.205)(PORT = 1521))
    )
    (CONNECT_DATA =
      (service_name = ORCL)
    )
  )
#辽宁79医院公司内网测试库 数据库用户名密码 system manager his用户名密码 cy cy
LN =
  (DESCRIPTION =
    (ADDRESS_LIST =
      (ADDRESS = (PROTOCOL = TCP)(HOST = 192.168.1.200)(PORT = 1521))
    )
    (CONNECT_DATA =
      (service_name = LN)
    )
  )      
```

ORA-12545:因目标主机或对象不存在，连接失败

oracle 默认用户名密码 scott tiger

1. 用户名: internal 密码:oracle 

2. 用户名:system  密码:manager 

3. 用户名:sys      密码:change_on_install 

#### 问题：查看tn_self_service项目中的代码发现有使用org.springframework.util.Base64Utils，可能会有线程安全问题？

[org.springframework.util.Base64Utils线程安全问题](https://www.cnblogs.com/jiangzhengjun/p/10840742.html)

https://www.cnblogs.com/jiangzhengjun/p/10840742.html

```
具体由哪个类引起的并发，原因有待分析，可能与JDK版本、org.apache.commons.codec.binary.Base64、java.util.Base64都有关系，不管问题出在哪，在使用Base64Utils的地方，加上同步应该即可解决：
 synchronized (Base64Utils.class) {
            key = Base64Utils.decodeFromString(keyBase64);
}
 synchronized (Base64Utils.class) {
            rtnValue = Base64Utils.encodeToString(data);
}
或者不使用org.springframework.util.Base64Utils，而是直接使用apache提供的org.apache.commons.codec.binary.Base64（相应方法：Base64.decodeBase64(keyBase64)，Base64.encodeBase64String(data)），并发环境下目前发现没有问题，代码参见附件！！
 
由于synchronized 同步会引起性能问题，如果直接使用org.apache.commons.codec.binary.Base64
没有问题的话，还是采用这种方式吧
```

#### 问题：查看tn_self_service代码发现controller写法没见过。但能看懂为什么要这样写呢？和传统的写法有什么好处？

#### 问题：String code = params.get("functionId") + "";

#### swagger

http://localhost:8090/self/swagger-ui.html

[oracle卸载](https://blog.csdn.net/qq_42589612/article/details/80943957)

[卸载oracle](https://www.cnblogs.com/zqfdgzrc/p/10682202.html)

安装数据库的时候显示：产品特定的先决条件 操作系统要求错误  Oracle Database 10g 未在当前操作系统中经过认证。

要求的结果: 5.0,5.1,5.2,6.0 之一	实际结果: 6.2

ORA-01017:invalid username/password;logon denied

## 11月19日

### 任务：

1 pb学习。上午

2 培训资料医疗业务。上午

3 查看学习 tn_self_service 项目代码

### 问题

1 [电脑自启动项目的修改](https://www.cnblogs.com/clovershell/p/10109143.html)

Win+R 后输入： shell:startup

2 学习虽然每天早上做了任务，但具体任务事件分配没有分配好，想到哪个做哪个。需要将时间分配好

3 oracle数据的使用

pb连接数据库

```sql
String ls_name

SQLCA.DBMS = "O10 Oracle10g (10.1.0)"
SQLCA.LogPass = "chenwei1234"
SQLCA.ServerName = "ORCL"
SQLCA.LogId = "chenwe12i"
SQLCA.AutoCommit = False
SQLCA.DBParm = "PBCatalogOwner='chenwe12i'"
connect;


If SQLCA.SQLcode = 0 Then
	open(w_connectdatabase)
	MessageBox('sqlcode',string(sqlca.sqlcode) + "连接成功")
	else
		MessageBox('sqlcode',sqlca.sqlcode)
		MessageBox('提示','报错信息：' + sqlca.SQLErrText)
end if
```



```
orapwd file=E:\oracle\product\10.2.0\db_1\database\pwdorcl.ora password=chenwei1234 entries=10;
PWDorcl.ora
sys/chenwei1234 as sysdba
用户名：sys
口令：chenwei1234
数据库：ORCL
连接为：sysdba
```

创建用户chenwei、simon都报错 用户名与另外一个用户名或角色名发生冲突

![oracle报错：创建用户-角色冲突](I:\Symedsoft\研发部\oracle报错：创建用户-角色冲突.PNG)

[oracle数据库基本操作](https://www.cnblogs.com/fighter007/p/8269238.html)

```
create  user chenwe12i identified by chenwei;//创建用户

alter user chenwe12i identified by chenwei1234;//更改用户密码

grant connect ,resource,dba to chenwe12i;授权用户，不授权会报错 logon denied

加锁：  alter  user laolu account lock;
解锁：  alter  user laolu  account unlock;

drop user username //删除用户
```



[oracle数据库字段类型说明](https://www.cnblogs.com/kliine/p/10018607.html)

创建的表在哪儿查看：plsql developer 左边下面对象 tables的文件夹可以看到创建的数据库

```
insert into test('name','id') values('chenwei',1);
```

登录LP服务器数据库提示：12638 身份证明检索失败：

解决：开始 ——> Net Manager ——>

问题：

Please使用pb连接自己创建的数据库报错，但连接项目的LP数据库就没有错。

 connnect as the powerbuilder catalog owner.this is necessary for the initial connection to the oracle to grant privileges on the repository 

[解决](https://blog.csdn.net/cuizatu9720/article/details/100406412)



ORACLE ODBC driver configuration 提示 An unsupported operation was attempted

解决：这个困扰比较久，但关闭那个提示框过后就显示出连接数据库，就成功，很玄。。。不管这个报错自己就好了。

### pb连接数据库：

```pascal
String ls_name

// Profile oracle_chenwe12i
SQLCA.DBMS = "O10 Oracle10g (10.1.0)"
SQLCA.LogPass = "chenwei1234"
SQLCA.ServerName = "ORCL"
SQLCA.LogId = "chenwe12i"
SQLCA.AutoCommit = False
SQLCA.DBParm = "PBCatalogOwner='chenwe12i'"
connect;//这里一定要写，不然执行sql时报错


If SQLCA.SQLcode = 0 Then
	open(w_connectdatabase)
	MessageBox('sqlcode',string(sqlca.sqlcode) + "连接成功")
	else
		MessageBox('sqlcode',sqlca.sqlcode)
		MessageBox('提示','报错信息：' + sqlca.SQLErrText)
end if
```

在pb中使用sql查询数据，一次最多只能一条。

```pascal
String ls_name

select name into :ls_name from test where id = 110;//一定要记得加分号，很容易忘
MessageBox(String(sqlca.sqlcode),ls_name)
//sqlca.code 0 表示成功，100表示没有找到数据，-1表示执行失败，返回数据时多条
```

### 关于游标：续昨天

```pascal
String ls_name;

//声明游标
Declare Cursor_Name Cursor for
	select name from test;
	
//打开游标
Open Cursor_Name;
//读取第一条数据
Fetch Cursor_Name into :ls_name;

Do while sqlca.sqlcode = 0
	MessageBox('提示',ls_name)
	Fetch Cursor_Name into :ls_name;
Loop

//关闭游标
Close Cursor_Name;

```

### 查看所有打开的窗口：

window 界面最下面可以看到所有打开的界面

### 视频16

一个函数编写应有一下信息。

```
函数定义：String gf_add(Integer ai_add1, Integer ai_ai_add2)
函数作用：做加法运算
参数解释：ai_add1：被加数，ai_ai_add2：加数
返回值：String类型，两数相加后的和
调用举例：li_temp = gf_add(10,33)
编写日期：2021.11.19
编写人：陈伟
改动情况：改动日期、改动人、改动原因、改动描述
```

### 编写函数之前：

什么功能需要函数来实现。

接口规划：返回值、哪些参数、参数类型、函数名称

文档书写：函数前面的位置。

代码编写：异常判断、变量初值、正常编程

调用函数



### 新建函数：

new ——>PB Object ——> Function

函数命名gf_函数名称。 eg: gf_code

参数名称名称：a+参数类型_参数名称。eg:as_content

Pass By：传递类型。可以选择值传递还是地址传值。value:传过去的是复制一份的值，修改后不会影响原程序的值。不会影响调用的那一方。

reference:地址传递，修改过后，原位置的数据也会被修改。会影响调用的那一方。readonly：只能读，不能进行修改操作

```
String as_contect	//输入的文本框
String ls_temp	// 每个位置的数据
String ls_encodeText	// 接收加密后的数据
String ls_seed	//种子，加密解密的秘钥
Integer li_index		//记录循环的次数，每次的数据放在temp中，加密后在放入ls_encodeText

if as_content = '' then return ''

as_contect = sle_1.text	//接收输入的数据
//判断接收的数据是否为空
if as_contect = '' then
	MessageBox('提示','输入内容为空')
	return
end if
//将ls_seed的长度填充到和输入字符的长度一样，方便操作
ls_seed = '4242424124243464575688'
ls_seed = Fill(ls_seed,Len(as_contect))


//循环将ls_content的内容的asc码和ls_seed对应位置的数据相加，得到的数字转换为字符。实现加密
for li_index = 1 to Len(as_contect)
	ls_temp = Mid(as_contect,li_index,1)
	ls_temp = Char(Asc(ls_temp) + Integer(Mid(ls_seed,li_index,1)))
	ls_encodeText = ls_encodeText + ls_temp 
next	
return ''
	
```

编写函数的时候报错，保存后一直响，但就是看不到哪里错，因为第一次使用编辑函数，所以报错信息在这个框的最下面，没有显示出来，需要自己拉一下，找了好几分钟。。。

### [常用函数,这里面很全。](http://blog.sina.com.cn/s/blog_4b0a468401012kqg.html)

## 11月20日

### window对象公用属性，后不再赘述

可视对象的公用属性

visible:是否可见，设置为false则不可见

enabled:是否可用，设置为false则变为灰色

X：控件左上角在横向的位置

Y：控件右上角在横向的位置

weight:控件宽度

height:控件高度

### window对象常用属性(结合窗口外观)

如果需要查看所有的window属性，查看帮助文档f1，输入window conrtrol。即可看到它的所有properties属性。

Title:窗口的标题文字

MenuName:窗口顶部菜单，MDI必需的

WindowType:窗口的类型

WindowState:窗口打开时的初始状态

ControlMenu:是否有控制菜单

MaxBox：是否有右上角的最大化

MinBox：是否有右上角的最小化

TitleBar：窗口的标题栏

窗口类型：

Main:整个应用中一般只有一个，主窗口

child：不可独立存在的，显示范围限于主窗口

popup：与response不同之处是可以去操作其他的窗口

response：再产生一个窗口，并打开这个窗口，不能再操作上一个窗口，需要操作必须关闭这个response窗口。资源独占式

MDI

MDI with help

自定义事件命名：ue__+描述词  u-->user e-->event

窗口空白处右键，进入编写程序。再new event。不希望鼠标右键触发，而是一开始就触发那些比较耗时的事。最下面--映射消息不选任何消息，也就是选择none。也就是event id选择none。

再在Open事件写触发事件。我们在创建一个空白窗口或者按钮等事件上右键编程script时，默认时在open事件上编程的。触发函数使用This.postevent（事件名）

事件名需要引号

This.postevent('ue_postopen')

```
MessageBox('heihei','xian')
//This.postevent('ue_postopen')
This.triggerevent( 'ue_postopen')
这两种触发方式不同之处在于是先打开窗口还是先执行事件triggerevent（先执行事件）postevent（先打开窗口，似乎是同时的。）
```

没有映射任何消息 ----> 也就是不会被任何动作触发，只能由函数出发它 ----> 只能使用postevent触发

### window事件常用事件1

#### Open事件

触发时机：窗口打开时触发，界面尚未显示出来。

常用编程：初始化工作。

忌用编程：耗时的程序不要在此编写。

思考：如何在窗口刚打开的时候编写耗时的程序？（见上面，使用自定义事件）

#### 自定义事件：

解决Open事件中不能编写耗时程序。

触发的事件：PostEvent()和TriggerEvent()

#### Close()事件

触发时机：窗口关闭时触发，界面已经小时。所以在这个事件中一般不编写对界面操作的代码。

常用编程：释放对象型变量，保存工作环境。

关闭按钮就是关闭窗口，其他事情一概不做。在close事件中常用来释放一些系统对象类型的变量，保存工作环境。

#### CloseQuery事件

触发时机：窗口关闭之前触发。

常用编程：关闭确认。

忌用编程：耗时的程序不要在此编写。

返回值：0-运行关闭，1-不允许关闭。

#### Resize

触发时机：窗口大小改变时。

常用编程：动态调整窗口中控件的布局。

事件参数：NewWidth、NewHeight

编程要点：坐标起点，主控件，逐个参照编写。

补充：能够适应不同分辨率的整体解决方案。

#### timer

触发时机：每隔指定的秒数后自动触发。

Timer函数：设定时间间隔

常用编程：处理周期性事件

编程注意点:执行用时不能接近间隔时间，更不能大于间隔时间。

![window对象-上机1](I:\Symedsoft\研发部\window对象-上机1.PNG)

视频18

## 11月22日，以及23日

### 培训

分诊---

复杂病-做相应检查--再回到医生站诊断

问题1 异常处理、接口信息方式？

病人ID号：病人ID号”是《三医医院信息》系统中病人信息线的源头

**住院号**：下次住院还是上次上次的住院号

发票号，收据号：发票号可能重复，但不会

帐、账

医嘱：是病人费用产生的源头。**医嘱**分**长期医嘱**和**临时医嘱**

长期医嘱：比如一级护理，病情比较严重

临时医嘱：换药

总结：

![image-20211124105348520](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211124105348520.png)

![image-20211124105414325](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211124105414325.png)

![image-20211124105423502](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211124105423502.png)

### 视频17

### window对象-上机1

#### resize事件

适应多窗口分辨率问题，不同电脑屏幕都可以使用。

在窗口上编程，选择resize事件，编写各个控件大小。

```pascal
//设置mle_1的x,y坐标
mle_1.X = 2
mle_1.Y = 2

//设置mle_1的长和宽,这里设置宽度的时候直接复制搞错了，NewHeight
mle_1.width = NewWidth - 2*mle_1.X
mle_1.height = NewHeight - mle_1.Y - cb_1.height - 20

//设置cb_1的x,y坐标
cb_1.X = mle_1.X + mle_1.width - cb_1.width
cb_1.Y = mle_1.Y + mle_1.height + 2

//设置cb_2的x,y坐标
cb_2.X = cb_1.X - cb_2.width - 20
cb_2.Y = cb_1.Y
```

#### closequery事件

新建窗口w_closequery，放上关闭按钮，在关闭按钮上的写Close函数，关闭此窗口w_closequery,再在w_closequery窗口上编程,选择closequery事件。

```pascal
//询问Question，YESNO
//缺省的设置为NO，也就是第二个选项，也就是2
//1-不关闭，2-关闭，这里返回0，就是关闭；返回1，就是不关闭，返回后closequery执行是否关闭
if MessageBox('提示','是否真的要关闭吗？',Question!,YesNo!,2) = 1 Then
	return 0
else
	return 1
end if
```

此时点击按钮后，会提示是否关闭窗口。相当于在关闭窗口前执行的操作。关闭窗口前的closequery事件会返回0或者1，返回0，就是关闭；返回1，就是不关闭。

#### timer事件

制作一个在走动的时钟。

新建一个窗口w_timer

首先在w_timer窗口open事件上编程，设置事件间隔

```pascal
//这里是为了更人性化，不然进来后出现none给人体验不好
st_1.text = String(today(),'yyyy.mm.dd') + ' ' + String(Now(),'hh:mm ss')
Timer(1)
```

再在w_timer窗口timer事件上编程

```pascal
//这里的timer事件，相当于每隔Timer秒，执行一次这里的代码。
st_1.text = String(today(),'yyyy.mm.dd') + ' ' + String(Now(),'hh:mm ss')
```

设置多个Timer(4),后面设置的会把前面设置的冲掉，比如

```pascal
st_1.text = String(today(),'yyyy.mm.dd') + ' ' + String(Now(),'hh:mm ss')
Timer(1)
Timer(2)//这里时间间隔就是2了，不再是1
```

窗口实例变量的复习。

在一个窗口中有多个不同的周期性事件要做的话，如何做？最小公约数设置运行时间

程序A每隔两秒执行，程序B每隔三秒执行。那么第6秒的时候这两个事就一起执行了。

##### 最小公约数设置运行时间



运行pb项目报错：

SiInterface ORA-12541:TNS:无监听程序

解决：开始：找到 打开Net Configuration Assistant

用于医保业务处理专用数据库事务初始化失败，请重新登录!ORA-01017 invalid username/password;logon denied

![门诊挂号收费子系统报错](I:\Symedsoft\研发部\门诊挂号收费子系统报错.PNG)



timer事件

```pascal
//这里的timer事件，相当于每隔Timer秒，执行一次这里的代码。
st_1.text = String(today(),'yyyy.mm.dd') + ' ' + String(Now(),'hh:mm ss')


ii_count = ii_count + 1
if Mod(ii_count,ii_jiange1) =0 Then
	st_2.text = String(Now(),'hh:mm ss')
elseif Mod(ii_count,ii_jiange2) = 0 Then
	st_3.text = String(Now(),'hh:mm ss')
end if

if (Mod(ii_count,ii_jiange1) = 0) and (Mod(ii_count,ii_jiange2) = 0) then
	MessageBox('清零',ii_count)
end if
```



杨老师临时安排的任务

做数据窗口(注意选择数据类型，)

步骤：

1 新建-->datawindow -->grid 再选择SQL Select (弹出的select tables叉掉)

2 菜单栏选择 Design 的 Conver to SynTax,输入对应的sql语句。例如。这里不用吧保存

```sql
select * from GOODS_SALES_IN where (id=:id or id is null)
```

3 再在菜单栏选择Design 的 Retrieval Arguments 

![杨-任务1](I:\Symedsoft\研发部\杨-任务1.png)

```sql

3 select * from GOODS_BUY_IN where (id=:id or id is null)

4 select * from GOODS_PURC_BACK_IN where (id=:id or id is null)

5 select * from GOODS_SALES_IN where (id=:id or id is null)
6 select * from GOODS_SALES_BACK_IN where (id=:id or id is null)
```

4 return

8.3.5.6.4 输入 对应的就是3506

问题：

1 在创建数据窗口时命名d_名称开头，但是不小心名字命名错了的话是不能重命名的。

这时需要在菜单栏选择File，另存为，这时就可以修改文件名了。

2 修改文件名的时候也会遇到菜单栏File没有另存为的问题。那是因为需要先把需要重命名的文件打开，然后才能重命名。

3 在数据窗口中数据类型选择错了，或者忘记选了，怎么弄？删掉了重新弄？

解决：在菜单栏选择Design，选择Retrieval Arguments就可以修改了

任务总结：

耗时比较多且重复性比较大的是复制粘贴相应字段，但当把数据窗口导入后，打开源代码发现，其实就是修改text="后面的内容，到另一个"结束，替换掉就可以了，但是有几个问题需要解决就好做了。

从pdf中读取相应的字段，没有做过，把这一行中的数据存入数据库，然后根据数据库来查询即可。比如pdf中字段med_list_codg 对应的中文为“医疗目录编码”，数据窗口中是“Med List Codg”。将pdf中的数据存入数据，查询的时候，将大小换成小写，将数据窗口中的空格换成下划线，查询即可。再在程序中替换即可。

注意：当在pdf中有换行的时候读取的内容是有误的，这时需要分类考虑

解决：

方法1：从根本上解决，读取的时候就不要让读的table乱

方法2：分析已经乱掉的txt，是有规律的。换行的位置上下一加就可以了，但要考虑好几种情况。

[怎么用java读取pdf中的表格_已解决_博问_博客园 (cnblogs.com)](https://q.cnblogs.com/q/90259/)

[IText使用（超详解） - sudt - 博客园 (cnblogs.com)](https://www.cnblogs.com/fonks/p/15090635.html)

文件写入是file、bufferwritter异常处理，使用try-catch

### window对象-上机2

#### 1 窗口之间信息的传递，目的是：

* 掌握窗口之间传递信息的编程
* 加深Response窗口‘资源独占’的理解

**OpenWithParm**:打开的时候传递信息

**OpenWithParm**(win,信息) 只掌握传string。message.StringParm

**CloseWithReturn**:关闭的时候传递信息

**CloseWithReturn**(win,信息)

**Message**:全局的消息对象

例子：新建一个窗口，在窗口中添加文本输入框，点击按钮后，将文本输入框内的内容传递给另外一个窗口。

优化处：调整各个框的大小。

步骤

1 新建窗口w_sendmsg,插入多行文本输入框和按钮，

2 新建窗口w_getmsg,插入多行文本输入框和按钮，

3 在w_getmsg的窗口上编程，接收传递过来的信息,程序如下：

```pascal
String ls_parm
ls_parm = Message.Stringparm
mle_1.text = ls_parm
```

4 在w_sendmsg窗口的按钮控件上的click事件上编程，发送信息。

```
OpenWithParm(w_getmsg,mle_1.text)
```

例子：在上面完成的情况下，再加功能。关闭时返回信息。在关闭w_getmsg窗口时，将w_getmsg窗口上的信息返回，给到w_sendmsg窗口。

这里需要注意：关闭并返回数据时，接收的窗口类型需要时response类型，不然接收不到消息。

步骤

1 在w_getmsg窗口的按钮控件上的click函数上编程，

```pascal
CloseWithReturn(parent,mle_1.text)
```

2 在接收窗w_sendmsg窗口按钮控件上的clicked函数上编程 注意顺序

```pascal
String ls_rtn		//声明变量

//下面代码是资源独占式的，当执行到下面的代码时，会打开w_getmsg窗口，当w_getmsg窗口关闭后才会执行后面的程序
OpenWithParm(w_getmsg,mle_1.text)	//打开w_getmsg窗口，发送数据mle.text

//这里顺序不能错，否则运行会错，因为如果先执行下面的代码是先接收全局的消息对象的消息，而时并没有数据传过来。

ls_rtn = Message.Stringparm		//接收数据，这里接收的是全局的消息对象
mle_1.text = ls_rtn		//将读取到的信息给到mle_1.text
```

3 

#### 2 Open事件的理解，目的是：

* 加深对Open事件的理解，掌握自定义事件
* 进一步练习窗口之间传递信息

这个事件的触发时机是在窗口打开的时候，界面还没有显示出来，这时候触发这个事件



![window对象-上机2](I:\Symedsoft\研发部\window对象-上机2.PNG)

tips：如果函数有问题，右击函数，选择Regenerate，就可以了

EditMask 控件：可以设置类型，数字类型，自动递增。

editMask设置TabPage（标签页标号），修改为123456，这里要点击到下面的内容部分才可以修改，点击头部是修改另外的内容。我找了好几分钟才修改成功。

tab 控件 ：右键none可以insertTabPage.各个标签页，可以编号，一共六个tab页，这里设置各个页面分别为123456.再设置EditMask控件的最大值为6

任务：根据editMask选择的值，来自动切换tab页。



创建w_open窗口，放上editMask控件，设置spIn打钩，设置Mask为数字，自增increment为1。

创建另外一个窗口，放上tab 控件，增加到6个tab页，并修改标签页为数字12345

在w_open窗口的按钮上编程，将选择的数字传递给窗口w_selecttab

```pascal
OpenWithParm(w_selecttab,em_1.text)
```



在w_select窗口上的Open事件上编程，打开窗口前的数据传递

```pascal
//切换到指定编号
String ls_parm

ls_parm = Message.stringparm
//异常判断，如果不是数字，就不操作
if IsNumber(ls_parm) then
	tab_1.selecttab(Integer(ls_parm))
end if
```

运行结果

![w_open](I:\Symedsoft\研发部\w_open.PNG)



![w_selecttab](I:\Symedsoft\研发部\w_selecttab.PNG)

奇怪了，视频说这里不会正常切换，就是用这个错误例子说明open事件界面不显示的解决方法，，，，

解决方法是在open事件结束之后来做这个工作，这样的话就需要我们再定义一个事件，然后再在Open事件中调用这个事件This.postEvent('ue_open').

在w_open窗口新建事件ue_open,编写接收值得代码

```pascal
//切换到指定编号
String ls_parm

ls_parm = Message.stringparm
//异常判断，如果不是数字，就不操作
if IsNumber(ls_parm) then
	tab_1.selecttab(Integer(ls_parm))
end if
```

再在w_open窗口的open事件上调用刚才写的事件This.postEvent('ue_open').

对于open事件，界面没有显示的问题的解决方法：如下：

this.postEvent() 这个函数ue_open()执行的时候，open事件已经执行完毕，窗口已经打开了，这个时候再去做界面的操作，也就没有关系了。

#### 3 制作有屏幕保护功能的程序，目的是：

* 进一步加深Response窗口‘资源独占’的理解
* 掌握Application对象Idle事件

这里指的屏幕保护是指保护正在运行的程序，不输入口令不给操作员操作这个程序。有response类型的窗口，不能切换到其他类型类型的窗口，从而起到屏幕保护的作用。

idle(n) 设置空闲若干秒后，触发idle事件。





```
java -jar tabula-1.0.2.jar E:\tmp\input\input1.pdf -o E:\tmp\output\output1.csv
java -jar tabula-1.0.2.jar E:\googleDownloadFile\scanpdf\src\main\resources\pdf\cqyl.pdf -o E:\googleDownloadFile\scanpdf\src\main\resources\txtfile\test.txt

java -jar tabula.jar E:\googleDownloadFile\scanpdf\src\main\resources\pdf\cqyl.pdf -o E:\googleDownloadFile\scanpdf\src\main\resources\txtfile\test.txt

java -jar tabula.jar -b E:\googleDownloadFile\scanpdf\src\main\resources\pdf\cqyl.pdf -o E:\googleDownloadFile\scanpdf\src\main\resources\txtfile\test.csv

java -jar tabula.jar E:\googleDownloadFile\scanpdf\src\main\resources\pdf\cqyl.pdf --out=E:\googleDownloadFile\scanpdf\src\main\resources\txtfile\test.csv

file:///C:/Users/11839/Documents/WeChat%20Files/wxid_s5qvsedoexro32/FileStorage/File/2021-11/%E9%87%8D%E5%BA%86%E5%B8%82%E5%8C%BB%E7%96%97%E4%BF%9D%E9%9A%9C%E4%BF%A1%E6%81%AF%E5%B9%B3%E5%8F%B0%E5%AE%9A%E7%82%B9%E5%8C%BB%E8%8D%AF%E6%9C%BA%E6%9E%84%E6%8E%A5%E5%8F%A3%E8%A7%84%E8%8C%83(V1.09).pdf
```





```sql
select * from test where (id=:id or id is null)
```







## 11月24日

### 任务：

上午培训，数据窗口技术

下午练习数据窗口技术，杨老师和朱老师给了我一个任务。项目代码有问题，需要取修改。

[pb实现增删改查_widenstage的专栏-CSDN博客_pb增删改查](https://blog.csdn.net/widenstage/article/details/70495490)

M0001736

周成兰

挂号维护

* 门诊号表生产

![image-20211124161849825](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211124161849825.png)

问题：

菜单栏 str_interface_regist  lstr_regist

解决：pb object ->新建 structure

![image-20211124163426130](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211124163426130.png)

菜单栏

```pascal
str_interface_regist  lstr_regist

lstr_regist.as_pid =''
lstr_regist.as_doctor= g_db_user
lstr_regist.as_Insurance_type = ""
lstr_regist.as_Insurance_no = ""
lstr_regist.as_Card_type ='现金' 
lstr_regist.as_Card_no = ""
openwithparm(w_registpub_writer,lstr_regist)
```



打开 w_registpub_writer 窗口，初始化数据，

```
istr_face = message.powerobjectparm

//初始化数据
wf_init()
```



```pascal
/* ================================================================= *\
	函数： wf_init()
	描述： 根据传入参数初始化数据
\* ================================================================= */

string	ls_pid
string	ls_name,ls_sex,ls_charge_type,ls_identity,ls_age,ls_unit_in_contract
datetime	ldt_birthday
integer	li_pos
string	ls_db_user
long		ll_age


//病人信息提取
ls_pid = istr_face.as_pid
if (ls_pid = "" or isnull(ls_pid)) then
	//
else
	dw_1.setitem(1,"patient_id",ls_pid)
	select name, sex, charge_type, identity, DATE_OF_BIRTH ,UNIT_IN_CONTRACT
		into :ls_name, :ls_sex, :ls_charge_type, :ls_identity, :ldt_birthday, :ls_unit_in_contract
		from pat_master_index where  patient_id = :ls_pid ;
	
	if sqlca.sqlcode=0 then
		//检索到病人信息后，给数据窗赋值
		dw_1.setitem(1, "name", ls_name)
		dw_1.setitem(1, "sex",  ls_sex)
		dw_1.setitem(1, "charge_type", ls_charge_type)
		dw_1.setitem(1, "identity",    ls_identity)
		dw_1.setitem(1, "UNIT_IN_CONTRACT", ls_unit_in_contract)
		ls_age = f_age(date(ldt_birthday))
		li_pos = posa(ls_age,"岁")
		ll_age=long(lefta(ls_age, li_pos -1))
		if isnull(ll_age) then ll_age=0
		dw_1.setitem(1, "age", ll_age)
	end if
end if

dw_1.setitem(1, "insurance_type", istr_face.as_insurance_type)
dw_1.setitem(1, "insurance_no",   istr_face.as_insurance_no)
dw_1.setitem(1, "card_name",      istr_face.as_card_type)
dw_1.setitem(1, "card_no",        istr_face.as_card_no)


datetime ldt_today_time
date     ldt_today
select sysdate into :ldt_today_time from dual;
ldt_today = date(ldt_today_time)
ldt_today_time = datetime(ldt_today,time(ldt_today_time))
dw_1.setitem(1, "REGISTERING_DATE", ldt_today_time)
//默认初诊
dw_1.setitem(1, "first_visit_indicator", 1)

//医生
long		ll_week
datawindowchild	ldwc_doctor, ldwc_label

ls_db_user = istr_face.as_doctor
select  to_char(sysdate - 1,'d') into :ll_week from dual; 


dw_1.getchild("clinic_label",ldwc_doctor)
ldwc_doctor.settransobject(sqlca)
ldwc_doctor.retrieve(ls_db_user,ll_week)

dw_1.getchild("doctor", ldwc_label)
ldwc_label.settransobject(sqlca)
ldwc_doctor.sharedata(ldwc_label)
//ldwc_label.retrieve(ls_db_user,ll_week)

if ldwc_doctor.rowcount()>0 then
	dw_1.setitem(1,"doctor", ldwc_doctor.getitemstring(1,"doctor_no"))
end if

```



dw_1 的itemchanged函数

```pascal
datawindowchild ldwc
string ls_time_desc
string ls_clinic_label
string ls_clinic_type
string ls_clinic_dept
long ll_row
choose case dwo.name
	case "clinic_label"
		this.getchild("clinic_label",ldwc)
		ll_row = ldwc.getrow()
		if ll_row>0 then
			ls_time_desc = ldwc.getitemstring(ll_row,"clinic_duration")
			ls_clinic_dept=ldwc.getitemstring(ll_row,"clinic_dept")
			ls_clinic_label=data
			select clinic_type into :ls_clinic_type from clinic_index where clinic_label=:ls_clinic_label;
			this.setitem(row,"visit_time_desc",ls_time_desc)
			this.setitem(row,"clinic_type",ls_clinic_type)
			this.setitem(row,"visit_dept",ls_clinic_dept)
		end if
	case "patient_id"
		string ls_patient_id,ls_name,ls_sex,ls_id_no,ls_charge_type,ls_identity
		date ld_date_of_birth,ld_now
		int li_age
		select a.patient_id,a.name,a.sex,a.date_of_birth,a.id_no,a.charge_type,a.identity 
		into :ls_patient_id,:ls_name,:ls_sex,:ld_date_of_birth,:ls_id_no,:ls_charge_type,:ls_identity
		from pat_master_index a where a.patient_id=:data;
		if sqlca.sqlcode<>0 then
			messagebox('提示','该id对应的病人不存在')
			return
		end if
		select sysdate into :ld_now from dual;
		li_age=year(ld_now) - year(ld_date_of_birth)
		dw_1.setItem(1,'name',ls_name)
		dw_1.setItem(1,'sex',ls_sex)
		dw_1.setItem(1,'age',li_age)
		dw_1.setItem(1,'charge_type',ls_charge_type)
		dw_1.setItem(1,'identity',ls_identity)
		dw_1.setItem(1,'first_visit_indicator',0)
	case "name"
		dw_2.setTransObject(sqlca)
		dw_2.retrieve(data)
		if dw_2.rowcount( )>0 then
			dw_2.visible=true
		else 
//			messagebox('提示','该病人未录入过基本信息，请先录入')
		end if
end choose

```

#### 问题

##### 1 下面的代码是子数据窗口写的sql，这个sql有问题，不能完全显示当天可挂号医生

```
SELECT  "CLINIC_FOR_REGIST"."CLINIC_LABEL" ,           "CLINIC_FOR_REGIST"."TIME_DESC" ,           "CLINIC_INDEX"."CLINIC_TYPE" 
,           "DOCTOR_GROUP"."DOCTOR" ,           "DEPT_DICT"."DEPT_NAME"     FROM "CLINIC_FOR_REGIST" ,           "CLINIC_INDEX" 
,           "DEPT_DICT" ,           "DOCTOR_GROUP"     WHERE ( "CLINIC_FOR_REGIST"."CLINIC_LABEL" = 
"CLINIC_INDEX"."CLINIC_LABEL" ) and          ( "CLINIC_INDEX"."CLINIC_DEPT" = "DEPT_DICT"."DEPT_CODE" ) and          ( 
"CLINIC_INDEX"."DOCTOR" = "DOCTOR_GROUP"."DOCTOR_USER" ) and          ( "CLINIC_FOR_REGIST"."CLINIC_DATE" = to_date((select 
to_char(sysdate,'yyyy-MM-dd') from dual),'yyyy-mm-dd' ))
```

![image-20211130160204126](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211130160204126.png)

完整能查询到的sql，完整的

```
SELECT "CLINIC_FOR_REGIST"."CLINIC_LABEL", "CLINIC_FOR_REGIST"."TIME_DESC", "CLINIC_FOR_REGIST"."REGISTRATION_LIMITS", 
"CLINIC_FOR_REGIST"."APPOINTMENT_LIMITS", "CLINIC_FOR_REGIST"."REGIST_PRICE", 0, "CLINIC_INDEX"."CLINIC_DEPT", 
"CLINIC_INDEX"."DOCTOR", "CLINIC_INDEX"."DOCTOR_TITLE", "CLINIC_INDEX"."CLINIC_TYPE", "CLINIC_FOR_REGIST"."CURRENT_NO", '号', 
'', 0, "CLINIC_INDEX"."INPUT_CODE", "DEPT_DICT"."POSITION", "CLINIC_INDEX"."CLINIC_POSITION", 0 as aa, 
"CLINIC_INDEX"."CLINIC_INDEX" FROM "CLINIC_FOR_REGIST", "CLINIC_INDEX", "DEPT_DICT" WHERE ( "CLINIC_FOR_REGIST"."CLINIC_LABEL" 
= "CLINIC_INDEX"."CLINIC_LABEL" ) and ( "CLINIC_INDEX"."CLINIC_DEPT" = "DEPT_DICT"."DEPT_CODE" ) and ( 
"CLINIC_FOR_REGIST"."CLINIC_DATE" = to_date((select to_char(sysdate,'yyyy-MM-dd') from dual),'yyyy-mm-dd' ))
```

![image-20211130160331678](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211130160331678.png)

经过修改后的sql,但还需要去程序里面修改子数据窗口，和一些相关的程序。

```
  SELECT  "CLINIC_FOR_REGIST"."CLINIC_LABEL" ,
"CLINIC_FOR_REGIST"."TIME_DESC" ,
"CLINIC_INDEX"."CLINIC_TYPE",
"DEPT_DICT"."DEPT_NAME",
"CLINIC_INDEX"."DOCTOR"
FROM "CLINIC_FOR_REGIST",
"CLINIC_INDEX" ,
"DEPT_DICT"
 WHERE ( "CLINIC_FOR_REGIST"."CLINIC_LABEL" ="CLINIC_INDEX"."CLINIC_LABEL" ) and
 ( "CLINIC_INDEX"."CLINIC_DEPT" = "DEPT_DICT"."DEPT_CODE" ) and 
 ("CLINIC_FOR_REGIST"."CLINIC_DATE" = to_date((select to_char(sysdate,'yyyy-MM-dd') from dual),'yyyy-mm-dd' )) 
```

##### 2 前些天都以为自己做好了，朱老师也比较忙也一直没有检查，但自己发现了一个问题，就是门诊时间问题。上午、下午、白天、昼夜、夜间。

这里需要子数据窗口数据过滤，这个是最好的方法

一个病人如果在上午挂号，那么上午、下午、白天、昼夜都可以挂

一个病人如果在下午挂号，那么不能挂上午的号

一个病人如果在夜间挂号，那么只能挂夜间的号

下面的截图是在12月1日上午截的

###### pb对时间的操作

```
		date ld_date_of_birth,ld_now
		select sysdate into :ld_now from dual;
		li_age=year(ld_now) - year(ld_date_of_birth)
```



```
datetime ld_now

string ls_test
string ls_now_datetime
string ls_am_pm_night
integer li_am_pm_night

select sysdate into :ld_now from dual;

ls_now_datetime = string(ld_now,'yyyy-mm-dd hh:mm:ss')

//SecondsAfter(05:00:00,ld_now)
//sle_1.text = String(ld_now)

sle_1.text = string(ld_now,ls_now_datetime)

ls_test = mid(ls_now_datetime,12,2)

MessageBox('tis',ls_test)
sle_2.text = ls_test

li_am_pm_night = integer(ls_test)
//if li_am_pm_night > 4 and li_am_pm_night <13 then
//	ls_am_pm_night = "上午"
//else
//	ls_am_pm_night='默认'
//end if
li_am_pm_night = 19

if li_am_pm_night > 4 and li_am_pm_night <13 then
	ls_am_pm_night = "上午"
elseif li_am_pm_night>13 and li_am_pm_night<18 then
	ls_am_pm_night = "下午"
elseif li_am_pm_night>18 and li_am_pm_night<24 then
	ls_am_pm_night="夜间"
end if
sle_3.text = ls_am_pm_night
```



![image-20211201093551946](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211201093551946.png)

##### 3 上次朱老师插入的数据有问题，没有诊查费为副高号的诊查费，不知道为什么有些是诊查费，有些又是诊疗费

![image-20211201173222442](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211201173222442.png)

```
//取得诊察费对应的价表项目，这时唐乙写的。
select price_item into :ls_priceitem_regist
	from   clinic_type_setting
	where  charge_item='诊察费' and clinic_type = :as_clinic_type;
if sqlca.sqlcode = 100 then
	messagebox("提示","诊察费未在价表中定义!")
	return -1
end if
```



##### 4 oracle字符世间转换为世间格式



#### 门诊医生值班安排表 OUTP_DOCTOR_SCHEDULE

![image-20211125134801666](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125134801666.png)

```
SELECT  "OUTP_DOCTOR_SCHEDULE"."CLINIC_DEPT"          "OUTP_DOCTOR_SCHEDULE"."DOCTOR" ,           
"OUTP_DOCTOR_SCHEDULE"."DAY_OF_WEEK" ,           "OUTP_DOCTOR_SCHEDULE"."CLINIC_DURATION" ,           
"OUTP_DOCTOR_SCHEDULE"."QUEUE_NAME" ,           "OUTP_DOCTOR_SCHEDULE"."COUNSEL_NO" ,           
"OUTP_DOCTOR_SCHEDULE"."DOCTOR_NO" ,           "OUTP_DOCTOR_SCHEDULE"."AUTO_ASSIGN_PATIENT"     FROM "OUTP_DOCTOR_SCHEDULE"     
 WHERE ( "OUTP_DOCTOR_SCHEDULE"."DOCTOR_NO" = FYADMIN ) and          ( "OUTP_DOCTOR_SCHEDULE"."DAY_OF_WEEK" = 3 )
:as_doctor = 'FYADMIN'
:day_week = 3
```

去掉数据库用户名数据库

```
SELECT  "OUTP_DOCTOR_SCHEDULE"."CLINIC_DEPT"          "OUTP_DOCTOR_SCHEDULE"."DOCTOR" ,           
"OUTP_DOCTOR_SCHEDULE"."DAY_OF_WEEK" ,           "OUTP_DOCTOR_SCHEDULE"."CLINIC_DURATION" ,           
"OUTP_DOCTOR_SCHEDULE"."QUEUE_NAME" ,           "OUTP_DOCTOR_SCHEDULE"."COUNSEL_NO" ,           
"OUTP_DOCTOR_SCHEDULE"."DOCTOR_NO" ,           "OUTP_DOCTOR_SCHEDULE"."AUTO_ASSIGN_PATIENT"     FROM "OUTP_DOCTOR_SCHEDULE"     
 WHERE( "OUTP_DOCTOR_SCHEDULE"."DAY_OF_WEEK" = 3 )
:as_doctor = 'FYADMIN'
:day_week = 3
```



提炼后的1：掉变量 + 去掉空格

```
SELECT  "OUTP_DOCTOR_SCHEDULE"."CLINIC_DEPT","OUTP_DOCTOR_SCHEDULE"."DOCTOR",           
"OUTP_DOCTOR_SCHEDULE"."DAY_OF_WEEK" , "OUTP_DOCTOR_SCHEDULE"."CLINIC_DURATION" ,           
"OUTP_DOCTOR_SCHEDULE"."QUEUE_NAME" ,"OUTP_DOCTOR_SCHEDULE"."COUNSEL_NO" , "OUTP_DOCTOR_SCHEDULE"."DOCTOR_NO" ,"OUTP_DOCTOR_SCHEDULE"."AUTO_ASSIGN_PATIENT" FROM "OUTP_DOCTOR_SCHEDULE" WHERE ("OUTP_DOCTOR_SCHEDULE"."DOCTOR_NO" = 'FYADMIN' ) and ( "OUTP_DOCTOR_SCHEDULE"."DAY_OF_WEEK" = 4 )
```



"CLINIC_FOR_REGIST

clinic_for_regist







select * from GOODS_SALES_IN where (id=:id or id is null)





![image-20211124233930418](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211124233930418.png)



![image-20211124234543396](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211124234543396.png)

创建数据窗口不能有;

![image-20211124235648041](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211124235648041.png)

d_reg_dotcor_schedule

```
select * from CLINIC_FOR_REGIST WHERE ( "CLINIC_FOR_REGIST"."CLINIC_LABEL" 
= "CLINIC_INDEX"."CLINIC_LABEL" ) and ( "CLINIC_INDEX"."CLINIC_DEPT" = "DEPT_DICT"."DEPT_CODE" ) and ( 
CLINIC_FOR_REGIST.CLINIC_DATE = :day1 );
```

```
SELECT "CLINIC_FOR_REGIST"."CLINIC_LABEL", "CLINIC_FOR_REGIST"."TIME_DESC", "CLINIC_FOR_REGIST"."REGISTRATION_LIMITS", 
"CLINIC_FOR_REGIST"."APPOINTMENT_LIMITS", "CLINIC_FOR_REGIST"."REGIST_PRICE", 0, "CLINIC_INDEX"."CLINIC_DEPT", 
"CLINIC_INDEX"."DOCTOR", "CLINIC_INDEX"."DOCTOR_TITLE", "CLINIC_INDEX"."CLINIC_TYPE", "CLINIC_FOR_REGIST"."CURRENT_NO", '号', 
'', 0, "CLINIC_INDEX"."INPUT_CODE", "DEPT_DICT"."POSITION", "CLINIC_INDEX"."CLINIC_POSITION", 0 as aa, 
"CLINIC_INDEX"."CLINIC_INDEX" FROM "CLINIC_FOR_REGIST", "CLINIC_INDEX", "DEPT_DICT" WHERE ( "CLINIC_FOR_REGIST"."CLINIC_LABEL" 
= "CLINIC_INDEX"."CLINIC_LABEL" ) and ( "CLINIC_INDEX"."CLINIC_DEPT" = "DEPT_DICT"."DEPT_CODE" ) and ( 
"CLINIC_FOR_REGIST"."CLINIC_DATE" = to_date((select to_char(sysdate,'yyyy-MM-dd') from dual),'yyyy-mm-dd' ))
```



####  号类设置表 CLINIC_TYPE_SETTING

```
select * from clinic_type_setting;
```

![image-20211126004206329](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211126004206329.png)

```
SELECT "CLINIC_FOR_REGIST"."CLINIC_LABEL", "CLINIC_FOR_REGIST"."TIME_DESC", "CLINIC_FOR_REGIST"."REGISTRATION_LIMITS", 
"CLINIC_FOR_REGIST"."APPOINTMENT_LIMITS", "CLINIC_FOR_REGIST"."REGIST_PRICE", 0, "CLINIC_INDEX"."CLINIC_DEPT", 
"CLINIC_INDEX"."DOCTOR", "CLINIC_INDEX"."DOCTOR_TITLE", "CLINIC_INDEX"."CLINIC_TYPE", "CLINIC_FOR_REGIST"."CURRENT_NO", '号', 
'', 0, "CLINIC_INDEX"."INPUT_CODE", "DEPT_DICT"."POSITION", "CLINIC_INDEX"."CLINIC_POSITION", 0 as aa, 
"CLINIC_INDEX"."CLINIC_INDEX" FROM "CLINIC_FOR_REGIST", "CLINIC_INDEX", "DEPT_DICT" WHERE ( "CLINIC_FOR_REGIST"."CLINIC_LABEL" 
= "CLINIC_INDEX"."CLINIC_LABEL" ) and ( "CLINIC_INDEX"."CLINIC_DEPT" = "DEPT_DICT"."DEPT_CODE" ) and ( 
"CLINIC_FOR_REGIST"."CLINIC_DATE" = to_date((select to_char(sysdate,'yyyy-MM-dd') from dual),'yyyy-mm-dd' ))
```



#### 门诊号表 CLINIC_FOR_REGIST

![image-20211125135559340](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125135559340.png)

#### 门诊号别定义 CLINIC_INDEX

![image-20211125140127800](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125140127800.png)

#### 科室字典 DEPT_DICT

![image-20211125140237035](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125140237035.png)

```
select * from CLINIC_FOR_REGIST WHERE ( "CLINIC_FOR_REGIST"."CLINIC_LABEL" 
= "CLINIC_INDEX"."CLINIC_LABEL" ) and ( "CLINIC_INDEX"."CLINIC_DEPT" = "DEPT_DICT"."DEPT_CODE" ) and ( 
"CLINIC_FOR_REGIST"."CLINIC_DATE" = to_date((select to_char(sysdate,'yyyy-MM-dd') from dual),'yyyy-mm-dd' ) );
```

[oracle获取系统时间](https://www.cnblogs.com/homesea/p/4724779.html)



(select to_char(sysdate,'yyyy-MM-dd') from dual)

#### 任务需要字段

##### 门诊科室 dept_name

DEPT_DICT.dept_name

##### 号别 clinic_label

后面有名字，另外加

CLINIC_FOR_REGIST.clinic_label

"CLINIC_FOR_REGIST"."CLINIC_LABEL"

##### 时间段 time_desc

 CLINIC_FOR_REGIST.time_desc

“CLINIC_FOR_REGIST”.“TIEM_DESC"





![image-20211124223424899](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211124223424899.png)



就诊医生

号别（得到号类、就诊科室）

就诊时间

号类

就诊科室

```
这里弄反了的
	case "clinic_label"
		this.getchild("clinic_label",ldwc)
		ll_row = ldwc.getrow()
		if ll_row>0 then
			ls_time_desc = ldwc.getitemstring(ll_row,"clinic_for_regist_time_desc")
			ls_clinic_dept=ldwc.getitemstring(ll_row,"dept_dict_dept_name")
			ls_clinic_label_chenwei = ldwc.getitemstring(ll_row,"clinic_for_regist_clinic_label")
			
			select CLINIC_TYPE into :ls_clinic_label from clinic_index where CLINIC_LABEL =:ls_clinic_label_chenwei;
		
			this.setitem(1,"visit_time_desc",ls_time_desc)
			this.setitem(1,"clinic_type",ls_clinic_dept)    //这里命名不规范了哈，但没办法，已经写好了
			this.setitem(1,"clinic_label",ls_clinic_label)
			return 2
		end if
```



## 1.1 科室字典 DEPT_DICT

| 字段中文名称     | 字段名              | 类型 | 长度 | 说明                                                         |
| ---------------- | ------------------- | ---- | ---- | ------------------------------------------------------------ |
| 序号             | SERIAL_NO           | N    | 3    | 此序号反映了科室的排列顺序                                   |
| 科室代码         | DEPT_CODE           | C    | 8    | 使用层次代码，由用户定义                                     |
| 科室名称         | DEPT_NAME           | C    | 20   | 科室的正式名称                                               |
| 科室简称或别名   | DEPT_ALIAS          | C    | 20   |                                                              |
| 临床科室属性     | CLINIC_ATTR         | N    | 1    | 描述本科室属于临床、辅诊、护理单元、机关、其他，本系统定义，见科室临床属性字典 |
| 门诊住院科室标志 | OUTP_OR_INP         | N    | 1    | 描述本科室属于门诊或住院科室，本系统定义，见科室门诊住院属性字典 |
| 内外科标志       | INTERNAL_OR_SERGERY | N    | 1    | 如果是临床科室，则区分内外科，本系统定义，见科室内外科属性字典 |
| 输入码           | INPUT_CODE          | C    | 8    |                                                              |
| 部门详细说明     | POSITION            | C    | 40   |                                                              |
|                  | SIGN                | C    | 1    |                                                              |
| 五笔码           | INPUT_CODE_WB       | C    | 8    |                                                              |
| 摆药累积属性     | DISPENSing_cumulate | N    | 1    | 是否参与摆药累积:0-否 1-是                                   |
| 虚拟药柜         | Virtual_cabinet     | N    | 1    | 是否参与虚拟药柜管理:0-否 1-是                               |

注释：此表描述全医院各科室的配置及其属性，由系统管理程序负责维护。各系统使用。

## 1.1 医生核算组DOCTOR_GROUP(新增)

| 中文名称   | 字段名           | 类型 | 长度 | 说明                                 |
| ---------- | ---------------- | ---- | ---- | ------------------------------------ |
| 医生代码   | DOCTOR_USER      | C    | 16   |                                      |
| 部门代码   | DEPT_CODE        | C    | 8    |                                      |
| 医生核算组 | ORDER_GROUP      | C    | 8    |                                      |
| 医生名     | DOCTOR           | C    | 8    |                                      |
| 输入码     | INPUT_CODE       | C    | 8    |                                      |
| 上级医生   | SUPER_DOCTOR_ID  | Var  | 16   | 相应的（医师）代码值。，而不是姓名。 |
| 主任医生   | PARENT_DOCTOR_ID | Var  | 16   | 相应的（医师）代码值。，而不是姓名。 |

![image-20211127160847928](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211127160847928.png)

## 1.1 门诊号别定义CLINIC_INDEX

select * from clinic_index

![image-20211127153836590](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211127153836590.png)

| 字段中文名称 | 字段名          | 类型 | 长度 | 说明                                                       |
| ------------ | --------------- | ---- | ---- | ---------------------------------------------------------- |
| 号别         | CLINIC_LABEL    | C    | 16   | 将不同专科的号看作不同的类别，为每种号分配一个唯一标识     |
| 门诊科室     | CLINIC_DEPT     | C    | 8    | 使用科室代码，用户定义，见科室字典                         |
| 医生         | DOCTOR          | C    | 8    | 医生姓名。当该门诊指定具体医生时使用，不用时，为空         |
| 医生职称     | DOCTOR_TITLE    | C    | 1    | 使用代码，本系统定义，见医生职务字典                       |
| 号类         | CLINIC_TYPE     | C    | 8    | 标识该门诊的挂号费等级，如：普通、专家等，见门诊号类别字典 |
| 输入码       | INPUT_CODE      | C    | 8    |                                                            |
| 门诊科室地址 | CLINIC_POSITION | C    | 20   |                                                            |
|              | CLINIC_INDEX    | C    | 8    |                                                            |

注释：此表定义了医院所开设的门诊种类，一个种类的门诊需要设立一种号别。

```
SELECT "CLINIC_FOR_REGIST"."CLINIC_LABEL",
"CLINIC_FOR_REGIST"."TIME_DESC",
"CLINIC_INDEX"."CLINIC_DEPT", 
"CLINIC_INDEX"."DOCTOR",
"CLINIC_INDEX"."CLINIC_TYPE",
"DOCTOR_GROUP"."DOCTOR",
"DEPT_DICT"."DEPT_NAME"
 FROM "CLINIC_FOR_REGIST", "CLINIC_INDEX", "DEPT_DICT" ,"DOCTOR_GROUP","DEPT_DICT"
WHERE ( "CLINIC_FOR_REGIST"."CLINIC_LABEL" 
= "CLINIC_INDEX"."CLINIC_LABEL" ) and ( "CLINIC_INDEX"."CLINIC_DEPT" = "DEPT_DICT"."DEPT_CODE" ) and ( 
"CLINIC_FOR_REGIST"."CLINIC_DATE" = to_date((select to_char(sysdate,'yyyy-MM-dd') from dual),'yyyy-mm-dd' )) and ("CLINIC_INDEX"."DOCTOR" = "DOCTOR_GROUP"."DOCTOR_USER" ) and("CLINIC_INDEX"."CLINIC_DEPT" = "DEPT_DICT"."DEPT_CODE")
```

主键：号别。

![image-20211127153818392](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211127153818392.png)



![image-20211125004152828](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125004152828.png)

![image-20211125004344105](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125004344105.png)

![image-20211125004436120](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125004436120.png)

#### 修改显示的字段

![image-20211125151512677](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125151512677.png)



![image-20211125153050902](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125153050902.png)



#### 诊间挂号失败

##### 图例

![image-20211125161807017](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125161807017.png)

![image-20211125162207918](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125162207918.png)

##### 诊间挂号失败代码位置

###### click事件

![image-20211125162924925](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125162924925.png)

###### 挂号费

![image-20211125163826959](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125163826959.png)





![image-20211125165420171](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125165420171.png)

![image-20211125165506898](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125165506898.png)



![image-20211125173902198](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125173902198.png)



![image-20211125221139386](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125221139386.png)

![image-20211125221331054](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125221331054.png)

![image-20211125221350411](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125221350411.png)

![image-20211125221526524](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211125221526524.png)

[PB之入门-itemchanged(long row,dwobject dwo,string data)_weixin_30922589的博客-CSDN博客](https://blog.csdn.net/weixin_30922589/article/details/95261745)

#### 价表 PRICE_LIST

| 字段中文名称           | 字段名             | 类型 | 长度 | 说明                                                         |
| ---------------------- | ------------------ | ---- | ---- | ------------------------------------------------------------ |
| 项目分类               | ITEM_CLASS         | C    | 1    | 本系统定义，见价表项目分类字典。非空                         |
| 项目代码               | ITEM_CODE          | C    | 20   | 非空                                                         |
| 项目名称               | ITEM_NAME          | C    | 100  | 项目的标准名称。非空                                         |
| 项目规格               | ITEM_SPEC          | C    | 50   | 药品规格、器械材料规格                                       |
| 单位                   | UNITS              | C    | 8    | 指计价单位，如：’片’，’针’，’人次’，’部位’等。见计价单位字典 |
| 价格                   | PRICE              | N    | 9,3  | 标准价格，可对应全费价。非空                                 |
| 优惠价格               | PREFER_PRICE       | N    | 9,3  | 可对应自费价。非空                                           |
| 外宾价格               | FOREIGNER_PRICE    | N    | 9,3  |                                                              |
| 执行科室               | PERFORMED_BY       | C    | 8    | 执行科室代码,当为*时，表示有两个以上执行科室，如一个检查项目。当为空时，表示为各科都执行的项目，如静滴等普通治疗项目。 |
| 费别屏蔽标志           | FEE_TYPE_MASK      | N    | 1    | 通常情况下，按照费别，各种项目统一原则收费或优惠。特殊项目不按费别收费。此项为1表示此收费项目不考虑费别按规定价格收费，0表示按费别收费。非空 |
| 对应的住院收据费用分类 | CLASS_ON_INP_RCPT  | C    | 1    | 此项目对住院病人在收据中应归属的费用类别；非空；见住院收据费用分类字典；使用代码。 |
| 对应的门诊收据费用分类 | CLASS_ON_OUTP_RCPT | C    | 1    | 此项目对门诊病人在收据中应归属的费用类别，见门诊收据费用分类字典；非空；使用代码。 |
| 对应的核算项目分类     | CLASS_ON_RECKONING | C    | 10   | 此项目在经济核算中应归属的费用类别；非空；见核算项目分类字典；使用代码。 |
| 对应的会计科目         | SUBJ_CODE          | C    | 3    | 此项目收入归属的会计科目；非空；见会计科目字典，使用代码。   |
| 对应的病案首页费用分类 | CLASS_ON_MR        | C    | 4    | 此项目对应住院病人在病案首页中应归属的费用类别；非空；使用规范名称，见病案首页费用分类字典。 |
| 备注                   | MEMO               | C    | 40   | 用于定价条件说明                                             |
| 起用日期               | START_DATE         | D    |      | 执行日期含起用日期当天                                       |
| 停止日期               | STOP_DATE          | D    |      | 执行日期含停止日期当天                                       |
| 操作员                 | OPERATOR           | C    | 8    | 操作员姓名                                                   |
| 录入日期及时间         | ENTER_DATE         | D    |      | 非空                                                         |
|                        | HIGH_PRICE         | N    | 10,4 |                                                              |
| 物价码                 | material_code      | c    | 20   |                                                              |
| 价格变更原因           | Changed_memo       | v    | 40   | 价格变更原因包括调价和停用等都可以录入保存原因';             |

注释：所有收费项目的价格全部存放在此表中，包括药品、检查、化验、手术、治疗、材料等。此表记录了价格的变动历史，每次调价，都停止该项目的原有价格，重新生成一条新的价格记录。价格记录只能追加，不能删除和修改。用户定义，由价表管理子系统负责维护。

主键：项目分类、项目代码、项目规格、单位、起用日期。

上述价表中包含了历史价格，为便于使用，系统定义当前价表视图，条件为

SYSDATE >= start_date AND ( SYSDATE < stop_date OR stop_date IS NULL )

#### CURRENT_PRICE_LIST

这里通过门诊挂号sql分析出，挂号费

```
select item_class , item_spec , price from current_price_list where item_code ='def00000126';
```



##### 1.1 当前价表 CURRENT_PRICE_LIST

| 字段中文名称           | 字段名             | 类型 | 长度 | 说明                 |
| ---------------------- | ------------------ | ---- | ---- | -------------------- |
| 项目分类               | ITEM_CLASS         | C    | 1    | 所有字段均对应原名称 |
| 项目代码               | ITEM_CODE          | C    | 20   |                      |
| 项目名称               | ITEM_NAME          | C    | 100  |                      |
| 项目规格               | ITEM_SPEC          | C    | 50   |                      |
| 单位                   | UNITS              | C    | 8    |                      |
| 价格                   | PRICE              | N    | 9,3  |                      |
| 优惠价格               | PREFER_PRICE       | N    | 9,3  |                      |
| 外宾价格               | FOREIGNER_PRICE    | N    | 9,3  |                      |
| 执行科室               | PERFORMED_BY       | C    | 8    |                      |
| 费别屏蔽标志           | FEE_TYPE_MASK      | N    | 1    |                      |
| 对应的住院收据费用分类 | CLASS_ON_INP_RCPT  | C    | 1    |                      |
| 对应的门诊收据费用分类 | CLASS_ON_OUTP_RCPT | C    | 1    |                      |
| 对应的核算项目分类     | CLASS_ON_RECKONING | C    | 10   |                      |
| 对应的会计科目         | SUBJ_CODE          | C    | 3    |                      |
| 对应的病案首页费用分类 | CLASS_ON_MR        | C    | 4    |                      |
| 备注                   | MEMO               | C    | 40   |                      |
| 操作员                 | OPERATOR           | C    | 8    |                      |
| 录入日期及时间         | ENTER_DATE         | D    |      |                      |

### 就诊记录 CLINIC_MASTER 挂一个号，就产生一个就诊记录

| 字段中文名称   | 字段名                | 类型 | 长度 | 说明                                                         |
| -------------- | --------------------- | ---- | ---- | ------------------------------------------------------------ |
| 就诊日期       | VISIT_DATE            | D    |      | 非空                                                         |
| 就诊序号       | VISIT_NO              | N    | 5    | 非空，每天从1开始递增，为病人每次挂号分配一个序号，该序号与就诊日期一起，构成一次就诊的唯一标识 |
| 号别           | CLINIC_LABEL          | C    | 16   | 对应门诊号表主记录定义的号别                                 |
| 就诊时间描述   | VISIT_TIME_DESC       | C    | 8    | 同号表门诊时间描述                                           |
| 号码           | SERIAL_NO             | N    | 3    | 一个号别下的序号                                             |
| 病人标识    号 | PATIENT_ID            | C    | 10   | 对已建立主索引的病人使用，对无主索引的病人为空               |
| 姓名           | NAME                  | C    | 20   | 病人姓名                                                     |
| 姓名拼音       | NAME_PHONETIC         | C    | 16   | 病人姓名拼音，大写，字间用一个空格分隔，超长截断             |
| 性别           | SEX                   | C    | 4    | 使用规范描述，见性别字典                                     |
| 年龄           | AGE                   | N    | 3    |                                                              |
| 身份           | IDENTITY              | C    | 10   | 使用规范名称，用户定义，见身份字典                           |
| 费别           | CHARGE_TYPE           | C    | 8    | 使用规范名称，用户定义，见费别字典                           |
| 医保类别       | INSURANCE_TYPE        | C    | 16   | 如果此病人为医保病人，则记录反映本次住院支付方案的医保类别   |
| 医疗保险号     | INSURANCE_NO          | C    | 18   | 如果此病人为医保病人，则记录其保险号                         |
| 合同单位       | UNIT_IN_CONTRACT      | C    | 11   | 也称体系单位，使用代码，用户定义，见合同单位记录             |
| 号类           | CLINIC_TYPE           | C    | 8    | 标识该门诊的挂号费等级，如：普通、专家等，见门诊号类别字典   |
| 初诊标志       | FIRST_VISIT_INDICATOR | N    | 1    | 1-初诊 0-复诊                                                |
| 就诊科室       | VISIT_DEPT            | C    | 8    | 科室代码，用户定义，见科室字典                               |
| 就诊专科       | VISIT_SPECIAL_CLINIC  | C    | 16   | 指就诊科室下所设的某一专科，可空                             |
| 医生           | DOCTOR                | C    | 8    | 在就诊专家门诊时，为专家姓名，可空                           |
| 提供病案标志   | MR_PROVIDE_INDICATOR  | N    | 1    | 1--需提供 0--不提供                                          |
| 挂号状态       | REGISTRATION_STATUS   | N    | 1    | 反映从预约到就诊的状态变化。0-预约 1-已确认（已取号） 2-就诊 |
| 挂号日期       | REGISTERING_DATE      | D    | 7    | 发生预约或挂号的日期                                         |
| 症状           | SYMPTOM               | C    | 40   |                                                              |
| 挂号费         | REGIST_FEE            | N    | 5,2  |                                                              |
| 诊疗费         | CLINIC_FEE            | N    | 5,2  |                                                              |
| 其它费         | OTHER_FEE             | N    | 5,2  |                                                              |
| 实收费用       | CLINIC_CHARGE         | N    | 5,2  |                                                              |
| 挂号员         | OPERATOR              | C    | 8    |                                                              |
| 退号日期       | RETURNED_DATE         | D    |      | 发生退号时使用                                               |
| 退号挂号员     | RETURNED_OPERATOR     | C    | 8    | 发生退号时使用                                               |
| 挂号模式       | MODE_CODE             | C    | 1    |                                                              |
| 卡名           | CARD_NAME             | C    | 16   |                                                              |
| 卡号           | CARD_NO               | C    | 20   |                                                              |
| 结帐时间       | ACCT_DATE_TIME        | D    |      |                                                              |
| 结帐号码       | ACCT_NO               | C    | 6    |                                                              |
| 支付方式       | PAY_WAY               | C    | 8    |                                                              |
| 病案传送否     | MR_PROVIDED_INDICATOR | N    | 1    |                                                              |
| 发票号码       | INVOICE_NO            | C    | 20   |                                                              |
| 门诊号         | clinic_no             | V2   | 13   |                                                              |

注释：此表反映病人一次就诊或挂号的基本信息，挂号时产生，由病人门诊的后续环节如：收费、取药等使用。病人完成整个门诊流程，待门诊业务统计完成后，即可删除挂号记录。

允许提前挂号，即提前拿号和交费（不同于预约）。

主键：就诊日期、就诊序号。



### 科室字典 DEPT_DICT

| 字段中文名称     | 字段名              | 类型 | 长度 | 说明                                                         |
| ---------------- | ------------------- | ---- | ---- | ------------------------------------------------------------ |
| 序号             | SERIAL_NO           | N    | 3    | 此序号反映了科室的排列顺序                                   |
| 科室代码         | DEPT_CODE           | C    | 8    | 使用层次代码，由用户定义                                     |
| 科室名称         | DEPT_NAME           | C    | 20   | 科室的正式名称                                               |
| 科室简称或别名   | DEPT_ALIAS          | C    | 20   |                                                              |
| 临床科室属性     | CLINIC_ATTR         | N    | 1    | 描述本科室属于临床、辅诊、护理单元、机关、其他，本系统定义，见科室临床属性字典 |
| 门诊住院科室标志 | OUTP_OR_INP         | N    | 1    | 描述本科室属于门诊或住院科室，本系统定义，见科室门诊住院属性字典 |
| 内外科标志       | INTERNAL_OR_SERGERY | N    | 1    | 如果是临床科室，则区分内外科，本系统定义，见科室内外科属性字典 |
| 输入码           | INPUT_CODE          | C    | 8    |                                                              |
| 部门详细说明     | POSITION            | C    | 40   |                                                              |
|                  | SIGN                | C    | 1    |                                                              |
| 五笔码           | INPUT_CODE_WB       | C    | 8    |                                                              |
| 摆药累积属性     | DISPENSing_cumulate | N    | 1    | 是否参与摆药累积:0-否 1-是                                   |
| 虚拟药柜         | Virtual_cabinet     | N    | 1    | 是否参与虚拟药柜管理:0-否 1-是                               |

注释：此表描述全医院各科室的配置及其属性，由系统管理程序负责维护。各系统使用。

## 报错

解决：

123报错都是字段问题，缺少字段和字段大小问题。

### 1  和3 错误一样

```
Timestamp: 14:23:48.603
INSERT INTO clinic_master ( 1 VISIT_DATE , 
2 VISIT_NO , 
3 CLINIC_LABEL , 
4 VISIT_TIME_DESC ,
5 SERIAL_NO , 
6 PATIENT_ID , 
7 NAME , 
8 NAME_PHONETIC , 
9 SEX , AGE , 
10 IDENTITY ,
11 CHARGE_TYPE , 
12 INSURANCE_TYPE , 
13 INSURANCE_NO , 
14 UNIT_IN_CONTRACT , 
15 CLINIC_TYPE , 
16 FIRST_VISIT_INDICATOR , 
17 SYMPTOM , 
18 VISIT_DEPT ,
19  DOCTOR , 
20 MR_PROVIDEd_INDICATOR , 
21 REGISTRATION_STATUS ,
22 REGISTERING_DATE , 
23 REGIST_FEE ,
24  CLINIC_FEE ,
25 OTHER_FEE , 
26 OPERATOR ,
27  clinic_charge , 
28 mode_code , 
29 card_name , 
30 card_no , 
31 pay_way ,
32 invoice_no , 
CLINIC_NO ) VALUES ( :1 , :2 , :3 , :4 , :5 , :6 , :7 , :8 , :9 , :10 , :11 , :12 , :13 , :14 , :15 , :16 , :17 , :18 , :19 , 
:20 , '' , 1 , :21 , 0 , 0 , 0 , :22 , 0 , 'A' , :23 , :24 , :25 , '' , :26 )
:1 = '2021/11/26'
:2 = 1009
:3 = '普通号'
:4 = '白天'
:5 = 0
:6 = 'M0000563'
:7 = '马嘉晨'
:8 = ''
:9 = '女'
:11 = '一般人员'
:12 = '自费'
:13 = ''
:14 = ''
:15 = <NULL>
:16 = '产科'
:17 = '0'
:18 = ''
:19 = <NULL>
:20 = 'FYADMIN'
:21 = '2021/11/26 14:23:49'
:22 = '2586'
:23 = '现金'
:24 = ''
:25 = '现金'
:26 = '2021112601009'
Runtime error occurred: 1400 (ORA-01400: 无法将 NULL 插入 ("OUTPDOCT"."OUTP_WAIT_QUEUE"."REGISTER_DEPT")
ORA-06512: 在 "OUTPADM.OUTP_WAIT_QUEUE_INSERT", line 2
ORA-04088: 触发器 'OUTPADM.OUTP_WAIT_QUEUE_INSERT' 执行过程中出错)
```

select OUTPADM.OUTP_WAIT_QUEUE_INSERT from all_triggers where table_name='clinic_master';

### 2

```
Timestamp: 14:38:09.646
INSERT INTO clinic_master ( VISIT_DATE , VISIT_NO , CLINIC_LABEL , VISIT_TIME_DESC , SERIAL_NO , PATIENT_ID , NAME , 
NAME_PHONETIC , SEX , AGE , IDENTITY , CHARGE_TYPE , INSURANCE_TYPE , INSURANCE_NO , UNIT_IN_CONTRACT , CLINIC_TYPE , 
FIRST_VISIT_INDICATOR , SYMPTOM , VISIT_DEPT , DOCTOR , MR_PROVIDEd_INDICATOR , REGISTRATION_STATUS , REGISTERING_DATE , 
REGIST_FEE , CLINIC_FEE , OTHER_FEE , OPERATOR , clinic_charge , mode_code , card_name , card_no , pay_way , invoice_no , 
CLINIC_NO ) VALUES ( :1 , :2 , :3 , :4 , :5 , :6 , :7 , :8 , :9 , :10 , :11 , :12 , :13 , :14 , :15 , :16 , :17 , :18 , :19 , 
:20 , '' , 1 , :21 , 0 , 0 , 0 , :22 , 0 , 'A' , :23 , :24 , :25 , '' , :26 )
:1 = '2021/11/26'
:2 = 1012
:3 = '免费号'
:4 = '昼夜'
:5 = 0
:6 = 'M0000562'
:7 = '杨睿'
:8 = ''
:9 = '男'
:11 = '一般人员'
:12 = '自费'
:13 = ''
:14 = ''
:15 = <NULL>
:16 = '核酸检测室'
:17 = '0'
:18 = ''
:19 = <NULL>
:20 = 'FYADMIN'
:21 = '2021/11/26 14:38:10'
:22 = '2586'
:23 = '现金'
:24 = ''
:25 = '现金'
:26 = '2021112601012'
Runtime error occurred: 12899 (ORA-12899: 列 "OUTPADM"."CLINIC_MASTER"."CLINIC_TYPE" 的值太大 (实际值: 10, 最大值: 8))
```

### 测试用户名密码

M01234567

testchenwei1234

M0001064

MLP0000



sta_ff

### 3

```
----------------------------------
Timestamp: 15:06:05.824
INSERT INTO clinic_master ( VISIT_DATE , VISIT_NO , CLINIC_LABEL , VISIT_TIME_DESC , SERIAL_NO , PATIENT_ID , NAME , 
NAME_PHONETIC , SEX , AGE , IDENTITY , CHARGE_TYPE , INSURANCE_TYPE , INSURANCE_NO , UNIT_IN_CONTRACT , CLINIC_TYPE , 
FIRST_VISIT_INDICATOR , SYMPTOM , VISIT_DEPT , DOCTOR , MR_PROVIDEd_INDICATOR , REGISTRATION_STATUS , REGISTERING_DATE , 
REGIST_FEE , CLINIC_FEE , OTHER_FEE , OPERATOR , clinic_charge , mode_code , card_name , card_no , pay_way , invoice_no , 
CLINIC_NO ) VALUES ( :1 , :2 , :3 , :4 , :5 , :6 , :7 , :8 , :9 , :10 , :11 , :12 , :13 , :14 , :15 , :16 , :17 , :18 , :19 , 
:20 , '' , 1 , :21 , 0 , 0 , 0 , :22 , 0 , 'A' , :23 , :24 , :25 , '' , :26 )
:1 = '2021/11/26'
:2 = 1028
:3 = '核酸检测室'
:4 = '昼夜'
:5 = 0
:6 = 'M01234567'
:7 = 'testchenwei1234'
:8 = ''
:9 = '男'
:11 = '一般人员'
:12 = '自费'
:13 = ''
:14 = ''
:15 = <NULL>
:16 = '免费号'
:17 = '0'
:18 = ''
:19 = <NULL>
:20 = 'FYADMIN'
:21 = '2021/11/26 15:06:06'
:22 = '2586'
:23 = '现金'
:24 = ''
:25 = '现金'
:26 = '2021112601028'
Runtime error occurred: 1400 (ORA-01400: 无法将 NULL 插入 ("OUTPDOCT"."OUTP_WAIT_QUEUE"."REGISTER_DEPT")
ORA-06512: 在 "OUTPADM.OUTP_WAIT_QUEUE_INSERT", line 2
ORA-04088: 触发器 'OUTPADM.OUTP_WAIT_QUEUE_INSERT' 执行过程中出错)
```



号别录入：挂号维护-号别录入



oracle 动态执行表不可访问，本会话的自动统计被禁止



```
Timestamp: 00:36:48.860
Insert Into clinic_master ( VISIT_DATE , VISIT_NO , CLINIC_LABEL , VISIT_TIME_DESC , SERIAL_NO , PATIENT_ID , NAME , 
NAME_PHONETIC , SEX , AGE , Identity , CHARGE_TYPE , INSURANCE_TYPE , INSURANCE_NO , UNIT_IN_CONTRACT , CLINIC_TYPE , 
FIRST_VISIT_INDICATOR , SYMPTOM , VISIT_DEPT , DOCTOR , MR_PROVIDEd_INDICATOR , REGISTRATION_STATUS , REGISTERING_DATE , 
REGIST_FEE , CLINIC_FEE , OTHER_FEE , OPERATOR , clinic_charge , mode_code , card_name , card_no , pay_way , invoice_no , 
CLINIC_NO , FUND_PAY , tradeno , rcpt_no ) Values ( :1 , :2 , :3 , :4 , :5 , :6 , :7 , :8 , :9 , :10 , :11 , :12 , :13 , :14 , 
:15 , :16 , :17 , :18 , :19 , :20 , :21 , 1 , :22 , :23 , :24 , :25 , :26 , :27 , 'A' , :28 , :29 , :30 , :31 , :32 , :33 , :34 
, :35 )
:1 = '2021/11/28'
:2 = 1071
:3 = '产科-刘伶俐'
:4 = '白天'
:5 = 1
:6 = 'Mtest1'
:7 = '陈111'
:8 = 'CHEN'
:9 = '男'
:11 = '一般人员'
:12 = '自费'
:13 = <NULL>
:14 = <NULL>
:15 = ''
:16 = '普通号'
:18 = ''
:19 = '3702'
:20 = 'LLL2'
:22 = '2021/11/28 0:36:49'
:23 = '0.00'
:24 = '9.00'
:25 = '3.00'
:26 = '2586'
:27 = '12.00'
:28 = '现金'
:29 = <NULL>
:30 = '现金'
:31 = ''
:32 = '2021112800441'
:33 = '0'
:34 = ''
:35 = ''
```

失败

```
Timestamp: 00:55:11.144
INSERT INTO clinic_master ( VISIT_DATE , VISIT_NO , CLINIC_LABEL , VISIT_TIME_DESC , SERIAL_NO , PATIENT_ID , NAME , 
NAME_PHONETIC , SEX , AGE , IDENTITY , CHARGE_TYPE , INSURANCE_TYPE , INSURANCE_NO , UNIT_IN_CONTRACT , CLINIC_TYPE , 
FIRST_VISIT_INDICATOR , SYMPTOM , VISIT_DEPT , DOCTOR , MR_PROVIDEd_INDICATOR , REGISTRATION_STATUS , REGISTERING_DATE , 
REGIST_FEE , CLINIC_FEE , OTHER_FEE , OPERATOR , clinic_charge , mode_code , card_name , card_no , pay_way , invoice_no , 
CLINIC_NO ) VALUES ( :1 , :2 , :3 , :4 , :5 , :6 , :7 , :8 , :9 , :10 , :11 , :12 , :13 , :14 , :15 , :16 , :17 , :18 , :19 , 
:20 , '' , 1 , :21 , 0 , 0 , 0 , :22 , 0 , 'A' , :23 , :24 , :25 , '' , :26 )
:1 = '2021/11/28'
:2 = 1079
:3 = '产科-刘苹'
:4 = '白天'
:5 = 0
:6 = 'M0001064'
:7 = '邓卓'
:8 = ''
:9 = '男'
:11 = '一般人员'
:12 = '自费'
:13 = ''
:14 = ''
:15 = <NULL>
:16 = '普通号'
:17 = '0'
:18 = ''
:19 = '产科'
:20 = '刘苹'
:21 = '2021/11/28 0:55:09'
:22 = ''
:23 = '现金'
:24 = ''
:25 = '现金'
:26 = '2021112801079'
```

## 24、25和26日主要是培训业务和完成朱老师和杨老师安排的诊间挂号的任务

上面几乎都是任务的记录，任务已经完成，现做个总结。到目前为止杨老师给了一个创建数据窗口并修改的字段为中文的任务，再就是这个朱老师任务了。

上周学习pb，到任务到手才看到视频20，初级都只看了一半，对于很多知识都不熟，几乎都是百度的。

有几个问题是耗时比较多的。

首先是在其他人的代码上做的，要读懂别人的代码，对于有问题的地方需要修改，读懂唐乙写的代码是最大的问题，注释多点就好了，带注释比较少。。。

1 最后做完了给到朱老师看的时候，任务大体看起来做完，但有几个字段没有添加上去，导致需要重新修改，添加两个需要显示的字段，但问题不大；

2 还有就是检查交流的时候，对于已经挂号成功的人，不同管理员登录后能看到自己的病人，这个在之前没有做，这个是挂号的时候有个字段需要指明挂号的医生，并且这个医生不是名字字段，是像CW种拼音，这个医生代码命名是更具医生的名字自动命名的，如果遇到相同的那么就加数字，比如还有一个医生是陈伟，那么医生代码就是CW2了，具体可以观察上面的截图信息，几乎所有的相关的表已经用数据工具查询出来截图了。

3 对于数据窗口的使用问题，虽然最开始的任务就是杨老师叫做数据窗口，但过了几天又做的时候，忘记了最后一个步骤，那就是需要renturn。

4 在pb编程时，对于代码的阅读，在其中遇到很多在视频中没有讲到的内容，比如[PB之入门-itemchanged(long row,dwobject dwo,string data)_weixin_30922589的博客-CSDN博客](https://blog.csdn.net/weixin_30922589/article/details/95261745)，对于itemchanged事件，特别是里面的参数的理解，在阅读代码时没理解这个东西的话，很难读懂，但花费一些时间后还是解决了。

5 在理解诊间挂号时，跟踪门诊挂号sql，来完成这个诊间挂号。

## 27日培训



![image-20211129144203441](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211129144203441.png)

select * from insur_table_master

| ID                               | INTERFACE_CODE | TABLE_NAME                    | CHINESE_NAME          | TABLE_TYPE | VER  | NOTE                  | COLUMN_COUNT |
| -------------------------------- | -------------- | ----------------------------- | --------------------- | ---------- | ---- | --------------------- | ------------ |
| 7B34F926ECCB4047B8019557ECE7BB3D | 3102           | DETAIL_AUDIT_ING_DATA_IN      | 输入-规则分析信息     | 入参       | 1    | 输入-规则分析信息     | 6            |
| 5CF0560BBF474411B30A122335AA73C5 | 3102           | DETAIL_AUDIT_ING_PATIENT_IN   | 输入-参保人信息       | 入参       | 1    | 输入-参保人信息       | 9            |
| DE2DBACD54BC401BB0D1B5D7CFB704BA | 3102           | DETAIL_AUDIT_ING_ENCOUNTER_IN | 输入-就诊信息         | 入参       | 1    | 输入-就诊信息         | 35           |
| 57DFE3D1179A446C86DEEC66142AE48C | 3102           | DETAIL_AUDIT_ING_DIAGNOSE_IN  | 输入-诊断信息         | 入参       | 1    | 输入-诊断信息         | 8            |
| 58D69BEEEAE24C04B25C6EF3C6085791 | 3102           | DETAIL_AUDIT_ING_ORDER_IN     | 输入-处方（医嘱）信息 | 入参       | 1    | 输入-处方（医嘱）信息 | 35           |

![image-20211129144403469](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211129144403469.png)



![image-20211129144600106](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211129144600106.png)

select * from insur_business_info 

| **BUSINESSID** |  **BUSINESS_NAME**   | **PROCESS_FLAG** |
| :------------: | :------------------: | :--------------: |
|      2201      |       门诊挂号       |        3         |
|      1161      |         读卡         |        6         |
|      1162      |      读电子凭证      |        5         |
|      2401      |       入院办理       |        3         |
|      2402      |       出院办理       |        1         |
|      2403      |     住院信息变更     |        1         |
|      2204      | 门诊费用明细信息上传 |        1         |
|      9001      |       医保签到       |        1         |
|      3505      |       商品采购       |        1         |
|      3503      |       商品上传       |        1         |
|      2301      |   住院费用明细上传   |        1         |
|      2302      |   住院费用明细撤销   |        1         |
|      2303      |      住院预结算      |        3         |
|      2304      |       住院结算       |        3         |
|      2305      |     住院结算撤销     |        1         |





![image-20211129144732429](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211129144732429.png)

select * from insur_business_log

| SERIAL_NO          | INTERFACE_CODE | INTERFACE_DESC | PATIENT_ID | VISIT_DATE        | VISIT_ID | OPERATE_NO | INFCODE | INF_REFMSGID                   | REFMSG_TIME       | RESPOND_TIME      | ERR_MSG | ID                               | IN_JSON                                                      | OUT_JSON | MSGID                          |
| ------------------ | -------------- | -------------- | ---------- | ----------------- | -------- | ---------- | ------- | ------------------------------ | ----------------- | ----------------- | ------- | -------------------------------- | ------------------------------------------------------------ | -------- | ------------------------------ |
| 202109240819440063 | 1161           |                | M0032935   | 2021/9/24 8:19:50 | 2669     | 1000       | 0       | 500000202109240819400344680434 | 20210924081945766 | 20210924081945876 |         | 83696B1A9FF5457CAA5              |                                                              |          |                                |
| 202109240821310070 | 1161           |                | M0032935   | 2021/9/24 8:21:34 | 2669     | 1000       | 0       | 500000202109240821140344713679 | 20210924082130699 | 20210924082130807 |         | 732159CC8ACD49FCA4B              |                                                              |          |                                |
| 202109240824090076 | 1161           |                | M0041506   | 2021/9/24 8:24:11 | 2774     | 1000       | 0       | 500000202109240824230344765611 | 20210924082338036 | 20210924082338233 |         | 28CCF387C06A4F2CA29              |                                                              |          |                                |
| 202109240824490078 | 1161           |                | M0041508   | 2021/9/24 8:24:51 | 2783     | 1000       | 0       | 500000202109240824150344778549 | 20210924082443783 | 20210924082443889 |         | 1569B1016E654B32975              |                                                              |          |                                |
| 202109240825330080 | 1161           |                | M0041509   | 2021/9/24 8:25:35 | 2787     | 1000       | 0       | 500000202109240825260344794197 | 20210924082518652 | 20210924082518759 |         | 44B63D74AFC3438D8E4              |                                                              |          |                                |
| 202109240826360082 | 1161           |                | M0024464   | 2021/9/24 8:26:38 | 2790     | 1000       | 0       | 500000202109240826380344815722 | 20210924082631170 | 20210924082631270 |         | 511D0009A7F0405EA6A              |                                                              |          |                                |
| 202109240827050084 | 1161           |                | M0002422   | 2021/9/24 8:27:07 | 2798     | 1000       | 0       | 500000202109240827070344826266 | 20210924082648755 | 20210924082649071 |         | A3D66BCDBB2445EDB50              |                                                              |          |                                |
| 202109240827100085 | 1161           |                | M0026284   | 2021/9/24 8:27:14 | 2729     | 1000       | 0       | 500000202109240827260344828836 | 20210924082709385 | 20210924082709710 |         | 6379E9D169BE49CA8D8              |                                                              |          |                                |
| 202109240827420087 | 1161           |                | M0026284   | 2021/9/24 8:27:44 | 2729     | 1000       | 0       | 500000202109240827480344840305 | 20210924082723954 | 20210924082724059 |         | 3FB6B5C187AE4550AE8              |                                                              |          |                                |
| 202109240827470088 | 1161           |                | M0026296   | 2021/9/24 8:27:51 | 2714     | 1000       | 0       | 500000202109240828020344842881 | 20210924082731327 | 20210924082731428 |         | 8F23582455204AFBB9A              |                                                              |          |                                |
| 202109240828130090 | 1161           |                | M0014272   | 2021/9/24 8:28:15 | 2734     | 1022       | 0       | 500000202109240827470344852225 | 20210924082802524 | 20210924082802627 |         | 8F9869C9385A4B0A932              |                                                              |          |                                |
| 202109240828170091 | 2201           |                | M0026781   | 2021/9/24         | 2815     | 1022       | 0       | 500000202109240828090344853446 | 20210924082745879 | 20210924082746060 |         | C13A9ABC9A2B493CAA1AA2DDB7056BAC |                                                              |          | H50015501017202109240828221034 |
| 202109240828170091 | 2204           |                | M0026781   | 2021/9/24         | 2815     | 1022       | 0       | 500000202109240827510344853570 | 20210924082806196 | 20210924082806262 |         | 80379A6C730A42FF921DFA315EAAC413 |                                                              |          | H50015501017202109240828231035 |
| 202109240828170091 | 2206           |                | M0026781   | 2021/9/24         | 2815     | 1022       | 0       | 500000202109240828310344853715 | 20210924082804337 | 20210924082804691 |         | 2B7C2A51E7DE49E4BC61DE64F014DD61 |                                                              |          | H50015501017202109240828231036 |
| 202109240828170091 | 2207           |                | M0026781   | 2021/9/24         | 2815     | 1022       |         |                                |                   |                   |         | 5543CADA7AF44FA3AB31397AEA02D905 | {"cainfo":"","dev_no":"","dev_safe_info":"","fixmedins_code":"H50015501017","fixmedins_name":"重庆市梁平区妇幼保健院","inf_time":"2021-09-24 08:28:27","infno":"2207","infver":"1","input":{"data":{"medfee_sumamt":9,"mdtrt_id":"310047070005","med_type":"12","fulamt_ownpay_amt":0,"mdtrt_cert_no":"E24486473","chrg_bchno":"202109240828170091","insutype":"390","inscp_scp_amt":9,"invono":"2021092414556","psn_setlway":"01","return_invono":"","psn_no":"JM2011463725","mdtrt_cert_type":"03","overlmt_selfpay":0,"preselfpay_amt":0,"acct_used_flag":"1","return_date":""}},"insuplc_admdvs":"500155","mdtrtarea_admvs":"500155","msgid":"H50015501017202109240828271037","opter":"1022","opter_name":"钟娟","opter_type":"1","recer_sys_code":"YBXT","serv_code":"A6B3720544049E1397","serv_sign":"HH00001","sign_no":"651918","signtype":""} |          | H50015501017202109240828271037 |
| 202109240828330092 | 1161           |                |            |                   |          |            | 0       | 500000202109240828070344859562 | 20210924082819053 | 20210924082819156 |         | D112B9DAAF09475C9612A83A7BF2D652 |                                                              |          | H50015501017202109240828381038 |
| 202109240828330092 | 1161           |                | M0026296   | 2021/9/24 8:28:35 | 2714     | 1000       | 0       | 500000202109240828070344859562 | 20210924082819053 | 20210924082819156 |         | 7676437F35EF4338BAC              |                                                              |          |                                |
| 202109240828370093 | 2201           |                | M0041511   | 2021/9/24         | 2816     | 1000       | 0       | 500000202109240828190344860743 | 20210924082822279 | 20210924082822396 |         | 22677EFDC35D417C9D0508018314F6CA |                                                              |          | H50015501017202109240828421039 |
| 202109240828370093 | 2204           |                | M0041511   | 2021/9/24         | 2816     | 1000       | 0       | 500000202109240828510344860874 | 20210924082824743 | 20210924082824813 |         | 10904AA05A9D4904B2C4A9B95530A5FC |                                                              |          | H50015501017202109240828431040 |
| 202109240828370093 | 2206           |                | M0041511   | 2021/9/24         | 2816     | 1000       | 0       | 500000202109240828200344861072 | 20210924082834929 | 20210924082835281 |         | DAC756AF2510401F9A0CBD7DA4960F15 |                                                              |          | H50015501017202109240828431041 |
| 202109240828370093 | 2207           |                | M0041511   | 2021/9/24         | 2816     | 1000       | 0       | 500000202109240828570344863059 | 20210924082841883 | 20210924082842262 |         | 165D650E4AD7490FA1F0CD3DDF19F250 |                                                              |          | H50015501017202109240828451042 |
| 202109240830030095 | 1161           |                |            |                   |          |            | 0       | 500000202109240829390344892828 | 20210924083002241 | 20210924083002378 |         | 4EB391DE13CE466D893226E6F4E3E1BF |                                                              |          | H50015501017202109240830081043 |



![image-20211129152401712](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211129152401712.png)

select * from insur_business_config

| BUSINESSID | IO_FLAG | CONFIG_ITEM      | CONFIG_TYPE | ITEM_NO | RELAT_BID | NODE_TABLE | MULTI_LINE | RELAT_NODE | NODE_SORT | NODE_SQL | CONFIG_CHECK | NODE_DATE_TYPE | NODE_TIME_TYPE | NODE_NUMBER_TYPE | ITEM_NAME                    | RELAT_FLAG | RELAT_NODE_IO | PARENT_NODE |
| ---------- | ------- | ---------------- | ----------- | ------- | --------- | ---------- | ---------- | ---------- | --------- | -------- | ------------ | -------------- | -------------- | ---------------- | ---------------------------- | ---------- | ------------- | ----------- |
| 2001       | I       | birctrl_type     | 1           | 12      |           |            |            |            | 1         |          |              |                |                |                  | 计划生育手术类别             |            |               |             |
| 2001       | O       | psn_no           | 1           | 1       |           |            |            |            | 1         |          |              |                |                |                  | 人员编号                     |            |               |             |
| 2001       | O       | trt_chk_type     | 1           | 2       |           |            |            |            | 1         |          |              |                |                |                  | 待遇检查类型                 |            |               |             |
| 2001       | O       | fund_pay_type    | 1           | 3       |           |            |            |            | 1         |          |              |                |                |                  | 基金支付类型                 |            |               |             |
| 2001       | O       | trt_enjymnt_flag | 1           | 4       |           |            |            |            | 1         |          |              |                |                |                  | 基金款项待遇享受标志         |            |               |             |
| 2001       | O       | begndate         | 1           | 5       |           |            |            |            | 1         |          |              |                |                |                  | 开始日期                     |            |               |             |
| 2001       | O       | enddate          | 1           | 6       |           |            |            |            | 1         |          |              |                |                |                  | 结束日期                     |            |               |             |
| 2001       | O       | trt_chk_rslt     | 1           | 7       |           |            |            |            | 1         |          |              |                |                |                  | 待遇检查结果                 |            |               |             |
| 2208       | O       | hifob_pay        | 1           | 16      |           |            | 0          |            | 1         |          |              |                |                |                  | 职工大额医疗费用补助基金支出 |            |               |             |
| 2208       | O       | maf_pay          | 1           | 17      |           |            | 0          |            | 1         |          |              |                |                |                  | 医疗救助基金支出             |            |               |             |
| 2208       | O       | oth_pay          | 1           | 18      |           |            | 0          |            | 1         |          |              |                |                |                  | 其他支出                     |            |               |             |

## 29日

### 在院支付扣款四个方面

统筹支付 - 公务员 - 大病  合并为基金

医院垫付

账户支付：有些人希望自己付，比如军人，军人账户支付医院还会给钱。

个人现金支付。支付方式：现金、微信、支付宝、银行。



mdtrtid(新医保里面)

psnnumber(医保里面)

patientid+visitnumber 组成传入医保中的id

费用流程是his中最复杂的，his中最复杂的是医保费用。

### 医保门诊结算流程



### 门诊就诊信息上传

门诊费

诊疗费

### 是否异常

his失败，医保成功

his成功，医保失败：医保成功做了，返回失败信息，his成功将此次作废。

只有在月底对账的时候（月底医保打钱到医院）才能发现

hospotal_config表

### 视频学习 第20讲

控件：treeview，命名tv_1

![image-20211129173702364](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211129173702364.png)

#### 常用函数：

##### 1 FindItem

ll_item = tv_1.FindItem(navigationcode,handle) 返回值就是一个long类型的。

第一个参数：枚举类型

NextTreeItem ParentTreeItem 

ChileTreeItem RootTreeItem

##### 2 InsertItemLast

tv_1.InsertItemLast(handleparent,label,Selectedpicture)

tv_1.insertitemlast(handleparent,item)

item：treeview类型的变量

Data、Label、pictureIndex、SelectPicture

##### 3 getItem

tv_1.getItem(handle,tvi)

item：treeview类型的变量

任务：

创建树形结构，显示各部门的员工。目的：掌握TreeView编程，复习游标的使用。扩充练习：增减‘性别’层

![image-20211202000710528](C:\Users\11839\AppData\Roaming\Typora\typora-user-images\image-20211202000710528.png)

```
//wf_refresh_regist
//更新检索号别
//
string ls_time_desc,ls_tmp
time sys_current_time,temp_time
datetime ldt_sysdate
date ldate_sysdate
long ll_row,ll_all
long ll_app_limits,ll_curr_no

//广安门2014-12
string ls_afternoon_startclinic
ls_afternoon_startclinic=ProfileString(ini_file,"time","afternoonstart0","")
//广安门2014-12

//下午不显示上午号				
//----上下午分割时刻
afternoon_start=ProfileString(ini_file,"time","afternoonstart","")
select sysdate  into :ldt_sysdate from dual;
if afternoon_start<>"" and not isnull(afternoon_start) then 	
	sys_current_time=time(ldt_sysdate)
	if sys_current_time >= time(afternoon_start) then
		ls_tmp = '上午'
	else
		ls_tmp = '下午'
	end if
end if
dw_clinic_for_regist.setredraw( false)
dw_clinic_for_regist.settransobject(sqlca)


//当天号表检索
ldate_sysdate=date(ldt_sysdate)
if flag=1 then 
	//分诊处挂号
	ll_all = dw_clinic_for_regist.Retrieve(ldate_sysdate,dept)
else
	//集中挂号
	ll_all = dw_clinic_for_regist.Retrieve(ldate_sysdate)
end if
//删除出诊时间不合适的号
for ll_row=ll_all to 1 step -1
	ls_time_desc = dw_clinic_for_regist.getitemstring(ll_row,"time_desc")
	if ls_time_desc=ls_tmp then
		//广安门2014-12
		if sys_current_time <= time(ls_afternoon_startclinic) or sys_current_time >time(afternoon_start)  then
			dw_clinic_for_regist.deleterow(ll_row)
		end if
		//广安门2014-12
//		dw_clinic_for_regist.deleterow(ll_row)

	else
		//显示当前号= 预约限号数+当前号zjh
//		ll_app_limits=dw_clinic_for_regist.GetItemNumber(ll_row,4)
		ll_curr_no   =dw_clinic_for_regist.GetItemNumber(ll_row,11)
		if isnull(ll_app_limits) then ll_app_limits=0
		if isnull(LL_curr_no) or LL_curr_no=0 then LL_curr_no=1
		if LL_curr_no=1 then
			dw_clinic_for_regist.SetItem(ll_row,"clinic_for_regist_current_no",ll_app_limits+LL_curr_no)
		end if
	end if
next
dw_clinic_for_regist.setredraw( true)
```

## 12月6日

12月123日的记录在另外一个文档

[文档地址](I:\Symedsoft\研发部\11月30.md)

任务

* 1 java小数计算问题

* 2 学习汇报ppt制作
  * 看别人的

