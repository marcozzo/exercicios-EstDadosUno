import java.util.ArrayList;

public class Employee{
    private String name;
    private Integer id;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void increaseSalary(Double percentage){
        if( percentage <= 1 && percentage > 0){
            this.salary += this.salary * percentage;
        } else {
            System.out.println("Porcentagem inválida!");
        }
    }

    public String getName(){
        return this.name;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }
}