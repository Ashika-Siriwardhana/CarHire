/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rent_a_car.service.customer;

import rent_a_car.dto.CustomerDto;
import rent_a_car.service.SuperService;

/**
 *
 * @author user
 */
public interface CustomerService extends SuperService{
    String addCustomer(CustomerDto customerDto);
    
}
