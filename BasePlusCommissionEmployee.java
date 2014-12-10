/*
 * Base Plus Commission Employee Subclass
 * Used to demonstrate Polymorphism and Inheritance
 * Based On "Java How To Program, 10, Early Objects" - Chapter 10.
 */

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    //Constructor
    public BasePlusCommissionEmployee(String nFirstName, String nLastName, String nssNumber,
        double nGrossSales, double nCommissionRate, double nBaseSalary) {
        super(nFirstName, nLastName, nssNumber, nGrossSales, nCommissionRate); //Call superclass constructor

        if (nBaseSalary < 0.0) { //Validate and set base salary
            throw new IllegalArgumentException("Base salary must be positive.");
        }
        
        this.baseSalary = nBaseSalary;
    }
    
    //Setters and Getters
    public void setBaseSalary(double nBaseSalary) {
        if (nBaseSalary < 0.0) { //Validate base salary
            throw new IllegalArgumentException("Base salary must be positive.");
        }
        
        this.baseSalary = nBaseSalary;
    }//End setBaseSalary
    
    public double getBaseSalary() {
        return baseSalary;
    }//End getBaseSalary
    
    @Override
    public double getEarnings() {
        return getBaseSalary() + super.getEarnings();
    }//End getEarnings
    
    @Override
    public String toString() {
        return String.format("%s%n%s: $%.2f", super.toString(), 
                "Base Salary", getBaseSalary());   
    }//End toString
    
    //BasePlusCommissionEmployee Test
    public static void main(String[] args) {
       BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee("Jane", "Smith", 
               "222-22-222", 70000, .04, 500);
  
       System.out.printf("%s:%n%s%n%s: $%.2f%n","From toString()",emp, "Earnings", emp.getEarnings());
    }//End Main 
    
}//End BasePlusCommissionEmployee
