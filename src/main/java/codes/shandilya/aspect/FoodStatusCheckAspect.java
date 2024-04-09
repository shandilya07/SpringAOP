package codes.shandilya.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class FoodStatusCheckAspect {

    private final Logger logger = Logger.getLogger(FoodStatusCheckAspect.class.getName());

   /* @Before("execution(* codes.shandilya.service.*.*(..)) && args(isFoodOrderPlaced,..)")
    public void checkIfFoodOrderPlaced(boolean isFoodOrderPlaced) {
        if (!isFoodOrderPlaced) {
            logger.log(Level.SEVERE, "Food order hasn't been placed, so won't cook!");
            System.exit(0);
        }
    }*/

    /*@Before("execution(* codes.shandilya.service.*.*(..)) && args(isFoodPrepared,..)")
    public void checkIfFoodPrepared(boolean isFoodPrepared) {
        if (!isFoodPrepared) {
            logger.log(Level.SEVERE, "Food isn't prepared, so won't serve!");
            System.exit(0);
        }
    }*/
}