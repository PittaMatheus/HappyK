package br.com.happykids.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.happykids.aplicacao.Resultado;
import br.com.happykids.command.CommandInserir;
import br.com.happykids.command.ICommand;
import br.com.happykids.dominios.EntidadeDominio;
import br.com.happykids.viewhelper.IViewHelper;
import br.com.happykids.viewhelper.ViewCliente;
import javax.servlet.ServletConfig;

public class Servlet extends HttpServlet {

    private static Map<String, IViewHelper> viewHelper;
    private static Map<String, ICommand> commands;

    public Servlet() {
        super();
        viewHelper = new HashMap<String, IViewHelper>();
        commands = new HashMap<String, ICommand>();

        viewHelper.put("/HappyK/paginas/CadastroCliente", new ViewCliente());
        commands.put("INSERIR", new CommandInserir());
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String uri = request.getRequestURI();
        System.out.println("uri: " + uri);
        String operacao = request.getParameter("operacao");
        System.out.println("operacao: " + operacao);
        IViewHelper vh = viewHelper.get(uri);
        System.out.println("vh: " + vh);
        EntidadeDominio entidade = null;
        if (vh != null) {
            entidade = vh.getEntidade(request);
            System.out.println("entidade: "+ entidade);
        }
        ICommand command = commands.get(operacao);
        System.out.println("command:" + command);

        Resultado resultado = null;

        if (entidade != null && command != null) {
            resultado = command.executar(entidade);
            System.out.println("retorno da fachada: "+ resultado);
        }

    }

}
