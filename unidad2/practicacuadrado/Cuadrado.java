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
        //Punto[] veriticesDeThis=obtenerVertices(this);
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
        int[] nombre=new int[10];
        Punto[] vertices=new Punto[4];
        //0 Inferior izquierdo VII (ya está definido en el atributo)
        vertices[0]=c.verticeInfIzq;
        //1 Superior izquierdo VSI, la X es la misma que la X de VII y la Y se le debe sumar lado a la Y de VII
        //Punto vertice=new Punto(x,y);
        vertices[1]=new Punto(vertices[0].getX(),c.verticeInfIzq.getY()+c.lado);
        //2 Superior derecho VSD, la X se obtiene sumando lado a la X de VII, la Y será la misma que la de VSI
        vertices[2]=new Punto(c.verticeInfIzq.getX()+c.getLado(),vertices[1].getY());
        //3 Inferior derecho VID, la X es la misma que la de VSD y la Y es la misma que la de VII
        vertices[3]=new Punto(vertices[2].getX(), vertices[0].getY());
        return vertices;
    } 
    
    private boolean colisiona(Punto[] vertices){
        int x1=this.verticeInfIzq.getX(),
                x2=x1+this.lado,
                y1=this.verticeInfIzq.getY(),
                y2=y1+this.lado;
        
        for (int i = 0; i < 4; i++) {
            if(vertices[i].getX()>=x1 && vertices[i].getX()<=x2 &&
                vertices[i].getY()>=y1 && vertices[i].getY()<=y2){
                //vertice i colisiona o se toca con this
                return true;
            }
        }
        //Termina de revisar todos y no colisionan
        return false;        
    }

}
