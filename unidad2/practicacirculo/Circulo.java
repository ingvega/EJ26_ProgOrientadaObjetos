/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.practicacirculo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author paveg
 */
public class Circulo {

    private int radio = 1;
    public Punto centro = new Punto(0, 0);

    public Circulo(int radio) {
        //centro=new Punto(0,0);
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.err.println("El radio no puede tener valores"
                    + " iguales o menores a 0, se asignará un valor inicial de 1");
        }
    }
//    public Circulo(int radio){
//        //centro=new Punto(0,0);
//        setRadio(radio);
//    }
//    private void setRadio(int radio){
//        if(radio>0)
//            this.radio=radio;
//        else{
//            System.err.println("El radio no puede tener valores"
//                    + " iguales o menores a 0, se asignará un valor inicial de 1");
//        }
//    }

    public Circulo(int radio, Punto centro) {
        this(radio);
        if (centro != null) {
            this.centro = centro;
        } else {
            System.err.println("No fue definido el centro, el circulo se posiciono "
                    + " en la coordenada 0,0");
        }
    }

    public double calculaArea() {
        return Math.PI * radio * radio;
        //return Math.PI*Math.pow(radio, 2);
    }

    public void aumentarRadio() {
        radio++;
    }

    public void aumentarRadio(int incremento) {
        if (radio + incremento <= 0) {
            System.err.println("Incremento no valido");
        } else {
            radio += incremento;
        }
    }
    
    public String datosCirculo(){
        String datos="Circulo con posicion: ("+centro.getX()+
                ","+centro.getY()+"). Radio: "
                + radio;
        return datos;
    }
    
    public void mueveX(int x){
        centro.setX(x);
    }
    public void mueveY(int y){
        centro.setY(y);
    }

}
