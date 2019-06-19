package aspectj;

import aspectj.dao.UserDao;
import aspectj.service.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aspectj.xml")
public class AspectjTest {

    @Autowired
    private UserDao dao;
    @Autowired
    private User user;
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    Service service;
    @Test
    public void userTest(){

        dao.add(user);
        dao.find("5");
//        Service service = (Service)applicationContext.getBean("userDao");
        service.increase(user);

    }
}
