package LearnCode.day1208;

import java.util.Comparator;

/**
 * @author: chenwei
 * @data: 2020/12/8 23:33
 * 面试题，对象根据某个字段去重，例如根据名字去重复。还有根据字段排序
 */
public class Students {
    private String name;
    private String id;
    private String gender;
    public static String del(String a){
        return a+"3";
    }
    public static int del(String a,String b){
        return 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Students(){

    }

    public Students(String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

//    @Override
//    public int compareTo(Students o) {
//        return 0;
//    }

    public static class nameComparator implements Comparator<Students>{
        @Override
        public int compare(Students o1, Students o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    @Override
    public boolean equals(Object obj) {
        Students students =(Students) obj;
        return (name.equals(students.name))&&(id.equals(students.id));
    }

    @Override
    public int hashCode() {
        String in = name;
        String id = this.id;
        return in.hashCode()*id.hashCode();
    }
}
