/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.dao.custom.impl;

import java.util.ArrayList;
import rent_a_car.dao.CrudUtil;
import rent_a_car.dao.custom.RentDao;
import rent_a_car.entity.RentEntity;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class RentDaoImpl implements RentDao{

    @Override
    public boolean add(RentEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO rent VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)", t.getRentId(),t.getCarId(),t.getCustId(),t.getFromDate(),
                t.getToDate(),t.getDayPrice(), t.getTotal(),t.getRefundDeposit(),t.getIsReturnRefundDeposit(),
                t.getAdvanceAmount(),t.getBalanceAmount(),t.getAdditionalCharge(),t.getIsReturnCar());
    }

    @Override
    public boolean update(RentEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE rent SET  CarId=?, CustId=?, FromDate=?, ToDate=?, DayPrice=?, Total=?, RefundDeposit=?, IsReturnRefundDeposit=?,AdvanceAmount=?, BalanceAmount=?, AdditionalCharge=?, IsReturnCar=? WHERE RentId=?",
                t.getCarId(),t.getCustId(),t.getFromDate(),t.getToDate(),t.getDayPrice(),t.getTotal(),t.getRefundDeposit(),t.getIsReturnRefundDeposit(),
                t.getAdvanceAmount(),t.getBalanceAmount(),t.getAdditionalCharge(),t.getIsReturnCar(),t.getRentId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM rent WHERE RentID=?", id);
    }

    @Override
    public RentEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM rent WHERE RentID=?",  id);
        while (rst.next()){
            RentEntity rEntity = new RentEntity(Integer.valueOf(rst.getString(1)), Integer.valueOf(rst.getString(2)), rst.getString(3), rst.getString(4), rst.getString(5), Double.valueOf(rst.getString(6)),
            Double.valueOf(rst.getString(7)), Double.valueOf(rst.getString(8)), rst.getString(9), Double.valueOf(rst.getString(10)), Double.valueOf(rst.getString(11)), Double.valueOf(rst.getString(12))
            , rst.getString(13));
            return rEntity;
        }
        return null;
    }

    @Override
    public ArrayList<RentEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM rent" );
        ArrayList<RentEntity> rEntities = new ArrayList<>();
        while (rst.next()){
            RentEntity rEntity = new RentEntity(Integer.valueOf(rst.getString(1)), Integer.valueOf(rst.getString(2)), rst.getString(3), rst.getString(4), rst.getString(5), Double.valueOf(rst.getString(6)),
            Double.valueOf(rst.getString(7)), Double.valueOf(rst.getString(8)), rst.getString(9), Double.valueOf(rst.getString(10)), Double.valueOf(rst.getString(11)), Double.valueOf(rst.getString(12))
            , rst.getString(13));
            rEntities.add(rEntity);
        }
        return rEntities;
    }

    
}
