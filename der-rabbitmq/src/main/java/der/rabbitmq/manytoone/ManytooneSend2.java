package der.rabbitmq.manytoone;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @FileName:ManytooneSend2
* @Description:
* @Author: Derrick Ye
*/
@Component
public class ManytooneSend2 {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(int x){
        String str="this is many-to-one way!!!"+x;
        System.out.println("send2:"+str);
        this.amqpTemplate.convertAndSend("manytoone",str);
    }
}
