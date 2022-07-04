package com.bridgelabz;

public class MoodAnalyzer {
    public static String analyzeMood(String message){
        if(message.toLowerCase().contains("sad")){
             return "SAD";
        }else if(message.toLowerCase().contains("happy")){
            return "HAPPY";
        }
        return null;
    }
}
