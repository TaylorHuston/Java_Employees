/*
 * Commission Employee Subclass
 * Used to demonstrate Polymorphism and Inheritance
 * Based On "Java How To Program, 10, Early Objects" - Chapter 10.
 */

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    
    //Constructor
    public CommissionEmployee(String nFirstName, String nLastName, String nssNumber, 
            double nGrossSales, double nCommissionRate) {
        super(nFirstName, nLastName, nssNumber); //Call superclass constructor
        
        if (nGrossSales < 0.0) { //Validate sales
            throw new IllegalArgumentException("Gross sales must exceed $0");
        }
        
        if (nCommissionRate <= 0.0 || nCommissionRate >= 1.0) { //Validate commission rate
            throw new IllegalArgumentException ("Commission rate must be between 0.0 and 1.0");
        }
        
        this.commissionRate = nCommissionRate;
        this.grossSales = nGrossSales;
    }//End Constructor
    
    //Setters and Getters
    public void setGross(double nGrossSales) {
        if (nGrossSales < 0.0) { //Validate sales
            throw new IllegalArgumentException("Gross sales must exceed $0");
        }
        
        this.grossSales = nGrossSales;
    }//End setGross
    
    public double getGross() {
        return grossSales;
    }//End getGross
    
    public void setCommission(double nCommissionRate) {
        if (nCommissionRate <= 0.0 || nCommissionRate >= 1.0) { //Validate commission rate
            throw new IllegalArgumentException ("Commission rate must be between 0 and 1");
        }
        
        commissionRate = nCommissionRate;
    }//End setCommission
    
    public double getCommission() {
        return commissionRate;
    }//End getCommission
    
    @Override
    public double getEarnings() {
        return getCommission() * getGross();
    }//End getEarnings
    
    
    @Override
    public String toString() {
        return String.format("%s%n%s: $%.2f%n%s: %.2f", super.toString(), 
                "Gross Sales", getGross(), 
                "Commission Rate", getCommission());
    }//End toString
    
    //CommissionEmployee test
    public static void main(String[] args) {
       CommissionEmployee emp = new CommissionEmployee("Bob", "Smith", "111-11-111",
               100000, .06);

       System.out.printf("%s:%n%s%n%s $%.2f%n","From toString()",emp, "Earnings", emp.getEarnings());
    }//End Main
    
}//End CommissionEmployee
