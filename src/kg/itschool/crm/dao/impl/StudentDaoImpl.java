package kg.itschool.crm.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDaoImpl {

    public StudentDaoImpl(){

        final String URL = "jdbc:postgresql://localhost:5432/crm";
        final String USERNAME = "postgres";
        final String PASSWORD = "0000";

        try {
            System.out.println("connecting to database...");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection succeeded.");

            String ddlQuery = "CREATE TABLE IF NOT EXISTS   tb_students(" +
                    "id BIGINT      PRIMARY KEY, " +
                    "first_name     VARCHAR(50) NOT NULL , " +
                    "last_name      VARCHAR(50) NOT NULL, " +
                    "email          VARCHAR (100) NOT NULL UNIQUE, " +
                    "phone_number   CHAR(13) NOT NULL, " +
                    "dob            DATE NOT NULL CHECK(dob < NOW()), " +
                    "date_created   TIMESTAMP NOT NULL DEFAULT NOW()" +
                    ")";

            Statement statement = connection.createStatement();
            statement.execute(ddlQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void save () {

        final String URL = "jdbc:postgresql://localhost:5432/crm";
        final String USERNAME = "postgres";
        final String PASSWORD = "0000";
        try {
            System.out.println("connecting to database...");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection succeeded.");

            String dmlQuery = "INSERT INTO tb_students(id, last_name, first_name, phone_number,email,dob)" +
                    "VALUES(1, 'Okenoff', 'Izat', '+999999999', 'izat_okenoff@mail.com', '1992-07-17') ";

            Statement statement = connection.createStatement();
            statement.execute(dmlQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}