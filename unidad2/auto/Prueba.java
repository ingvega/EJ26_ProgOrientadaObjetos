/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.auto;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        //Scanner lector=new Scanner(System.in);
        Auto auto1=new Auto();
        auto1.setEstado("encendido");
        System.out.println(auto1.getEstado());
        System.out.println(auto1.getAnio());
        
        Auto auto2=new Auto("estado");
        System.out.println(auto2.getEstado());
        System.out.println(auto2.getAnio());
        
//        String texto="Hola";
//        texto="Mundo";
        
    }
}
