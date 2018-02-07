package der.rabbitmq.manytoone;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @FileName:ManytooneReceive2
* @Description:
* @Author: Derrick Ye
*/
@Component
@RabbitListener(queues = "manytoone")
public class ManytooneReceive2 {

    @RabbitHandler
    public void receive(String str){
        System.out.println("received message2:"+str);
    }
}
