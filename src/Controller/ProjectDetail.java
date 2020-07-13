/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Project;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class ProjectDetail extends AbstractTableModel{

    private static final String[] COLUMN_NAMES={"ProjectID", "ProjectName", "StartedDate", "ProjectValue", "ReductionPercentage", "DemandedTotalValue", "BankName", "BankBondHandlingFee", "RetaindedMoney", "DueDateReleasingRetainedMoney", "DueDateOfFinishingDate"};
    private static ArrayList<Project> plist; 

    public ProjectDetail(ArrayList<Project> prjctlist) {
        plist=prjctlist;
    }
    
    
    @Override
    public int getRowCount() {
        return plist.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public String getColumnName(int columnIndex){
    return COLUMN_NAMES[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
        case 0:return plist.get(rowIndex).getProjectID();
        case 1:return plist.get(rowIndex).getProjectName();
        case 2:return plist.get(rowIndex).getStartedDate();
        case 3:return plist.get(rowIndex).getProjectValue();
        case 4:return plist.get(rowIndex).getReductionPercentage();
        case 5:return plist.get(rowIndex).getDemandedTotalValue();
        case 6:return plist.get(rowIndex).getBankName();
        case 7:return plist.get(rowIndex).getBankBondHandlingFee();
        case 8:return plist.get(rowIndex).getRetaindedMoney();
        case 9:return plist.get(rowIndex).getDueDateReleasingRetainedMoney();
        case 10:return plist.get(rowIndex).getDueDateOfFinishingDate();
        default:return "Error";     
        }
    }
    
}
