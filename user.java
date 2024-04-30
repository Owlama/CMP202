package User;

public class User {
    String name;
    String password;

    String login() {
        if (!name.equals("") && !password.equals("")) {
            return "Logged in";
        } else {
            return "Login failed";
        }
    }

    String logout() {
        return "Logged out";
    }

    String register() {
        if (!name.equals("") && !password.equals("")) {
            return "Registered";
        } else {
            return "Registration failed";
        }
    }
}

