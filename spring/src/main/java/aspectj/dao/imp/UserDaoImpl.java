package aspectj.dao.imp;

import aspectj.User;
import aspectj.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void add(User user) {
        System.out.println(user+"吃饭");
    }

    @Override
    public void find(String id) {
        System.out.println(id);
    }
}
