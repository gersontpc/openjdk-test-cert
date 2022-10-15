package com.journaldev.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RequestTest {
   RestTemplate restTemplate = new RestTemplate();

   @Autowired
   RequestTest(@Value("${url.test}") String url) {
      System.out.println("Get na url: " + url);
      System.out.println("Result " + this.get(url));
   }

   public String get(String url) {
      ResponseEntity<String> response = this.restTemplate.getForEntity(url, String.class, new Object[0]);
      return (String)response.getBody();
   }
}
