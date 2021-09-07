# 打算完成的任务
## 1. 入出库系统  
## 2. 爬虫，根据爬取的结果做一个搜索功能，爬取黔江政府网[黔江政府网](https://www.qianjiang.gov.cn/zwxx_210/gsgg/index_66.html#dw)
## 3. 卖货小商城，比如鸡爪，小商城下单地点，下单是微信小程序还是web页面
&ensp;&ensp;用Java做一个爬虫，再用python做一个。  
&ensp;&ensp;完成爬取黔江政府网站所有公告，将内容存储进数据库，这里数据库好像只能用mongodb。  
&ensp;&ensp;爬取数据后，做一个网站，根据输入的关键词检索，首先检索标题有没有关键词，再检索文章内部有没有关键词，然后返回这篇文章的地址，
这里就要求存储的数据全部为汉字，就是不要像以前python爬虫把一个网页所有标签啥的都爬下来，只需要汉字就可以了。  
## 爬虫不止黔江政府网，残联和重庆人力资源网站也弄
## 域名已有，https证书也有，放点东西上去看看，熟悉熟悉Linux命令
## 找工作职位
1. [重庆巨东科技有限公司](https://jobs.51job.com/chongqing-ybq/134164860.html?t=2&s=01)
## 需要注意的一些面试题
1. 代理模式、工厂模式
2. 手写单例模式，饿汉式、懒汉式、线程安全的
3. 抽象类和接口的区别
4. == 和equals的区别
5. 手写对象排序，有两种方式
6.  String、Stringbuffer、Stringbuilder的异同
7. 手写快速排序，冒泡排序，归并排序、深度、广度优先搜索、并查集
8. 多线程实现的几种方式+ 线程通信
## 每日记录
### 2021年8月31日
#### 今日打算做
1. 阅读《数学之美》第一章，并记录读后收获记录在Markdown文档中
2. 学习Java day25
3. 用springboot+vue制作一个身份证校验系统
## 一些需要解决的问题
1. 对事务的理解
2. ORM:对象关系映射，一张表对应一个类

## 再创建springboot项目遇到的一些问题
### 1. 使用easecode时，id无符号自增，其实是只能时正数
### 2. spingboot集成了security,会多出一个登录界面，密码会在控制台输出，用户名为user,去掉这个依赖即可(其实就是手贱，不点springboot security什么事没有)
1. 在@SpringBootApplication注解上排除掉烦人的SpringSecurity，不要让它自动配置  
```java
@SpringBootApplication(exclude={SecurityAutoConfiguration.class,SecurityFilterAutoConfiguration.class})
```
### 3. [从零开始创建springboot项目](https://blog.csdn.net/u014553029/article/details/110473509)
### 4. 连接数据库时报错 [Failed to configure a DataSource: 'url' attribute is not specified and no embedded](https://blog.csdn.net/qq_34322008/article/details/89954934?utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-1.control&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-1.control)
1. 在 SpringBoot 应用程序启动时，排除 jdbc 的自动装配机制即可，在程序入口文件中新增配置注解 “ exclude=DataSourceAutoConfiguration.class ” 
```java
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class ToolsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ToolsApplication.class, args);
	}
}
```
### 5. 导入数据库文件错误
