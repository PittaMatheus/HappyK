package br.com.happykids.command;

import br.com.happykids.aplicacao.Resultado;
import br.com.happykids.dominios.EntidadeDominio;

public class CommandInserir extends AbstractCommand {
        @Override
	public Resultado executar(EntidadeDominio entidade) {
		return fachada.inserir(entidade);
	}
}
