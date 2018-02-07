package der.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;


/**
* @FileName:JmsProducer
* @Description:
* @Author: Derrick Ye
*/
@Component
@EnableScheduling
public class JmsProducer {

    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    Queue queue;

    @Autowired
    Topic topic;

    @Scheduled(fixedDelay = 7000)
    public void send(){
        this.jmsMessagingTemplate.convertAndSend(this.topic,"Spring boot->ActiveMQ");
        this.jmsMessagingTemplate.convertAndSend(this.queue,"Hi,I am Derrick!Today, we talk about how to use ActiveMQ!");
    }
}
