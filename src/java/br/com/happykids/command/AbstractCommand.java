package br.com.happykids.command;

import br.com.happykids.core.Fachada;
import br.com.happykids.core.IFachada;

public abstract class AbstractCommand implements ICommand{
	
	protected IFachada fachada = new Fachada();
	
}
