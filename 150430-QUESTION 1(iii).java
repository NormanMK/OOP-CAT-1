import java.util.Date;

public class Customer {
    private String fullName;
    private Date dateOfBirth;
    private String address;
    private Date dateOfRegistration;
    private String nationality;
    
    
    public Customer(String fullName, Date dateOfBirth, String address, Date dateOfRegistration, String nationality) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.dateOfRegistration = dateOfRegistration;
        this.nationality = nationality;
    }
    
    
    public void enterInformation(String fullName, Date dateOfBirth, String address, Date dateOfRegistration, String nationality) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.dateOfRegistration = dateOfRegistration;
        this.nationality = nationality;
    }
    
    
    public void displayInformation() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Address: " + address);
        System.out.println("Date of Registration: " + dateOfRegistration);
        System.out.println("Nationality: " + nationality);
    }
    
  
    public String getFullName() {
        return fullName;
    }
    
 
    public static void main(String[] args) {
      
        Customer customer1 = new Customer("John Smith", new Date(1990, 4, 15), "123 Main St, City, Country", new Date(), "Country1");
        Customer customer2 = new Customer("Jane Doe", new Date(1985, 11, 10), "456 Elm St, City, Country", new Date(), "Country2");
        
       
        System.out.println("Customer 1:");
        customer1.displayInformation();
        
        System.out.println();
        
        System.out.println("Customer 2:");
        customer2.displayInformation();
    }
}









