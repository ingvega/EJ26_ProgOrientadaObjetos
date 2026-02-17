/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.practicacuadrado;

/**
 *
 * @author paveg
 */
public class Cuadrado {

    private int lado;
    public Punto verticeInfIzq = new Punto(0, 0);

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public Cuadrado(int lado, Punto verticeInfIzq) {
        this.lado = lado;
        this.verticeInfIzq = verticeInfIzq;
    }

    /**
     * Intenta fusionar el cuadrado actual con el recibido como parámetro, en
     * caso de que ambos se sobre pongan o se toquen, la fusión es posible El
     * cuadrado más grande siempre se conservará, en caso de ser de las mismas
     * dimensiones, el cuadrado actual consume al cuadrado recibido como
     * parámetro
     *
     * @param c Cuadrado con el que se intentará fusionar
     * @return Cuando la fusión se realiza, devuelve el cuadrado que fue
     * consumido, cuando la fusion no puede darse, devuelve null
     */
    public Cuadrado fusionar(Cuadrado c) {
        //Verificar las colisiones
        boolean colisiona = false;
        Punto[] veriticesDeThis=obtenerVertices(this);
        Punto[] veriticesDeC=obtenerVertices(c);
        
        
        
        //Si hay colisiones
        //if(colisiona){
        if (colisiona == true) {
            if(this.lado>=c.lado){
                this.lado+=c.lado;
                return c;
            }else{
                c.lado+=this.lado;
                return this;
            }
        } else {
            //Si no hay colisiones
            return null;
        }
    }
    
    private Punto[] obtenerVertices(Cuadrado c){
    
    } 

}
