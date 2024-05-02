package br.com.alura.screenMartch;

import br.com.alura.screenMartch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMartchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenMartchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();

	}


}
