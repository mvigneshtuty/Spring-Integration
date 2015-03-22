
package org.codehowpedia.sif.hellosi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;


public class HelloWorldDemoApp {

    public static void main(String arg[]) {
        String cfg = "hello-world-demo.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(cfg);
        MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);
        Message<String> msg = MessageBuilder.withPayload("Guest").build();
        channel.send(msg);
    }
}
