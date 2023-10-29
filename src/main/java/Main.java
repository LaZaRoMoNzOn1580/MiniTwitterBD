import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connector conexion = new Connector();

        try(Connection cnx = conexion.getConection()){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
