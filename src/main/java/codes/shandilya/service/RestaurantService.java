package codes.shandilya.service;

import codes.shandilya.model.Chef;
import codes.shandilya.model.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class RestaurantService {

    private Logger logger = Logger.getLogger(RestaurantService.class.getName());

    private final Chef chef;
    private final Server server;

    @Autowired
    public RestaurantService(Chef chef, Server server) {
        this.chef = chef;
        this.server = server;
    }

    public void cookFood(boolean isFoodOrderPlaced) {
        if (isFoodOrderPlaced) {
            chef.cook();
        } else {
            logger.log(Level.SEVERE, "No food order placed, can't cook!");
        }
    }

    public void serveFood(boolean isFoodPrepared) {
        if (isFoodPrepared) {
            server.serve();
        } else {
            logger.log(Level.SEVERE, "Food not prepared, can't serve!");
        }
    }
}