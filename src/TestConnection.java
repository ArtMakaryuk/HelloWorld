import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/testdb";
        String userName = "user";
        String password = "1234";

        Class.forName("org.postgresql.Driver");

        try(Connection connection =
                    DriverManager.getConnection(url, userName, password)){
            System.out.println("Connection Successful");
        };
    }
}
