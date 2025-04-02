package org.jmc.mydomain;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Intern intern1 = new Intern("John", "john@email.com", 25, 18000);
        intern1.setSalary(25000); // this salary should not be updated

        System.out.println("intern1 = " + intern1);

        List<Employee> listEmployees = Arrays.asList(
                new Employee("Juan", "juan@email.com", 25, 25000),
                new Employee("Maria", "maria@email.com", 20, 25000),
                new Employee("Mario", "mario@email.com", 40, 25000),
                new Employee("Andrés", "andres@email.com", 25, 25000),
                new Employee("Víctor", "victor@email.com", 25, 25000),
                new Intern("Amalia", "amalia@email.com", 25, 25000),
                new Intern("Julia", "julia@email.com", 22, 19000),
                new Intern("Julian", "julian@email.com", 24, 18000),
                new Intern("Martín", "martin@email.com", 30, 18000),
                new Intern("Alicia", "alicia@email.com", 40, 20000)
        );

        System.out.println("\nWriting to employees.txt file:");
        // save employees to file employees.txt
        try (FileWriter writer = new FileWriter("employees.txt")) {
            listEmployees.stream().forEach(employee -> {
                try {
                    System.out.println(employee.toStringForFile());
                    writer.write(employee.toStringForFile() + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}