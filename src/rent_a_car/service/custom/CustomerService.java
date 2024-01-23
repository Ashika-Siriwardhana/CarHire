/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rent_a_car.service.custom;

import java.util.ArrayList;
import rent_a_car.dto.CustomerDto;
import rent_a_car.service.SuperService;

/**
 *
 * @author user
 */
public interface CustomerService extends SuperService{
    String addCustomer(CustomerDto customerDto) throws Exception;
    String updateCustomer(CustomerDto customerDto)throws Exception;
    String deleteCustomer(String Id)throws Exception;
    CustomerDto getCustomer(String Id)throws Exception;
    ArrayList <CustomerDto> getAllCustomer() throws Exception;
}
