package br.com.happykids.command;

import br.com.happykids.aplicacao.Resultado;
import br.com.happykids.dominios.EntidadeDominio;

public interface ICommand {
	public Resultado executar(EntidadeDominio entidade);
}
