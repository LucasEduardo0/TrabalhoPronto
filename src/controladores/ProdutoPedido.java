package controladores;

import java.util.ArrayList;

public class ProdutoPedido {
	
	//Atributos
	private String nomeCliente;
	private int idadeCliente;
	private double codigoProduto;
	private String nomeProduto;
	private String descricao;
	private double quantidade;
	private double valorUnitario;
	private double valorCompra;
	private double pagoCliente;
	private double troco;
	private String hora;
	private String data;
	
	//ArrayList
	public static ArrayList<ProdutoPedido> dadosPedido = new ArrayList<>();
	
	//Métodos magicos
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public int getIdadeCliente() {
		return idadeCliente;
	}
	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}
	
	public double getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(double codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompta(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public double getPagoCliente() {
		return pagoCliente;
	}
	public void setPagoCliente(double pagoCliente) {
		this.pagoCliente = pagoCliente;
	}
	
	public double getTroco() {
		return troco;
	}
	public void setTroco(double troco) {
		this.troco = troco;
	}
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

}