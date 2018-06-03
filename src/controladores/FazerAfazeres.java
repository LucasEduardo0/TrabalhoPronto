package controladores;

import java.util.ArrayList;

public class FazerAfazeres {
	
	//Atributos
	private String nomeFuncionario;
	private String cargo;
	private String afazer;
	private String situacao;
	
	//ArrayList
	public static ArrayList<FazerAfazeres> dadosFazerAfazeres = new ArrayList<>();
	
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
		
		public String getSituacao() {
			return situacao;
		}
		public void setSituacao(String situacao) {
			this.situacao = situacao;
		}
		
}
