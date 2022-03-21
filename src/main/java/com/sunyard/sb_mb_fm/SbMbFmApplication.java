package com.sunyard.sb_mb_fm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sunyard.sb_mb_fm.dao")
public class SbMbFmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMbFmApplication.class, args);
	}

}
