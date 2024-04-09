package codes.shandilya.runner;

import codes.shandilya.config.ProjectConfig;
import codes.shandilya.service.RestaurantService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var restaurantService = context.getBean(RestaurantService.class);
        restaurantService.cookFood(true);
        //restaurantService.serveFood(true);
        System.out.println(restaurantService.generateBill("12.34"));
    }
}
