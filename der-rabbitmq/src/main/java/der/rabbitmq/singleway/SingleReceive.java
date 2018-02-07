package der.rabbitmq.singleway;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @FileName:SingleReceive
* @Description:
* @Author: Derrick Ye
*/
@Component
@RabbitListener(queues = "single")
public class SingleReceive {

    @RabbitHandler
    public void receive(String str){
        System.out.println("Received message:" +str);
    }
}
