package ru.mirea.Dog;

public class Dog {

    private String name;
    private int age;

    public Dog(String z,int x){
        name=z;
        age=x;
    }
    public Dog(){
        name="Unnamed";
        age=0;
    }
    public Dog(String z){
        name=z;
        age=0;
    }
    public Dog(int x){
        name="Unnamed";
        age=x;
    }
    public void set_name(String z){
        this.name=z;
    }
    public String get_name(){
        return this.name;
    }
    public void set_age(int x){
        this.age=x;
    }
    public int get_age(){
        return this.age;
    }
    public void human_age(){
        System.out.println("A master would be "+this.age*7+" when the dog is "+this.age+" years old.");
    }
    public String toString(){
        return this.name+"'s age is "+this.age+" y.o.";
    }
}