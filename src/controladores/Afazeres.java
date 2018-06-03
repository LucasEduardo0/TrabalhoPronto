package controladores;

import java.util.ArrayList;

public class Afazeres {
	
	//Atributos
	private String nomeFuncionario;
	private String cargo;
	private String afazer;
	
	//ArrayList
	public static ArrayList<Afazeres> dadosAfazeres = new ArrayList<>();
	
	//Métodos magicos
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getAfazer() {
		return afazer;
	}
	public void setAfazer(String afazer) {
		this.afazer = afazer;
	}

}
