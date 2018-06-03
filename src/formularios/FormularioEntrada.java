package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class FormularioEntrada extends JFrame {

	private JPanel contentPane;

	public FormularioEntrada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JButton btnComprarBebidas = new JButton("Entrar para Beber");
		btnComprarBebidas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnComprarBebidas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Fechar formulário
				dispose();
				
				//Chamar formulario
				FormularioCliente fc = new FormularioCliente();
				fc.repaint();
				
			}
		});
		btnComprarBebidas.setBackground(Color.WHITE);
		btnComprarBebidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComprarBebidas.setBounds(61, 91, 186, 48);
		contentPane.add(btnComprarBebidas);
		
		JButton btnNewButton = new JButton("Entrada Administrador");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioEntradaAdministrador fec = new FormularioEntradaAdministrador();
				fec.repaint();
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(61, 150, 186, 48);
		contentPane.add(btnNewButton);
		
		JButton btnEntradaAtendente = new JButton("Entrada Atendente");
		btnEntradaAtendente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnEntradaAtendente.setBackground(Color.WHITE);
		btnEntradaAtendente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioEntradaAtendente fea = new FormularioEntradaAtendente();
				fea.repaint();
				
			}
		});
		btnEntradaAtendente.setBounds(61, 209, 186, 48);
		contentPane.add(btnEntradaAtendente);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioEntrada.class.getResource("/imagem/c5b3bc59768c6b922bfa3c1ee9b6de4b.jpg")));
		label.setBounds(0, 0, 298, 332);
		contentPane.add(label);
		
		
	}
}