/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.mariobros;

/**
 *
 * @author paveg
 */
public class Jugador {

    private int nivelPoder = 1;
    private String nombre;
    private int monedas;
    private int vidas;

    public String getNombre() {
        return nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        if (vidas > 0) {
            this.vidas = vidas;
        } else {
            System.err.println("La cantidad de vidas indicada no es valida");
        }
    }

    public void subirNivel() {
        nivelPoder++;
    }

    // nivel inicial 1
    // powerUp 2
    // gigante 3
    public void perderNivel() {
        if (nivelPoder > 0) {
            nivelPoder--;
        }
        if (nivelPoder == 0) {
            perderVida();
            nivelPoder = 1;
        }
    }

    public void ganaVida() {
        vidas++;
    }

    public void perderVida() {
        if (vidas > 0) {
            vidas--;
        }
        if(vidas==0){
            System.out.println("GAME OVER");
            //Finaliza la ejecución
            System.exit(0);
        }
    }

    public void saltar() {
        System.out.println("Saltando");
    }

    public void volar() {
        System.out.println("Volando");
    }

    public void tomarHongo(Hongo hongo) {
        if (hongo.getColor().equalsIgnoreCase("rojo")) {
            //nivelPoder++;
            subirNivel();
        } else {
            ganaVida();
        }
    }

}
