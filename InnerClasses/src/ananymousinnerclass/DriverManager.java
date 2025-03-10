package ananymousinnerclass;

public class DriverManager {

    static Connection getConnection() {
        Connection con = new Connection() {
            @Override
            public void createStatement() {
                System.out.println("Ananymous Inner Class Connection!!");
            }
        };
        return con;
    }
}
