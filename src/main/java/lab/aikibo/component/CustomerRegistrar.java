package lab.aikibo.component;

import lab.aikibo.entity.Customer;
import lab.aikibo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by tamami on 22/06/17.
 */
@Component
public class CustomerRegistrar {

    CustomerRepository customerRepository;

    @Autowired
    CustomerRegistrar(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer register(Customer customer) {
        Optional<Customer> existingCustomer = customerRepository.findByName(customer.getName());
        if(existingCustomer.isPresent()) {
            throw new RuntimeException("is already exists");
        } else {
            customerRepository.save(customer);
        }
        return customer;
    }

}
