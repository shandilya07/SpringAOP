package codes.shandilya.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Order(2)
@Component
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterThrowing(value = "execution(* codes.shandilya.service.*.*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        logger.log(Level.INFO, joinPoint.getSignature() + " Exception occurred due to " + ex.getMessage());
    }

    @AfterReturning(value = "execution(* codes.shandilya.service.*.*(..))", returning = "value")
    public void logReturn(JoinPoint joinPoint, Object value) {
        logger.log(Level.INFO, joinPoint.getSignature() + " method returned successfully with value : " + value);
    }

    // @After

    @Around("execution(* codes.shandilya.service.*.*(..))")
    public void logTime(ProceedingJoinPoint pjp) throws Throwable {
        logger.info(pjp.getSignature() + " Method execution starting...");
        Instant startTime = Instant.now();
        pjp.proceed();
        Instant endTime = Instant.now();
        logger.info("Time elapsed : " + Duration.between(startTime, endTime).toMillis() + " ms");
        logger.info(pjp.getSignature() + " Method execution finished...");
    }

}