package der.rabbitmq.manytoone;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @FileName:ManytooneReceice1
* @Description:
* @Author: Derrick Ye
*/
@Component
@RabbitListener(queues = "manytoone")
public class ManytooneReceice1 {

    @RabbitHandler
    public void receive(String str){
        System.out.println("received message1:"+str);
    }
}
