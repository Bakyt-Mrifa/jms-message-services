package kg.megacom.jmssystem.JmsTest;

import kg.megacom.jmssystem.receiver.MessageReceiver;
import kg.megacom.jmssystem.sender.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJmsApplicationTest {

    @Autowired
    private MessageSender sender;

    @Autowired
    private MessageReceiver receiver;

    @Test
    public void testReceive() throws Exception {
        sender.send("Проверка - Spring JMS ActiveMQ!");


    }
}