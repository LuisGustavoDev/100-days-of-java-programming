package constant;

public class Login {
    // static
    // snake case name
    // final
    private static final int MIN_LENGTH_PASSWORD = 7;

    public void verifyPassword(String password) {
        if (password.length() >= MIN_LENGTH_PASSWORD) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
