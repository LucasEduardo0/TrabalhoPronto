package controladores;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.table.DefaultTableModel;

public class Acao {
	
	//Métodos para cadastro
	public void Cadastrar(double codigoProduto, String nomeProduto, String descricao, double quantidade, double valorUnitario, double valorTotal, int idadeMinima) {
		
		//Criar objeto
		ProdutoCadastrado pc = new ProdutoCadastrado();
		pc.setCodigoProduto(codigoProduto);
		pc.setNomeProduto(nomeProduto);
		pc.setDescricao(descricao);
		pc.setQuantidade(quantidade);
		pc.setValorUnitario(valorUnitario);
		pc.setValorTotal(valorTotal);
		pc.setIdadeMinima(idadeMinima);
		
		//Add ao ArrayList
		ProdutoCadastrado.dadosCadastro.add(pc);
		
	}
	
	//Método para retornar os dados do produto cadastrado
	public DefaultTableModel listarProdutoCadastrado() {
		
		//DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Nome");
		modelo.addColumn("Descrição");
		modelo.addColumn("Quantidade (Litros)");
		modelo.addColumn("Valor (Litro)");
		modelo.addColumn("Valor Total");
		modelo.addColumn("Idade");
		
		for(int indice = 0; indice < ProdutoCadastrado.dadosCadastro.size(); indice++) {
			
			modelo.addRow(new Object [] {
					ProdutoCadastrado.dadosCadastro.get(indice).getCodigoProduto(),
					ProdutoCadastrado.dadosCadastro.get(indice).getNomeProduto(),
					ProdutoCadastrado.dadosCadastro.get(indice).getDescricao(),
					ProdutoCadastrado.dadosCadastro.get(indice).getQuantidade(),
					ProdutoCadastrado.dadosCadastro.get(indice).getValorUnitario(),
					ProdutoCadastrado.dadosCadastro.get(indice).getValorTotal(),
					ProdutoCadastrado.dadosCadastro.get(indice).getIdadeMinima()
			});
			
		}
		
		//Retorno
		return modelo;
		
	}
	
	//Método para alterar produto
	public void alterar(double codigoProduto, String nomeProduto, String descricao, double quantidade, double valorUnitario, double valorTotal, int idadeMinima, int linha) {
	
		//Criar objeto
		ProdutoCadastrado pc = new ProdutoCadastrado();
		pc.setCodigoProduto(codigoProduto);
		pc.setNomeProduto(nomeProduto);
		pc.setDescricao(descricao);
		pc.setQuantidade(quantidade);
		pc.setValorUnitario(valorUnitario);
		pc.setValorTotal(valorTotal);
		pc.setIdadeMinima(idadeMinima);
		
		//Realizar a alteração
		ProdutoCadastrado.dadosCadastro.set(linha, pc);
		
	}
	
	//Método para excluir produto
	public void excluir(int linha) {
		
		ProdutoCadastrado.dadosCadastro.remove(linha);
		
	}
	
	//Método para cadastrar o pedido
	public void cadastrarPedido(String nomeCliente, int idadeCliente, double codigoProduto, String nomeProduto, String descricao, double quantidade, double valorUnitario, double valorCompra, double pagoCliente, double troco, String hora, String data) {
		
		//Criar objeto
		ProdutoPedido pp = new ProdutoPedido();
		pp.setNomeCliente(nomeCliente);
		pp.setIdadeCliente(idadeCliente);
		pp.setCodigoProduto(codigoProduto);
		pp.setNomeProduto(nomeProduto);
		pp.setDescricao(descricao);
		pp.setQuantidade(quantidade);
		pp.setValorUnitario(valorUnitario);
		pp.setValorCompta(valorCompra);
		pp.setPagoCliente(pagoCliente);
		pp.setTroco(troco);
		pp.setHora(hora);
		pp.setData(data);
		
		//Add ao ArrayList
		ProdutoPedido.dadosPedido.add(pp);
		
	}
	
	//Método para retornar os dados do produto cadastrado
	public DefaultTableModel listarProdutoPedido() {
		
		//DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Cliente");
		modelo.addColumn("Idade");
		modelo.addColumn("Codigo");
		modelo.addColumn("Produto");
		modelo.addColumn("Descrição");
		modelo.addColumn("Quantidade");
		modelo.addColumn("Valor(Litro)");
		modelo.addColumn("Valor Compra");
		modelo.addColumn("Valor pago");
		modelo.addColumn("Troco");
		modelo.addColumn("Hora");
		modelo.addColumn("Data");
		
		for(int indice = 0; indice < ProdutoPedido.dadosPedido.size(); indice++) {
			
			modelo.addRow(new Object [] {
					ProdutoPedido.dadosPedido.get(indice).getNomeCliente(),
					ProdutoPedido.dadosPedido.get(indice).getIdadeCliente(),
					ProdutoPedido.dadosPedido.get(indice).getCodigoProduto(),
					ProdutoPedido.dadosPedido.get(indice).getNomeProduto(),
					ProdutoPedido.dadosPedido.get(indice).getDescricao(),
					ProdutoPedido.dadosPedido.get(indice).getQuantidade(),
					ProdutoPedido.dadosPedido.get(indice).getValorUnitario(),
					ProdutoPedido.dadosPedido.get(indice).getValorCompra(),
					ProdutoPedido.dadosPedido.get(indice).getPagoCliente(),
					ProdutoPedido.dadosPedido.get(indice).getTroco(),
					ProdutoPedido.dadosPedido.get(indice).getHora(),
					ProdutoPedido.dadosPedido.get(indice).getData()
			});
			
		}
		
		//Retorno
		return modelo;
		
	}
	
	//Método para cadastrar administrador
	public void cadastrarAdministrador(String nomeAdministrador, String loginAdministrador, String senhaAdministrador) {
		
		//Criar objeto
		Administrador a = new Administrador();
		a.setNomeAdministrador(nomeAdministrador);
		a.setLoginAdministrador(loginAdministrador);
		a.setSenhaAdministrador(senhaAdministrador);
		
		//Add ao ArrayList
		Administrador.dadosAdministrador.add(a);
		
	}
	
	//Métodos para retornar os dados do administrador
	public DefaultTableModel listarAdministrador() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Admistrador");
		
		for(int indice = 0; indice < Administrador.dadosAdministrador.size(); indice++) {
			
			modelo.addRow(new Object [] {
					Administrador.dadosAdministrador.get(indice).getNomeAdministrador(),
					Administrador.dadosAdministrador.get(indice).getLoginAdministrador(),
					Administrador.dadosAdministrador.get(indice).getSenhaAdministrador()
			});
			
		}
		
		//Retorno
		return modelo;
		
	}
	
	//Método para excluir administrador
		public void excluirAdministrador(int linha) {
			
			Administrador.dadosAdministrador.remove(linha);
			
		}
		
	//Método para cadastrar atendente
	public void cadastrarAtendente(String nomeAtendente, String loginAtendente, String senhaAtendente) {
		
		//Criar objeto
		Atendente at = new Atendente();
		at.setNomeAtendente(nomeAtendente);
		at.setLoginAtendente(loginAtendente);
		at.setSenhaAtendente(senhaAtendente);
		
		//Add ao ArrayList
		Atendente.dadosAtendente.add(at);
		
	}
	
	//Método para retornar os dados do atendente
	public DefaultTableModel listarAtendente() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Atendente");
		
		for(int indice = 0; indice < Atendente.dadosAtendente.size(); indice++) {
			
			modelo.addRow(new Object [] {
					Atendente.dadosAtendente.get(indice).getNomeAtendente(),
					Atendente.dadosAtendente.get(indice).getLoginAtendente(),
					Atendente.dadosAtendente.get(indice).getSenhaAtendente()
			});
			
		}
		
		//Retorno
		return modelo;
		
	}
	
	//Método para excluir atendente
	public void excluirAtendente(int linhda) {
		
		Atendente.dadosAtendente.remove(linhda);
		
	}
	
	//Método para cadastrar afazeres
	public void cadastrarAfazer(String nomeFuncionario, String cargo, String afazer) {
		
		//Criar objeto
		Afazeres a = new Afazeres();
		a.setNomeFuncionario(nomeFuncionario);
		a.setCargo(cargo);
		a.setAfazer(afazer);
		
		//Add ao ArrayList
		Afazeres.dadosAfazeres.add(a);
		
	}
	
	//Métodos para retornar dados dos afazeres
	public DefaultTableModel listarAfazeres() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Funcionario");
		modelo.addColumn("Cargo");
		modelo.addColumn("Afazer");
		
		for(int indice = 0; indice < Afazeres.dadosAfazeres.size(); indice++) {
			
			modelo.addRow(new Object [] {
					Afazeres.dadosAfazeres.get(indice).getNomeFuncionario(),
					Afazeres.dadosAfazeres.get(indice).getCargo(),
					Afazeres.dadosAfazeres.get(indice).getAfazer()
			});
			
		}
		
		//Retorno
		return modelo;
		
	}
	
	//Método para cadastrar afazeres
		public void cadastrarFazerAfazer(String nomeFuncionario, String cargo, String afazer, String situacao) {
			
			//Criar objeto
			FazerAfazeres fa = new FazerAfazeres();
			fa.setNomeFuncionario(nomeFuncionario);
			fa.setCargo(cargo);
			fa.setAfazer(afazer);
			fa.setSituacao(situacao);
			
			//Add ao ArrayList
			FazerAfazeres.dadosFazerAfazeres.add(fa);
			
		}
		
		//Métodos para retornar dados dos afazeres
		public DefaultTableModel listarFazerAfazeres() {
			
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.addColumn("Funcionario");
			modelo.addColumn("Cargo");
			modelo.addColumn("Afazer");
			modelo.addColumn("Situacao");
			
			for(int indice = 0; indice < FazerAfazeres.dadosFazerAfazeres.size(); indice++) {
				
				modelo.addRow(new Object [] {
						FazerAfazeres.dadosFazerAfazeres.get(indice).getNomeFuncionario(),
						FazerAfazeres.dadosFazerAfazeres.get(indice).getCargo(),
						FazerAfazeres.dadosFazerAfazeres.get(indice).getAfazer(),
						FazerAfazeres.dadosFazerAfazeres.get(indice).getSituacao()
				});
				
			}
			
			//Retorno
			return modelo;
			
		}
		
		//Método para excluir afazer
		public void excluirAfazer(int linhda) {
			
			FazerAfazeres.dadosFazerAfazeres.remove(linhda);
			
		}

		
		
}