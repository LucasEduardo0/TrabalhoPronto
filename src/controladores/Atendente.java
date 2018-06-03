package controladores;

import java.util.ArrayList;

public class Atendente {
	
	//Atributos
		private String nomeAtendente;
		private String loginAtendente;
		private String senhaAtendente;
		
		//ArrayList
		public static ArrayList<Atendente> dadosAtendente = new ArrayList<>();
		
		//Métodos magicos
		public String getNomeAtendente() {
			return nomeAtendente;
		}
		public void setNomeAtendente(String nomeAtendente) {
			this.nomeAtendente = nomeAtendente;
		}
		
		public String getLoginAtendente() {
			return loginAtendente;
		}
		public void setLoginAtendente(String loginAtendente) {
			this.loginAtendente = loginAtendente;
		}
		
		public String getSenhaAtendente() {
			return senhaAtendente;
		}
		public void setSenhaAtendente(String senhaAtendente) {
			this.senhaAtendente = senhaAtendente;
		}

}