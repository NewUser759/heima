package day18;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
    }
}
