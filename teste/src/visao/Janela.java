package visao;

import javax.swing.JOptionPane;

public class Janela {

	public static void main(String[] args) {
		
		//String digitado = JOptionPane.showInputDialog("Qual seu nome?");
		//if (!digitado.isEmpty()) {
			//JOptionPane.showMessageDialog(null, digitado);
		//}
		
		//JOptionPane.showInternalConfirmDialog(null, "Quer café?");

		int opcao = JOptionPane.showConfirmDialog(null, "mensagem");
		if (opcao == 0) {
			JOptionPane.showMessageDialog(null, "nao");
		}else if (opcao==1){
			JOptionPane.showMessageDialog(null, "sim");
		}
	}

}
