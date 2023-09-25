package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import modelo.Pessoa;

import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroPessoa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimeiroNome;
	private JLabel lblNewLabel_1;
	private JTextField txtSobrenome;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroPessoa frame = new TelaCadastroPessoa();
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
	public TelaCadastroPessoa() {
		setTitle("Cadastro de Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primeiro Nome:");
		lblNewLabel.setBounds(96, 13, 97, 14);
		contentPane.add(lblNewLabel);
		
		txtPrimeiroNome = new JTextField();
		txtPrimeiroNome.setBounds(192, 10, 86, 20);
		contentPane.add(txtPrimeiroNome);
		txtPrimeiroNome.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Sobrenome:");
		lblNewLabel_1.setBounds(110, 51, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(192, 48, 86, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JButton btnSave = new JButton("Cadastrar");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Pega o texto digitado pelo usuário
				String nome = txtPrimeiroNome.getText();
				String sobrenome = txtSobrenome.getText();
				
				if (nome.isEmpty() || sobrenome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
				} else {
					//Cria obj Pessoa
					Pessoa p = new Pessoa();
					//Seta valores para obj pessoa
					p.setPrimeiroNome(nome);
					p.setSobrenome(sobrenome);
					
					String msg = "Cadastro de sucesso!\n"+
					"Você cadastrou: "+ p.getPrimeiroNome() + " " + p.getSobrenome();
					JOptionPane.showMessageDialog(null, msg);
				}
			}
		});
		btnSave.setBounds(181, 102, 97, 18);
		contentPane.add(btnSave);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					txtPrimeiroNome.setText("");
					txtSobrenome.setText("");
			
				}
		});
		
		
		btnLimpar.setBounds(181, 76, 97, 18);
		contentPane.add(btnLimpar);
	}
}
