/*
 * Base Plus Commission Employee Subclass
 * Used to demonstrate inheritance
 * Based On "Java How To Program, 10, Early Objects" - Chapter 9.
 */

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String nFirstName, String nLastName, String nssNumber,
        double nGrossSales, double nCommissionRate, double nBaseSalary) {
        //Call superclass constructor
        super(nFirstName, nLastName, nssNumber, nGrossSales, nCommissionRate);
        
        //Validate and set base salary
        if (nBaseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be positive.");
        }
        
        this.baseSalary = nBaseSalary;
    }
    
    //Set and get
    public void setBaseSalary(double nBaseSalary) {
        if (nBaseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be positive.");
        }
        
        this.baseSalary = nBaseSalary;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    @Override  //Override super's getEarnings method
    public double getEarnings() {
        return getBaseSalary() + super.getEarnings();
    }
    
    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "Base Plus", super.toString(), 
                "Base Salary", getBaseSalary());   
    }
    
    
    public static void main(String[] args) {
       BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee("Jane", "Smith", "222-22-222",
       100000, .06, 500);
       
       System.out.printf("%s %s%n","First name: ", emp.getFirstName());
       System.out.printf("%s %s%n","Last name: ", emp.getLastName());
       System.out.printf("%s %s%n","SS Number: ", emp.getSS());
       System.out.printf("%s %s%n","Gross Sales: ", emp.getGrossSales());
       System.out.printf("%s %s%n","Commission Rate: ", emp.getCommission());
       System.out.printf("%s %s%n","Base Salary: ", emp.getBaseSalary());
       
       emp.setGross(5000);
       emp.setCommission(.1);
       System.out.printf("%n%s:%n%s%n","From toString()",emp);
    }//End Main 
}
