package der.rabbitmq.topic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @FileName:TopicTest
* @Description:
* @Author: Derrick Ye
*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TopicTest {
    @Autowired
    private TopicSender topicSender;

    @Test
    public void testTopic1()throws Exception{
        topicSender.send1();
    }
    @Test
    public void testTopic2()throws Exception{
        topicSender.send2();
    }

    @Test
    public void testTopic3()throws Exception{
        topicSender.send3();
    }
}
