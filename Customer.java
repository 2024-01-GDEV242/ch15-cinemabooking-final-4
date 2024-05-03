
/**
 * The class that store's customer details.
 *
 * @author Juan Jimenez
 * @version 4/29/24
 */
public class Customer
{
    private String name;
    private String phoneNumber;
    
    /**
     * Constructs a customer with a name and phone number.
     * 
     * @param name The customer's name
     * @param phoneNumber The customer's phone number
     */
    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}