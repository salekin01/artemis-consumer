package artemis_consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ArtemisConsumer {
    @JmsListener(destination = "${jms.queue.destination}")
    public void receive(String msg){
        System.out.println("Got Message: " + msg);
        /*
        try{
            System.out.println("Got Message: " + msg);
            throw new JMSException("I am Exception Alpha!");
        }
        catch(JMSException e){
            System.out.println("Message: " + e.getMessage());
        }
        */
    }
}
