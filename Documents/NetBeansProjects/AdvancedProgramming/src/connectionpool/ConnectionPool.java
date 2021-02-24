package connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private final List<Connection> availableConnections;
    private final List<Connection> usedConnections;
    private final int MAX_CONNECTIONS = 5;

    final String URL;
    final String USERNAME;
    final String PASSWORD;

    public ConnectionPool(String URL, String USERNAME, String PASSWORD) throws SQLException {
        this.usedConnections = new ArrayList<>();
        this.availableConnections = new ArrayList<>();
        this.URL = URL;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;

        for (int count = 0; count < MAX_CONNECTIONS; count++) {
            availableConnections.add(this.createConnection());
        }

    }

    private Connection createConnection() throws SQLException {
        return DriverManager.getConnection(this.URL, this.USERNAME, this.PASSWORD);
    }

    public Connection getConnection() {
        if (availableConnections.isEmpty()) {
            System.out.println("All connections are Used !!");
            return null;
        } else {
            Connection con = availableConnections.remove(availableConnections.size() - 1);
            usedConnections.add(con);
            return con;
        }
    }

    public boolean releaseConnection(Connection conn) {
        if (null != conn) {
            usedConnections.remove(conn);
            availableConnections.add(conn);
            return true;
        }
        return false;
    }

    public int getFreeConnectionCount() {
        return availableConnections.size();
    }

    public static void main(String[] args) throws SQLException {

        ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost/anonymous", "said", "StarBoyG");

        Connection conn = pool.getConnection();
        pool.releaseConnection(conn);
             pool.releaseConnection(conn);
                  pool.releaseConnection(conn);
        System.out.println(pool.getFreeConnectionCount());

    }

}
