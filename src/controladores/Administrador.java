package controladores;

import java.util.ArrayList;

public class Administrador {
	
	//Atributos
	private String nomeAdministrador;
	private String loginAdministrador;
	private String senhaAdministrador;
	
	//ArrayList
	public static ArrayList<Administrador> dadosAdministrador = new ArrayList<>();
	
	//Métodos magicos
	public String getNomeAdministrador() {
		return nomeAdministrador;
	}
	public void setNomeAdministrador(String nomeAdministrador) {
		this.nomeAdministrador = nomeAdministrador;
	}
	
	public String getLoginAdministrador() {
		return loginAdministrador;
	}
	public void setLoginAdministrador(String loginAdministrador) {
		this.loginAdministrador = loginAdministrador;
	}
	
	public String getSenhaAdministrador() {
		return senhaAdministrador;
	}
	public void setSenhaAdministrador(String senhaAdministrador) {
		this.senhaAdministrador = senhaAdministrador;
	}
	
}