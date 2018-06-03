package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

public class FormularioIrAlteracaoEcluir extends JFrame {

	private JPanel contentPane;

	public FormularioIrAlteracaoEcluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblClickParaRealizar = new JLabel("Click para realizar a alter\u00E7\u00E3o ou a exclus\u00E3o");
		lblClickParaRealizar.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblClickParaRealizar.setBounds(146, 32, 416, 55);
		contentPane.add(lblClickParaRealizar);
		
		//Instanciar
		Acao a = new Acao();
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Fechar formulário
				dispose();
				
			}
		});
		btnSair.setBounds(283, 347, 114, 39);
		contentPane.add(btnSair);
		
		JTable table = new JTable(a.listarProdutoCadastrado());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(10, 86, 655, 250);
		contentPane.add(barra);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioIrAlteracaoEcluir.class.getResource("/imagem/cerveja.jpg")));
		label.setBounds(0, 0, 675, 414);
		contentPane.add(label);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {

				//Obter a linha 
				int linha = table.getSelectedRow();
				
				//Obter dados
				double codigoProduto = Double.parseDouble(table.getValueAt(linha, 0).toString());
				String nomeProduto = table.getValueAt(linha, 1).toString();
				String descricao = table.getValueAt(linha, 2).toString();
				double quantidade = Double.parseDouble(table.getValueAt(linha, 3).toString());
				double valorUnitario = Double.parseDouble(table.getValueAt(linha, 4).toString());
				double valorTotal = valorUnitario * quantidade;
				int idadeMinima =  Integer.parseInt(table.getValueAt(linha, 6).toString());
					
				//Chamar formulario
				FormularioAlteraeExcluir fae = new FormularioAlteraeExcluir(codigoProduto, nomeProduto, descricao, quantidade, valorUnitario, valorTotal, idadeMinima, linha);
						
				//Fechar formulario
				dispose();
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}