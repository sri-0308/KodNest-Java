
public class learningprogress {

    public static void main(String[] args) {
        int ctopics = 17;
        int topics = 20;
        int dailyhours = 3;
        int ldays = 5;
        int rem = topics - ctopics;
        int wlearn = dailyhours * ldays;
        double progress = (double) ctopics * 100 / topics;
        System.out.println("Completed Topics: " + ctopics);
        System.out.println("Remaining Topics: " + rem);
        System.out.println("Weekly Learning Hours: " + wlearn);
        System.out.println("Progress Percentage: " + progress);
    }
}
