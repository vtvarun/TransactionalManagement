package com.Transaction2.Controller;

import com.Transaction2.Model.Customers;
import com.Transaction2.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    // use this API to add a new customer to database
    @PostMapping("/add-customer")
    public ResponseEntity<Customers> addCustomer(@RequestBody Customers customer){
        Customers customers = customerService.addCustomer(customer);
        return new ResponseEntity<>(customers, HttpStatus.CREATED);
    }


}
