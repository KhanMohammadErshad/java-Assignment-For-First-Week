package allLists;

import java.util.Vector;

public class vector
{
    public static void main(String[] args)
    {
        Student s = new Student(1,"Mohammad");
        Vector<Student> vector = new Vector<>();

        // important function in vector
        vector.add(new Student(1,"Khan"));
        vector.add(s);
        vector.addElement(new Student(2,"Khanooooooooo"));
        vector.add(new Student(2,"Hamdullah Hamdard"));
        vector.add(new Student(4 , "Haji Khan"));


        // display the size of vector
        System.out.println(vector.capacity());

        for( Student obj : vector )
        {
            System.out.println(obj.id+": "+obj.name);
        }
    }
}
