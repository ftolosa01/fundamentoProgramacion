package vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class VentanaMenu extends JFrame {

    private JButton verResultados;
    private JButton volverTest;
    private JButton verObjetivos;
    private VentanaObjetivos ventanaObjetos;
    private VentanaTest ventanaTest;
    private VentanaResultados ventanaResultado;

    public VentanaMenu() {
        
        this.setSize(500, 500);
        this.setTitle("Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,1));
        verResultados = new JButton("Ver Resultados");
        verResultados.addActionListener(e -> {
            verResultados(e);
        });
        this.add(this.verResultados);
        
        volverTest = new JButton("Volver Test");
        volverTest.addActionListener(e -> {
        volverTest(e);
        });
        this.add(this.volverTest);
        
        verObjetivos = new JButton("Ver Objetivos");
        verObjetivos.addActionListener(e -> {
        verObjetivos(e);
        });
        this.add(this.verObjetivos);
        
                
    }

    public void volverTest(ActionEvent e) {
        ventanaTest = new VentanaTest(this);
        ventanaTest.setVisible(true);
        this.setVisible(false);
    }

    public void verResultados(ActionEvent e) {
        ventanaResultado = new VentanaResultados(this);
        ventanaResultado.setVisible(true);
        this.setVisible(false);
    }

    public void verObjetivos(ActionEvent e) {
        ventanaObjetos = new VentanaObjetivos(this);
        ventanaObjetos.setVisible(true);
        this.setVisible(false);
        
    }
}
