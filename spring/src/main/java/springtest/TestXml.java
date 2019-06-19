package springtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
//@ContextConfiguration(classes = PersonConfig.class)
public class TestXml {

    @Autowired
    private  IPerson iPerson;

    @Test
    public void testScope(){

        iPerson.sing();
    }
}
