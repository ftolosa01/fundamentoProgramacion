package vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaTest extends JFrame {

    private VentanaMenu ventanaMenu;
    private JLabel preguntaUno;
    private JLabel preguntaDos;
    private JLabel preguntaTres;
    private JLabel preguntaCutro;
    private JLabel preguntaCinco;
    private JLabel preguntaSeis;
    private JLabel preguntaSiete;
    private JLabel preguntaOcho;
    private JLabel preguntaNueve;
    private JLabel preguntaDies;
    private JTextField preguntaUnoTf;
    private JTextField preguntaDosTf;
    private JTextField preguntaTresTf;
    private JTextField preguntaCutroTf;
    private JTextField preguntaCincoTf;
    private JTextField preguntaSeisTf;
    private JTextField preguntaSieteTf;
    private JTextField preguntaOchoTf;
    private JTextField preguntaNueveTf;
    private JTextField preguntaDiesTf;
    private JPanel test;
    private JButton menu;

    public VentanaTest(VentanaMenu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.HEIGHT);
        this.setTitle("Test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        test = new JPanel();

        preguntaUno = new JLabel();
        preguntaUnoTf = new JTextField(10);
        preguntaDos = new JLabel();
        preguntaDosTf = new JTextField(10);
        preguntaTres = new JLabel();
        preguntaTresTf = new JTextField(10);
        preguntaCutro = new JLabel();
        preguntaCutroTf = new JTextField(10);
        preguntaCinco = new JLabel();
        preguntaCincoTf = new JTextField(10);
        preguntaSeis = new JLabel();
        preguntaSeisTf = new JTextField(10);
        preguntaSiete = new JLabel();
        preguntaSieteTf = new JTextField(10);
        preguntaOcho = new JLabel();
        preguntaOchoTf = new JTextField(10);
        preguntaNueve = new JLabel();
        preguntaNueveTf = new JTextField(10);
        preguntaDies = new JLabel();
        preguntaDiesTf = new JTextField(10);
        test.add(this.preguntaUno);
        test.add(this.preguntaUnoTf);
        test.add(this.preguntaDos);
        test.add(this.preguntaDosTf);
        test.add(this.preguntaTres);
        test.add(this.preguntaTresTf);
        test.add(this.preguntaCutro);
        test.add(this.preguntaCutroTf);
        test.add(this.preguntaCinco);
        test.add(this.preguntaCincoTf);
        test.add(this.preguntaSeis);
        test.add(this.preguntaSeisTf);
        test.add(this.preguntaSiete);
        test.add(this.preguntaSieteTf);
        test.add(this.preguntaOcho);
        test.add(this.preguntaOchoTf);
        test.add(this.preguntaNueve);
        test.add(this.preguntaNueveTf);
        test.add(this.preguntaDies);
        test.add(this.preguntaDiesTf);
        test.setLayout(new GridLayout(10,2));
        this.add(this.test, BorderLayout.CENTER);

        menu = new JButton("Volver menu");
        menu.addActionListener(e -> {
            menu(e);
        });
        this.add(this.menu, BorderLayout.SOUTH);
    }

    public void menu(ActionEvent e) {
        ventanaMenu.setVisible(true);
        this.setVisible(false);
    }
}
