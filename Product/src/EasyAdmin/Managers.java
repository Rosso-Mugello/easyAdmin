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
public class Managers  extends Employee {
    private int code;

    public Managers(){
        super();
        code=000000;
    }
    public Managers(String name, int age, String sex, double sal,String cell,String home, 
             String title, int ID,int years,boolean manager ,int password){// overload constructor
        super(name,age,sex,sal,cell,home,title,ID,years,manager); 
        this.code = password; 
    }
    
    public void changeCode(int temp){
        code = temp;
    }
    public int getCode(){
        return code;
    }
}
