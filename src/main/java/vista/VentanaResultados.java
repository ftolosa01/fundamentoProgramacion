package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaResultados extends JFrame {

    private JLabel porcentaje;
    private JTextField mostrarPorcentaje;
    private JButton menu;
    private VentanaMenu ventanaMenu;
    private JPanel resultado;

    public VentanaResultados(VentanaMenu ventanaMenu) {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.HEIGHT);
        this.setTitle("Resultados");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.ventanaMenu = ventanaMenu;
        resultado = new JPanel();

        porcentaje = new JLabel("Porcentaje de aciertos :");
        resultado.add(this.porcentaje);

        mostrarPorcentaje = new JTextField(10);
        resultado.add(this.mostrarPorcentaje);
        //cambiar uml para que almDatos llame a venResultado y llene el jtfield con los resultados//

        menu = new JButton("Menu");
        menu.addActionListener(e -> {
            menu(e);
        });
        this.add(this.menu, BorderLayout.SOUTH);
        this.add(this.resultado, BorderLayout.CENTER);
    }

    public void menu(ActionEvent e) {
        ventanaMenu.setVisible(true);
        this.setVisible(false);
    }
}
