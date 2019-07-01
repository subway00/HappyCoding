package domain;


import domain.Address;
import java.util.HashMap;
import java.util.Map;
public class Customer {
    private String name;
    
    public static final int HEAD_OFFICE = 0;
    public static final int BILLING = 1;
    public static final int DELLIVERY = 2;
    private final Address[] addresses = new Address[3];
    
    
    public Customer(String name, Address office, Address billing, Address delivery) {
        this.name = name;
        addresses[HEAD_OFFICE] = office;
        addresses[BILLING] =billing;
        addresses[DELLIVERY] = delivery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Address getOfficeAddress() {
        return addresses[HEAD_OFFICE];
    }
    public Address getBillAddress() {
        return  addresses[BILLING];
    }
    public Address getDeliveryAddress() {
        return addresses[DELLIVERY];
    }
    public Address[] getAddress() {
        return addresses;
    }
    private static final Map<Long, Customer> customers = new HashMap<>();
    static {
        customers.put(1L, new Customer("Fred Bloggs", 
                new Address("1699 Crumin Road","", "London", "Ontraio", "N5B 3V5"),
                new Address("1700 Cheng Long","", "New York", "Brooklin", "M77 N11"),
                new Address("1855 Bruce Lee","", "Seatle", "Queen", "E33 R77") )
        );
    }
    
    public static Customer getCustomer(long id) {
        return customers.get(id);
    }
    public static Map<Long, Customer> getCustomers() {
        return customers;
    }
}
