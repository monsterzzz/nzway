package com.monster.nzway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author monster
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.monster.nzway.mapper"})
public class NzwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NzwayApplication.class, args);
    }

}
