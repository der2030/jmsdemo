package der.rabbitmq.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
* @FileName:FanoutSender
* @Description: to send message using fanout
* @Author: Derrick Ye
*/
@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String str="Today is"+ LocalDate.now();
        System.out.println("to send message-"+str);
        this.amqpTemplate.convertAndSend("fanoutEx","",str);
    }

}
