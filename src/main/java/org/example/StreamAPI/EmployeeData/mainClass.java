package org.example.StreamAPI.EmployeeData;

import java.util.*;
import java.util.stream.Collectors;

public class mainClass {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //How many male and female employees are there in the organization?
        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);
        System.out.println("--------------------------------------------------");

        //Print the name of all departments in the organization?
        List<String> collect1 = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("--------------------------------------------------");

        //What is the average age of male and female employees?
        Map<String, Double> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        System.out.println(collect2);
        System.out.println("--------------------------------------------------");

        //Get the details of highest paid employee in the organization?
        Employee employee = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(employee);
        System.out.println("--------------------------------------------------");

        //Get the names of all employees who have joined after 2015?
        List<String> collect3 = employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println(collect3);
        System.out.println("--------------------------------------------------");

        //Count the number of employees in each department?
        Map<String, Long> collect4 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect4);
        System.out.println("--------------------------------------------------");

        //What is the average salary of each department?
        Map<String, Double> collect5 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect5);
        System.out.println("--------------------------------------------------");

        //Get the details of youngest male employee in the product development department?
        Employee employee1 = employeeList.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("product development") && e.getGender().equalsIgnoreCase("Male"))
                .min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(employee1);
        System.out.println("--------------------------------------------------");

        //Who has the most working experience in the organization?
        Employee employee2 = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get();
        System.out.println(employee2);
        System.out.println("--------------------------------------------------");

        //How many male and female employees are there in the sales and marketing team?
        Map<String, Long> collect6 = employeeList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("sales and marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect6);
        System.out.println("--------------------------------------------------");

        //What is the average salary of male and female employees?
        Map<String, Double> collect7 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect7);
        System.out.println("--------------------------------------------------");

        //List down the names of all employees in each department?
        Map<String, List<Employee>> collect8 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entries = collect8.entrySet();
        for (Map.Entry<String, List<Employee>> entry: entries) {
            System.out.println(entry.getKey());
            for (Employee emp : entry.getValue()) {
                System.out.println(emp.getName());
            }
        }
        System.out.println("--------------------------------------------------");

        //What is the average salary and total salary of the whole organization?
        double sum = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Sum : "+sum);
        double average = employeeList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println("Average : "+average);
        System.out.println("--------------------------------------------------");

        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
        Map<Boolean, List<Employee>> collect9 = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() <= 25));
        Set<Map.Entry<Boolean, List<Employee>>> entries1 = collect9.entrySet();
        for (Map.Entry<Boolean, List<Employee>> entry : entries1){
            if(entry.getKey()){
                System.out.println("Younger or equal to 25 Years");
            }else{
                System.out.println("Older than 25 Years");
            }
            for (Employee emp: entry.getValue()){
                System.out.println(emp.getName());
            }
        }
        System.out.println("--------------------------------------------------");

        //Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Employee employee3 = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Name : "+employee3.getName()+",Age : "+employee3.getAge()+" and Department : "+employee3.getDepartment());
        System.out.println("--------------------------------------------------");




    }
}
