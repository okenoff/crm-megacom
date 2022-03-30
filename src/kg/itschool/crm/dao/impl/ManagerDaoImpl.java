package kg.itschool.crm.dao.impl;

import kg.itschool.crm.dao.ManagerDao;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static org.postgresql.util.JdbcBlackHole.close;

public class ManagerDaoImpl implements ManagerDao {

    public ManagerDaoImpl() {

       Connection connection = null;
       Statement statement = null;

        try {
            //api:driver://host.post/database_name            System.out.println("connecting to database...");
            System.out.println("Connecting to database...");
            Connection connection = getConnection();
            System.out.println("Connection succeeded.");

            String ddlQuery = "CREATE TABLE IF NOT EXISTS   tb_managers(" +
                    "id BIGINT      PRIMARY KEY, " +
                    "first_name     VARCHAR(50) NOT NULL , " +
                    "last_name      VARCHAR(50) NOT NULL, " +
                    "email          VARCHAR (100) NOT NULL UNIQUE, " +
                    "phone_number   CHAR(13) NOT NULL, " +
                    "salary MONEY   NOT NULL CHECK(salary > MONEY(0)), " +
                    "dob            DATE NOT NULL CHECK(dob < NOW()), " +
                    "date_created   TIMESTAMP NOT NULL DEFAULT NOW()," +
                    "" +
                    "CONSTRAINT pk_manager_id PRIMARY KEY(id)," +
                    "CONSTRAINT chk_manager_salary CHECK (salary > MONEY(0))," +
                    "CONSTRAINT chk_manager_first_name CHECK (LENGTH (first_name)>2));";

            System.out.println("Creating statement...");
            statement= connection.createStatement();
            System.out.println("Executing creat table statement...");
            statement = execute(ddlQuery);

            System.out.println(ddlQuery);

        } catch (SQLException e) {
            System.out.println("Some error occurred");
            e.printStackTrace();
        }final{
            close(statement);
            close(connection);
        }
    }
        public void save () {

            Connection connection = null;
            Statement statement = null;
            try {
                System.out.println("connecting to database...");
                Connection connection = getConnection();
                System.out.println("Connection succeeded.");

                String dmlQuery = "INSERT INTO tb_managers(id, last_name, first_name, phone_number,email,dob,salary)" +
                        "VALUES(3, 'Doe', 'John', '+999999999', 'john_doe1@mail.com', '1970-04-30', MONEY(30000)) ";

                Statement statement = connection.createStatement();
                statement.execute(dmlQuery);

            } catch (SQLException e) {
                e.printStackTrace();
            }final{
                close(statement);
                close(connection);

            }
            @Override
            public void findById(Long id) {

            }


            private void close(AutoCloseable closeable){
                try{
                    System.out.println(closeable.getClass().getSimleName() + "closing...");
                    closeable.close();
                    System.out.println(closeable.GetClass().getSimleName() + "closed");
                }catch (Exception e){
                    System.out.println("Could not clode" );
                }
            }
    }
}
