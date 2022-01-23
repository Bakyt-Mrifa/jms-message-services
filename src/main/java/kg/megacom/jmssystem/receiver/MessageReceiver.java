package kg.megacom.jmssystem.receiver;

import java.util.concurrent.CountDownLatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;

public class MessageReceiver {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(MessageReceiver.class);
    private CountDownLatch latch = new CountDownLatch(5);

    public CountDownLatch getLatch() {
        return latch;
    }

    @JmsListener(destination = "payers.q")
    public void receive(String message) {
        LOGGER.info("Получение сообщения='{}'", message);
        System.out.println("Получили сообщение - " + message);
//        latch.countDown();
    }

        @JmsListener(destination = "megaPay.q")
        public void receiveMegapay(String message) {
//            LOGGER.info("Получение сообщения='{}'", message);
            System.out.println("Получили сообщение - "+message);
    }
}
