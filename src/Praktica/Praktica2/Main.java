package Praktica.Praktica2;

public class Main {
    public static void main(String[] args) {
        Developer javaDev = new Developer("Михаил", 23, 74345.68, "Java Backend");
        Manager manDev = new Manager("Дмитрий", 34, 150345.34, "Development");

        javaDev.displayDetails();
        manDev.displayDetails();
    }
}
