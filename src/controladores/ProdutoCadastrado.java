package controladores;

import java.util.ArrayList;

public class ProdutoCadastrado {
	
	//Atributos
	private double codigoProduto;
	private String nomeProduro;
	private String descricao;
	private double valor;
	private int idadeMinima;
	private double quantidade;
	private double valorUnitario;
	private double valorTotal;
	
	//ArrayList
	public static ArrayList<ProdutoCadastrado> dadosCadastro = new ArrayList<>();
	
	//Métodos magicos
	public double getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(double codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduro;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduro = nomeProduto;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getIdadeMinima() {
		return idadeMinima;
	}
	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	

}