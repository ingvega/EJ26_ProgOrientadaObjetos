package unidad2.practicacirculo;

import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String args[]) {
        Circulo c1 = new Circulo(5);
        System.out.println(c1.centro.getX() + "," + c1.centro.getY());
        Punto centroC2 = new Punto(-5, 5);
        Punto centro2C2 = null;
        Circulo c2 = new Circulo(3, centro2C2);
        System.out.println(c2.centro.getX() + "," + c2.centro.getY());

        c2.aumentarRadio(-5);

        System.out.println(c2.calculaArea());
        System.out.println(c2.datosCirculo());
        //JOptionPane.showMessageDialog(null, c2.datosCirculo());
//        c2.aumentarRadio();
//        c2.aumentarRadio();
        c2.aumentarRadio(2);
        c2.mueveX(5);
        c2.mueveY(-5);
        System.out.println(c2.datosCirculo());

//        Punto p1=new Punto(0,0);
//        p1.setX(3);
//        p1.setY(-1);
//        p1.setX(5);
//        System.out.println(p1.getX()+","+p1.getY());
//        p1.setX(p1.getX()+10);
//        p1.setY(p1.getY()+20);
//        System.out.println(p1.getX()+","+p1.getY());
    }
}
