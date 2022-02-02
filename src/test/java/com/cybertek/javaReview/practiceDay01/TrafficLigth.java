package com.cybertek.javaReview.practiceDay01;

public class TrafficLigth extends Ligth{
   private String color;

   public TrafficLigth(String localTime){

       this.localTime=localTime;
   }
   public TrafficLigth(){


   }
    public void showColor(){
        System.out.println("color = " + color);
    }
    public static String localTime;
    public static void showTime(){
        System.out.println("Traffic lights time in the city "+localTime);
    }
    public void changeColor(String newColor){
        if(newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow")
                ||newColor.equalsIgnoreCase("green")){
            System.out.println("changing the color to "+newColor);
            color=newColor;
        }else{
            System.err.println("ERROR invalid color "+newColor);
        }
    }


    @Override
    public void giveLigth() {
        System.out.println("Showing different ligth colors to arrange traffic ligths ");

    }
}
