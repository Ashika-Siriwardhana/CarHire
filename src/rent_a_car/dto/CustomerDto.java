/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.dto;

/**
 *
 * @author user
 */
public class CustomerDto {
    private String custID; 
    private String custName; 
    private String custNIC;
    private String custAddress;
    private String custTPNo;

    public CustomerDto(String custID, String custName, String custNIC, String custAddress, String custTPNo) {
        this.custID = custID;
        this.custName = custName;
        this.custNIC = custNIC;
        this.custAddress = custAddress;
        this.custTPNo = custTPNo;
    }

    public CustomerDto() {
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the custNIC
     */
    public String getCustNIC() {
        return custNIC;
    }

    /**
     * @param custNIC the custNIC to set
     */
    public void setCustNIC(String custNIC) {
        this.custNIC = custNIC;
    }

    /**
     * @return the custAddress
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * @param custAddress the custAddress to set
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    /**
     * @return the custTPNo
     */
    public String getCustTPNo() {
        return custTPNo;
    }

    /**
     * @param custTPNo the custTPNo to set
     */
    public void setCustTPNo(String custTPNo) {
        this.custTPNo = custTPNo;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custID=" + custID + ", custName=" + custName + ", custNIC=" + custNIC + ", custAddress=" + custAddress + ", custTPNo=" + custTPNo + '}';
    }
    
    
}
