package org.buybyte.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.buybyte.ware.dao")
public class BuybyteWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuybyteWareApplication.class, args);
    }

}
