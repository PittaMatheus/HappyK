package br.com.happykids.core;

import java.util.HashMap;
import java.util.Map;

import br.com.happykids.aplicacao.Resultado;
import br.com.happykids.dao.DAOCliente;
import br.com.happykids.dominios.Cliente;
import br.com.happykids.dominios.EntidadeDominio;

public class Fachada implements IFachada {
	private Resultado resultado = new Resultado();
	private Map<String, IDAO> dao;
	
	public Fachada() {
		dao = new HashMap<String, IDAO>();
		dao.put(Cliente.class.getName(), new DAOCliente());
	}
	
	public Resultado inserir(EntidadeDominio entidade) {
		
		try {
//                    if(resultado.isStatus() == true) {
                            resultado = dao.get(entidade.getClass().getName()).inserir(entidade);
//                    }
		}catch(Exception e) {
			e.printStackTrace();
			resultado.setMensagem("Não foi possível cadastrar o cliente.");
			resultado.setStatus(false);
		}
		
		return resultado;
	}
}
