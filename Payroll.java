/*
 * Payroll Class
 * Used to demonstrate Polymorphism and Inheritance
 * Based On "Java How To Program, 10, Early Objects" - Chapter 10.
 */
public class Payroll {
    
    public static void main(String[] args) {
        CommissionEmployee emp1 = new CommissionEmployee("Malcolm", "Reynold", "111-11-111",
                100000, .06);
        BasePlusCommissionEmployee emp2 = new BasePlusCommissionEmployee("Zoe", "Wash", 
                "222-22-222", 100000, .05, 500);
        SalariedEmployee emp3 = new SalariedEmployee("Hoburn", "Wash", "333-33-333",
                3000);
        HourlyEmployee emp4 = new HourlyEmployee("Jayne", "Cobb", "444-44-444",
                10, 50);
        
        //Array of employees
        Employee[] myEmployees = new Employee[4];
        myEmployees[0] = emp1;
        myEmployees[1] = emp2;
        myEmployees[2] = emp3;
        myEmployees[3] = emp4;
        
        for (Employee currentEmp : myEmployees) {
            System.out.println(currentEmp);
            
            if(currentEmp instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee tempEmp = 
                        (BasePlusCommissionEmployee) currentEmp;  //Downcast in order to call methods
                        
                tempEmp.setBaseSalary(tempEmp.getBaseSalary() * 1.10);
                System.out.printf("%s: $%.2f%n", "New Base Salary",tempEmp.getBaseSalary());
            }
            
            System.out.printf("%s: $%.2f%n%n","Earnings", currentEmp.getEarnings());
        }
        
        for (int j = 0; j < myEmployees.length; j++) {
            System.out.printf("%s %d %s %s%n", "Employee", j+1, "is a(n)", myEmployees[j].getClass().getName());
        }
    }//End Main
    
}//End Payroll
