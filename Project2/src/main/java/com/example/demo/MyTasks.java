/* package com.example.demo;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Component
public class MyTasks {

    RestTemplate restTemplate = new RestTemplate();
    private  int lastID = 3;

    @Scheduled(fixedRate = 1000)
    public void addVehicle() {
        String URL = "http://localhost:8080/addVehicle";
        Random r = new Random();
        int year = (int) Math.floor(Math.random()*(2016-1986+1)+1986);
        int price = (int) Math.floor(Math.random()*(45000-15000+1)+15000);
        String generatedString = RandomStringUtils.random(25, true, false);
        restTemplate.postForObject(URL, new Vehicle(lastID,generatedString,year,price), Vehicle.class);
        lastID++;
    }

    @Scheduled(fixedRate = 6000)
    public void deleteVehicle() {
        String URL = "http://localhost:8080/deleteVehicle";
        Random r = new Random();
        int l = r.nextInt(lastID + 100);
        restTemplate.delete(URL + "/" + l);
    }

    @Scheduled(fixedRate = 20000)
    public void updateVehicle() {
        String URL = "http://localhost:8080/updateVehicle";
        Random r = new Random();
        int id = r.nextInt(lastID);
        restTemplate.put(URL, new Vehicle(id, "Porsche", 2013, 59999));
    }

}
 */