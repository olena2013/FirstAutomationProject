package helper;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String incorrectEmail;

    public User() {
        firstName = "Ivan";
        lastName = "Ivanov";
        email = "auto@gmail.com";
        password = "1234";
        phoneNumber = "(123) 333-444";
        incorrectEmail = "12345";

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIncorrectEmail(){return incorrectEmail;}
}
