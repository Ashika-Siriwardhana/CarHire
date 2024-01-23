/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.service.custom.impl;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import rent_a_car.dao.DaoFactory;
import rent_a_car.dao.custom.RentDao;
import rent_a_car.dto.RentDto;
import rent_a_car.entity.RentEntity;
import rent_a_car.service.custom.RentService;

/**
 *
 * @author user
 */
public class RentServiceImpl implements RentService {
    RentDao rentDao = (RentDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.RENT);
    @Override
    public String saveRent(RentDto rentDto) throws Exception {
        if (dayValidation(rentDto)){
            RentEntity rentEntity = new RentEntity(rentDto.getRentId(), rentDto.getCarId(), rentDto.getCustId(), rentDto.getFromDate(), rentDto.getToDate(), 
                rentDto.getDayPrice(), rentDto.getTotal(), rentDto.getRefundDeposit(), rentDto.getIsReturnRefundDeposit(), 
                rentDto.getAdvanceAmount(), rentDto.getBalanceAmount(), rentDto.getAdditionalCharge(), rentDto.getIsReturnCar());
            if (customerValidation( rentDto)==false){
                return "Customer also booked vehicle";  
            }else if(carValidation( rentDto)==false){
                return "Car also booked by another customer"; 
            }
            else{
                if (rentDao.add(rentEntity)){
                    return "Succesfully Added";
                }
                else {
                    return "Fail";
                }
            }
            
        }else {
            return "Selected Date range is wrong or othervise customer or car Id not in range, Please select bellow 30 days or correct range and fill new car or new customer";
        }    
    }

    @Override
    public String updateRent(RentDto rentDto) throws Exception {
        if (dayValidation(rentDto)){
            RentEntity rentEntity = new RentEntity(rentDto.getRentId(), rentDto.getCarId(), rentDto.getCustId(), rentDto.getFromDate(), rentDto.getToDate(), 
                rentDto.getDayPrice(), rentDto.getTotal(), rentDto.getRefundDeposit(), rentDto.getIsReturnRefundDeposit(), 
                rentDto.getAdvanceAmount(), rentDto.getBalanceAmount(), rentDto.getAdditionalCharge(), rentDto.getIsReturnCar());
            if (rentDao.update(rentEntity)){
                return "Succesfully Updated";
            }
            else {
                return "Fail";
            }
        }else { 
            return "Selected Date range is wrong, Please select bellow 30 days or correct range";
        }
    }

    @Override
    public String deleteRent(String rentId) throws Exception {
        if (rentDao.delete(rentId)){
            return "Succesfully Deleted";
        }
        else {
            return "Fail";
        }
    }

    @Override
    public ArrayList<RentDto> getAll() throws Exception {
        ArrayList rentDtos = new ArrayList<>();
        List<RentEntity> entities =rentDao.getAll();
        for(RentEntity entity :entities){
            RentDto rentDto = new RentDto(entity.getRentId(), entity.getCarId(), entity.getCustId(), entity.getFromDate(), entity.getToDate(), entity.getDayPrice(), entity.getTotal(),
        entity.getRefundDeposit(), entity.getIsReturnRefundDeposit(), entity.getAdvanceAmount(), entity.getBalanceAmount(), 
        entity.getAdditionalCharge(), entity.getIsReturnCar());
            rentDtos.add(rentDto);
        }
        return rentDtos;
    }

    @Override
    public RentDto searchRent(String rentId) throws Exception {
        RentEntity entity =rentDao.get(rentId);
        if(entity!=null){
            return new RentDto(entity.getRentId(), entity.getCarId(), entity.getCustId(), entity.getFromDate(), entity.getToDate(), entity.getDayPrice(), entity.getTotal(),
        entity.getRefundDeposit(), entity.getIsReturnRefundDeposit(), entity.getAdvanceAmount(), entity.getBalanceAmount(), 
        entity.getAdditionalCharge(), entity.getIsReturnCar());
        }
        return null;
    }
    private boolean dayValidation(RentDto rentDto){
        LocalDate fDate = LocalDate.parse(rentDto.getFromDate());
        LocalDate tDate = LocalDate.parse(rentDto.getToDate());
        LocalDate toDay = LocalDate.parse(today());
        Long dayGap = ChronoUnit.DAYS.between(fDate, tDate);
        Long todayGap = ChronoUnit.DAYS.between(toDay, fDate);
        return dayGap<30 && dayGap>0 && todayGap >=0;  
    }//fromdate is today or futureday, Maximum retal period is 30 days, Always "from date" is past date than "to date".
    private String today() {
        Date lDate= new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String today =sdf.format(lDate);
        return today;
    }// today 
    private boolean customerValidation(RentDto rentDto) throws Exception{
        List<RentEntity> entities =rentDao.getAll();
        boolean isValid =true;
        for(RentEntity entity :entities){
            if(Integer.parseInt(entity.getCustId())== Integer.parseInt(rentDto.getCustId())){
                LocalDate tDate = LocalDate.parse(rentDto.getToDate());
                LocalDate toDay = LocalDate.parse(today());
                Long todayGap = ChronoUnit.DAYS.between(toDay, tDate);
                if(todayGap >=0){
                    isValid = false;
                }
                break;
            }
        }
        return isValid;
    }//Customer can't book any cars at one time. Only one for one time.
    private boolean carValidation(RentDto rentDto) throws Exception{
        List<RentEntity> entities =rentDao.getAll();
        boolean isValid =true;
        for(RentEntity entity :entities){
            if(entity.getCarId()== rentDto.getCarId()){
                LocalDate tDate = LocalDate.parse(rentDto.getToDate());
                LocalDate toDay = LocalDate.parse(today());
                Long todayGap = ChronoUnit.DAYS.between(toDay, tDate);
                if(todayGap >=0){
                    isValid = false;
                }
                break;
            }
        }
        return isValid;
    }//Rent out cars can't book by another customer
   
}
