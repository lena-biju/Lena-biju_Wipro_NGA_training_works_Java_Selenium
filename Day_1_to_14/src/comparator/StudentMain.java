package comparator;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students("Manu", 21));
        list.add(new Students("Zara", 26));
        list.add(new Students("Abhay", 22));
        
        
//using lamda exp sorting the age here
        
        System.out.println("Before sorting by age:");
        for (Students s : list) {
            System.out.println(s.getAge());
        }

        Collections.sort(list, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

        System.out.println("After sorting by age:");
        for (Students s : list) {
            System.out.println(s.getAge());
        }

 // Sort by Name using anonymous class
        System.out.println("Before sorting by name:");
        for (Students s : list) {
            System.out.println(s.getName());
        }

        Collections.sort(list, new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        System.out.println("After sorting by name:");
        for (Students s : list) {
            System.out.println(s.getName());
        }
    }
}


//sorting by using lambda expression.
/*
 *list.sort((s1,s2)->Integer.compare(s1.getName(),s2.getName()));
 *list.forEach(System.out::println) ;
 * */
