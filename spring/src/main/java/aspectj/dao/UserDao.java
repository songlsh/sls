package aspectj.dao;

import aspectj.User;

public interface UserDao {
   void add(User usr);
   void find(String id);
}
