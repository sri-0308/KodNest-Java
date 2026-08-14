class overloading{
    String name;
    int age;
    double height;
    overloading()
    {
       name="Anu";
       age=19;
       height=5.0;
    }
    overloading(String name)
    {
        this.name=name;
    }
    overloading(String name,int age,double height)
    {
        this.name=name;
        this.age=age;
        this.height=height;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
public class constructoroverloading {
    public static void main(String args[])
    {
        overloading o1=new overloading();
        o1.display();
        overloading o2=new overloading("Sri");
        o2.display();
        overloading o3=new overloading("sri",10,4.5);
        o3.display();

    }
}
