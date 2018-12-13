/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Roger
 */
@WebServlet(name ="Inicio",urlPatterns = "/IS")
public class InicioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<HTML>");
        out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<form method='GET' action='/Agenda/SalvarContatos'>");
        out.println("Nome: ");
        out.println("<input type='text' name='nome'/>");
        out.println("Endereco: ");
        out.println("<input type='text' name='endereco'/>");
        out.println("Data Nascimento: ");
        out.println("<input type='text' name='data_nascimento'>");
        out.println("Data Nascimento: ");
        out.println("<input type='submit'>");
        out.println("");
        out.println("</BODY></HTML>");
            
    }
}
