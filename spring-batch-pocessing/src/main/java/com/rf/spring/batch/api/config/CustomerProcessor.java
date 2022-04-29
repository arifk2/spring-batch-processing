package com.rf.spring.batch.api.config;

import com.rf.spring.batch.api.entity.Customer;
import org.springframework.batch.item.ItemProcessor;


public class CustomerProcessor implements ItemProcessor<Customer, Customer> {


    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
