package org.jmc.mydomain;

public class Intern extends Employee {
    private final int SALARY_LIMIT = 20000;

    Intern() {
        super();
    }

    public Intern(String name, String email, int age, int salary) {
        super(name, email, age);
        setSalary(salary);
    }

    @Override
    public void setSalary(int salary) {
        if (SALARY_LIMIT < salary) {
            System.out.println("Error: Intern " + getName() + " salary " + salary + " exceeds the limit");
        } else {
            super.setSalary(salary);
        }
    }

}
