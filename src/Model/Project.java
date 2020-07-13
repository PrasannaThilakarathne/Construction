/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Project {
    private String projectID;   
    private String projectName;   
    private String startedDate;    
    private String projectValue;   
    private String reductionPercentage;   
    private String demandedTotalValue;    
    private String bankName;    
    private String bankBondHandlingFee;
    private String retaindedMoney;
    private String dueDateReleasingRetainedMoney;
    private String dueDateOfFinishingDate;

    public Project(){
        
    }
    
    public Project(String projectID, String projectName, String startedDate, String projectValue, String reductionPercentage, String demandedTotalValue, String bankName, String bankBondHandlingFee, String retaindedMoney, String dueDateReleasingRetainedMoney, String dueDateOfFinishingDate) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.startedDate = startedDate;
        this.projectValue = projectValue;
        this.reductionPercentage = reductionPercentage;
        this.demandedTotalValue = demandedTotalValue;
        this.bankName = bankName;
        this.bankBondHandlingFee = bankBondHandlingFee;
        this.retaindedMoney = retaindedMoney;
        this.dueDateReleasingRetainedMoney = dueDateReleasingRetainedMoney;
        this.dueDateOfFinishingDate = dueDateOfFinishingDate;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(String startedDate) {
        this.startedDate = startedDate;
    }

    public String getProjectValue() {
        return projectValue;
    }

    public void setProjectValue(String projectValue) {
        this.projectValue = projectValue;
    }

    public String getReductionPercentage() {
        return reductionPercentage;
    }

    public void setReductionPercentage(String reductionPercentage) {
        this.reductionPercentage = reductionPercentage;
    }

    public String getDemandedTotalValue() {
        return demandedTotalValue;
    }

    public void setDemandedTotalValue(String demandedTotalValue) {
        this.demandedTotalValue = demandedTotalValue;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBondHandlingFee() {
        return bankBondHandlingFee;
    }

    public void setBankBondHandlingFee(String bankBondHandlingFee) {
        this.bankBondHandlingFee = bankBondHandlingFee;
    }

    public String getRetaindedMoney() {
        return retaindedMoney;
    }

    public void setRetaindedMoney(String retaindedMoney) {
        this.retaindedMoney = retaindedMoney;
    }

    public String getDueDateReleasingRetainedMoney() {
        return dueDateReleasingRetainedMoney;
    }

    public void setDueDateReleasingRetainedMoney(String dueDateReleasingRetainedMoney) {
        this.dueDateReleasingRetainedMoney = dueDateReleasingRetainedMoney;
    }

    public String getDueDateOfFinishingDate() {
        return dueDateOfFinishingDate;
    }

    public void setDueDateOfFinishingDate(String dueDateOfFinishingDate) {
        this.dueDateOfFinishingDate = dueDateOfFinishingDate;
    }
    
    
    
}
