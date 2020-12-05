package LearnCode.day12092;

/**
 * @author: chenwei
 * @data: 2020/12/2 23:34
 */

/*
* 简单的一个 continue 会退回最内层循环的开头（顶部），并继续执行。

带有标签的 continue 会到达标签的位置，并重新进入紧接在那个标签后面的循环。

break 会中断当前循环，并移离当前标签的末尾。

带标签的 break 会中断当前循环，并移离由那个标签指示的循环的末尾。
* */
public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while(true) {
            System.out.println("Outer while loop");
            while(true) {
                i++;
                System.out.println("i = " + i);
                if(i == 1) {
                    System.out.println("continue");
                    continue;
                }
                if(i == 3) {
                    System.out.println("continue outer");
                    continue outer;
                }
                if(i == 5) {
                    System.out.println("break");
                    break;
                }
                if(i == 7) {
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}
/*
 * Outer while loop
 * i = 1
 * continue
 * i = 2
 * i = 3
 * continue outer
 * Outer while loop
 * i = 4
 * i = 5
 * break
 * Outer while loop
 * i = 6
 * i = 7
 * break outer
 *
 * */
