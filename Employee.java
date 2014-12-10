/*
 * Employee Abstract Superclass
 * Used to demonstrate Polymorphism and Inheritance
 * Based On "Java How To Program, 10e, Early Objects" - Chapter 10.
 */

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String ssNumber;
    
    //Constructor
    public Employee(String nFirstName, String nLastName, String nssNumber) {
        this.firstName = nFirstName;
        this.lastName  = nLastName;
        this.ssNumber = nssNumber;
    }//End Constructor
        
    public String getFirstName() {
        return firstName;
    }//End getFirstName
    
    public String getLastName() {
        return lastName;
    }//End getLastName
    
    public String getSS() {
        return ssNumber;
    }//End getSS
    
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s", "Name", getFirstName(), getLastName(),
                "SS Number", getSS());
    }//End toString
    
    //Abstract method, no implementation
    public abstract double getEarnings();
    
}
