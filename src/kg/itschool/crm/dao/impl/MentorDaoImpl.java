package kg.itschool.crm.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MentorDaoImpl {

    public MentorDaoImpl() {

        final String URL = "jdbc:postgresql://localhost:5432/crm";
        final String USERNAME = "postgres";
        final String PASSWORD = "0000";

        try {
            System.out.println("connecting to database...");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection succeeded.");

            String ddlQuery = "CREATE TABLE IF NOT EXISTS   tb_mentor(" +
                    "id BIGINT      PRIMARY KEY, " +
                    "user_name      VARCHAR (50 NOT NULL)" +
                    "password       VARCHAR (100) NOT NULL" +
                    "first_name     VARCHAR(50) NOT NULL , " +
                    "last_name      VARCHAR(50) NOT NULL, " +
                    "email          VARCHAR (100) NOT NULL UNIQUE, " +
                    "phone_number   CHAR(13) NOT NULL, " +
                    "salary MONEY   NOT NULL CHECK(salary > MONEY(0)), " +
                    "dob            DATE NOT NULL CHECK(dob < NOW()), " +
                    "date_created   TIMESTAMP NOT NULL DEFAULT NOW()" +
                    ")";

            Statement statement = connection.createStatement();
            statement.execute(ddlQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void save() {

        final String URL = "jdbc:postgresql://localhost:5432/crm";
        final String USERNAME = "postgres";
        final String PASSWORD = "0000";
        try {
            System.out.println("connecting to database...");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection succeeded.");

            String dmlQuery = "INSERT INTO tb_mentor(id, user_name, password,last_name, first_name, phone_number,email,dob,salary)" +
                    "VALUES(1, 'Baha', '0000','Nurmanbetov', 'Bahtiyar', '+999999999', 'baha50501@mail.com', '1970-04-30', MONEY(30000)) ";

            Statement statement = connection.createStatement();
            statement.execute(dmlQuery);

            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        private void close(AutoCloseable closeable){
            try {
                System.out.println(closeable.get);
            }
        }

    }
}
