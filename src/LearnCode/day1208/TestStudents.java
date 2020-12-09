package LearnCode.day1208;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: chenwei
 * @data: 2020/12/9 0:26
 */
public class TestStudents {
    public static void main(String[] args){
        List<Students> studentsList = new ArrayList<Students>();
        Students[] students;
        Students students1 = new Students("陈伟1","1","男f");
        Students students2 = new Students("陈伟3","3","男");
        Students students3 = new Students("陈伟2","2","女");
        Students students4 = new Students("陈伟1","1","男s");
        Students students5 = new Students("陈伟2","2","男");
        Students students6 = new Students("陈伟1","1","女");
        studentsList.add(students1);
        studentsList.add(students2);
        studentsList.add(students3);
        studentsList.add(students4);
        studentsList.add(students5);
        studentsList.add(students6);
        //下面的代码中，distinct通过hashcode去除重复
        studentsList = studentsList.stream().distinct().collect(Collectors.toList());
        Iterator iterator = studentsList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashMap<Students,String> hashMap = new HashMap<>();
        hashMap.put(students1,"students1");
        hashMap.put(students2,"students2");
        hashMap.put(students3,"students3");
        hashMap.put(students4,"students4");
        hashMap.put(students5,"students5");
        hashMap.put(students6,"students6");
        System.out.println("#########");
        for(Map.Entry<Students,String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Set<Students> studentsSet = new HashSet<>();
        studentsSet.add(students1);
        studentsSet.add(students2);
        studentsSet.add(students3);
        studentsSet.add(students4);
        studentsSet.add(students5);
        studentsSet.add(students6);
        Iterator iteratorSet = studentsSet.iterator();
        System.out.println("#########TestSet");
        while (iteratorSet.hasNext()){
            System.out.println(iteratorSet.next());
        }
//        System.out.println("#########");
//        System.out.println("排序后");
//        //对象根据某个属性排序,下面是两种方法
////        Collections.sort(studentsList, new Comparator<Students>(){
////            public int compare(Students s1,Students s2){
////                return s1.getName().compareToIgnoreCase(s2.getName());
////            }
////        });
//        Collections.sort(studentsList,new Students.nameComparator());
//        for(int i=0;i<studentsList.size();i++){
//            System.out.println(studentsList.get(i));
//        }
//        System.out.println("#########");
//        //复制list
//        List<Students> studentsList2 = new ArrayList<>();
//        for(int i = 0 ;i<studentsList.size();i++){
//            studentsList2.add(studentsList.get(i));
//            while (true){
//                int j=i+1;
//                if(j==studentsList.size()){
//                    break;
//                }
//                if(studentsList.get(i).equals(studentsList.get(j))){
//                    j++;
//                }else {
//                    i=j;
//                    break;
//                }
//            }
//        }
//        System.out.println("去除重复后");
//        for(int i=0;i<studentsList2.size();i++){
//            System.out.println(studentsList2.get(i));
//        }
    }
}
