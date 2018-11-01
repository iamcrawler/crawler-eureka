package cn.iamcrawler.crawlereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CrawlerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerEurekaApplication.class, args);
    }
}
