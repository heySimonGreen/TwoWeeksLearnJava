package learncode20210706day10basic;

/**
 * @author: chenwei
 * @date: 2021/7/8 11:58
 */
public class Girl {
    private String name;
    private int age;

    public Girl(){
    }

    public Girl(String name,int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy){
        System.out.println("我喜欢 " + boy.getName());
        boy.marry(this);
    }

    /*
    *  对象排序
    *  @Description 比较两个对象的大小
    *  @param girl
    *  @return 正数：当前对象大；负数：当前对象小；0：当前对象与形参对象相等
    *
    * */

    public int compare(Girl girl){
        System.out.println("compare with...");
//        if (this.age > girl.age){
//            return 1;
//        }else if(this.age< girl.age) {
//            return -1;
//        }else {
//            return 0;
//        }

        return this.age - girl.age;
    }
}
