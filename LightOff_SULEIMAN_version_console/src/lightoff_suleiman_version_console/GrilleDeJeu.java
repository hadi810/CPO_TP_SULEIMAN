/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_suleiman_version_console;
import java.util.Random;
/**
 *
 * @author hadi8
 */
public class GrilleDeJeu {
   
     int nl,nc;
    cellum[][] mat;
    
    public GrilleDeJeu (int nc_,int nl_){
    nc=nc_;
    nl=nl_;
    mat= new cellum[nc][nl];
    for(int i=0;i<nc;i++){
    for(int j=0;j<nl;j++){
    mat[i][j]=new cellum();
    }}}
     
    /**
     * this function turns off all the cells of the gride 
     */
    public void eteindreToutes(){
    for(int i=0;i<nc;i++){
    for(int j=0;j<nl;j++){
    mat[i][j].eteindreCellule();
    }}
    }
    /**
     * this actives a line or a colone or a diagonal randomly
     */
    public void activeraleatoire(){
    Random r=new Random();
    int n = r.nextInt()%4;
    if(n<0)n=-n;
    if(n==0){
    int nn=r.nextInt()%nl;
    if(nn<0)nn=-nn;
    for(int i=0;i<nc;i++){
    mat[i][nn].activerCellule();
    }
    }
    if(n==1){
    int nn=r.nextInt()%nc;
     if(nn<0)nn=-nn;
    for(int i=0;i<nl;i++){
    mat[nn][i].activerCellule();
    }
    }
    if(n==2){
    for(int i=0;i<nl&&i<nc;i++){
    mat[i][i].activerCellule();
    }}
    if(n==3){
    for(int i=nc-1;i>=0&&nc-1-i<nl;i--){
    mat[i][i].activerCellule();
    }
    }
    
    }
    /**
     * activate a line 
     * @param a the index of the line to be activated 
     */
    public void activerl(int a){
    for(int i=0;i<nc;i++) mat[i][a].activerCellule();
    }
    /**
     * activate a colone
     * @param a the index of the colone to be activated 
     */
    public void activerc(int a){
    for(int i=0;i<nl;i++) mat[a][i].activerCellule();
    }
    /**
     * this function mix grid randomly
     * @param a the level of mixing or the number of moves needed to rearrenge the grid
     */
    public void melangerMatrice(int a){
    eteindreToutes();
    for(int i=0;i<a;i++){
        activeraleatoire();
    }
    }
    /**
     * activate the \ diagonale
     */
    public void activerDiagonale(){
    for(int i=0;i<nl&&i<nc;i++){
    mat[i][i].activerCellule();
    }
    }
    /**
     * activate the / diagonale
     */
    public void activerDiagonaled(){
    for(int i=nc-1;i>=0&&nc-1-i<nl;i--){
    mat[i][i].activerCellule();
    }
    }
    /**
     * test if the grid is all off
     * @return true if all the cells are off
     */
    public boolean cellulesToutesEteintes(){
        boolean t=true;
    for(int i=0;i<nc;i++){
    for(int j=0;j<nl;j++){
    if( !mat[i][j].estEteint()) t=false;
    }} return t;
    }
    /**
     * print the grid 
     */
    public void tostring(){
        System.out.print("   |");
        for(int i=0;i<nc;i++){
        System.out.print(" "+i+" |");
        } System.out.println();
        for(int i=0;i<=nc;i++){
            System.out.print("----");
        } System.out.println();
    for(int i=0;i<nl;i++){
    System.out.print(" "+i+" |");
    for(int j=0;j<nc;j++){
    System.out.print(" ");
            mat[j][i].tostring();
            
           System.out.print (" |");
    }System.out.println();
    for(int j=0;j<=nc;j++){
    System.out.print("----");
    } System.out.println();
    }
    }
    
    
}