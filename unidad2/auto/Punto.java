/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.auto;

/**
 *
 * @author paveg
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y){
        setX(x);
        setY(y);
        //this.x=x;
        //this.y=y;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        if(x>=0){
            this.x=x;
        }else{
            System.err.println("No se permiten valores negativos para X");
        }
    }
    
    public void setY(int y){
        if(y>=0){
            this.y=y;
        }else{
            System.err.println("No se permiten valores negativos para Y");
        }
    }
}
