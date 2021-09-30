package br.com.pedrodavi.analisesonarcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AnaliseSonarcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnaliseSonarcloudApplication.class, args);
	}

}
