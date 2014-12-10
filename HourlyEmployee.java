/*
 * Hourly Employee Subclass
 * Used to demonstrate Polymorphism and Inheritance
 * Based On "Java How To Program, 10, Early Objects" - Chapter 10.
 */

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    
   //Constructor
    public HourlyEmployee(String nFirstName, String nLastName, String nssNumber,
        double nWage, double nHours) {
        super(nFirstName, nLastName, nssNumber); //Call superclass constructor
        
        if(nWage < 0.0) { //validate hourly wage
            throw new IllegalArgumentException("Hourly wage must be positive");
        }
        
        if(nHours < 0.0 || nHours > 168) {  //Validate hours
            throw new IllegalArgumentException("Hours worked must be between 0 and 168");
        }
        
        this.wage = nWage;
        this.hours = nHours;
    }//End Consturctor
    
    //Setters and Getters
    public void setWage(double nWage) {
        if(nWage < 0.0) { //Validate wage
            throw new IllegalArgumentException("Hourly wage must be positive");
        }

        this.wage = nWage;
    }//End setWage
    
    public double getWage() {
        return wage;
    }//End getWage
    
    public void setHours(double nHours) {
        if(nHours < 0.0 || nHours > 168) { //Validate hours
            throw new IllegalArgumentException("Hours worked must be between 0 and 168");
        }

        this.hours = nHours;
    }//End setHours
    
    public double getHours() {
        return hours;
    }//End getHours
    
    @Override
    public double getEarnings() {
        if(hours <=40) { //No overtime
            return (getHours() * getWage());
        } else {
            return ((getHours() - 40) * (getWage() * 1.5) + 40 * getWage()); 
        }
    }//End getEarnings
    
    
    @Override
    public String toString() {
        return String.format("%s%n%s: $%.2f%n%s: %.2f", super.toString(), 
               "Wage", getWage(), 
               "Hours", getHours());
    }//End toString
    
    
    //SalariedEmployee test
    public static void main(String[] args) {
       HourlyEmployee emp = new HourlyEmployee("John", "Jackson", "444-44-444",
       10, 50);
       
       System.out.printf("%s:%n%s%n%s $%.2f%n","From toString()",emp, "Earnings", emp.getEarnings());
    }//End Main
    
}//End HourlyEmployee