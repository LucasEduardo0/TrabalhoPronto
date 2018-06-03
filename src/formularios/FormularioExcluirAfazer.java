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
import java.awt.Color;

public class FormularioExcluirAfazer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnVoltar;
	private JLabel label;

	public FormularioExcluirAfazer(String nomeFuncionario, String cargo, String afazer, String situacao, int linha) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 263, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		
		JLabel lblNomeFuncionario = new JLabel("Nome Funcionario");
		lblNomeFuncionario.setForeground(Color.WHITE);
		lblNomeFuncionario.setBounds(22, 65, 115, 14);
		contentPane.add(lblNomeFuncionario);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setForeground(Color.WHITE);
		lblCargo.setBounds(22, 90, 75, 14);
		contentPane.add(lblCargo);
		
		JLabel lblAfazer = new JLabel("Afazer");
		lblAfazer.setForeground(Color.WHITE);
		lblAfazer.setBounds(22, 115, 46, 14);
		contentPane.add(lblAfazer);
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o");
		lblSituao.setForeground(Color.WHITE);
		lblSituao.setBounds(22, 140, 46, 14);
		contentPane.add(lblSituao);
		
		textField = new JTextField(nomeFuncionario);
		textField.setBounds(133, 62, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(cargo);
		textField_1.setBounds(133, 87, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(afazer);
		textField_2.setBounds(133, 112, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(situacao);
		textField_3.setBounds(133, 137, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Método para executar a exclusão
				Acao a = new Acao();
				a.excluirAfazer(linha);
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioIrExcluirAfazer fiea = new FormularioIrExcluirAfazer();
				
			}
		});
		btnExcluir.setBounds(22, 179, 197, 23);
		contentPane.add(btnExcluir);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioIrExcluirAfazer fiea = new FormularioIrExcluirAfazer();
				
			}
		});
		btnVoltar.setBounds(22, 213, 197, 23);
		contentPane.add(btnVoltar);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioExcluirAfazer.class.getResource("/imagem/bebida-alcoolica-miami-orlando.jpg")));
		label.setBounds(0, 0, 247, 261);
		contentPane.add(label);
	}
}
