package helper;

public class UserWalker {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String apt;
    private String city;
    private String zipCode;

    public UserWalker() {
        firstName = "Olya";
        lastName = "Ivanova";
        email = "newwalker@gmail";
        phone = "(635) 141-3582";
        address ="1050 Bollinger Canyon Road";
        apt = "11";
        city = "";
        zipCode = "";
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

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getApt() {
        return apt;
    }
    public String getCity(){
        return city;
    }
    public String getZipCode(){
        return zipCode;
    }


}
