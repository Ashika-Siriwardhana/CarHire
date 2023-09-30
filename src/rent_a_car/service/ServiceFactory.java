/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.service;

import rent_a_car.service.customer.impl.CustomerServiceImpl;

/**
 *
 * @author user
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory; 
    private ServiceFactory (){}
    public static ServiceFactory getInstance(){
        if (serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(serviceType type){
        switch (type){
            case CUSTOMER:
                return new CustomerServiceImpl();
            default :
                return null;
        }
    }
    public enum serviceType{
        CUSTOMER
    }
    
    
}
