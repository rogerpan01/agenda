/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexao.MySQL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Roger
 */
@WebServlet(urlPatterns = {"/SalvarContato"})
public class SalvarContatos extends HttpServlet {
    
     private String nome = null;
     private String endereco = null;
     private String email = null;
     private String data = null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        
    }
     @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MySQL banco_dados = new MySQL();
        nome = request.getParameter("nome");
        endereco = request.getParameter("endereco");
        email = request.getParameter("email");
        data = request.getParameter("data_nascimento");
        try {
            Connection conexao = banco_dados.conecta();
            PreparedStatement instrucao = conexao.prepareStatement("insert into contato"
                    + "(nome, endereco,data_nascimento, email)"
                    + " values(?,?,?,?)");
            instrucao.setString(1, nome);
            instrucao.setString(2, endereco);
            instrucao.setString(3, data);
            instrucao.setString(4, email);
            instrucao.execute();
            
        }  catch (SQLException e) {
            e.printStackTrace();
        }
 }

}
