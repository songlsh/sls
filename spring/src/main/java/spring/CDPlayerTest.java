package spring;

        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:rsources/spring.xml")
public class CDPlayerTest {

//    @Autowired
//    private CDPlayer cd;  //将cd注入到CDPlayerTest类中
//
//    @Test
//    public void testSpring(){
//        assertNotNull(cd);
//    }
    @Autowired
    ApplicationContext ac;
    @Test
    public void testxml(){

        //ApplicationContext ac = new ClassPathXmlApplicationContext("rsources/cspring.xml");

        CompicDis cd = (CompicDis) ac.getBean("music");
        cd.listen(" ：可以播放的音乐");
        // CDPlayer cd = (CDPlayer) ac.getBean("cdplayer");
        // cd.play();
    }



}
