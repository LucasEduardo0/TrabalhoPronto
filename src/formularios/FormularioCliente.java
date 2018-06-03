package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class FormularioCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public FormularioCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblNomeCliente = new JLabel("Nome Cliente");
		lblNomeCliente.setForeground(Color.WHITE);
		lblNomeCliente.setBounds(10, 61, 89, 14);
		contentPane.add(lblNomeCliente);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setForeground(Color.WHITE);
		lblIdade.setBounds(10, 86, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setBounds(10, 111, 71, 14);
		contentPane.add(lblQuantidade);
		
		JLabel lblDinheiroParaPagar = new JLabel("Dinheiro para pagar");
		lblDinheiroParaPagar.setForeground(Color.WHITE);
		lblDinheiroParaPagar.setBounds(10, 136, 110, 14);
		contentPane.add(lblDinheiroParaPagar);
		
		textField = new JTextField();
		textField.setBounds(138, 58, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 83, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 108, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(138, 133, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		//Instanciar
		Acao a = new Acao();
		
		//JTable
		JTable table = new JTable(a.listarProdutoCadastrado());
		JTable table_1 = new JTable(a.listarProdutoPedido());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				//Obter dados informados do cliente
				String nomeCliente =  textField.getText();
				int idadeCliente = Integer.parseInt(textField_1.getText());
				double quantidade = Integer.parseInt(textField_2.getText());
				double pagoCliente = Double.parseDouble(textField_3.getText()); 
				
				//Obter linha
				int linha = table.getSelectedRow();
				
				//Obter dados da tabela
				double codigoProduto = Double.parseDouble(table.getValueAt(linha, 0).toString());
				String nomeProduto = table.getValueAt(linha, 1).toString();
				String descricao = table.getValueAt(linha, 2).toString();
				double valorUnitario = Double.parseDouble(table.getValueAt(linha, 4).toString());
				
				LocalDateTime tempo = LocalDateTime.now();
				int segundo = tempo.getSecond();
				int minuto = tempo.getMinute();
				int horas = tempo.getHour();
				String hora = horas+":"+minuto+":"+segundo;
				
				LocalDate datas = tempo.toLocalDate();
				
				String data = ""+datas;
				
				double valorCompra = quantidade * valorUnitario;
				double troco = pagoCliente - valorCompra; 
				
				int idadeTabela = Integer.parseInt(table.getValueAt(linha, 6).toString());
				double quantidadeTabela = Double.parseDouble(table.getValueAt(linha, 3).toString());
				
				if(quantidadeTabela < quantidade) {
					
					JOptionPane.showMessageDialog(null, "Quantidade superior a do estoque.");
					
					textField_2.setText("");
					
					textField_2.requestFocus();
					
				}else if(idadeCliente < idadeTabela) {
					
					JOptionPane.showMessageDialog(null, "Você ainda não tem idade para beber.");
					
					textField_1.setText("");
					
					textField_1.requestFocus();
					
				}else if(valorCompra > pagoCliente) {
					
					JOptionPane.showMessageDialog(null, "Dinheiro para pagar insuficiente.");
					
					textField_3.setText("");
					
					textField_3.requestFocus();
					
				}else {
				
				a.cadastrarPedido(nomeCliente, idadeCliente, codigoProduto, nomeProduto, descricao, quantidade, valorUnitario, valorCompra, pagoCliente, troco, hora, data);
				
				//Atualizar tabela
				table_1.setModel(a.listarProdutoPedido());
				
				//Limpar campos
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				
				//Cursor no campo nome
				textField.requestFocus();
				
				}
				
			}
		});
		
		barra.setBounds(253, 51, 432, 128);
		contentPane.add(barra);
		JScrollPane barra2 = new JScrollPane(table_1);
		barra2.setBounds(10, 211, 675, 161);
		contentPane.add(barra2);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioEntrada fe = new FormularioEntrada();
				fe.repaint();
				
			}
		});
		btnSair.setBounds(295, 393, 105, 39);
		contentPane.add(btnSair);
		
		JLabel lblClickNaTabela = new JLabel("Click na tabela à baixo para realizar o pedido");
		lblClickNaTabela.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblClickNaTabela.setForeground(Color.WHITE);
		lblClickNaTabela.setBounds(253, 20, 326, 20);
		contentPane.add(lblClickNaTabela);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioCliente.class.getResource("/imagem/distribuidora-de-bebidas.jpg")));
		label.setBounds(0, 0, 695, 443);
		contentPane.add(label);
		
		
		
		
		
		
	}
}