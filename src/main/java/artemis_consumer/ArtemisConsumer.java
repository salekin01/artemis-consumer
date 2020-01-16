package artemis_consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@Component
public class ArtemisConsumer {
    @JmsListener(destination = "${jms.queue.destination}")
    public void receive(String msg) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter("note.txt")) {
            out.println(msg);
        }
    }
}
