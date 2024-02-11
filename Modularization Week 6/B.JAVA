import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nStudents = in.nextInt(), nSubjects = in.nextInt();

        for (int i = 0; i < nSubjects; i++) {
            in.nextLine();
            String Subject = in.nextLine();
            int nApproved = in.nextInt();
            print(Subject, nApproved, nStudents);

        }
    }

    public static void print(String subject, int nApproved, int nStudents) {
        System.out.println("Subject: " + subject);
        StringBuilder graphApproved = new StringBuilder("- Approved: ");
        StringBuilder graphFailed = new StringBuilder("- Failed: ");

        for (int i = 0; i < nStudents; i++) {
            if (i < nApproved) {
                graphApproved.append("*");
            } else {
                graphFailed.append("*");
            }
        }

        System.out.println(graphApproved);
        System.out.println(graphFailed);
    }

}