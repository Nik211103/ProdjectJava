package Praktica.Praktica2;

public class Developer extends Employee{
    private String department;
    public Developer(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Отдел: " + department);
    }
}
