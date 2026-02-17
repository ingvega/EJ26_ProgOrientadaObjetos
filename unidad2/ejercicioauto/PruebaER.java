/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.ejercicioauto;

/**
 *
 * @author paveg
 */
public class PruebaER {
    public static void main(String[] args) {
        //Expresion Regular
        String numControl="s25120001";
        String expresionRegular="[gaetmcskd][0-9]{2}12[0-9]{4}";
        
        if(numControl.toLowerCase().matches(expresionRegular)){
            System.out.println(numControl + " VALIDO");
        }else{
            System.out.println(numControl + " NO VALIDO");
        }
        
        numControl="S25120001";
        if(numControl.toLowerCase().matches(expresionRegular)){
            System.out.println(numControl + " VALIDO");
        }else{
            System.out.println(numControl + " NO VALIDO");
        }
        //g gestion
        //a ambiental
        //e electrónica
        //t 
        //m
        //c cambios de carrera
        //d industrial
        //s
        //k
        numControl=" S25120001";
        if(numControl.toLowerCase().matches(expresionRegular)){
            System.out.println(numControl + " VALIDO");
        }else{
            System.out.println(numControl + " NO VALIDO");
        }
        
        String cadena=" texto con         espacios            ";
        System.out.println(cadena.trim());
        String erEspaciosDuplicados="\\s{2,}";
        cadena=cadena.replaceAll(erEspaciosDuplicados, " ").trim();
        System.out.println(cadena);
        
        
    }
}
