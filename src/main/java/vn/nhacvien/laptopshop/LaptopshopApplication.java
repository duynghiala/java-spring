package vn.nhacvien.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaptopshopApplication {

	public static void main(String[] args) {

		ApplicationContext nhacvien = SpringApplication.run(LaptopshopApplication.class, args);
		for (String s : nhacvien.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}

}
