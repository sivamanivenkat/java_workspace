package ananymousinnerclass;

public class Main {
    public static void main(String[] args) {
        Connection con = DriverManager.getConnection();
        con.createStatement();
    }
}
