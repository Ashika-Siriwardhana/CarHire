/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.controller;

import rent_a_car.dto.CustomerDto;
import rent_a_car.service.ServiceFactory;
import rent_a_car.service.customer.CustomerService;

/**
 *
 * @author user
 */
public class CustomerController {
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);

    public String saveCustomer(CustomerDto customerDto) {
        return customerService.addCustomer(customerDto);
    }
    
}
