/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.dao.custom.impl;

import java.util.ArrayList;
import rent_a_car.dao.CrudUtil;
import rent_a_car.dao.custom.CustomerDao;
import rent_a_car.entity.CustomerEntity;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?,?)", t.getCustID(),t.getCustName(),t.getCustNIC(),t.getCustAddress(), t.getCustTPNo());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customer SET  CustName=?, CustNIC=?, CustAddress=?, CustTP =? WHERE CustID=?",t.getCustName(),t.getCustNIC(),t.getCustAddress(), t.getCustTPNo(), t.getCustID());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE CustID=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM Customer WHERE CustID = ?", id);
        
        while (rst.next()) {            
            CustomerEntity entity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
            return entity;
        }
        return  null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM Customer");
        ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();
        while (rst.next()) {            
            CustomerEntity entity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
            
            customerEntitys.add(entity);
        }
        return  customerEntitys;
    }
}
