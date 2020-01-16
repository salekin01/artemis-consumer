package artemis_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @RequestMapping(value = "/")
    public String receive(){
        return "Ready for listening the messages: ";
    }
}
