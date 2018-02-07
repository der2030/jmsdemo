package der.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

/**
* @FileName:DerActivemqApplication
* @Description: 
* @Author: Derrick Ye
*/
@SpringBootApplication
@EnableJms
public class DerActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(DerActivemqApplication.class, args);
	}
}
