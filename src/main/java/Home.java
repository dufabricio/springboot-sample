import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Home {

    @RequestMapping("/")
    String home() {
        return "Spring Boot Working :)";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Home.class, args);
    }

}