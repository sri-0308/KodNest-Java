
import java.util.Scanner;

public class userinputwithconditions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int days = sc.nextInt();
        int solvedProblems;
        int total = 0;
        for (int i = 0; i < days; i++) {
            solvedProblems = sc.nextInt();
            total = total + solvedProblems;
        }
        double avg = total / days;
        System.out.println("Learner: " + name);
        System.out.println("Total solved: " + total);
        System.out.println("Daily average: " + avg);
        String status = "";
        if (avg >= 5) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }
        System.out.println("Status: " + status);
        sc.close();
    }
}
