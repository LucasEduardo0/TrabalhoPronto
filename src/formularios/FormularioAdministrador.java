package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FormularioAdministrador extends JFrame {

	private JPanel contentPane;

	public FormularioAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JButton btnNewButton = new JButton("Cadastrar Bebida");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Chamar formulario
				FormularioCadastrarProduto fcp = new FormularioCadastrarProduto();
				fcp.repaint();
				
			}
		});
		btnNewButton.setBounds(10, 71, 153, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Novo Administrador");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Chamar campo
				FormularioNovoAdm fna = new FormularioNovoAdm();
				fna.repaint();
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(192, 71, 153, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Novo Atendente");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Chamar formulario
				FormularioNovoAtendente fna = new FormularioNovoAtendente();
				fna.repaint();
			}
		});
		btnNewButton_2.setBounds(192, 144, 153, 43);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Historico de Pedidos");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Chamar formulario
				FormularioHistorico fh = new FormularioHistorico();
				fh.repaint();
				
			}
		});
		btnNewButton_3.setBounds(10, 144, 153, 43);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Demitir Funcionário");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Chamar formulario
				FormularioIrDemitir fid = new FormularioIrDemitir();
				fid.repaint();
				
			}
		});
		btnNewButton_4.setBounds(365, 71, 153, 43);
		contentPane.add(btnNewButton_4);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Sair
				dispose();
				
				//Chamar funcionario
				FormularioEntrada fe = new FormularioEntrada();
				fe.repaint();
				
			}
		});
		btnSair.setBounds(192, 301, 153, 43);
		contentPane.add(btnSair);
		
		JButton btnAlterarOuExcluir = new JButton("Alterar ou Excluir Produto");
		btnAlterarOuExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Chamar formuçário
				FormularioIrAlteracaoEcluir fiae = new FormularioIrAlteracaoEcluir();
				fiae.repaint();
				
			}
		});
		btnAlterarOuExcluir.setBounds(365, 144, 153, 43);
		contentPane.add(btnAlterarOuExcluir);
		
		JButton btnListarAfazeres = new JButton("Listar Afazeres");
		btnListarAfazeres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Chamar formulario
				FormularioListarAfazeres fls = new FormularioListarAfazeres();
				fls.repaint();
				
			}
		});
		btnListarAfazeres.setBounds(10, 217, 153, 43);
		contentPane.add(btnListarAfazeres);
		
		JButton btnExcluirAfazer = new JButton("Excluir Afazer");
		btnExcluirAfazer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Chamar formulario
				FormularioIrExcluirAfazer fiea = new FormularioIrExcluirAfazer();
				fiea.repaint();
				
			}
		});
		btnExcluirAfazer.setBounds(192, 217, 153, 43);
		contentPane.add(btnExcluirAfazer);
		
		JButton btnFazerAfazeres = new JButton("Fazer Afazeres");
		btnFazerAfazeres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Chamar formulario
				FormularioFazerAfazeres fza = new FormularioFazerAfazeres();
				fza.repaint();
				
			}
		});
		btnFazerAfazeres.setBounds(365, 217, 153, 43);
		contentPane.add(btnFazerAfazeres);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioAdministrador.class.getResource("/imagem/garrafas-bebidas.jpg")));
		label.setBounds(0, 0, 554, 433);
		contentPane.add(label);
		setVisible(true);
	}
}