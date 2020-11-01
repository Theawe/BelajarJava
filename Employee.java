import java.time.*;
public class Employee {
    // instance fields
    private final String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextId = 1;
    private int id;
    
    // constructor
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
        // a method
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }
    
    private boolean equals(Employee other)
    {
        return name.equals(other.name);
    }
    
    public void setId()
    {
        id = nextId;
        nextId++;
    }
    

}
