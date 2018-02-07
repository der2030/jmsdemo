package der.rabbitmq.object;

import der.rabbitmq.model.Client;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @FileName:ObjectSender
* @Description:
* @Author: Derrick Ye
*/
@Component
public class ObjectSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(Client client){
        System.out.println("To send object:"+client.toString());
        this.amqpTemplate.convertAndSend("object",client);
    }
}
