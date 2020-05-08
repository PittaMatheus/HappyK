package br.com.happykids.viewhelper;

import javax.servlet.http.HttpServletRequest;

import br.com.happykids.dominios.EntidadeDominio;

public interface IViewHelper {
	
	public EntidadeDominio getEntidade(HttpServletRequest request);
	
}
