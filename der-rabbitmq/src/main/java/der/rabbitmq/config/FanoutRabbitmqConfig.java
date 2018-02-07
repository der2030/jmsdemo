package der.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @FileName:FanoutRabbitmqConfig
* @Description: Fanout exchange delivers message to all of queues thar are bound it
* @Author: Derrick Ye
*/
@Configuration
public class FanoutRabbitmqConfig {

    @Bean
   public Queue messageOne() {
       return new Queue("fanout.one");
   }
   @Bean
   public Queue messageTwo(){
        return new Queue("fanout.two");
   }
   @Bean
   public Queue messageThree(){
       return new Queue("fanout.three");
   }

   @Bean
   public  FanoutExchange fanoutExchange(){
       return new FanoutExchange("fanoutEx");

   }

   @Bean
   public Binding bindingMessageOne(Queue messageOne,FanoutExchange fanoutExchange){
       return BindingBuilder.bind(messageOne).to(fanoutExchange);
   }
   @Bean
   public Binding bindingMessageTwo(Queue messageTwo,FanoutExchange fanoutExchange){
       return BindingBuilder.bind(messageTwo).to(fanoutExchange);
   }

   @Bean
    public Binding bindingMessageThree(Queue messageThree,FanoutExchange fanoutExchange){
       return BindingBuilder.bind(messageThree).to(fanoutExchange);
   }
}
