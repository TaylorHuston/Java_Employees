/*
 * Salaried Employee Subclass
 * Used to demonstrate Polymorphism and Inheritance
 * Based On "Java How To Program, 10e, Early Objects" - Chapter 10.
 */

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    //Constructor
    public SalariedEmployee(String nFirstName, String nLastName, String nssNumber,
            double nWeeklySalary) {
        super(nFirstName, nLastName, nssNumber); //Call superclass constructor
        
        if(nWeeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be positive");
        }
        
        this.weeklySalary = nWeeklySalary;
    }//End Consturctor
    
    //Set and Get
    public void setSalary(double nWeeklySalary) {
        if(nWeeklySalary < 0.0) { //Calidate weekly salary
            throw new IllegalArgumentException("Weekly salary must be positive");
        }

        this.weeklySalary = nWeeklySalary;
    }//End setSalary
    
    public double getSalary() {
        return weeklySalary;
    }//End getSalary
    
    @Override
    public double getPaymentAmount() {
        return getSalary();
    }//End getPaymentAmount
    
    
    @Override
    public String toString() {
        return String.format("%s%n%s: $%.2f", super.toString(), 
                "Salary", getSalary());
    }//End toString
    
    
    //SalariedEmployee test
    public static void main(String[] args) {
       SalariedEmployee emp = new SalariedEmployee("Jack", "Dangerfield", "333-33-333",
               3000);
       
       System.out.printf("%s:%n%s%n","From toString()",emp);
    }//End Main
    
}//End SalariedEmployee
