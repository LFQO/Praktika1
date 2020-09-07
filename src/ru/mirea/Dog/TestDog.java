package ru.mirea.Dog;

public class TestDog {
    public static void  main(String[] args){
        Dog cl1, cl2;
        cl1=new Dog("Barya",3);
        cl2=new Dog("Varya");
        cl2.set_age(5);
        System.out.println(cl1.get_name()+" is "+cl1.get_age()+" y.o.");
        cl1.human_age();
        System.out.println(cl2);
    }
}
