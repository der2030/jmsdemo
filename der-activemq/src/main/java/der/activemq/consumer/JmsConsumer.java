package der.activemq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
* @FileName:JmsConsumer
* @Description:
* @Author: Derrick Ye
*/
@Component
public class JmsConsumer {

    private final static Logger logger = LoggerFactory.getLogger(JmsConsumer.class);

    @JmsListener(destination = "derr.topic")
    public void receiveTopic(String msg){
        logger.info("received topic message:{}",msg);
    }

    @JmsListener(destination = "derr.queue")
    public void receiveQueue(String msg) {
        logger.info("received queue message：{}",msg);
    }


}
