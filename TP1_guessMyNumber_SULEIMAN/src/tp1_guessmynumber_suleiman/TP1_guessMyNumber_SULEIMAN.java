/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_suleiman;

/**
 *
 * @author hadi8
 */
import java.util.Scanner;
import java.util.Random;
public class TP1_guessMyNumber_SULEIMAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
Random gr = new Random(); 
        System.out.println("choose diffculty level \n 1)easy\n 2)hard" );
        int i=sc.nextInt();
        if (i==1){
        
  
   int n=gr.nextInt(100); int x; int p=0;
   do{
   System.out.println("enter your guess");
    x=sc.nextInt();
    if(x>n) System.out.println("too big");
    if(x<n) System.out.println("too small");
     if(x==n) System.out.println("true guess");
     p++;
   }
   while (x!=n);
   System.out.println("it took you "+p+" times");
    
    
    
    }
        else{
        
         int n=gr.nextInt(100); int x; int p=0;
   do{
   System.out.println("enter your guess");
    x=sc.nextInt();
    if(x>n) System.out.println("too big");
    if(x<n) System.out.println("too small");
     if(x==n) System.out.println("true guess");
     p++;
   }
   while (x!=n&&p<7);
   if(x!=n) System.out.println("you lost");
   System.out.println("it took you "+p+" times");
    
        
        
        
        
        
        }
    
    
    
    
    }
    
}
