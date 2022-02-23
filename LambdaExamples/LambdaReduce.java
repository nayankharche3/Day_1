/**
 * Created by ADMIN on 7/2/17.
 */
import java.util.Arrays;
import java.util.List;

class Employee{
    private String name;
    private Integer age;
    private Double salary;
    public Employee(String name, Integer age, Double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public double getSalary()
    {
        return salary;
    }

    //getters and setters for name and age attributes go here
    //overridden equals() and hashcode() go here
    public String toString(){
        return "Employee Name: "+this.name
                +"  Age: "+this.age
                +"  Salary: "+this.salary;
    }
}


public class LambdaReduce {
    static List<Employee> employeeList = Arrays.asList(
            new Employee("Kishore", 45, 8500.00),
            new Employee("Kumar", 25, 10000.00),
            new Employee("Kiran", 28, 10000.00),
            new Employee("Naveen", 32, 11000.00),
            new Employee("Niranjan", 33, 1000.00));

    public static void main(String[] args) {
        Double totalSalaryExpense = employeeList.stream() //creates stream
                .map(emp -> emp.getSalary()) //
                .reduce(0.00,(a,b) -> a+b);
        
        System.out.println("Total salary expense: "+totalSalaryExpense);
        
        Double minSalary = employeeList.stream() //creates stream
                .map(emp -> emp.getSalary()) //
                .reduce(9999.99,(a,b) -> a>b?b:a );
     
        System.out.println(minSalary);
    }
}