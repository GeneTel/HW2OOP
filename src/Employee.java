public class Employee {
    // Can I also use _fullName, _position..... and instead of this use underscore in my Setters?
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Employee(String fullName, String position, String email, String phoneNumber, int age) {

        setFullName(fullName);
        setPosition(position);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setAge(age);
    }



}
