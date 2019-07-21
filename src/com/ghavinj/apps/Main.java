package com.ghavinj.apps;

public class Main {

    public static void main(String[] args) {
        Ball blueBall = new Ball();

        Ball redBall = new Ball();

        Ball yellowBall = new Ball();

        //Set all balls names
        blueBall.setName("blue");
        redBall.setName("red");
        yellowBall.setName("yellow");

        //Set all balls color
        blueBall.setColor("blue");
        redBall.setColor("red");
        yellowBall.setColor("yellow");


        System.out.println("The balls names are " + blueBall.getName() + " " + yellowBall.getName()+ " " + redBall.getName());


    }
}
