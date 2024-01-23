/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import rent_a_car.dao.CrudUtil;
import rent_a_car.dao.custom.CarDao;
import rent_a_car.entity.CarEntity;

/**
 *
 * @author user
 */
public class CarDaoImpl implements CarDao{

    @Override
    public boolean add(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO cardetails VALUES(?,?,?,?,?,?)", t.getCarId(),t.getBrandName(),t.getModel(),t.getFuel(), t.getYear(), t.getPrice());
    }

    @Override
    public boolean update(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE cardetails SET  Brand=?, Model=?, Fuel=?, Year =?, RentalPrice=? WHERE CarId=?", t.getBrandName(),t.getModel(),t.getFuel(), t.getYear(), t.getPrice(), t.getCarId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM cardetails WHERE CarId =?", id);
    }

    @Override
    public CarEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM cardetails WHERE CarId=?",  id);
        while (rst.next()){
            CarEntity entity = new CarEntity(rst.getString(1), 
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    Integer.valueOf(rst.getString(5)),
                    Double.valueOf(rst.getString(6)));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<CarEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM cardetails");
        ArrayList<CarEntity> carEntities = new ArrayList<>();
        while (rst.next()){
            CarEntity entity = new CarEntity(rst.getString(1), 
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    Integer.valueOf(rst.getString(5)),
                    Double.valueOf(rst.getString(6)));
            carEntities.add(entity);
        }
        return carEntities;
    }
    
}
    
    

