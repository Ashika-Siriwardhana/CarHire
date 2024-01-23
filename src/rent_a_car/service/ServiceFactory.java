/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.service;

import rent_a_car.service.custom.impl.CarServiceImpl;
import rent_a_car.service.custom.impl.CustomerServiceImpl;
import rent_a_car.service.custom.impl.RentServiceImpl;

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
            case CAR:
                return new CarServiceImpl();
            case RENT:
                return new RentServiceImpl();
            default :
                return null;
        }
    }
    public enum serviceType{
        CUSTOMER,
        CAR,
        RENT
    }
    
    
}
