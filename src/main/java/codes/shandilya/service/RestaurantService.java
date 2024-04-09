package codes.shandilya.service;

import codes.shandilya.model.Chef;
import codes.shandilya.model.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class RestaurantService {

    private final Logger logger = Logger.getLogger(RestaurantService.class.getName());

    private final Chef chef;
    private final Server server;

    @Autowired
    public RestaurantService(Chef chef, Server server) {
        this.chef = chef;
        this.server = server;
    }

    public void cookFood(boolean isFoodOrderPlaced) {
        /*Instant startTime = Instant.now();
        logger.info("Method CookFood execution starting...");*/
        /*if (isFoodOrderPlaced) {
            chef.cook();
        } else {
            logger.log(Level.SEVERE, "No food order placed, can't cook!");
        }*/
        chef.cook();
        /*logger.info("Method CookFood execution ending...");
        Instant finishTime = Instant.now();
        long timeTaken = Duration.between(startTime, finishTime).toMillis();
        logger.info("Time taken in ms for execution of method CookFood..." + timeTaken);*/
    }

    public void serveFood(boolean isFoodPrepared) {
        /*Instant startTime = Instant.now();
        logger.info("Method ServeFood execution starting...");*/
        /*if (isFoodPrepared) {
            server.serve();
        } else {
            logger.log(Level.SEVERE, "Food not prepared, can't serve!");
        }*/
        server.serve();
        /*logger.info("Method ServeFood execution ending...");
        Instant finishTime = Instant.now();
        long timeTaken = Duration.between(startTime, finishTime).toMillis();
        logger.info("Time taken in ms for execution of method ServeFood..." + timeTaken);*/
    }

    public String generateBill(String amount) {
        if (!amount.isEmpty()) {
            return "You gotta pay an amount of : " + amount;
        } else {
            throw new RuntimeException("No bill amount present!");
        }
    }
}