package der.rabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @FileName:TopicReceiver1
* @Description:
* @Author: Derrick Ye
*/
@Component
@RabbitListener(queues = "topic.msg")
public class TopicReceiver1 {

    @RabbitHandler
    public void receive(String str){
        System.out.println("Topic receiver1:"+str);
    }

}
