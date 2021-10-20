import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DemoTest {
    @Test
    public void realizaEnvioDeMensagemFacebook(){

        Network network = null;
        String userName = "marcio";
        String password = "senha";
        String message = "teste de mensagem Facebook";

        //FACEBOOK
        int choice = 1;

        if (choice == 1) {
            network = new Facebook(userName, password);
        }
        assertTrue(network.post(message));

    }@Test
    public void realizaEnvioDeMensagemTwitter(){

        Network network = null;
        String userName = "marcio";
        String password = "senha";
        String message = "teste de mensagem Twitter";

        //Twitter
        int choice = 2;

        if (choice == 2) {
            network = new Twitter(userName, password);
        }
        assertTrue(network.post(message));

    }
}
