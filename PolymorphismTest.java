/*
 * Polymorphism Test
 * Used to demonstrate Polymorphism
 * Based On "Java How To Program, 10, Early Objects" - Chapter 10.
 */

public class PolymorphismTest {
    
    public static void main(String[] args) {
        CommissionEmployee commEmp = new CommissionEmployee("Malcolm", 
                "Reynolds", "111-11-111", 100000, .06);
        
        BasePlusCommissionEmployee bpcEmp = new BasePlusCommissionEmployee(
                "Zoe", "Wash", "222-22-222", 100000, .06, 500);
        
        CommissionEmployee commEmp2 = bpcEmp;
        
        System.out.printf("%s%n%s%n%n", "Superclass toString()", 
                commEmp.toString());
        System.out.printf("%s%n%s%n%n", "Subclass toString()", 
                bpcEmp.toString());
        System.out.printf("%s%n%s%n%n",
                "Subclass toString() on Superclass object", commEmp2.toString());
        
    } //End Main
} //End PolymorhismTest
