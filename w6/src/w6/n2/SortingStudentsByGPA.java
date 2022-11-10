package w6.n2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
    public int compare(Student o1, Student o2) {
        return o2.getFinalScore() - o1.getFinalScore();
    }

}
