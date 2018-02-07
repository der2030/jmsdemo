package der.rabbitmq.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
* @FileName:RabbitmqConfig
* @Description: Direct Exchange delivers message to queue based on the message routing key
* @Author: Derrick Ye
*/
@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue singleQueue(){
        return new Queue("single") ;
    }
    @Bean
    public Queue manytooneQueue(){
        return new Queue("manytoone");
    }

    @Bean
    public Queue objectQueue(){
        return new Queue("object");
    }
}
