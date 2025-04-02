package org.jmc.mydomain;

public class Employee {
    private String name;
    private String email;
    private int age;
    private int salary;

    public Employee() {

    }

    public Employee(String name, String email, int age) {
        setName(name);
        setEmail(email);
        setAge(age);
    }

    public Employee(String name, String email, int age, int salary) {
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String toStringForFile() {
        return "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary;
    }
}
