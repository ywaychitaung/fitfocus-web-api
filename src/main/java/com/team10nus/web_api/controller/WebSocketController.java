//package com.team10nus.web_api.controller.api;
//
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class WebSocketController {
//
//    @MessageMapping("/updateFitness")
//    @SendTo("/topic/fitnessUpdates")
//    public FitnessData send(FitnessData fitnessData) {
//        // Update the database with the new fitness data
//        // ...
//        return fitnessData;
//    }
//}
