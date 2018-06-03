package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FormularioAlteraeExcluir extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	//Construtor
	public FormularioAlteraeExcluir(double codigoProduto, String nomeProduto, String descricao, double quantidade, double valorUnitario, double valorTotal, int idadeMinima, int linha) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setForeground(Color.WHITE);
		lblCdigo.setBounds(36, 67, 46, 14);
		contentPane.add(lblCdigo);
		
		textField = new JTextField(String.valueOf(codigoProduto));
		textField.setBounds(125, 64, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNomeProduto = new JLabel("Nome Produto");
		lblNomeProduto.setForeground(Color.WHITE);
		lblNomeProduto.setBounds(36, 92, 78, 14);
		contentPane.add(lblNomeProduto);
		
		textField_1 = new JTextField(nomeProduto);
		textField_1.setBounds(125, 89, 100, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setForeground(Color.WHITE);
		lblDescrio.setBounds(36, 117, 58, 14);
		contentPane.add(lblDescrio);
		
		textField_2 = new JTextField(descricao);
		textField_2.setBounds(125, 114, 100, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade (Litros)");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setBounds(295, 67, 100, 14);
		contentPane.add(lblQuantidade);
		
		textField_3 = new JTextField(String.valueOf(quantidade));
		textField_3.setBounds(405, 64, 100, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblValorUnitrio = new JLabel("Valor Unit\u00E1rio");
		lblValorUnitrio.setForeground(Color.WHITE);
		lblValorUnitrio.setBounds(295, 92, 86, 14);
		contentPane.add(lblValorUnitrio);
		
		textField_4 = new JTextField(String.valueOf(valorUnitario));
		textField_4.setBounds(405, 89, 100, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade ");
		lblIdade.setForeground(Color.WHITE);
		lblIdade.setBounds(295, 117, 46, 14);
		contentPane.add(lblIdade);
		
		textField_5 = new JTextField(String.valueOf(idadeMinima));
		textField_5.setBounds(405, 114, 100, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// Obter os dados informados pelo usuário
				double codigoProduto = Double.parseDouble(textField.getText());
				String nomeProduto = textField_1.getText();
				String descricao = textField_2.getText();
				double quantidade = Double.parseDouble(textField_3.getText());
				double valorUnitario = Double.parseDouble(textField_4.getText());
				double valorTotal = valorUnitario * quantidade;
				int idadeMinima = Integer.parseInt(textField_5.getText());
				
				//Executar a ação para alterar
				Acao a = new Acao();
				a.alterar(codigoProduto, nomeProduto, descricao, quantidade, valorUnitario, valorTotal, idadeMinima, linha);
				
				//Fechar formulário
				dispose();
				
				//Chamar formulário
				FormularioIrAlteracaoEcluir fiae = new FormularioIrAlteracaoEcluir();
				
			}
		});
		btnAlterar.setBounds(36, 169, 145, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Método para executar a exclusão
				Acao a = new Acao();
				a.excluir(linha);
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioIrAlteracaoEcluir fiae = new FormularioIrAlteracaoEcluir();
				
			}
		});
		btnExcluir.setBounds(196, 169, 145, 23);
		contentPane.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioIrAlteracaoEcluir fiae = new FormularioIrAlteracaoEcluir();
				
			}
		});
		btnCancelar.setBounds(360, 169, 145, 23);
		contentPane.add(btnCancelar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioAlteraeExcluir.class.getResource("/imagem/uisque-quantidade-de-bebidas-para-casamento-revista-icasei.jpg")));
		label.setBounds(0, 11, 533, 199);
		contentPane.add(label);
	}

}