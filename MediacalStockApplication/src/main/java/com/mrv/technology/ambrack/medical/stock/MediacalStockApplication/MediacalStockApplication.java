package com.mrv.technology.ambrack.medical.stock.MediacalStockApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class MediacalStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediacalStockApplication.class, args);
		
		 
	}

}