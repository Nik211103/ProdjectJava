package Praktica.Praktica2;
/*Создайте класс Employee (Сотрудник) с полями name (имя), age (возраст) и salary (зарплата).
Реализуйте конструктор, геттеры и сеттеры для каждого поля.

Далее создайте подклассы Manager (Менеджер) и Developer (Разработчик), которые наследуются от класса Employee.
Добавьте дополнительное поле department (отдел) для каждого подкласса и соответствующие геттеры и сеттеры.

Напишите метод displayDetails(), который выводит информацию о сотруднике, включая имя, возраст, зарплату и отдел.*/

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Зарплата: " + salary);
    }
}
