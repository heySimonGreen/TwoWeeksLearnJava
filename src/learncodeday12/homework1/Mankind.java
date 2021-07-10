package learncodeday12.homework1;

import javax.annotation.processing.SupportedSourceVersion;

/**
 * @author: chenwei
 * @date: 2021/7/9 16:22
 */
public class Mankind {
    private int sex;
    private int salary;
    public void manOrWoman(){
        if (sex == 1){
            System.out.println("man");
        }else if (sex == 0){
            System.out.println("women");
        }else {
            System.out.println("error");
        }
    }
    public void employed(){
        if (salary == 0){
            System.out.println("no job");
        }else if(salary !=0){
            System.out.println("job");
        }
    }

    public Mankind() {
    }

    public Mankind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
