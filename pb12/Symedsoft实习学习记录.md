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

##### 系统事件：

对象上已经提供的所有事件

##### 缺省事件：

初次打开时的事件

##### 自定义事件：

有消息映射的。窗口中选择 new event。Event name 开头用ue_开头，表示user event用户自定义事件

eg:新建一个自定义事件。右键点击起来框内文本改变。

##### 自定制事件：

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

timer

触发时机：每隔指定的秒数后自动触发。

Timer函数：设定时间间隔

常用编程：处理周期性事件

编程注意点:执行用时不能接近间隔时间，更不能大于间隔时间。

![window对象-上机1](I:\Symedsoft\研发部\window对象-上机1.PNG)

视频18

