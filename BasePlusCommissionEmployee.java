/*
 * Base Plus Commission Employee Subclass
 * Used to demonstrate Polymorphism and Inheritance
 * Based On "Java How To Program, 10e, Early Objects" - Chapter 10.
 */

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    //Constructor
    public BasePlusCommissionEmployee(String nFirstName, String nLastName, 
            String nssNumber, double nGrossSales, double nCommissionRate, 
            double nBaseSalary) {
        
        //Call superclass constructor
        super(nFirstName, nLastName, nssNumber, nGrossSales, nCommissionRate); 

        //Validate and set base salary
        if (nBaseSalary < 0.0) { 
            throw new IllegalArgumentException("Base salary must be positive.");
        }
        
        this.baseSalary = nBaseSalary;
    } //End Constructor
    
    //Setters and Getters
    public void setBaseSalary(double nBaseSalary) {
        //Validate base salary
        if (nBaseSalary < 0.0) { 
            throw new IllegalArgumentException("Base salary must be positive.");
        }
        
        this.baseSalary = nBaseSalary;
    } //End setBaseSalary
    
    public double getBaseSalary() {
        return baseSalary;
    } //End getBaseSalary
    
    @Override
    public double getPaymentAmount() {
        return getBaseSalary() + super.getPaymentAmount();
    } //End getPaymentAmount
    
    @Override
    public String toString() {
        return String.format("%s%n%s: $%.2f", super.toString(), "Base Salary", 
                getBaseSalary());   
    } //End toString
    
    //BasePlusCommissionEmployee Test
    public static void main(String[] args) {
       BasePlusCommissionEmployee emp = 
               new BasePlusCommissionEmployee("Jane", "Smith", "222-22-222", 
                       70000, .04, 500);
  
       System.out.printf("%s:%n%s%n%s: $%.2f%n", "From toString()", 
               emp, "Earnings", emp.getPaymentAmount());
    } //End main 
    
} //End BasePlusCommissionEmployee
