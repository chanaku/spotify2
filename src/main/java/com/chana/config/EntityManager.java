package com.chana.config;

import javax.annotation.PostConstruct;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
public class EntityManager {
		@Autowired
	    Environment env;

		  Logger logger = Logger.getLogger(EntityManager.class.getSimpleName());

		     @Value("${security.oauth2.client.tokenName}")
		     private String testValue;

		      @PostConstruct
		      public void initializeApplication() {
		        logger.info("============================================>"+testValue);
		      }
//	@Value("${security.oauth2.client.tokenName}")
//    private static String newLang;
//
//    public EntityManager(){
//        System.out.println("langauge is: " + newLang);
//    }

}
