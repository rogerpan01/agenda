package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
public class MySQL {
    public Connection conecta(){
        String host = "jdbc:mysql://localhost/agenda";
        String usuario = "root";
        String senha = "";
        Connection conexao = null;
        
        try{
            DriverManager.registerDriver(new Driver());
            conexao = DriverManager.getConnection(host,usuario,senha);
        }catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco: "+e.getMessage());
        }
    return conexao;
    }
    
    
}
