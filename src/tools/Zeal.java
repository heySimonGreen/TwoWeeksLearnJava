package tools;

/**
 * @author: chenwei
 * @date: 2021/9/6 16:17
 * @description:
 * https://blog.csdn.net/DickDiShuiShiChuan/article/details/112283732
 * http://api.zealdocs.org/v1/docsets
 */
public class Zeal {
  public static void main(String[] args) {
    String cityName = null;
    String name = null;

    cityName = "tokyo.kapeli.com";
    name = "VueJS";
    String url = "https://" + cityName+ ".kapeli.com/feeds/" + name + ".tgz";
    System.out.println(url);
  }
}
