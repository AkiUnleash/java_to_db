import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleSQLSample {

    public static void main(String[] args) throws SQLException {

        String hostname = "";   // Endpoint
        String dbname = "orcl";
        String username = "";
        String password = "";
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@" + hostname
                    + ":1521/" + dbname, username, password);
            System.out.println("Success!!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}