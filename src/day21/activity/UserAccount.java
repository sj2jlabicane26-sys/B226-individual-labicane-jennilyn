package day21.activity;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    //Constructor
    public UserAccount(String firstName, String middleName, String lastName, String address, String email, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        setEmail(email);
        setPassword(password);

    }

    // Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Validation
    public void setEmail(String email) {
        if (email.equals("labicane@gmail.com")) {
            this.email = email;
        } else {
            this.email = "Invalid Email";
        }
    }

    public void setPassword(String setpassword) {
        if (email.equals("jen123")) {
            this.password = password;
        }else {
            this.password = "Invalid Password";
        }
    }

    // Getter
    public String getFirstName() {
        return firstName;

    }
    
     public String getMiddleName() {
        return middleName;

    }
    
    public String getLastName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
