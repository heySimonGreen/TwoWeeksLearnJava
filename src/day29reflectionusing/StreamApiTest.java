package day29reflectionusing;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: chenwei
 * @date: 2021/9/18 15:39
 * @description: StreamApi相关概述 1. Stream关注的是对数据的运算，与cpu打交道 集合关注的是数据的存储，与内存打交道
 * 2. 一、Stream 不会自己存储元素
 * 二、Stream 不会改变源对象。相反，他们会返回一个持有结果的新Stream
 * 三、Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行
 * 3. Stream执行流程
 * 一、Stream 的实例化
 * 二、一系列的中间操作(过滤、映射、。。。)
 * 三、终止操作
 * 4. 说明 一、 一个中间操作链，对数据源的数据进行处理 二、
 * 一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用
 */
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
