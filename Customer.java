
/**
 * The class that store's customer details.
 *
 * @author Alper Hiz & Juan Jimenez
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
    
    /**
     * Gets the customer's name.
     * 
     * @return The customer's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the customer's name.
     * 
     * @param name The customer's name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the customer's phone number.
     * 
     * @return The customer's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the customer's phone number.
     * 
     * @param phoneNumber The customer's phone number to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns a string representation of the customer.
     * 
     * @return A string representation of the customer
     */
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}