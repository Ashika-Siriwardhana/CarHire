/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_a_car.entity;

/**
 *
 * @author user
 */
public class RentEntity {
    private Integer rentId;
    private Integer carId;
    private String custId;
    private String fromDate;
    private String toDate;
    private Double dayPrice;
    private Double total;
    private Double refundDeposit;
    private String isReturnRefundDeposit;
    private Double advanceAmount;
    private Double balanceAmount;
    private Double additionalCharge;
    private String isReturnCar;

    public RentEntity() {
    }

    public RentEntity(Integer rentId, Integer carId, String custId, String fromDate, String toDate, Double dayPrice, Double total, Double refundDeposit, String isReturnRefundDeposit, Double advanceAmount, Double balanceAmount, Double additionalCharge, String isReturnCar) {
        this.rentId = rentId;
        this.carId = carId;
        this.custId = custId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.dayPrice = dayPrice;
        this.total = total;
        this.refundDeposit = refundDeposit;
        this.isReturnRefundDeposit = isReturnRefundDeposit;
        this.advanceAmount = advanceAmount;
        this.balanceAmount = balanceAmount;
        this.additionalCharge = additionalCharge;
        this.isReturnCar = isReturnCar;
    }

    /**
     * @return the rentId
     */
    public Integer getRentId() {
        return rentId;
    }

    /**
     * @param rentId the rentId to set
     */
    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }

    /**
     * @return the carId
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * @param carId the carId to set
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * @param fromDate the fromDate to set
     */
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * @return the toDate
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * @param toDate the toDate to set
     */
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    /**
     * @return the dayPrice
     */
    public Double getDayPrice() {
        return dayPrice;
    }

    /**
     * @param dayPrice the dayPrice to set
     */
    public void setDayPrice(Double dayPrice) {
        this.dayPrice = dayPrice;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return the refundDeposit
     */
    public Double getRefundDeposit() {
        return refundDeposit;
    }

    /**
     * @param refundDeposit the refundDeposit to set
     */
    public void setRefundDeposit(Double refundDeposit) {
        this.refundDeposit = refundDeposit;
    }

    /**
     * @return the isReturnRefundDeposit
     */
    public String getIsReturnRefundDeposit() {
        return isReturnRefundDeposit;
    }

    /**
     * @param isReturnRefundDeposit the isReturnRefundDeposit to set
     */
    public void setIsReturnRefundDeposit(String isReturnRefundDeposit) {
        this.isReturnRefundDeposit = isReturnRefundDeposit;
    }

    /**
     * @return the advanceAmount
     */
    public Double getAdvanceAmount() {
        return advanceAmount;
    }

    /**
     * @param advanceAmount the advanceAmount to set
     */
    public void setAdvanceAmount(Double advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    /**
     * @return the balanceAmount
     */
    public Double getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * @param balanceAmount the balanceAmount to set
     */
    public void setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    /**
     * @return the additionalCharge
     */
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    /**
     * @param additionalCharge the additionalCharge to set
     */
    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    /**
     * @return the isReturnCar
     */
    public String getIsReturnCar() {
        return isReturnCar;
    }

    /**
     * @param isReturnCar the isReturnCar to set
     */
    public void setIsReturnCar(String isReturnCar) {
        this.isReturnCar = isReturnCar;
    }

    @Override
    public String toString() {
        return "RentEntity{" + "rentId=" + rentId + ", carId=" + carId + ", custId=" + custId + ", fromDate=" + fromDate + ", toDate=" + toDate + ", dayPrice=" + dayPrice + ", total=" + total + ", refundDeposit=" + refundDeposit + ", isReturnRefundDeposit=" + isReturnRefundDeposit + ", advanceAmount=" + advanceAmount + ", balanceAmount=" + balanceAmount + ", additionalCharge=" + additionalCharge + ", isReturnCar=" + isReturnCar + '}';
    }

    
}
