package Home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import resources.PermissionResources;


@SpringBootApplication
@ComponentScan(basePackageClasses = PermissionResources.class)
public class HomeAPI {
    public static void main(String[] args) {
        SpringApplication.run(HomeAPI.class,args);
    }
}
