package codes.shandilya.model;

import org.springframework.stereotype.Component;

@Component
public class Server {

    public void serve() {
        System.out.println("Server is serving!");
    }
}
