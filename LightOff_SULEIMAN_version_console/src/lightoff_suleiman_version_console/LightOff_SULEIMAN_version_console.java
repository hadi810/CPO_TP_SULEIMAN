/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_suleiman_version_console;

/**
 *
 * @author hadi8
 */
public class LightOff_SULEIMAN_version_console {

    /**
     * zdfd
     */
    public static void main(String[] args) {
        
        /*cellum a,b ;
        a =new cellum();
        b =new cellum();
        a.tostring();
        b.tostring();
        a.invers();
        b.eteindreCellule();
        a.tostring ();
        b.tostring();*/
        
        GrilleDeJeu a;
        a=new GrilleDeJeu(5,5);
        a.melangerMatrice(6);
        a.tostring();
        a.activerc(3);
        a.activerl(2);
        a.tostring();
        
       
        
        
    }
    
}
