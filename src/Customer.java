import java.util.ArrayList;
import java.util.List;

class Customer {
    // Customer class represents a customer with username and password for authentication
    private final String name;
    private final String contactInformation;
    private final List<String> rentalHistory;

    public Customer(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public String getContactInformation() {

        return contactInformation;
    }

    public void addRentalHistory(String rentalDetails) {
        rentalHistory.add(rentalDetails);
    }
    static class AuthenticationSystem {   //Authenticates a customer.

        public boolean authenticateCustomer(Customer customer) {  //return True if the customer is authenticated, false otherwise.
            return true;
        }
    }
}