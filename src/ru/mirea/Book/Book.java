package ru.mirea.Book;

public class Book {

    private String name;
    private double weight;

    public Book(String z,double x){
        name=z;
        weight=x;
    }
    public Book(){
        name="Unnamed";
        weight=0;
    }
    public Book(String z){
        name=z;
        weight=0;
    }
    public Book(double x){
        name="Unnamed";
        weight=x;
    }
    public void set_name(String z){
        this.name=z;
    }
    public String get_name(){
        return this.name;
    }
    public void set_weight(double x){
        this.weight=x;
    }
    public double get_weight(){
        return this.weight;
    }
    public void heft(){
        if(this.weight>0.8) System.out.println(this.name+" book is heavy.");
        else System.out.println(this.name+" book is lightweight.");
    }
    public String toString(){
        return this.name+" book weights "+this.weight+" kilos.";
    }
}