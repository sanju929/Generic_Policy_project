package com.example.zen.engine.cpe.dto;


import java.math.BigDecimal;

public class Equipment {

    private String makYr;
    private String make;
    private String model;
    private String chassisNo;
    private BigDecimal value;
    private String regNo;
    private String itemDesc;

    // Getters & Setters
    public String getMakYr() { return makYr; }
    public void setMakYr(String makYr) { this.makYr = makYr; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getChassisNo() { return chassisNo; }
    public void setChassisNo(String chassisNo) { this.chassisNo = chassisNo; }

    public BigDecimal getValue() { return value; }
    public void setValue(BigDecimal value) { this.value = value; }

    public String getRegNo() { return regNo; }
    public void setRegNo(String regNo) { this.regNo = regNo; }

    public String getItemDesc() { return itemDesc; }
    public void setItemDesc(String itemDesc) { this.itemDesc = itemDesc; }
}
