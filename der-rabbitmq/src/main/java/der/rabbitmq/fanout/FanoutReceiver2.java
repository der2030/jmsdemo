package der.rabbitmq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @FileName:FanoutReceiver2
* @Description:  to receive message using fanout
* @Author: Derrick Ye
*/
@Component
@RabbitListener(queues = "fanout.two")
public class FanoutReceiver2 {

    @RabbitHandler
    public void receive(String str){
        System.out.println("to receive message two-"+str);
    }
}
