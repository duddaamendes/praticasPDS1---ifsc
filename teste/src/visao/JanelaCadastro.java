package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionaria;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton ButtonSalvar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastro frame = new JanelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtNome = new JLabel("Nome:");
		txtNome.setFont(new Font("Source Code Pro", Font.BOLD | Font.ITALIC, 14));
		txtNome.setBounds(84, 12, 41, 14);
		contentPane.add(txtNome);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(132, 10, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel textCPF = new JLabel("CPF:");
		textCPF.setFont(new Font("Source Code Pro", Font.BOLD | Font.ITALIC, 14));
		textCPF.setBounds(84, 49, 41, 14);
		contentPane.add(textCPF);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setBounds(132, 47, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		ButtonSalvar = new JButton("Salvar");
		ButtonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome= txtNome.getText();
				String cpf = textCPF.getText();
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome foi preenchido");
				}
				if (cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum CPF foi preenchido");
				}
				Funcionaria func = new Funcionaria();
				func.setNome(nome);
				func.setCpf(Long.valueOf(cpf));
				
				FuncionarioDAO bdPessoa = FuncionarioDAO.getInstance();
				bdPessoa.inserir(func);
						
			}
		});
		ButtonSalvar.setBounds(129, 85, 89, 23);
		contentPane.add(ButtonSalvar);
		


			
	}
}
