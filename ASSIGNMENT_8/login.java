import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String name;
    private String mobileNumber;
    private String email;

    // Getters and setters for name, mobileNumber, and email

    public String execute() {
        // Perform validations
        if (name == null || name.trim().isEmpty() || !name.matches("[a-zA-Z]+")) {
            addActionError("Invalid name. Please enter a valid name.");
            return INPUT;
        }
        
        if (mobileNumber == null || mobileNumber.trim().isEmpty() || !mobileNumber.matches("\\d{10}")) {
            addActionError("Invalid mobile number. Please enter a 10-digit mobile number.");
            return INPUT;
        }

        if (email == null || email.trim().isEmpty() || !email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            addActionError("Invalid email address. Please enter a valid email.");
            return INPUT;
        }

        // Validation successful, redirect to welcome page
        return SUCCESS;
    }
}
