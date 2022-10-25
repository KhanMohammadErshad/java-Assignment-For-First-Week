package thirdweek;

class abstraction extends Student
{
    String name =(String) subject.subjectName;
    String name1 = faculty.facultyName;
    @Override
    public void add(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }
    public String getName()
    {
        return studentName;
    }
    public int getId()
    {
        return studentId;
    }
    public String getFacultyName()
    {
        return name1;
    }
    public String getSubName()
    {
        return name;
    }
}
abstract class Student
{
    int studentId;
    String studentName;
    Subject subject;
    Faculty faculty;

    public abstract void add(int id , String name);
}

abstract class Subject
{
    String subjectName="Math";

  //  public abstract void add(int id , String name);
}

abstract class Faculty
{
    String facultyName="CS_Faculty";
  //  public abstract void add(int id, String name,);
}