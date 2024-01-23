/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.controller;

import java.util.ArrayList;
import rent_a_car.dto.CustomerDto;
import rent_a_car.service.ServiceFactory;
import rent_a_car.service.custom.CustomerService;

/**
 *
 * @author user
 */
public class CustomerController {
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);

    public String saveCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        return customerService.getAllCustomer();
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String custId) throws Exception {
        return customerService.deleteCustomer(custId);
    }

    public CustomerDto searchCustomer(String custId) throws Exception {
        return customerService.getCustomer(custId);
    }
    
}
