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

public class FormularioFazerAfazeres extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnVoltar;

	public FormularioFazerAfazeres() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o");
		lblSituao.setForeground(Color.WHITE);
		lblSituao.setBounds(10, 21, 79, 14);
		contentPane.add(lblSituao);
		
		textField = new JTextField();
		textField.setBounds(112, 18, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//Instanciar
		Acao a = new Acao();
		
		JTable table = new JTable(a.listarAfazeres());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(243, 14, 181, 95);
		contentPane.add(barra);
		
		JTable table_1 = new JTable(a.listarFazerAfazeres());
		
		//JScrollPane
		JScrollPane barra1 = new JScrollPane(table_1);
		barra1.setBounds(10, 120, 414, 90);
		contentPane.add(barra1);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				//Obter linha
				int linha = table.getSelectedRow();
				
				//Obter dados informados pela tabela
				String nomeFuncionario = table.getValueAt(linha, 0).toString();
				String cargo = table.getValueAt(linha, 1).toString();
				String afazer = table.getValueAt(linha, 2).toString();
				
				//Obter dados informados pelo usuário
				String situacao = textField.getText();
				
				Acao a = new Acao();
				
				a.cadastrarFazerAfazer(nomeFuncionario, cargo, afazer, situacao);
				
				//Atualizar tabela
				table_1.setModel(a.listarFazerAfazeres());
				
				//Limpar campos
				textField.setText("");
				
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
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Voltar
				dispose();
				
			}
		});
		btnVoltar.setBounds(148, 227, 157, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblClickNaTabela = new JLabel("Click na tabela ao lado para realizar \u00E0 a\u00E7\u00E3o");
		lblClickNaTabela.setForeground(Color.WHITE);
		lblClickNaTabela.setBounds(10, 66, 223, 36);
		contentPane.add(lblClickNaTabela);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioFazerAfazeres.class.getResource("/imagem/IMG_0458.jpg")));
		label.setBounds(0, -16, 434, 405);
		contentPane.add(label);
		
		
	}

}
