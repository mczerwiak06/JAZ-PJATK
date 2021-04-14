package pl.pjatk.miccze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class MicczeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicczeApplication.class, args);
	}

}
