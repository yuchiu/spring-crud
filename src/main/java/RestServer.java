import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServer {
    public static void main(String[] args){
        System.out.println("hello world");
        SpringApplication.run(RestServer.class, args);
    }
}
