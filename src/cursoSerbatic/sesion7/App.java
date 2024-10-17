package cursoSerbatic.sesion7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "1612";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM ALUMNO");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+ " " + resultSet.getString(2)+resultSet.getInt(3));
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
