public class Employee {
    String name;
    String surname;
    int salary;
    int yearOfEmployment;

    Employee(String surname, String name, int salary, int yearOfEmployment) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String toString() {
        return "surname - " + surname + ", name - " + name + ", salary = "
                + salary + "$, year of employment: " + yearOfEmployment;
    }
}
