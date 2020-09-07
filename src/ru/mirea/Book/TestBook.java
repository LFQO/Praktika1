package ru.mirea.Book;

public class TestBook {
    public static void  main(String[] args){
        Book cl1, cl2;
        cl1=new Book("Voyna i mir",3.1);
        cl2=new Book("Skazki");
        cl2.set_weight(0.7);
        System.out.println(cl1.get_name()+" weights "+cl1.get_weight()+" kilos.");
        cl1.heft();
        System.out.println(cl2);
    }
}
