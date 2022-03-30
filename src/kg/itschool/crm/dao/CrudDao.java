package kg.itschool.crm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface CrudDao {
    void save ();
    void findById(Long id);

    default Connection getConnection() throws SQLException {
        final String URL = "jdbc:postgresql://localhost:5432/crm";
        final String USERNAME = "postgres";
        final String PASSWORD = "0000";
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}
