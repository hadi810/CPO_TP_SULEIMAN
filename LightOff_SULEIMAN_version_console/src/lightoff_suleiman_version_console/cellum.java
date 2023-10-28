package lightoff_suleiman_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hadi8
 */
public class cellum {
    
    public cellum (boolean a){
    status =a;
    }
    
    boolean status ;
    /**
     * The function changes the status of the light 
     * 
     */
    public void invers(){
        status=!status;
    }
    /**
     * The function turn on the light 
     */
    public void on(){
    status=true;
    }
    /**
     * The function turn off the light 
     */
     public void off(){
    status=!true;
    }
     /**
      * The function gives the status of light 
      * @return status(boolean) which is true when the light is on 
      */
     public boolean read (){
     return status;
     }
     public void show (){
         if(status)
     System.out.println("light is on");
         else 
                  System.out.println("light is off");

     
     }
    
    
}
