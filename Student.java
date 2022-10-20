package firstweek;

public class Student
{
    int id;
    String name;
    public Student(int id , String name)
    {
        // 11: This reference
        this.id=id;
        this.name=name;
    }


    // 7: Data field encapsulation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
