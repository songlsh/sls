package springtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.CDPlayer;


/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class PersonTest {

//    @Autowired
//    private CDPlayer cd;  //将cd注入到CDPlayerTest类中
//
//    @Test
//    public void testSpring(){
//        assertNotNull(cd);
//    }

    @Test
    public void testxml(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//        PersonConfig cd = (PersonConfig) ac.getBean("person");
        for(int i =0;i < 10; i++) {
            CDPlayer cd = (CDPlayer) ac.getBean("cdplayer");
            System.out.println(cd);
        }
        // cd.play();
    }



}
