
import java.util.*;

public class userinputcharacter {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        char ch = sc.next().charAt(3);
        System.out.println("Required character is: " + ch);
    }
}
