package der.rabbitmq.singleway;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
* @FileName:SingleSend
* @Description:
* @Author: Derrick Ye
*/
@Component
public class SingleSend {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String str="hi,derrick!"+ LocalDate.now();
        System.out.println(str);
        this.amqpTemplate.convertAndSend("single",str);
    }

}
