package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
 Application a = new Application();

	public static void main(String[] args) {
//changed here********************8

		SpringApplication.run(Application.class, args);
	}

  //HIS-301 changesss
   public void loadDateToCache()
{
   //logic here
}

}
