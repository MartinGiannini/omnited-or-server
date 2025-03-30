package coop.bancocredicoop.omnited.service.rabbit;

import com.fasterxml.jackson.databind.ObjectMapper;
import coop.bancocredicoop.omnited.config.MessageOut.MensajeJSON;
import java.util.HashMap;
import java.util.Map;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitListenerService {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Map<String, MessageHandler> handlers = new HashMap<>();
    

    public RabbitListenerService() {
        
    }

    @RabbitListener(queues = {
        "#{@environment.getProperty('spring.rabbitmq.colaWS')}",
        "#{@environment.getProperty('spring.rabbitmq.colaCR')}"
    })

    public void receiveMessage(MensajeJSON message) {

    }
}