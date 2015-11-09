package io.corp.store;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorpStoreApplication {

	public static void main(String[] args) {

		SpringApplication.run(CorpStoreApplication.class, args);
/*		Flyway flyway = new Flyway();

		// Point it to the database
		flyway.setDataSource("jdbc:mysql://10.68.52.27:3306/cf_0ad03e54_3ff1_4ea5_af28_6582f60ab468",
				"ESA0i4NCQyOakdAA", "mZAGcOD0dplxh6Ua");
		// flyway.clean();
		flyway.setBaselineOnMigrate(true);
		// Start the migration

		flyway.migrate();*/
		

		

	}
}
