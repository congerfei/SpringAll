package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.springboot.bean.ConfigBean;
import com.springboot.bean.TestConfigBean;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class,TestConfigBean.class})
//@ImportResource({"classpath:some-application.xml"})
public class Application {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		//命令行属性总是优先于其他属性源 eg:--server.port=9000
		app.setAddCommandLineProperties(false);
		app.run(args);
	}
}
