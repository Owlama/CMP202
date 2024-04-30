package User;

public class Student extends User {
    String matric_no = "bhu/22/04/05/0030";
    String departmentId = "dept/9087542134679";

    String registerCourse() {
        if (matric_no.equals("") || departmentId.equals("")) {
            return "You cannot register at this moment";
        } else {
            return "Registered all courses";
        }
    }

    String checkResults() {
        if (matric_no.equals("") || departmentId.equals("")) {
            return "Cannot check results";
        } else {
            return "All papers graded: 15 A's, 10 B's, and 5 C's";
        }
    }
}
