package ru.mirea.Ball;

public class Ball {

    private double radius;
    private String colour;

    public Ball(double x, String z){
        radius=x;
        colour=z;
    }
    public Ball(String z){
        radius=0;
        colour=z;
    }
    public Ball(double x){
        radius=x;
        colour="unknown";
    }
    public Ball(){
        radius=0;
        colour="unknown";
    }
    public void set_radius(double x){
        this.radius=x;
    }
    public double get_radius(){
        return this.radius;
    }
    public void set_colour(String z){
        this.colour=z;
    }
    public String get_colour(){
        return this.colour;
    }
    public String toString(){
        return "Ball is "+this.colour+" and it's radius is "+this.radius;
    }
    public void area(){
        System.out.println (this.colour+" ball area is "+radius*radius*Math.PI);
    }
}
