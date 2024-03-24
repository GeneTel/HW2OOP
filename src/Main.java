public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Deer Marcus", "manual qa", "test@mail.com", "513551133",25);

        System.out.println(emp.getFullName());
        System.out.println(emp.getPosition());
        System.out.println(emp.getEmail());
        System.out.println(emp.getPhoneNumber());
        System.out.println(emp.getAge());
    }


}
