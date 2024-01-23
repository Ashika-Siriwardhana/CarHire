/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.dao;

import rent_a_car.dao.custom.impl.CarDaoImpl;
import rent_a_car.dao.custom.impl.CustomerDaoImpl;
import rent_a_car.dao.custom.impl.RentDaoImpl;

/**
 *
 * @author user
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){}
    public static DaoFactory getInstance(){
        if (daoFactory==null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(daoTypes type){
        switch (type){
            case CUSTOMER:
                return new CustomerDaoImpl();
            case CAR:
                return new CarDaoImpl();
            case RENT:
                return new RentDaoImpl();
            default :
                return null;
        }
    }
    
    public enum daoTypes{
        CUSTOMER, CAR, RENT
    }
}
