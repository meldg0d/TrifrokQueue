package via.pro.rabbitmqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.sql.DriverManager.println;

@SpringBootApplication
public class RabbitMqDemoApplication {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        SpringApplication.run(RabbitMqDemoApplication.class, args);
    }

}
