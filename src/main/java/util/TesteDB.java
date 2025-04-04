package util;

import modelo.dao.VeiculoDAO;
import modelo.entities.Veiculo;

public class TesteDB {
	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		v.setMarca("Honda");
		v.setModelo("Honda civic 16v");
		v.setAno(1994);
		v.setPreco(19_000);
		VeiculoDAO dao = new VeiculoDAO();
		dao.salvar(v);
		System.out.println("Veículo cadastrado!");
	}
}