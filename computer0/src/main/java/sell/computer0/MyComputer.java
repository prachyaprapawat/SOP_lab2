package sell.computer0;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class MyComputer {
	@RequestMapping("/computer")
    public String toString(){
        return "First Page : 1. Lenovo 2.Dell";
    }
}
