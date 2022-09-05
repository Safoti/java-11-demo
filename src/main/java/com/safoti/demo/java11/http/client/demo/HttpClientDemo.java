package com.safoti.demo.java11.http.client.demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * @author safoti
 * @Description httpclient  demo
 * @createTime 2022年09月04日
 */
public class HttpClientDemo {
    public static void main(String[] args) {
        HttpClient httpClient =  HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(20))
                .build();

        try {
        HttpRequest request =  HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://httpbin.org/get"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .build();
             HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
             response.headers().map().forEach((k,v)-> System.out.println(k+":"+v));
             System.out.println("Status code: " + response.statusCode());
             System.out.println("Body: " + response.body());
        } catch (IOException |InterruptedException e) {
            e.printStackTrace();

    }}
}
