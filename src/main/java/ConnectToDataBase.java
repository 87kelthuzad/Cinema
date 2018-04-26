import java.sql.*;

public class ConnectToDataBase {
    private Connection connection;

    public void connectDB()  {

        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/storeEbooks?autoReconnect=true&useSSL=false", "root", "<podaj hgasło>");
            if (connection != null) {
                System.out.println("Connected to the database test1");
            }

            Statement statement =  connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from author");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("last_name") + " , " + resultSet.getString("first_name"));
            }

//            connection.commit();
            resultSet.close();
            statement.close();


            connection.close();
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}
