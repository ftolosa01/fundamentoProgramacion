package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class VentanaObjetivos extends JFrame {

    private JLabel objetivos;
    private JRadioButton objUno;
    private JRadioButton objDos;
    private JRadioButton objTres;
    private JButton volver;
    private VentanaMenu ventanaMenu;

    public VentanaObjetivos(VentanaMenu ventanaMenu) {

        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.HEIGHT);
        this.setTitle("Objetivos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.ventanaMenu = ventanaMenu;
        this.setLayout(new GridLayout(5, 1));
        objetivos = new JLabel("Seleccione su objetivo");
        this.add(this.objetivos);

        objUno = new JRadioButton(" Aumentar la capacidad de memoria a corta plazo");
        this.add(this.objUno);

        objDos = new JRadioButton(" Aumentar la memoria a corto plazo superando a la media");
        this.add(this.objDos);

        objTres = new JRadioButton("Aumentar la memoria a corto plazo, superando a gran parte de la poblacion");
        this.add(objTres);

        volver = new JButton(" Volver  al menu");
        volver.addActionListener(e -> {
            volverMenu(e);
        });
        this.add(volver);
    }

    public void volverMenu(ActionEvent e) {
        ventanaMenu.setVisible(true);
        this.setVisible(false);
    }
}
