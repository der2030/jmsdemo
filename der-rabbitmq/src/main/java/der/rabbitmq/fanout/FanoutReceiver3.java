package der.rabbitmq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @FileName:FanoutReceiver3
* @Description: to receive message using fanout
* @Author: Derrick Ye
*/
@Component
@RabbitListener(queues = "fanout.three")
public class FanoutReceiver3 {

    @RabbitHandler
    public void receive(String str){
        System.out.println("to receive message three-"+str);
    }
}
