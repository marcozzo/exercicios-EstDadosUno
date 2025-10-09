import java.util.ArrayList;
import java.util.Scanner;

public class SalaryManager{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many employees will be registered? ");
        int n = sc.nextInt();
        if(n <= 0)
            return;
        
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Integer> idList = new ArrayList<>();

        // TAKE USER INPUT
        for (int i = 0; i < n ; i++) {

            System.out.println("\nEMPLOYEE #" + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            System.out.print("Id: ");
            Integer employeeId = 0;
            do {
                employeeId = sc.nextInt();
                if (idList.contains(employeeId))
                    System.out.print("\nID has already been taken. Try again." +
                                        "\nId: ");
            } while (idList.contains(employeeId));

            idList.add(employeeId);

            Employee nthEmployee = new Employee(employeeId, name, salary);
            idList.add(employeeId);

            employees.add(nthEmployee);
        }

        //SALARY INCREASE
        System.out.print("\nEnter ID of employee having a pay raise: ");
        int luckyOneId = sc.nextInt();
        double percentageInc;

        if(idList.contains(luckyOneId)){
            System.out.println("\nEnter the PERCENTAGE of the raise.");
            do{
                System.out.println("RULES: percentage has to be BETWEEN 5% AND 90%");
                percentageInc = sc.nextDouble();
            } while(percentageInc < 5 || percentageInc > 90);

            percentageInc /= 100;

            for(Employee employee: employees){
                if(employee.getId() == luckyOneId){
                    employee.increaseSalary(percentageInc);
                }
            }

        } else
            System.out.println("Employee ID does not exist!");


        System.out.println("\nLIST OF EMPLOYEES: ");
        for (Employee employee: employees) {
            System.out.println(employee.getId()+", "
                                +employee.getName()+", R$"
                                +employee.getSalary());
        }
    }
}