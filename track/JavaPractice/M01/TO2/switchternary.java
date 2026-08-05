
public class switchternary {

    public static void main(String[] args) {
        int roundCode = 4;
        int attemptsUsed = 2;
        int maxAttempts = 3;
        String roundName;
        // Select the round and attempt status, then print them
        switch (roundCode) {
            case 1:
                System.out.println("Current Round: Aptitude Round");
                break;
            case 2:
                System.out.println("Current Round: Technical Round");
                break;
            case 3:
                System.out.println("Current Round: HR Round");
                break;
            case 4:
                System.out.println("Current Round: Final Review");
                break;
            case 5:
                System.out.println("Current Round: Final Review");
                break;
            default:
                System.out.println("Invalid Round");
        }
        String res = attemptsUsed < maxAttempts ? "Attempt Available" : "Attempt Limit Reached";
        System.out.println("Attempt Status: " + res);
    }
}
