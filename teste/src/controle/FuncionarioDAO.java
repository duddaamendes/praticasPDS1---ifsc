package controle;

import java.util.ArrayList;

import modelo.Funcionaria;

public class FuncionarioDAO {
	
	private static ArrayList<Funcionaria> listaFuncionarias;
	
	public FuncionarioDAO () {
		listaFuncionarias = new ArrayList<>();
	}
	
	public boolean inserir(Funcionaria func) {
		
		return false;
	}
	
	public ArrayList<Funcionaria> listar(){
		return listaFuncionarias;
	}

}
