package ru.mirea.Ball;

public class TestBall {
    public static void main(String[] args){
        Ball cl1,cl2;
        cl1=new Ball(3.4,"red");
        cl2=new Ball("blue");
        cl2.set_radius(1.2);
        System.out.println(cl1.get_radius()+" is a radius of a "+cl1.get_colour()+" ball.");
        cl1.area();
        System.out.println(cl2);
    }
}
