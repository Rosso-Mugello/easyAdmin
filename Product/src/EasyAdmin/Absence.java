/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyAdmin;

/**
 *
 * @author 3406446
 */
public class Absence {
    private String name;     //constant
    private int EmployeeNum; //constant
    private String type;
    private double timeInDays; // 8 working hours a day
    private String department;
    private boolean approval;
    public Absence(){
    name="Unknown";
    EmployeeNum=000;
    type="Unknown";
    timeInDays=0; // 8 working hours a day
    department="Unknown";
    approval=false;
}
    public void loadInfo(String name, int ID, String type, double time, String department){
    this.name=name;
    EmployeeNum=ID;
    this.type=type;
    timeInDays=time; // 8 working hours a day
    this.department=department;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }        
    public String getDepartment(){
        return department;
    }
    public int getId(){
        return EmployeeNum;
    }
    public double getLength(){
        return timeInDays;
    }
    public String getState(){
      String out=name+" "+EmployeeNum+" "+type+" "+department+" "+timeInDays +" days"+".";
      if(approval){
          out += "Approved!";
      }
        return out;
    }
    public void setType(String temp){
        type=temp;
    }
    public void setDuration(double time){
        this.timeInDays=time;
    }
    public void setState(boolean temp){
        approval=temp;
    }
    
}
