package fourthweek;

public class Father
{
    String name="Hamdullah";
    public void showName(String name)
    {
        if(name.equals("Hamdullah"))
            System.out.println(name);
    }
    public int showName(int name)
    {
        return name;
    }
    public void show()
    {
        System.out.println("Hi I am Hamdullah Hamdard");
    }
}
class Child extends Father
{
    String name="Hamdullah";
    public void show()
    {
        super.show();
        System.out.println("Hi I am Khan Mohammad");
    }
}
class SubChaild extends Child
{

}
