class Student{
  String name;
  int age;
  double height;
  void input(String name,int age,double height)
  {
    this.name=name;
    this.age=age;
    this.height=height;
  }
  void display()
  {
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.height);
  }
}
public class StudentApplication {
    public static void main(String args[])
    {
      Student s1=new Student();
      s1.input("Sri",20,5.5);
      s1.display();
    }
}
