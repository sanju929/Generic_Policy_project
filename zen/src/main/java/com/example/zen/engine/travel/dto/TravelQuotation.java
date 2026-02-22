package com.example.zen.engine.travel.dto;


import java.util.List;

public class TravelQuotation {

    public String getPolQuotNo() {
        return polQuotNo;
    }

    public void setPolQuotNo(String polQuotNo) {
        this.polQuotNo = polQuotNo;
    }

    public String getPolFromDate() {
        return polFromDate;
    }

    public void setPolFromDate(String polFromDate) {
        this.polFromDate = polFromDate;
    }

    public String getPolToDate() {
        return polToDate;
    }

    public void setPolToDate(String polToDate) {
        this.polToDate = polToDate;
    }

    public String getSportsAct() {
        return sportsAct;
    }

    public void setSportsAct(String sportsAct) {
        this.sportsAct = sportsAct;
    }

    public String getDestCountry() {
        return destCountry;
    }

    public void setDestCountry(String destCountry) {
        this.destCountry = destCountry;
    }

    public List<Passenger> getPolRiskFlexi() {
        return polRiskFlexi;
    }

    public void setPolRiskFlexi(List<Passenger> polRiskFlexi) {
        this.polRiskFlexi = polRiskFlexi;
    }

    private String polQuotNo;
    private String polFromDate;
    private String polToDate;

    private String sportsAct;
    private String destCountry;

    private List<Passenger> polRiskFlexi;

    // getters & setters
}
