package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class FormularioListarAfazeres extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JLabel lblCargo;
	private JTextField textField_1;
	private JButton btnVoltar;
	private JLabel label;
	private JLabel lblClickNoFuncionrio;

	public FormularioListarAfazeres() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblDigitarAfazer = new JLabel("Digitar Afazer");
		lblDigitarAfazer.setForeground(Color.WHITE);
		lblDigitarAfazer.setBounds(10, 79, 86, 14);
		contentPane.add(lblDigitarAfazer);
		
		textField = new JTextField();
		textField.setBounds(110, 76, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblCargo = new JLabel("Cargo");
		lblCargo.setForeground(Color.WHITE);
		lblCargo.setBounds(230, 79, 46, 14);
		contentPane.add(lblCargo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(330, 76, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		
		//Instanciar
		Acao a = new Acao();
		
		table = new JTable(a.listarAdministrador());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(10, 104, 186, 113);
		contentPane.add(barra);
		
		table_1 = new JTable(a.listarAtendente());
		
		//JScrollPane
		JScrollPane barra1 = new JScrollPane(table_1);
		barra1.setBounds(230, 104, 186, 113);
		contentPane.add(barra1);
		
		table_2 = new JTable(a.listarAfazeres());
		
		//JScrollPane
		JScrollPane barra2 = new JScrollPane(table_2);
		barra2.setBounds(10, 228, 406, 136);
		contentPane.add(barra2);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
			}
		});
		btnVoltar.setBounds(140, 375, 142, 23);
		contentPane.add(btnVoltar);
		
		lblClickNoFuncionrio = new JLabel("Click no funcion\u00E1rio para realizar \u00E0 a\u00E7\u00E3o");
		lblClickNoFuncionrio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblClickNoFuncionrio.setForeground(Color.WHITE);
		lblClickNoFuncionrio.setBounds(58, 22, 315, 23);
		contentPane.add(lblClickNoFuncionrio);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioListarAfazeres.class.getResource("/imagem/happy-hour-bebidas-braganca-paulista-6.jpg")));
		label.setBounds(0, 0, 436, 409);
		contentPane.add(label);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {

				//Obter dados informados pelo usuário
				String afazer = textField.getText();
				String cargo = textField_1.getText();
				
				//Obter linha
				int linha = table.getSelectedRow();
				
				//Obter informações da tabela
				String nomeFuncionario = table.getValueAt(linha, 0).toString();
				
				a.cadastrarAfazer(nomeFuncionario, cargo, afazer);
				
				//Atualizar tabela
				table_2.setModel(a.listarAfazeres());
				
				//Limpar campos
				textField.setText("");
				textField_1.setText("");
				
				//Cursor no campo nome
				textField.requestFocus();
				
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
		
		table_1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {

				//Obter dados informados pelo usuário
				String afazer = textField.getText();
				String cargo = textField_1.getText();
				
				//Obter linha
				int linha = table_1.getSelectedRow();
				
				//Obter informações da tabela
				String nomeFuncionario = table_1.getValueAt(linha, 0).toString();
				
				a.cadastrarAfazer(nomeFuncionario, cargo, afazer);
				
				//Atualizar tabela
				table_2.setModel(a.listarAfazeres());
				
				//Limpar campos
				textField.setText("");
				textField_1.setText("");
				
				//Cursor no campo nome
				textField.requestFocus();
				
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
