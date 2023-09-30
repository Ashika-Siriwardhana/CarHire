/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.service.customer.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import rent_a_car.dao.DaoFactory;
import rent_a_car.dao.custom.CustomerDao;
import rent_a_car.dto.CustomerDto;
import rent_a_car.entity.CustomerEntity;
import rent_a_car.service.customer.CustomerService;

/**
 *
 * @author user
 */
public class CustomerServiceImpl implements CustomerService {

    @Override
    public String addCustomer(CustomerDto customerDto) {
        CustomerEntity customerEntity = new CustomerEntity(customerDto.getCustID(), 
                customerDto.getCustName(), customerDto.getCustNIC(),
                customerDto.getCustAddress(), customerDto.getCustTPNo());
        CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.CUSTOMER);
        
        try {
            if (customerDao.addCustomer(customerEntity)){
                return "Succesfully Added";
            }
            else {
                return "Fail";
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
