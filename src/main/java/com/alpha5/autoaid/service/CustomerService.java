package com.alpha5.autoaid.service;

import com.alpha5.autoaid.dto.response.CustomerSigned;
import com.alpha5.autoaid.model.Customer;
import com.alpha5.autoaid.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerSigned signup(Customer customer){

        Customer storedUser = customerRepository.save(customer);

        CustomerSigned output=new CustomerSigned();

        output.setId(storedUser.getCustomerId());
        output.setEmail(storedUser.getEmail());
        output.setUsername(storedUser.getFirstName());

        return output;
    }





}
