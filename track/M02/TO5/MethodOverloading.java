public class MethodOverloading {
    public static void main(String args[])
    {
        Addition a=new Addition();
        System.out.println(a.add(2,3));
        System.out.println(a.add(4.5,4.5));
        System.out.println(a.add(3,4,5));
    }
    
}
class Addition
{
    int add(int a,int b)
    {
       return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    double add(int a,double b)
    {
        return a+b;
    }
    double add(double a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    double add(double a,double b, double c)
    {
        return a+b+c;
    }
}
