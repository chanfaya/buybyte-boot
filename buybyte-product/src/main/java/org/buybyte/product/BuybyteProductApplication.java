package org.buybyte.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.buybyte.product.dao")
public class BuybyteProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuybyteProductApplication.class, args);
	}

}
