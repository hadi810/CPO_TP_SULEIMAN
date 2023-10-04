/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0;
/**
 *
 * @author hadi8
 */
import java.util.Scanner;

public class Tp0 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter the operator:\n" +
"1) add\n" +
"2) substract\n" +
"3) multiply\n" +
"4) divide\n" +
"5) modulo");
        
        Scanner n;
        n=new Scanner(System.in);
        int o=n.nextInt();
        if(o>5||o<1){
        System.out.println("invalid operator");
        } else{
        System.out.println("please enter the first variable");
        int x=n.nextInt();
        System.out.println("please enter the second variable");
        int y=n.nextInt();
        switch(o){
                case(1): System.out.println(x+y);break;
                case(2): System.out.println(x-y);break;
                case(3): System.out.println(x*y);break;
                case(4): System.out.println(x/y);break;
                case(5): System.out.println(x%y);break;
                default:System.out.println("invalid operator");

        }}

        
                
        

        
        
        
    }
    
}
