package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FormularioNovoAdm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public FormularioNovoAdm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(10, 31, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(100, 28, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBounds(10, 56, 46, 14);
		contentPane.add(lblLogin);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 53, 126, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(10, 81, 46, 14);
		contentPane.add(lblSenha);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 78, 126, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		//Instanciar
		Acao a = new Acao();
		
		//JTable
		JTable table = new JTable(a.listarAdministrador());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(10, 157, 216, 177);
		contentPane.add(barra);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Obter dados informados pelo usuário
				String nomeAdministrador = textField.getText();
				String senhaAdministrador = textField_1.getText();
				String loginAdministrador = textField_2.getText();
				
				//Criar objeto e chmar o método
				a.cadastrarAdministrador(nomeAdministrador, loginAdministrador, senhaAdministrador);
				
				//Atualizar tabela
				table.setModel(a.listarAdministrador());
				
				//Limpar campos
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
				//Cursor no campo nome
				textField.requestFocus();
				
			}
		});
		btnCadastrar.setBounds(10, 106, 105, 40);
		contentPane.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
			}
		});
		btnSair.setBounds(115, 106, 111, 40);
		contentPane.add(btnSair);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioNovoAdm.class.getResource("/imagem/c5b3bc59768c6b922bfa3c1ee9b6de4b.jpg")));
		label.setBounds(0, 0, 236, 368);
		contentPane.add(label);
	}
}