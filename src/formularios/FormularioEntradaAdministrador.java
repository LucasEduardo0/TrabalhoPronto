package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import controladores.Administrador;
import controladores.Atendente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URL;
import java.security.Principal;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioEntradaAdministrador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public FormularioEntradaAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		
		//Borda
		Border emptyBorder = BorderFactory.createEmptyBorder();
		
		JLabel lblLogin = new JLabel("");
		lblLogin.setBounds(67, 295, 46, 56);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("");
		lblSenha.setBounds(67, 381, 46, 56);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(117, 295, 423, 56);
		textField.setBorder(emptyBorder);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField.setBounds(117, 381, 423, 56);
		passwordField.setBorder(emptyBorder);
		contentPane.add(passwordField);
		
		JButton btnEntrar = new JButton();
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setForeground(Color.BLACK);
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEntrar.setBorder(emptyBorder);
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			if((textField.getText().equals("Lucas")) && (passwordField.getText().equals("lindao"))) {
					
					//Fechar formulario
					dispose();
				
					//Chamar formulario
					FormularioAdministrador fc = new FormularioAdministrador();
					fc.repaint();
					
					textField.setText("");
					passwordField.setText("");
					
				}
					
			for(int linha = 0; linha < Administrador.dadosAdministrador.size(); linha++){
							
				if((textField.getText().equals(String.valueOf(Administrador.dadosAdministrador.get(linha).getLoginAdministrador())) && (passwordField.getText().equals(String.valueOf(Administrador.dadosAdministrador.get(linha).getSenhaAdministrador()))))) {
						
					//Chamar formulario
					FormularioAdministrador fc = new FormularioAdministrador();
					fc.repaint();
					
					//Fechar formulário
					dispose();
					break;
					
				}else if((!textField.getText().equals(String.valueOf(Administrador.dadosAdministrador.get(linha).getLoginAdministrador())) || (!passwordField.getText().equals(String.valueOf(Administrador.dadosAdministrador.get(linha).getSenhaAdministrador()))))){
					
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta.");
					
					textField.setText("");
					passwordField.setText("");
					
				}
				
				}	
					
				}
		
		});
		btnEntrar.setBounds(169, 524, 261, 63);
		contentPane.add(btnEntrar);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Fechar
				dispose();
				
				//Chamar formulario
				FormularioEntrada fe = new FormularioEntrada();
				
			}
		});
		btnVoltar.setBounds(10, 24, 70, 63);
		btnVoltar.setBorder(emptyBorder);
		btnVoltar.setContentAreaFilled(false);
		contentPane.add(btnVoltar);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(FormularioEntradaAdministrador.class.getResource("/imagem/216437-64.png")));
		label_1.setBounds(10, 24, 113, 63);
		contentPane.add(label_1);
		
		JLabel label = new JLabel();
		label.setForeground(Color.BLACK);
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon(FormularioEntradaAdministrador.class.getResource("/imagens/login.jpg")));
		label.setBounds(-98, -17, 684, 703);
		contentPane.add(label);
		
		
		
		
	}
}