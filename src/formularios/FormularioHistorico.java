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
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FormularioHistorico extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public FormularioHistorico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		
		//Instanciar
		Acao a = new Acao();
		
		table = new JTable(a.listarProdutoPedido());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(10, 11, 608, 313);
		contentPane.add(barra);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulário
				dispose();
				
			}
		});
		btnVoltar.setBounds(272, 336, 113, 39);
		contentPane.add(btnVoltar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioHistorico.class.getResource("/imagem/bebidas-alcoolicas.jpg")));
		label.setBounds(0, 0, 765, 403);
		contentPane.add(label);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
}
