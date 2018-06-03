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

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FormularioIrDemitir extends JFrame {

	private JPanel contentPane;
	private JTable table_1;

	public FormularioIrDemitir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//Instanciar
		Acao a = new Acao();
		
		JTable table = new JTable(a.listarAdministrador());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(16, 81, 199, 176);
		contentPane.add(barra);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
			}
		});
		btnSair.setBounds(115, 268, 192, 36);
		contentPane.add(btnSair);
		
		table_1 = new JTable(a.listarAtendente());
		
		//JScrollPane
		JScrollPane barra1 = new JScrollPane(table_1);
		barra1.setBounds(225, 81, 199, 175);
		contentPane.add(barra1);
		
		JLabel lblClickNoFuncionrio = new JLabel("Click no funcion\u00E1rio para demito-lo");
		lblClickNoFuncionrio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblClickNoFuncionrio.setForeground(Color.WHITE);
		lblClickNoFuncionrio.setBounds(86, 11, 272, 36);
		contentPane.add(lblClickNoFuncionrio);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioIrDemitir.class.getResource("/imagem/garrafas-bebidas.jpg")));
		label.setBounds(0, 0, 434, 315);
		contentPane.add(label);
		
		
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {

				//Obter a linha 
				int linha = table.getSelectedRow();
				
				//Obter dados
				String nomeAdministrador = table.getValueAt(linha, 0).toString();
				
				//Chamar formulario
				FormularioDemitirAdm fda = new FormularioDemitirAdm(nomeAdministrador, linha);
				
				//Fechar formulario
				dispose();
			
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

				//Obter a linha 
				int linha = table.getSelectedRow();
				
				//Obter dados
				String nomeAtendente = table.getValueAt(linha, 0).toString();
				
				//Chamar foirmulário
				FormularioDemitirAtendente fda = new FormularioDemitirAtendente(nomeAtendente, linha);
				
				//Fechar formulário
				dispose();
				
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