package learncodeday15.stage20;

/**
 * @author: chenwei
 * @date: 2021/7/19 17:00
 */
public interface CompareObj {
    /**
    * 若返回值是0，表示当前值和比较值大小相等
    * 若返回值是负数，表示当前值比被比较值小
    * 若返回值是正数，表示当前值比被比较值大
    */
    public int compareTo(Object o);
}
