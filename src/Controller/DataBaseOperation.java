/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Project;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DataBaseOperation {
   
    String url="jdbc:mysql://localhost:3306/construction";
    String username="root";
    String password="";
    Connection connection =null;
    PreparedStatement pst = null;
    ResultSet rs;
    
    public boolean AddProject(Project project){
        try {
            connection = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO projects VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement)connection.prepareStatement(query);
            pst.setString(1, project.getProjectID());
            pst.setString(2, project.getProjectName());
            pst.setString(3, project.getStartedDate());
            pst.setString(4, project.getProjectValue());
            pst.setString(5, project.getReductionPercentage());
            pst.setString(6, project.getDemandedTotalValue());
            pst.setString(7, project.getBankName());
            pst.setString(8, project.getBankBondHandlingFee());
            pst.setString(9, project.getRetaindedMoney());
            pst.setString(10, project.getDueDateReleasingRetainedMoney());
            pst.setString(11, project.getDueDateOfFinishingDate());
            
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public ArrayList<Project> getProjects(){
        ArrayList<Project> plist = new ArrayList<>();
        
        try{
            connection = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM projects";
            pst = (PreparedStatement)connection.prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next()){
                Project p = new Project();
                p.setProjectID(rs.getString(1));
                p.setProjectName(rs.getString(2));
                p.setStartedDate(rs.getString(3));
                p.setProjectValue(rs.getString(4));
                p.setReductionPercentage(rs.getString(5));
                p.setDemandedTotalValue(rs.getString(6));
                p.setBankName(rs.getString(7));
                p.setBankBondHandlingFee(rs.getString(8));
                p.setRetaindedMoney(rs.getString(9));
                p.setDueDateReleasingRetainedMoney(rs.getString(10));
                p.setDueDateOfFinishingDate(rs.getString(11));
                
                plist.add(p);
                
            }
            return plist;
        }catch(SQLException ex){
            System.out.println("Exception" + ex);
            return null;
        }
    }
    
    public boolean updateProject(Project prjct){
        try {
            connection = (Connection)DriverManager.getConnection(url, username, password);
            String query = "UPDATE projects SET ProjectName='"+prjct.getProjectName()+"', StartedDate='"+prjct.getStartedDate()+"', ProjectValue='"+prjct.getProjectValue()+"', ReductionPercentage='"+prjct.getReductionPercentage()+"', DemandedTotalValue='"+prjct.getDemandedTotalValue()+"', BankName='"+prjct.getBankName()+"', BankBondHandlingFee='"+prjct.getBankBondHandlingFee()+"', RetaindedMoney='"+prjct.getRetaindedMoney()+"', DueDateReleasingRetainedMoney='"+prjct.getDueDateReleasingRetainedMoney()+"', DueDateOfFinishingDate='"+prjct.getDueDateOfFinishingDate()+"' WHERE ProjectID="+prjct.getProjectID();
            pst=(PreparedStatement) connection.prepareStatement(query);
            pst.executeQuery();
            return true;
        } catch (Exception e) {
            System.out.println("Exception " +e);
            return false;
        }
    }
    
    public boolean deleteProject(Project pr){
        try {
            connection = (Connection) DriverManager.getConnection(url, username, password);
            String qury;
            qury ="DELETE FROM projects WHERE ProjectID ="+pr.getProjectID();
            pst = (PreparedStatement) connection.prepareStatement(qury);
            pst.executeUpdate();
            return true;
        }   catch (Exception e) {
            System.out.println("Exception "+e);
            return false;
        }
    }
    
     public boolean deleteStudent(Project em)
    {
        try{
               connection = (Connection)(java.sql.Connection)DriverManager.getConnection(url, username, password);
               String query;
               //String var = em.getProjectID();
               int var = Integer.parseInt(em.getProjectID());
            query = "DELETE FROM projects WHERE ProjectID =" +var;
               pst =(PreparedStatement)(java.sql.PreparedStatement)connection.prepareStatement(query);
            
                pst.executeUpdate();
               return true;
               
        }catch(SQLException e){System.out.println(e); return false;}
        
    }
}


