/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rent_a_car.service.custom;

import java.util.ArrayList;
import rent_a_car.dto.CarDto;
import rent_a_car.service.SuperService;

/**
 *
 * @author user
 */
public interface CarService extends SuperService {

    public String addCar(CarDto carDto) throws Exception;

    public String updateCar(CarDto carDto) throws Exception;

    public ArrayList<CarDto> getAllCars() throws Exception;

    public CarDto getCar(String carId)throws Exception;

    public String deleteCar(String carId)throws Exception;
    
}
