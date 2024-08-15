import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sql = "select *from students";
        String url = "jdbc:mysql://127.0.0.1:3306/myDB";
        String user = "root";
        String password = "sir2kalFOUR!";
        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            String firstName = rs.getString("first_name");
            System.out.println(firstName);
        }


    }
}