package der.rabbitmq.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
* @FileName:TopicSender
* @Description:
* @Author: Derrick Ye
*/
@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send1(){
        String str= LocalDate.now()+ ":to send all message";
        System.out.println("Sender 1:"+str);
        this.amqpTemplate.convertAndSend("topicExchange","topic.1",str);
    }

    public void send2(){
        String str= LocalDate.now()+ ":to send  message2";
        System.out.println("Sender 2:"+str);
        this.amqpTemplate.convertAndSend("topicExchange","topic.msg",str);
    }

    public void send3(){
        String str= LocalDate.now()+ ":to send  message3";
        System.out.println("Sender 3:"+str);
        this.amqpTemplate.convertAndSend("topicExchange","topic.msgs",str);
    }
}
