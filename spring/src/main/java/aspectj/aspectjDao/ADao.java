package aspectj.aspectjDao;

import aspectj.User;
import aspectj.dao.imp.UserDaoImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//@Aspect
public class ADao {


//    @Before("execution(* aspectj.dao.imp.UserDaoImpl.add(..)) && args(user)")
    public void modUser(User user){
        user.setAge(5);
        user.setName("sdnf");
        System.out.println("name :"+user.getName()+" age :"+user.getAge());
    }

//    @AfterReturning("execution(* aspectj.dao.imp.UserDaoImpl.add(..))")
    public void  returnUser(){
        System.out.println("只是一个返回");
    }

//    @Around("execution(* aspectj.dao.imp.UserDaoImpl.find(..))")
    public void onlyId(ProceedingJoinPoint joinPoint){

        try {
            System.out.println("before");
            joinPoint.proceed();
            System.out.println("after");
        } catch (Throwable throwable) {
            System.err.println("error");
            throwable.printStackTrace();
        }
    }
}
