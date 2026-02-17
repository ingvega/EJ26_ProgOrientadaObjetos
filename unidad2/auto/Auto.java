/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.auto;

import java.time.LocalDate;

/**
 *
 * @author paveg
 */
public class Auto {
    private String estado="Apagado";
    private int anio=LocalDate.now().getYear()+1;
    
    public Auto(){
////        LocalDate hoy=LocalDate.now();
////        anio=hoy.getYear()+1;
    }
    
    public Auto(String estado){
        setEstado(estado);
        
//        nuevoEstado=nuevoEstado.toLowerCase();
//        if(nuevoEstado.equals("encendido") ||
//                nuevoEstado.equals("apagado") ||
//                nuevoEstado.equals("switchabierto")){
//            estado=nuevoEstado;
//        }else{
//            System.out.println("El estado asignado no es valido");
//        }
        
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setAnio(int anio){
        this.anio=anio;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String nuevoEstado){
        nuevoEstado=nuevoEstado.toLowerCase();
        if(nuevoEstado.equals("encendido") ||
                nuevoEstado.equals("apagado") ||
                nuevoEstado.equals("switchabierto")){
            estado=nuevoEstado;
        }else{
            System.err.println("El estado asignado no es valido");
        }
    }
}
