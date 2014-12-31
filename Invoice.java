/*
 * Invoice Class that implements Payable
 * Used to demonstrate Interfaces
 * Based On "Java How To Program, 10, Early Objects" - Chapter 10.
 */

public class Invoice implements Payable {
    private final String partNumber;
    private final String partDesc;
    private int quantity;
    private double pricePerItem;
    
    //Constructor
    public Invoice(String nPartNumber, String nPartDesc, int nQuantity, 
            double nPricePerItem) {
        if (nQuantity < 1) { //Validate quantity
            throw new IllegalArgumentException("Quantity must be positive");
        }
            
        if (nPricePerItem <= 0.0) { //Validate price
            throw new IllegalArgumentException("Price must be positive");
        }
        
        this.quantity = nQuantity;
        this.pricePerItem = nPricePerItem;
        this.partDesc = nPartDesc;
        this.partNumber = nPartNumber;
    } //End Constructor
    
    //Getters and Setters
    public void setQuantity(int nQuantity) {
        if (nQuantity < 1) { //Validate quantity
            throw new IllegalArgumentException("Quantity must be positive");
        }
        
        this.quantity = nQuantity;
    } //End setQuantity
    
    public int getQuantity() {
        return quantity;
    } //End getQuantity
    
    public void setPricePerItem(double nPricePerItem) {
        if (nPricePerItem <= 0.0) { //Validate price
            throw new IllegalArgumentException("Price must be positive");
        }
        
        this.pricePerItem = nPricePerItem;
    } //End setPricePerItem
    
    public double getPricePerItem() {
        return pricePerItem;
    } //End getPricePerItem
    
    public String getPartNumber() {
        return partNumber;
    } //End getPartNumber
    
    public String getPartDesc() {
        return partDesc;
    } //End partDesc
    
    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
            "Invoice", "Part #", getPartNumber(), getPartDesc(),
            "Quantity", getQuantity(), "PPI", getPricePerItem());
    } //End toString
    
    //Required as a Payable interface
    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    } //End getPaymentAmount
    
    //Test method for Invoice
    public static void main(String[] args) {
        Invoice testInvoice = new Invoice("111-XYZ", "Thingamajig 9000", 10, 
                15.50);
        
        System.out.printf("%s%n%s%n%s: $%.2f%n", "Item", testInvoice, 
                "Total Cost", testInvoice.getPaymentAmount());
        
    } //End Main
    
} //End Invoice
