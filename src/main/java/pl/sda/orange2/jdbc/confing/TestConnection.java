package pl.sda.orange2.jdbc.confing;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {

            var h2Connection = DriverManager.getConnection(H2Config.DB_URL,
                    H2Config.USER,
                    H2Config.PASSWORD);
            System.out.println("got connection: " + (h2Connection != null));
        } catch (SQLException exc) {
            System.out.println("got exception: " + exc);
        }
    }
}
