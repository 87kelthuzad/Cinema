import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        ConnectToDataBase connect = new ConnectToDataBase();
        connect.connectDB();
    }
}
