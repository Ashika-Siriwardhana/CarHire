/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import rent_a_car.dao.DaoFactory;
import rent_a_car.dao.custom.CustomerDao;
import rent_a_car.dto.CustomerDto;
import rent_a_car.entity.CustomerEntity;
import rent_a_car.service.custom.CustomerService;

/**
 *
 * @author user
 */
public class CustomerServiceImpl implements CustomerService {
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(customerDto.getCustID(), 
                customerDto.getCustName(), customerDto.getCustNIC(),
                customerDto.getCustAddress(), customerDto.getCustTPNo());
        if (customerDao.add(customerEntity)){
            return "Succesfully Added";
        }
        else {
            return "Fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(customerDto.getCustID(), 
                customerDto.getCustName(), customerDto.getCustNIC(),
                customerDto.getCustAddress(), customerDto.getCustTPNo());
        if (customerDao.update(customerEntity)){
            return "Succesfully Updated";
        }
        else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String Id) throws Exception {
        if (customerDao.delete(Id)){
            return "Succesfully Deleted";
        }
        else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String Id) throws Exception {
        CustomerEntity entity=customerDao.get(Id);
        
        return new CustomerDto(entity.getCustID(), 
                entity.getCustName(), entity.getCustNIC(),
                entity.getCustAddress(), entity.getCustTPNo());
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        List<CustomerEntity> entities=customerDao.getAll();
        ArrayList<CustomerDto> customerDtos= new ArrayList<>();
        for(CustomerEntity entity: entities){
            customerDtos.add(new CustomerDto(entity.getCustID(), 
                entity.getCustName(), entity.getCustNIC(),
                entity.getCustAddress(), entity.getCustTPNo())); 
        }  
        return customerDtos;
    }
}
