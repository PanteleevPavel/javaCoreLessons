package lesson5_introductionToOOP;

public class Main {

    private static final String[] firstname = {"Alexander", "Petr", "Albert", "Dmitriy", "Vladimir"};
    private static final String[] patronymic = {"Ivanovich", "Fedorov", "Mikhailovich", "Andreevich", "Artamonovich"};
    private static final String[] lastname = {"Kruzernshtern", "Krasnov", "Stepanenko", "kizilcin", "Antonov"};
    private static final String[] posts = {"CEO", "QSD", "CTO", "PO", "Financing Manager", "HR manager", "Designer", "Office manager", "SMM"};
    private static final Employee[] listEmployee = new Employee[5];

    public static void main(String[] args) {

        //Метод для генерации сотрудников, чтобы не хардкодить)))
        createNewEmployee(listEmployee.length);

        //Цикл для вывода сотрудников старше 40 лет
        for (int i = 0; i < listEmployee.length; i++) {
            if (listEmployee[i].getAge() > 40) {
                Employee.outputToTheConsoleObject(listEmployee[i]);
                System.out.println();
            }
        }

        System.out.println("РАСЧЁТ ОКОНЧЕН\n");

        //Следующий цикл для проверки всего, что было в массиве
        for (int i = 0; i < listEmployee.length; i++) {
            System.out.println("Сотрудник № " + (i + 1));
            Employee.outputToTheConsoleObject(listEmployee[i]);
            System.out.println();
        }
    }

    private static void createNewEmployee(int howMuch) {

        for (int i = 0; i < howMuch; i++) {
            listEmployee[i] = new Employee(
                    firstname[generateRandomNumber(0, firstname.length - 1)],
                    patronymic[generateRandomNumber(0, patronymic.length - 1)],
                    lastname[generateRandomNumber(0, lastname.length - 1)],
                    posts[generateRandomNumber(0, posts.length - 1)],
                    Employee.getEmployeeCount() + "@corpadress.ru",
                    generateRandomNumber(100000, 999999),
                    generateRandomNumber(70000, 300000),
                    generateRandomNumber(20, 45));
        }
    }

    private static int generateRandomNumber(int min , int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}