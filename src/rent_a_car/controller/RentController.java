/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.controller;

import java.util.ArrayList;
import rent_a_car.dto.RentDto;
import rent_a_car.service.ServiceFactory;
import rent_a_car.service.custom.RentService;

/**
 *
 * @author user
 */
public class RentController {
    RentService rentService=(RentService) ServiceFactory.getInstance().getService(ServiceFactory.serviceType.RENT);

    public String saveRent(RentDto rentDto) throws Exception {
        return rentService.saveRent(rentDto);
    }

    public String updateRent(RentDto rentDto) throws Exception {
        return rentService.updateRent(rentDto);
    }

    public String deleteRent(String rentId) throws Exception {
        return rentService.deleteRent(rentId);
    }

    public ArrayList<RentDto> getAllRent() throws Exception {
        return rentService.getAll();
    }

    public RentDto searchRent(String rentId) throws Exception {
        return rentService.searchRent(rentId);
    }
    
}
