
import java.util.Scanner;

class userinput {

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter byte value:");
            byte a = sc.nextByte();
            System.out.println("The byte value is : " + a);
            System.out.println("Enter short value:");
            short b = sc.nextShort();
            System.out.println("The short value is : " + b);
            System.out.println("Enter integer value:");
            int c = sc.nextInt();
            System.out.println("The integer value is : " + c);
            System.out.println("Enter long value:");
            long d = sc.nextLong();
            System.out.println("The long value is : " + d);
            System.out.println("Enter float value:");
            float e = sc.nextFloat();
            System.out.println("The float value is : " + e);
            System.out.println("Enter double value:");
            double f = sc.nextDouble();
            System.out.println("The double value is : " + f);
        }
    }
}
