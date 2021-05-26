package lesson5_introductionToOOP;

public class Employee {
    //Поле с ФИО из ТЗ разделил на Фамилию, Имя и Отчество просто для более рандомной и красивой генерации, надеюсь не будет ошибкой))
    private static int employeeCount = 1;
    private String firstName;
    private String patronymic;
    private String lastName;
    private String post;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee(String post) {
        this("Неизвестно", "Неизвестно", "Неизвестно", post, "Неизвестно", 0, 0, 0);
        employeeCount++;
    }

    public Employee(String firstName, String patronymic, String lastName, String post) {
        this(firstName, patronymic, lastName, post, "Неизвестно", 0, 0, 0);
        employeeCount++;
    }

    public Employee(String firstName, String patronymic, String lastName, String post, int age) {
        this(firstName, patronymic, lastName, post, "Неизвестно", 0, 0, age);
        employeeCount++;
    }

    public Employee(String firstName, String patronymic, String lastName, String post, String email, int age) {
        this(firstName, patronymic, lastName, post, email, 0, 0, age);
        employeeCount++;
    }

    public Employee(String firstName, String patronymic, String lastName, String post, String email, int phoneNumber, int age) {
        this(firstName, patronymic, lastName, post, email, phoneNumber, 0, age);
        employeeCount++;
    }

    public Employee(String firstName, String patronymic, String lastName, String post, String email, int phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void outputToTheConsoleObject(Employee name) {
        System.out.println("Имя " + name.getFirstName());
        System.out.println("Отчество " + name.getPatronymic());
        System.out.println("Фамилия " + name.getLastName());
        System.out.println("email " + name.getEmail());
        System.out.println("Номер телефона " + name.getPhoneNumber());
        System.out.println("Должность " + name.getPost());
        System.out.println("Зарплата " + name.getSalary());
        System.out.println("Возраст " + name.getAge());
    }
}