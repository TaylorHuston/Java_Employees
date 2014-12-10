/*
 * Employee abstract Superclass
 * Used to demonstrate Polymorphism
 * Based On "Java How To Program, 10, Early Objects" - Chapter 10.
 */
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String ssNumber;
    
        public Employee(String nFirstName, String nLastName, String nssNumber) {
            this.firstName = nFirstName;
            this.lastName  = nLastName;
            this.ssNumber = nssNumber;
        }
        
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getSS() {
        return ssNumber;
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s", "Name", getFirstName(), getLastName(),
                "SS Number", getSS());
    }
    
    //Abstract method, no implementation
    public abstract double getEarnings();
    

    
}
