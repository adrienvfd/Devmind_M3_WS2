package devmind.workshop_2;

import devmind.workshop_2.service.DataImportInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Workshop2Application {

	public static void main(String[] args) {
		DataImportInitializer.init();
		SpringApplication.run(Workshop2Application.class, args);
	}
}
