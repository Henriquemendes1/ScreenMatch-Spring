package br.com.alura.screenMartch;

import br.com.alura.screenMartch.models.DadosSerie;
import br.com.alura.screenMartch.service.ConsumoApi;
import br.com.alura.screenMartch.service.ConverteDados;
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
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=Gilmore+Girls&apikey=64a6d7f7&");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
