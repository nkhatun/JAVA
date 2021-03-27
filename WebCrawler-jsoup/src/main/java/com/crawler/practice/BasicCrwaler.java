package com.crawler.practice;

import java.util.HashMap;
import java.util.HashSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashSet;

public class BasicCrwaler {
	private HashSet<String> links;
	private HashMap<String,BigDecimal> rates;


    public BasicCrwaler() {
        links = new HashSet<String>();
        rates = new HashMap<String,BigDecimal>();
    }
	  public void getPageLinks(String URL) {
	        //4. Check if you have already crawled the URLs 
	        //(we are intentionally not checking for duplicate content in this example)
	        if (!links.contains(URL)) {
	            try {
	                //4. (i) If not add it to the index
	                if (links.add(URL)) {
	                    System.out.println(URL);
	                }

	                //2. Fetch the HTML code
	                Document document = Jsoup.connect(URL).get();
	                //3. Parse the HTML to extract links to other URLs
	                Elements linksOnPage = document.select("a[href]");
	                Elements repositories = document.getElementsByClass("forextable");
	                Elements currencies = document.getElementsByClass("currency a");
                    Elements newsHeadlines = document.getElementsByClass("w5");
                    for (Element headline : newsHeadlines) {
//                    	 System.out.println( headline.attr("title"));
                    	String s1= headline.absUrl("href");
    	                Elements l = headline.select("a[href]");

                    	 System.out.println("s1"+s1 );
                    	 System.out.println("l"+l );
                     	String s2= l.attr("abs:href");

                    	 System.out.println(s2 );

                    	}
	                for (Element repository : repositories) {
	                    // Extract the title
	                    String repositoryTitle = repository.getElementsByClass("currency").text();
	                    String rate = repository.getElementsByClass("rate").text();


	                    String[] repoArr = repositoryTitle.split(" ");
	                    String[] rateArr = rate.split(" ");

	                    for(int i=0;i<repoArr.length;i++) {
	                    	BigDecimal val = new BigDecimal(rateArr[i]); 
	                    	rates.put(repoArr[i],val);
	                    }
	                    
	                    System.out.println("Currency : "+repositoryTitle +"Rate: "+rate);

	                    }
                    System.out.println("Rates : "+rates);

	                //5. For each extracted URL... go back to Step 4.
//	                for (Element page : linksOnPage) {
//	                    getPageLinks(page.attr("abs:href"));
//	                }
	            } catch (IOException e) {
	                System.err.println("For '" + URL + "': " + e.getMessage());
	            }
	        }
	    }
}
