package lab.aikibo.controller;

import lab.aikibo.component.CustomerRegistrar;
import lab.aikibo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tamami on 22/06/17.
 */
@RestController
public class CustomerController {

    @Autowired
    CustomerRegistrar customerRegistrar;

    @RequestMapping(path="/register", method= RequestMethod.POST)
    Customer register(@RequestBody Customer customer) {
        return customerRegistrar.register(customer);
    }

}
