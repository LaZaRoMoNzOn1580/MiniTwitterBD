import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {


    public Connection getConection(){

        Connection conection = null;

            try {

                conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");

                if(conection != null){
                    System.out.println("Conexion Exitosa");
                }

            } catch (SQLException e) {

                throw new RuntimeException(e);

            }

            return conection;
    }

}
