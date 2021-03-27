package com.crawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crawler.practice.BasicCrwaler;
import com.crawler.practice.Spider;

@SpringBootApplication
public class WebCrawlerJsoupApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebCrawlerJsoupApplication.class, args);
		/*Spider spider = new Spider();
        spider.search("https://github.com/nkhatun/", "public");*/
		
		BasicCrwaler b = new BasicCrwaler();
		b.getPageLinks("https://www.ecb.europa.eu/stats/policy_and_exchange_rates/euro_reference_exchange_rates/html/index.en.html");
		
	}
	
	

}
