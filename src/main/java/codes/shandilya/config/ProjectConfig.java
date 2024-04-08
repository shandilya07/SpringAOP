package codes.shandilya.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"codes.shandilya.model", "codes.shandilya.service"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}