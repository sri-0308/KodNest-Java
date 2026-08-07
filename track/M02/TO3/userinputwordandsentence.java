
import java.util.*;

public class userinputwordandsentence {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Name is: " + name);
        //nextline comes at starting no issues
        //but it came in the middle so it will consider the space as line and doesnot allow us to read the input
        //so use one more nextLine here
        sc.nextLine();
        System.out.println("Enter your full name: ");
        String fname = sc.nextLine();
        System.out.println("Full name is: " + fname);
    }
}
