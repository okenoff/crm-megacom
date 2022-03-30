package kg.itschool.crm.dao.impl;

import kg.itschool.crm.dao.CourseFormatDao;
import sun.rmi.runtime.Log;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CourseFarmatDaoImpl implements CourseFormatDao {

    public CourseFarmatDaoImpl(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Log.info(this.getClass().getSimpleName(),Connection.class.getSimpleName(), "Establishing connection");

        }
    }
}
