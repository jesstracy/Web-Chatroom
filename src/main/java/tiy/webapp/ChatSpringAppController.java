package tiy.webapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jessicatracy on 9/14/16.
 */
public class ChatSpringAppController {
//    Client myClient = new Client();
    @RequestMapping(path = "/chat", method = RequestMethod.GET)
    public String chat() {
//        myClient.sendMessage(message);

        return "input";
    }
}
