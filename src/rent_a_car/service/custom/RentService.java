/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rent_a_car.service.custom;

import java.util.ArrayList;
import rent_a_car.dto.RentDto;
import rent_a_car.service.SuperService;

/**
 *
 * @author user
 */
public interface RentService extends SuperService{

    public String saveRent(RentDto rentDto) throws Exception;

    public String updateRent(RentDto rentDto)throws Exception;

    public String deleteRent(String rentId)throws Exception;

    public ArrayList<RentDto> getAll()throws Exception;

    public RentDto searchRent(String rentId)throws Exception;
    
}
