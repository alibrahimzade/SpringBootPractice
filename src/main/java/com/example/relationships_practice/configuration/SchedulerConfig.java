package com.example.relationships_practice.configuration;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Component
public class SchedulerConfig {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    @Scheduled(fixedRate = 2000)
    public void run(){
//        System.out.println("Time time is now "+ dateFormat.format(new Date()));
        System.out.println(LocalDateTime.now());
    }
}
