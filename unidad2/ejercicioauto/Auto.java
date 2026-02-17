/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.ejercicioauto;

/**
 *
 * @author paveg
 */
public class Auto {

    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMaxima;
    private boolean encendido;

    public Auto(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        //"Volskwagen "
        //"Aston      Martin    " -> "   Aston      Martin  "
        //"a         b" "a b"
        
        if (marca != null) {
            //Quitar espacios de los extremos y luego los de en medio que tengan
            //más de 2
            String marcaSinEspacios = marca.trim().replaceAll("\\s{2,}", " ");
            int longitud = marcaSinEspacios.length();
            if (longitud >= 2 && longitud <= 50) {
                this.marca = marcaSinEspacios;
            } else {
                System.err.println("La marca no cuenta con una longitud valida");
            }
        }else{
            System.err.println("No se recibio un valor para la marca");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
    }

    public void apagar() {
    }

    public void acelerar() {
    }

    public void acelerar(int velocidad) {
    }

    public void frenar() {
    }

    public void frenar(int velocidad) {
    }

}
