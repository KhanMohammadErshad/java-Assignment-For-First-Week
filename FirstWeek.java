package firstweek;

import java.util.ArrayList;

public class FirstWeek
{

    // 6: Access Modifiers        10: Scope of variables
    protected static int number;      // 5.1: static variable
    String lastName;
    private static final String name = "Khan Mohammad";      // 5.2: Constants
                        // 8: passing objects to method
    public static void show(ArrayList st)          // 5.3: static methods that call with class name
    {
        for( Object stu : st)
        {
            if( stu instanceof Student )
            {
                Student student = (Student) stu;
                                      // 3: accessing Objects via reference variables
                System.out.println("ID: "+student.getId()+" Name: "+student.getName());
            }
        }
    }
    public static void main(String[] args)
    {
        // 1: Classes and Objects
        Student student = new Student(5,"Khanooo");

        // 4: Using classes from the java library
        // 9: Array of Objects
        ArrayList<Student> list = new ArrayList<>();
                  // 2: Constructing objects using constructors
        list.add(new Student(1,"Nayaim"));
        list.add(new Student(2,"Mohammad"));
        list.add(new Student(3,"Khalid"));
        list.add(new Student(4,"Khan"));

        System.out.println("this is the static method that get objects as parameters ");
        FirstWeek.show(list);

    }
}


// Mutable and emutable objects and classes

// emutable like ArrayList, LIST and etc...

// Mutable like int String float boolean and etc...