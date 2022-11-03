package allSets;

import allLists.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkdHashSet
{

    private static int anInt;

    public static void main(String[] args)
    {
        LinkedHashSet<Student> student = new LinkedHashSet<>();
        student.add(new Student(1,"khan"));
        student.add(new Student(3,"hamraz"));
        student.add(new Student(2,"Khan mohammad"));

        // return the size of array
        System.out.println(student.size());

        // return the refrence of pipline in parallel mode
        System.out.println(student.stream().parallel());

        // clear the set
        student.clear();

        // dispaly the hashCode of set
        anInt = student.hashCode();
        System.out.println("=====> "+ anInt);

        Iterator<Student> studentIterator = student.iterator();
        while(studentIterator.hasNext())
        {
            Student student1 = studentIterator.next();
            System.out.println(student1.getId()+": "+student1.getName());
        }
    }
}
