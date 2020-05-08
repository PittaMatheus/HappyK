package br.com.happykids.core;

import br.com.happykids.aplicacao.Resultado;
import br.com.happykids.dominios.EntidadeDominio;

public interface IFachada {
	public Resultado inserir(EntidadeDominio entidade);
}
