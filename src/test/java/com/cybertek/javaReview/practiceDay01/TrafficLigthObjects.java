package com.cybertek.javaReview.practiceDay01;

public class TrafficLigthObjects {
    public static void main(String[] args) {
        TrafficLigth trafficLigth=new TrafficLigth("9:42 pm");

        // new TrafficLigth().changeColor("red");  this is also a way to call methods and variables
        trafficLigth.changeColor("red");
        trafficLigth.showColor();
        trafficLigth.changeColor("black");
        TrafficLigth trafficLigth1=new TrafficLigth();
        trafficLigth1.changeColor("yellow");
        trafficLigth1.showColor();
        System.out.println("trafficLigth1.localTime = " + trafficLigth1.localTime);
        System.out.println("TrafficLigth.localTime = " + TrafficLigth.localTime);
    }
}
