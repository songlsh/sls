package aspectj.service.imp;

import aspectj.User;
import aspectj.service.Service;

public class ServiceImp implements Service {
    @Override
    public void increase(User user) {
        System.out.println(user);
    }
}
