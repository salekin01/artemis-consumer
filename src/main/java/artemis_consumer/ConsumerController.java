package artemis_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ArtemisConsumer artemisConsumer;

    @RequestMapping(value = "/receive")
    public String receive(String msg){
        artemisConsumer.receive(msg);
        return "Message received successfully";
    }
}
