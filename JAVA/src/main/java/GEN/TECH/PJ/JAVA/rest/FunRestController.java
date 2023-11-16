package GEN.TECH.PJ.JAVA.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController {

    // "/"  return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    //new endpoint for"workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 10k";
    }

    //new endpoint
    @GetMapping ("/fortune")
    public String getDailyFortune(){
        return "Today is your worst day";
    }
}
