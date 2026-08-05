
public class placementeligible {

    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean activeBacklog = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;
        // Write the placement-readiness decision
        boolean academic = marks >= 60 && attendance >= 75 && !activeBacklog;
        if (!academic) {
            System.out.println("Improve Academic Eligibility");
        } else if (academic && !projectCompleted) {
            System.out.println("Complete the Project");
        } else if (projectCompleted && mockInterviewScore <= 70) {
            System.out.println("Improve Interview Skills");
        } else {
            System.out.println("Placement Ready");
        }
    }
}
