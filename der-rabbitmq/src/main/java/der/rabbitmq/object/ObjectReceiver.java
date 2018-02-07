package der.rabbitmq.object;

import der.rabbitmq.model.Client;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @FileName:ObjectReceiver
* @Description:
* @Author: Derrick Ye
*/
@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {

    @RabbitHandler
    public void receive(Client client){
        System.out.println("To receive object:" +client);
    }
}
