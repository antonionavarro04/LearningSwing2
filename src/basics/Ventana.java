package basics;

import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana() {
        super("Mi primera ventana");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();

        System.out.println("El ancho de la ventana es " + v.getWidth());
        System.out.println("El alto de la ventana es " + v.getHeight());

        System.out.println("La posición x de la ventana es " + v.getX());
        System.out.println("La posición y de la ventana es " + v.getY());

        System.out.println("El ancho de la pantalla es " + v.getToolkit().getScreenSize().width);
        System.out.println("El alto de la pantalla es " + v.getToolkit().getScreenSize().height);
    }
}
