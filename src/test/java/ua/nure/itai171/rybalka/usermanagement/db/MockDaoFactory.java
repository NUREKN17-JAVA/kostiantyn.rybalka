package test.java.ua.nure.itai171.rybalka.usermanagement.db;

import main.java.ua.nure.itai171.rybalka.usermanagement.db.DaoFactory;
import main.java.ua.nure.itai171.rybalka.usermanagement.db.UserDao;
import com.mockobjects.dynamic.Mock;
public class MockDaoFactory extends DaoFactory {

    private Mock mockUserDao;

    public MockDaoFactory() {
        mockUserDao = new Mock(UserDao.class);
    }

    @Override
    public UserDao getUserDao() {
        return (UserDao) mockUserDao.proxy();
    }

    public Mock getMockUserDao() {
        return mockUserDao;
    }
}
