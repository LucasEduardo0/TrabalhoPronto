package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FormularioNovoAtendente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JButton btnCadastrar;
	private JButton btnVoltar;
	private JLabel label;

	public FormularioNovoAtendente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(10, 29, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBounds(10, 54, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(10, 79, 46, 14);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(116, 26, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 51, 105, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 76, 105, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		//Instanciar
		Acao a = new Acao();
		
		table = new JTable(a.listarAtendente());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(10, 160, 211, 125);
		contentPane.add(barra);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Obter dados informados pelo usuário
				String nomeAtendente = textField.getText();
				String senhaAtendente = textField_1.getText();
				String loginAtendente = textField_2.getText();
				
				//Criar objeto e chamar método
				a.cadastrarAtendente(nomeAtendente, loginAtendente, senhaAtendente);
				
				//Atualizar tabela
				table.setModel(a.listarAtendente());
				
				//Limpar campos
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
				//Cursor no campo nome
				textField.requestFocus();
				
			}
		});
		btnCadastrar.setBounds(10, 106, 105, 43);
		contentPane.add(btnCadastrar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
			}
		});
		btnVoltar.setBounds(116, 107, 105, 42);
		contentPane.add(btnVoltar);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioNovoAtendente.class.getResource("/imagem/c5b3bc59768c6b922bfa3c1ee9b6de4b.jpg")));
		label.setBounds(0, 0, 241, 322);
		contentPane.add(label);
		
		
		
	}
}