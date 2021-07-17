package learncodeday15.stage1to12vedio;

/**
 * @author: chenwei
 * @date: 2021/7/16 20:39
 */
public class TemplateTest {
    public static void main(String[] args){
        Template template = new SubTemplate();
        template.spendTime();
    }
}
abstract class Template{
    public void spendTime(){
        long start = System.currentTimeMillis();
        this.code();
        long end = System.currentTimeMillis();

        System.out.println("执行时间为：" + (end - start));
    }
  /**
   * 需要运行的代码
   * */
  public abstract void code();
}
class SubTemplate extends Template{

    @Override
    public void code() {
        int number = 10000000;
        int count = 0;
        for(int i=2;i<number;i++){
            boolean flag = false;
            for (int j=2;j<=Math.sqrt(i);j++){
                if (i%j ==0){
                    flag=true;
                    break;
                }
            }
            if (flag == false){
                System.out.println(i + "是质数");
                count++;
            }
        }
        System.out.println("质数的个数为：" + count);
    }
}
