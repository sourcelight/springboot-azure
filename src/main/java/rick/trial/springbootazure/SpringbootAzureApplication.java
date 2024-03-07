package rick.trial.springbootazure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/maintest")
@SpringBootApplication
public class SpringbootAzureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAzureApplication.class, args);
    }

    @GetMapping("/message")
    public Mono<String> message(){

        return Mono.just("Hello Max ! : )Application deployed in  Azure !!!");
    }

}
