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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FormularioDemitirAtendente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public FormularioDemitirAtendente(String nomeAtendente, int linha) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblAtendente = new JLabel("Atendente");
		lblAtendente.setBounds(10, 23, 89, 14);
		contentPane.add(lblAtendente);
		
		textField = new JTextField(nomeAtendente);
		textField.setBounds(130, 20, 115, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnDemitir = new JButton("Demitir");
		btnDemitir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Método para executar a exclusão
				Acao a = new Acao();
				a.excluirAtendente(linha);
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioIrDemitir fid = new FormularioIrDemitir();
				
			}
		});
		btnDemitir.setBounds(0, 78, 120, 23);
		contentPane.add(btnDemitir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioIrDemitir fid = new FormularioIrDemitir();
				
			}
		});
		btnVoltar.setBounds(125, 78, 120, 23);
		contentPane.add(btnVoltar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioDemitirAtendente.class.getResource("/imagem/images.jpg")));
		label.setBounds(0, 0, 258, 133);
		contentPane.add(label);
	}
}
