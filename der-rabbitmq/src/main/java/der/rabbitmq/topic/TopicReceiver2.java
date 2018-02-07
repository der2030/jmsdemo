package der.rabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @FileName:TopicReceiver2
* @Description:
* @Author: Derrick Ye
*/
@Component
@RabbitListener(queues = "topic.msgs")
public class TopicReceiver2 {

    public void receive(String str){
        System.out.println("Topic receive2"+str);
    }
}
