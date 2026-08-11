class Student {
    int id;
    String name;
    double height;
    void sleep()
    {
        System.out.println("Sleeping");
    }
    void study()
    {
        System.out.println("Studying");
    }
    
}
public class StudApplication{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.id=22;
        s1.name="Sri";
        s1.height=5.5;
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.sleep();
        s1.study();
    }
}