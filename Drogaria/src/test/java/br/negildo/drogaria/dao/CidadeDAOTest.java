package br.negildo.drogaria.dao;

import org.junit.Test;

import br.negildo.drogaria.domain.Cidade;
import br.negildo.drogaria.domain.Estado;

public class CidadeDAOTest {
	@Test
	public void salvar(){
		Cidade cidade = new Cidade();
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(1l);
		
		cidade.setNome("Capistrano");
		cidade.setEstado(estado);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
}
	
}
