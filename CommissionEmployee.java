/*
 * Commission Employee Superclass
 * Based On "Java How To Program, 10, Early Objects" - Chapter 9.
 */

public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String ssNumber;
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String nFirstName, String nLastName, String nssNumber, double nGrossSales, double nCommissionRate) {
        if (nGrossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must exceed $0");
        }
        
        if (nCommissionRate <= 0.0 || nCommissionRate >= 1.0) {
            throw new IllegalArgumentException ("Commission rate must be between 0.0 and 1.0");
        }
        
        this.firstName = nFirstName;
        this.lastName  = nLastName;
        this.ssNumber = nssNumber;
        this.commissionRate = nCommissionRate;
    }//End Constructor
    
    //Setters and Getters
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getSS() {
        return ssNumber;
    }
    
    public void setGross(double nGrossSales) {
        if (nGrossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must exceed $0");
        }
        
        this.grossSales = nGrossSales;
    }
    
    public double getGrossSales() {
        return grossSales;
    }
    
    public void setCommission(double nCommissionRate) {
        if (nCommissionRate <= 0.0 || nCommissionRate >= 1.0) {
            throw new IllegalArgumentException ("Commission rate must be between 0 and 1");
        }
        
        commissionRate = nCommissionRate;
    }
    
    public double getCommission() {
        return commissionRate;
    }
    
    public double getEarnings() {
        return getCommission() * getGrossSales();
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "Commission", getFirstName(), getLastName(),
                "SS Number", getSS(), "Gross Sales", getGrossSales(), "Commission Rate", getCommission());
    }
    
    
    public static void main(String[] args) {
       CommissionEmployee emp = new CommissionEmployee("Bob", "Smith", "111-11-111",
       100000, .06);
       
       System.out.printf("%s %s%n","First name: ", emp.getFirstName());
       System.out.printf("%s %s%n","Last name: ", emp.getLastName());
       System.out.printf("%s %s%n","SS Number: ", emp.getSS());
       System.out.printf("%s %s%n","Gross Sales: ", emp.getGrossSales());
       System.out.printf("%s %s%n","Commission Rate: ", emp.getCommission());
       
       emp.setGross(5000);
       emp.setCommission(.1);
       System.out.printf("%n%s:%n%s%n","From toString()",emp);
    }//End Main
    
}//End CommissionEmployee
