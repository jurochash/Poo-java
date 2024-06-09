package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBC{
       public static void main(String[] args) {
	       String url = "jdbc:postgresql://localhost:5432/postgres";
	       String usuario= "seu_usuario";
	       String senha="sua_senha";
	       try {
		       Connection conexao= DriverManager.getConnection(url,usuario,senha);
				if (conexao !=null) {
					System.out.println ("Conexão bem-sucedida!");
					conexao.close();
				} else {
					System.out.println("falha de conexão.");
				}
	        } catch (SQLException e) {
		        System.out.println("Erro na conexão com o banco de dados:" + e.get);
	        }
       }
}
	
	
