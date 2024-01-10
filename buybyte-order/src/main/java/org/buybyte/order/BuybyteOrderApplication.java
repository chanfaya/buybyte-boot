package org.buybyte.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.buybyte.order.dao")
public class BuybyteOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuybyteOrderApplication.class, args);
    }

}
