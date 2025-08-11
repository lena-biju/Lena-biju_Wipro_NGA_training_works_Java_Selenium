package comparator;



import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {
    @Override
    public int compare(Students s1, Students s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
