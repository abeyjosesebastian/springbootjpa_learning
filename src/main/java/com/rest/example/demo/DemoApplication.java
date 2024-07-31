package com.rest.example.demo;

import com.rest.example.demo.entity.Video;
import com.rest.example.demo.entity.repository.VideoInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}
	@Bean
	public CommandLineRunner commandLineRunner(VideoInterface videoInterface){
		return args -> {
			Video video=Video.builder()
					.name("My name is John")
					.length("20mins")
					.build();
			videoInterface.save(video);



		};
	}

}
