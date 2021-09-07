package day24Collection.code;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: chenwei
 * @date: 2021/9/1 17:17
 * @description: 描述
 */
public class Practice2 {

    public static void main(String[] args) {
      Set treeSet = new TreeSet(new Comparator() {
          @Override
          public int compare(Object o1, Object o2) {
              if (o1 instanceof Students && o2 instanceof Students){
                  Students s1 = (Students) o1;
                  Students s2 = (Students) o2;
                  return -(s1.score-s2.score);
              }
              throw new RuntimeException("Object is not Students");
          }
      });
      for (int i=0;i<10;i++){
          treeSet.add(new Students("chen"+i,(int)(Math.random()*100 +1)));
      }
      System.out.println(treeSet);
  }
}
class Students{
    String name;
    int score;

    public Students(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Students students = (Students) o;
        return score == students.score && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
