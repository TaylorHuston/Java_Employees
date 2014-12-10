/*
 * Salaried Employee subclass
 * Used to demonstrate Polymorphism and Inheritance
 * Based On "Java How To Program, 10, Early Objects" - Chapter 10.
 */

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    
  //Constructor
    public HourlyEmployee(String nFirstName, String nLastName, String nssNumber,
        double nWage, double nHours) {
        super(nFirstName, nLastName, nssNumber);
        
        if(nWage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be positive");
        }
        
        if(nHours < 0.0 || nHours > 168) {
            throw new IllegalArgumentException("Hours worked must be between 0 and 168");
        }
        
        this.wage = nWage;
        this.hours = nHours;
    }//End Consturctor
    
    //Set and Get
    public void setWage(double nWage) {
        if(nWage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be positive");
        }

        this.wage = nWage;
    }//End setWage
    
    public void setHours(double nHours) {
        if(nHours < 0.0 || nHours > 168) {
            throw new IllegalArgumentException("Hours worked must be between 0 and 168");
        }

        this.hours = nHours;
    }//End setHours
    
    public double getWage() {
        return wage;
    }//End getWage
    
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
        return String.format("Hourly Employee%n%s%n%s $%.2f%n%s %.2f%n%s %.2f", super.toString(), 
                "Earnings", getEarnings(), "Wage", getWage(), "Hours", getHours());
    }//End toString
    
    
    //SalariedEmployee test
    public static void main(String[] args) {
       HourlyEmployee emp = new HourlyEmployee("John", "Jackson", "444-44-444",
       10, 50);
       
       System.out.printf("%n%s:%n%s%n","From toString()",emp);
    }//End Main
}