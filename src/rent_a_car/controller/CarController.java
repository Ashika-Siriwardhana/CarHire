/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.controller;

import java.util.ArrayList;
import rent_a_car.dto.CarDto;
import rent_a_car.service.ServiceFactory;
import rent_a_car.service.custom.CarService;

/**
 *
 * @author user
 */
public class CarController {
    
    CarService carService =(CarService) ServiceFactory.getInstance().getService(ServiceFactory.serviceType.CAR);

    public String saveCar(CarDto carDto) throws Exception {
        return carService.addCar(carDto);
    }

    public ArrayList<CarDto> getAllCars() throws Exception {
        return carService.getAllCars();
    }

    public String updateCar(CarDto carDto) throws Exception {
        return carService.updateCar(carDto);
    }

    public CarDto searchCar(String carId) throws Exception {
        return carService.getCar(carId);
    }

    public String deleteCar(String carId) throws Exception {
        return carService.deleteCar(carId);
    }
}
   

    
