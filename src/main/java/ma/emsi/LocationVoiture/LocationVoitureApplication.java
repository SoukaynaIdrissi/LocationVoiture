package ma.emsi.LocationVoiture;

import lombok.AllArgsConstructor;
import ma.emsi.LocationVoiture.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@AllArgsConstructor
public class LocationVoitureApplication implements CommandLineRunner {


//	Client client;
	public static void main(String[] args) {
		SpringApplication.run(LocationVoitureApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
