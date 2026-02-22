package com.example.zen.engine.cpe.dto;

import java.util.List;

public class CpeQuotation {

    private List<Equipment> polRiskFlexi;

    // Other fields like policy number, dates, etc.
    private String polQuotNo;
    private String polFromDate;
    private String polToDate;

    // Getters & Setters
    public List<Equipment> getPolRiskFlexi() { return polRiskFlexi; }
    public void setPolRiskFlexi(List<Equipment> polRiskFlexi) { this.polRiskFlexi = polRiskFlexi; }

    public String getPolQuotNo() { return polQuotNo; }
    public void setPolQuotNo(String polQuotNo) { this.polQuotNo = polQuotNo; }

    public String getPolFromDate() { return polFromDate; }
    public void setPolFromDate(String polFromDate) { this.polFromDate = polFromDate; }

    public String getPolToDate() { return polToDate; }
    public void setPolToDate(String polToDate) { this.polToDate = polToDate; }
}
