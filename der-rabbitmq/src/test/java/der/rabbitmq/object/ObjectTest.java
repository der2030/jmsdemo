package der.rabbitmq.object;

import der.rabbitmq.model.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;

/**
* @FileName:ObjectTest
* @Description:
* @Author: Derrick Ye
*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ObjectTest {

    @Autowired
    private ObjectSender objectSender;

    @Test
    public void testObject(){
        Client client=new Client();
        client.setCname("Derrick Ye");
        client.setCaddress("Auckland");
        client.setCemail("derrickye@outlook.com");
        client.setRegisterdate(LocalDate.now());
        objectSender.send(client);
    }
}
