package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringBootHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateApplication.class, args);
//		openHomePage();
	}

	private static void openHomePage() {
		try {
			Runtime rt = Runtime.getRuntime();
			rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

}
