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
public class Employee {
    private String name;
    private int age;
    private String gender;
    private double salary;
    private String phoneNum;
    private String address;
    private String department;
    private int employeeNumber;
    private boolean isManager;
    private int vacation;
    public Employee(){// constructor:Set initial values for class
        name = " ";
        age = 0;
        salary=0.00;
        phoneNum=" ";
        address=" ";
        department=" ";
        gender=" ";
        employeeNumber=0;
        isManager=false;
        vacation = 15;
    }
    
     public Employee(String name, int age, String sex, double sal,String cell,String home, 
             String title, int ID,int years, boolean manager){// overload constructor
        this.name = name;
        this.age = age;
        gender=sex;
        salary=sal;
        phoneNum=cell;
        address=home;
        department=title;
        employeeNumber=ID;
        isManager=manager;               
    }
public void loadinfo(String name, int age,String sex,double sal,String cell,String home, 
             String title, int ID,boolean manager){//mutator
        this.name = name;
        this.age = age;
        salary=sal;
        gender=sex;
        phoneNum=cell;
        address=home;
        department=title;
        employeeNumber=ID;
        isManager=manager;
}
public void changeName(String temp){
    this.name=temp;
}
public void changePosn(String temp){
        department = temp;
    }
public void changeAge(int temp){
        age = temp;
    }
public void changeSal(double temp){
        salary = temp;
    }
public void changePhone(String temp){
        phoneNum = temp;
    }
public void changeAddress(String temp){
        address = temp;
    }
public void changeENum(int temp){
    employeeNumber=temp;
}
public void changeGender(String temp){
    gender=temp;
}
public void updateVacation(int temp){
    vacation=temp;
}
public void ifManager(boolean temp){
    isManager=temp;
}
public int GetDays(){
    return vacation;
}
public String getName(){
    return name;
}
public String getGender(){
    return gender;
}
public double getSal(){
    return salary;
}
public String getPhone(){
    return phoneNum;
}
public String getAddress(){
    return address;
}
public String getPosn(){
    return department;
}
public String getIfManager(){
    if(this.isManager){
        return "Manager";
    }
    else{
          return"Employee";  
            }
}
public int getENUM(){
    return employeeNumber;
}
public int getAge(){
    return age;
}
public String getAll(){
    String all="";
    all+=name+" ,aged "+age+" "+gender
            + ", in "+department + " Employee Number: "
            + employeeNumber +" With a salary of $"+ salary +" monthly"+ 
            "\nPhone Number: "+phoneNum+"." +isManager;
    return  all;
}
}
