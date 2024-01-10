package org.buybyte.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "org.buybyte.member.feign")
@SpringBootApplication
@MapperScan("org.buybyte.member.dao")
public class BuybyteMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuybyteMemberApplication.class, args);
    }

}
