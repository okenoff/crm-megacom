package kg.itschool.crm;

import kg.itschool.crm.dao.daoutil.DaoFactory;
import kg.itschool.crm.dao.ManagerDao;

public class Main {

    public static void main(String[] args) {

        ManagerDao managerDao = DaoFactory.getManagerDaoSql();
//        ManagerDao managerDao = new ManagerDao();
//        managerDao.save();
//        StudentDao studentDao = new StudentDao();
//        studentDao.save();
//
//        MentorDao mentorDao = new MentorDao();
//        mentorDao.save();

    }
}
