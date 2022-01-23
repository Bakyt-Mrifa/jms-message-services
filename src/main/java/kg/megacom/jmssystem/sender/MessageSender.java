package kg.megacom.jmssystem.sender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
public class MessageSender {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(MessageSender.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String message) {
        LOGGER.info("Отправка сообщения='{}'", message);
        jmsTemplate.convertAndSend("payers.q", message);
    }
}
