package com.FirstMulitProp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:abcd.properties",
	"classpath:xyz.properties",
	"classpath:application.properties",
	"classpath:mno.properties"
})
public class SpringBoot2MulitPropFileApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBoot2MulitPropFileApplication.class, args);
		
		//get - read,  bean-object (objectName, classType)
		ProductInfo pob=ac.getBean("pi", ProductInfo.class);
		System.out.println(pob);
	}
}
