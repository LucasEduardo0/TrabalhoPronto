package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FormularioAtendente extends JFrame {

	private JPanel contentPane;

	public FormularioAtendente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarProdutos = new JButton("Cadastrar Bebida");
		btnCadastrarProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Chamar formulario
				FormularioCadastrarProduto fcp = new FormularioCadastrarProduto();
				fcp.repaint();
				
			}
		});
		btnCadastrarProdutos.setBounds(47, 75, 127, 36);
		contentPane.add(btnCadastrarProdutos);
		
		JButton btnHistricoProdutos = new JButton("Hist\u00F3rico Produtos");
		btnHistricoProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Chamar formulario
				FormularioHistorico fh = new FormularioHistorico();
				fh.repaint();
				
			}
		});
		btnHistricoProdutos.setBounds(209, 75, 127, 36);
		contentPane.add(btnHistricoProdutos);
		
		JButton btnVerAfazeres = new JButton("Fazer Afazeres");
		btnVerAfazeres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Chamar formulario
				FormularioFazerAfazeres ffa = new FormularioFazerAfazeres();
				ffa.repaint();
				
			}
		});
		btnVerAfazeres.setBounds(47, 136, 127, 36);
		contentPane.add(btnVerAfazeres);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar funcionario
				FormularioEntrada fe = new FormularioEntrada();
				fe.repaint();
				
			}
		});
		btnSair.setBounds(124, 198, 127, 36);
		contentPane.add(btnSair);
		
		JButton btnAlterarOuExcluir = new JButton("Alterar ou Excluir produtos");
		btnAlterarOuExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Chamar formuçário
				FormularioIrAlteracaoEcluir fiae = new FormularioIrAlteracaoEcluir();
				
			}
		});
		btnAlterarOuExcluir.setBounds(209, 136, 127, 36);
		contentPane.add(btnAlterarOuExcluir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioAtendente.class.getResource("/imagem/garrafas-bebidas.jpg")));
		label.setBounds(0, 0, 387, 261);
		contentPane.add(label);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}
