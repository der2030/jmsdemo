package der.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @FileName:TopicRabbitmqConfig
* @Description:  Topic exchange delivers message to one or many queues based on matching between a message roting key
* @Author: Derrick Ye
*/
@Configuration
public class TopicRabbitmqConfig {

    final static String msg = "topic.msg";
    final static String msgs = "topic.msgs";

    @Bean
    public Queue queueMessage() {
        return new Queue(TopicRabbitmqConfig.msg);
    }

    @Bean
    public Queue queueMessages() {
        return new Queue(TopicRabbitmqConfig.msgs);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.msg");
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }

}
