package md.pbl.project.pblbackendapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "md.pbl.project.pblbackendapi.rest")
public class PblBackendApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PblBackendApiApplication.class, args);
    }

}
