package modelo;

import vista.VentanaUsuario;
import controlador.AlmacenamientoDato;

public class Usuario {
	private String nombre;
	private String contrasenga;
	public VentanaUsuario ventanaUsuario;
	private AlmacenamientoDato recuperarUsuario;

	public Usuario agreagarUsuario(String nombre, String contrasenga) {
		throw new UnsupportedOperationException();
	}

	public boolean iniciarSesion(String nombre, String contrasenga) {
		throw new UnsupportedOperationException();
	}
}