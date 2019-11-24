package app.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"app.user"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}