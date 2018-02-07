package der.rabbitmq.fanout;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @FileName:FanoutTest
* @Description:
* @Author: Derrick Ye
*/

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class FanoutTest {

    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void testSend()throws Exception{
        fanoutSender.send();
    }

}
