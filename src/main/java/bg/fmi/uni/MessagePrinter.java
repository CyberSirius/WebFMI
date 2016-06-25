package bg.fmi.uni;

import org.springframework.stereotype.Component;

/**
 * Created by CyberSirius on 25-Jun-16.
 */
@Component
public class MessagePrinter  {
    final private MessageService service;

    public MessagePrinter(MessageService service) {
        this.service = service;
    }
    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
