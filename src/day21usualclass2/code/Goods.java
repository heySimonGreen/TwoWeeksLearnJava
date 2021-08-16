package day21usualclass2.code;

/**
 * @author: chenwei
 * @date: 2021/8/17 0:56
 * @description: 描述
 */
public class Goods implements Comparable{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    //指定商品比较大小的排序:例如价格从低到高排序,当价格相等时，按照名称排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods){
            Goods goods = (Goods) o;
            if (this.price == goods.price){
                return this.getName().compareTo(goods.getName());
            }
            return this.price - goods.price;
        }
        throw new RuntimeException("传入的数据不是goods");
    }
}
