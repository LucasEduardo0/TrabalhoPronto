package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;
import controladores.ProdutoCadastrado;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JTable;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FormularioCadastrarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	
	public FormularioCadastrarProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setVisible(true);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblCadastramento = new JLabel("Cadastramento");
		lblCadastramento.setForeground(Color.WHITE);
		lblCadastramento.setBounds(51, 25, 453, 64);
		lblCadastramento.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		contentPane.add(lblCadastramento);
		
		JLabel lblCdigoDoProduto = new JLabel("C\u00F3digo do Produto");
		lblCdigoDoProduto.setForeground(Color.WHITE);
		lblCdigoDoProduto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCdigoDoProduto.setBounds(31, 123, 154, 26);
		contentPane.add(lblCdigoDoProduto);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setBounds(195, 110, 213, 39);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNomeDoProduto = new JLabel("Nome do Produto");
		lblNomeDoProduto.setForeground(Color.WHITE);
		lblNomeDoProduto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDoProduto.setBounds(31, 178, 154, 26);
		contentPane.add(lblNomeDoProduto);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setBounds(195, 160, 213, 39);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setForeground(Color.WHITE);
		lblDescrio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDescrio.setBounds(31, 230, 154, 26);
		contentPane.add(lblDescrio);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setBounds(195, 210, 215, 39);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade (Litros)");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuantidade.setBounds(458, 123, 154, 26);
		contentPane.add(lblQuantidade);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setBounds(622, 108, 215, 39);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblValorUnitrio = new JLabel("Valor Unit\u00E1rio");
		lblValorUnitrio.setForeground(Color.WHITE);
		lblValorUnitrio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorUnitrio.setBounds(458, 178, 154, 26);
		contentPane.add(lblValorUnitrio);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setBounds(622, 160, 215, 39);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade Mínima");
		lblIdade.setForeground(Color.WHITE);
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdade.setBounds(458, 230, 154, 26);
		contentPane.add(lblIdade);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setBounds(622, 214, 215, 42);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		//Instanciar
		Acao a = new Acao();
		
		//JTabel
		JTable table = new JTable(a.listarProdutoCadastrado());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(31, 288, 1122, 387);
		contentPane.add(barra);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrar.setBounds(1000, 102, 137, 56);
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				// Obter os dados informados pelo usuário
				double codigoProduto = Double.parseDouble(textField_6.getText());
				String nomeProduto = textField_7.getText();
				String descricao = textField_8.getText();
				double quantidade = Double.parseDouble(textField_9.getText());
				double valorUnitario = Double.parseDouble(textField_10.getText());
				double valorTotal = valorUnitario * quantidade;
				int idadeMinima = Integer.parseInt(textField_11.getText());
				
				//Criar objeto e chamar o método
				a.Cadastrar(codigoProduto, nomeProduto, descricao, quantidade, valorUnitario, valorTotal, idadeMinima);
				
				//Atualizar tabela
				table.setModel(a.listarProdutoCadastrado());
				
				//Linpar campos
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				
				//Cursor no campo código produto
				textField_6.requestFocus();
			
			}
		});
		contentPane.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSair.setBounds(1000, 166, 137, 55);
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Fechar formulário
				dispose();
		
			}
		});
		contentPane.add(btnSair);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioCadastrarProduto.class.getResource("/imagem/beer.jpg")));
		label.setBounds(0, -30, 1225, 771);
		contentPane.add(label);
		
	}
}