class overloading
{
    void m1(short a,short b)
    {
        System.out.println("Short method");
        System.out.println(a+b);
    }
    void m1(int a,int b)
    {
        System.out.println("int method");
        System.out.println(a+b);
    }
}
public class primitiveoverloading {
    public static void main(String args[])
    {
        overloading o1=new overloading();
        o1.m1(10,20);
        o1.m1((short)10,(short)20);  //we need to explicitely specift that type otherwise java compiler defaultly converts into int that's why only int method is calling 
    }
    
}
