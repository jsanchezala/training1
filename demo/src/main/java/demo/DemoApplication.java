package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {
	
	@RequestMapping("/")
	@ResponseBody
	String mensaje(){
		return "Welcome Guys!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
