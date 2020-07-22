package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//changed here********************8

		SpringApplication.run(Application.class, args);
	}

  //HIS-301 changes
   public void loadDateToCache()
{
   //logic here
}

}
