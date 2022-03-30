package kg.itschool.crm.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CourseDaoImpl {
    public CourseDaoImpl(){

        final String URL = "jdbc:postgresql://localhost:5432/crm";
        final String USERNAME = "postgres";
        final String PASSWORD = "0000";

        try {
            System.out.println("connecting to database...");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection succeeded.");

            String ddlQuery = "CREATE TABLE IF NOT EXISTS   tb_mentor(" +
                    "id BIGINT      PRIMARY KEY, " +
                    "course_name    VARCHAR (50 NOT NULL)" +
                    "address        VARCHAR (100) NOT " +
                    "price          VARCHAR(50) NOT NULL , " +
                    "diration       INTEGER NOT NULL, " +
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

            String dmlQuery = "INSERT INTO tb_mentor(id, course_name, address, price, duration, date_created)" +
                    "VALUES(1, 'Java', 'Megacom','15000', '3', 'baha50501@mail.com', '1970-04-30', MONEY(30000)) ";

            Statement statement = connection.createStatement();
            statement.execute(dmlQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
