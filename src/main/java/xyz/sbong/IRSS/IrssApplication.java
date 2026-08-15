package xyz.sbong.IRSS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IrssApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrssApplication.class, args);
	}

}
