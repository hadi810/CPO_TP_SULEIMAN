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
    
    public cellum (){
    etat =false;
    }
    
    private boolean etat ;
    /**
     * The function changes the status of the light 
     * 
     */
    public void invers(){
        etat=!etat;
    }
    /**
     * The function turn on the light 
     */
    public void activerCellule(){
    etat=true;
    }
    /**
     * The function turn off the light 
     */
     public void eteindreCellule(){
    etat=!true;
    }
     /**
      * The function gives the status of light 
      * @return status(boolean) which is true when the light is on 
      */
     public boolean getetat (){
     return etat;
     }
     /**
      * to know if the cell is off 
      * @return true if the cell is off and false if it is on
      */
     public boolean estEteint(){
     return !etat;
     }
     /**
      * print X if cell is on and O if not
      */
     public void tostring(){
         if(etat)
     System.out.print("X");
         else 
                  System.out.print("O");

     
     }
    
    
}
