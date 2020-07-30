package domain;

public class Employee {
    private int id;
    private String name;
    private int age;
    private  double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
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

    public String getDescription() {
        return "" + getId() + "\t" + getName() + "\t\t" + getAge() + "\t" + getSalary();
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
