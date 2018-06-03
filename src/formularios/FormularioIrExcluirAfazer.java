package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class FormularioIrExcluirAfazer extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final JLabel label = new JLabel("");

	public FormularioIrExcluirAfazer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		
		//Instanciar
		Acao a = new Acao();
		
		table = new JTable(a.listarFazerAfazeres());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(10, 62, 414, 197);
		contentPane.add(barra);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {

				//Obter a linha 
				int linha = table.getSelectedRow();
				
				//Obter dados
				String nomeFuncionario = table.getValueAt(linha, 0).toString();
				String cargo = table.getValueAt(linha, 1).toString();
				String afazer = table.getValueAt(linha, 2).toString();
				String situacao = table.getValueAt(linha, 3).toString();
				
				//Chamar formulario
				FormularioExcluirAfazer fea = new FormularioExcluirAfazer(nomeFuncionario, cargo, afazer, situacao, linha);
				
				//Fechar formulario
				dispose();
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton btnDemitir = new JButton("Voltar");
		btnDemitir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDemitir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
			}
		});
		btnDemitir.setBounds(132, 270, 182, 23);
		
		JLabel lblClickNoAfazer = new JLabel("Click no afazer para exclui-lo");
		lblClickNoAfazer.setForeground(Color.WHITE);
		lblClickNoAfazer.setBackground(Color.WHITE);
		lblClickNoAfazer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblClickNoAfazer.setBounds(96, 25, 232, 14);
		contentPane.add(lblClickNoAfazer);
		
		contentPane.add(btnDemitir);
		label.setIcon(new ImageIcon(FormularioIrExcluirAfazer.class.getResource("/imagem/Bebidas-alcoh\u00F3licas-que-no-engordan-e1424340959620-700x499.jpg")));
		label.setBounds(0, 0, 434, 304);
		contentPane.add(label);
		
		
	}
}
