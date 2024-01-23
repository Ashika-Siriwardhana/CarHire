/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.service.custom.impl;

import java.util.ArrayList;
import rent_a_car.dao.DaoFactory;
import rent_a_car.dao.custom.CarDao;
import rent_a_car.dto.CarDto;
import rent_a_car.entity.CarEntity;
import rent_a_car.service.custom.CarService;

/**
 *
 * @author user
 */
public class CarServiceImpl implements CarService{
    
    CarDao carDao = (CarDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.CAR);

    @Override
    public String addCar(CarDto carDto) throws Exception {
        CarEntity carEntity = new CarEntity(carDto.getCarId(),carDto.getBrandName(), 
                carDto.getModel(), carDto.getFuel(), carDto.getYear(), carDto.getPrice());
        if (carDao.add(carEntity)){
            return "Succesfully Added";
        }
        else {
            return "Fail";
        }
    }

    @Override
    public String updateCar(CarDto carDto) throws Exception{
        CarEntity carEntity = new CarEntity(carDto.getCarId(),carDto.getBrandName(), 
                carDto.getModel(), carDto.getFuel(), carDto.getYear(), carDto.getPrice());
        if (carDao.update(carEntity)){
            return "Succesfully Updated";
        }
        else {
            return "Fail";
        }
    }

    @Override
    public ArrayList<CarDto> getAllCars() throws Exception{
        ArrayList<CarEntity> carEntities = carDao.getAll();
        ArrayList<CarDto> carDtos = new ArrayList<>();
        for (CarEntity entity:carEntities){
            carDtos.add(new CarDto(entity.getCarId(),entity.getBrandName(), entity.getModel(), 
                    entity.getFuel(), entity.getYear(), entity.getPrice()));
        }
        return carDtos;
    }

    @Override
    public CarDto getCar(String carId) throws Exception{
        CarEntity carEntity = carDao.get(carId);
        return new CarDto(carEntity.getCarId(),carEntity.getBrandName(),  
                carEntity.getModel(), carEntity.getFuel(), carEntity.getYear(), carEntity.getPrice());
    
}

    @Override
    public String deleteCar(String carId) throws Exception{
        if (carDao.delete(carId)){
            return "Succesfully Deleted";
        }
        else {
            return "Fail";
        } 
    }
    
}
