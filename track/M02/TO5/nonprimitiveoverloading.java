class overloading{
   void m1(String a,String b)
   {
     System.out.println("both string arguments");
   }
   void m1(overloading a,overloading b) //class name can be used as an datatype
   {                       //a and b are the two object references passed as parameters
    System.out.println("both overloading arguments");
   }
}
public class nonprimitiveoverloading {
    public static void main(String args[])
    {
        overloading o1=new overloading();
        //o1.m1(null,null);//compiler error because null treats as an input for both methods and will get ambiguity error
        //both are non primitive parameter methods .
    }
}
