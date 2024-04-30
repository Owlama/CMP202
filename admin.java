package User;

public class Manager extends User {
    String staffNo = "bhu/staff/1953";

    void uploadResults(String course, float score) {
        if (!staffNo.equals("")) {
            System.out.println(course + " " + score);
        } else {
            System.out.println("Enter a staff no");
        }
    }
}
