package learncodeday15.stage20;

/**
 * @author: chenwei
 * @date: 2021/7/19 17:04
 */
public class ComparebleCircle extends Circle implements CompareObj{
    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof CompareObj){
            ComparebleCircle comparebleCircle = (ComparebleCircle) o;
            return this.getRadius().compareTo(comparebleCircle.getRadius());
        }else {
            new RuntimeException("o not instanceof CompareObj");
            return 0;
        }
    }

    public ComparebleCircle() {
    }

    public ComparebleCircle(Double radius) {
        super(radius);
    }
}
