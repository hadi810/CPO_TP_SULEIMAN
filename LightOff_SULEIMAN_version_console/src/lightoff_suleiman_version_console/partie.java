/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_suleiman_version_console;
import java.util.Scanner;
/**
 *
 * @author hadi8
 */
public class partie {
    int h=0;
    Scanner s=new Scanner(System.in);
    int n=0,m;
    GrilleDeJeu grille;
    /**
     * the constructor of the class 
     * @param nc number of columns 
     * @param nl number of lines
     */
    public partie (int nc,int nl){
    n=0; m=nc+nl/3;
    grille=new GrilleDeJeu(nc,nl);
    }
    /**
     * prepare the game in easy mode
     */
    public void initialiser(){
    grille.melangerMatrice(m);
    }
    /**
     * prepare the game in very hard mode
     */
    public void initialiser_impossible(){
    grille.melangerMatriceh(m);
    }
    /**
     * prepare the game in hard mode
     */
    public void initialiser_hard(){
    grille.melangerMatriceh(m);
    h=2;
    }
    
    /**
     * launches the game
     */
    public void lancer(){
        
        grille.tostring();
    while(!grille.cellulesToutesEteintes()){
        char g; n++;
    System.out.println("enter L to choose a line \nenter C to choose a colone \nenter D to choose a diagonal ");
    System.out.println("you have "+h+" chance to inver");
    g=s.next().charAt(0);
            if(g=='L'){
            System.out.println("enter the number of the line ");
            int u=s.nextInt();
            grille.invl(u);
            }
            if(g=='H'&&h!=0){
            System.out.println("enter the index of the cell that you want to inverse ");
            int u=s.nextInt();
            int uu=s.nextInt();
            h--; 
            grille.mat[u][uu].invers();
            }
            if(g=='C'){
            System.out.println("enter the number of the colone ");
            int u=s.nextInt();
            grille.invc(u);
            }
            if(g=='D'){
            System.out.println("enter the number of the diagonale ");
            int u=s.nextInt();
            if(u==1) grille.invDiagonale();
            else {grille.invDiagonaled();}
            }
            System.out.println("number of trys is "+n);
            grille.tostring(); 
            System.out.println("\n\n\n\n");
    }
    System.out.println("you won with "+n+" trys");
    }
    
    
   
   
    
    
    
}
