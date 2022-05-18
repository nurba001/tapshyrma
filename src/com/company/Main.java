package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Animal [] cow =new Cow[5];
        cow[0]=new Cow (110,3,"bull","Soil");
        cow[1]=new Cow(156,5,"cow","Zello");
        cow[2]=new Cow(140,4,"cow","timi");
        cow[3]=new Cow(150,5,"cow","Shen");
        cow[4]=new Cow(138,4,"cow","Tima");

        Animal[] sheep=new Sheep[3];
        sheep[0]=new Sheep(56,6,"ram","Nae");
        sheep[1]=new Sheep(44,3,"sheep","Oly");
        sheep[2]=new Sheep(12,2,"sheep","Asu");

        Animal[]horse=new Horse[2];
        horse[0]=new Horse(158,3,"W","Jack");
        horse[1]=new Horse(170,5,"M","Algyr");

//        Animal animal1=new Animal((Sheep[])sheep,(Horse[]) horse,(Cow[]) cow);

        Farm farm = new Farm("asan 12", (Sheep[]) sheep,(Horse[])horse, (Cow[])cow, "Farhat Aftandilov");


        Animal[]horse1=new Horse[1];
        horse1[0]=new Horse(170,4,"M","Aluu");

        Animal[]cow1=new Cow[1];
        cow1[0]=new Cow(140,4," bull","Suuli");

        Animal[] sheep1=new Sheep[1];
        sheep1[0]=new Sheep(74,7,"sheep","Sara");

        Farm farm1=new Farm("Ali 2",(Sheep[])sheep1,(Horse[])horse1,(Cow[])cow1,"Aigil Ashymova");

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\n"+farm);
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("\n\t\t--COW--\n");
        for (Animal cows : cow) {
            System.out.println(cows);
        }
        System.out.println("\n\t\t--HORSE--\n");
        for (Animal horses : horse) {
            System.out.println(horses);
        }
        System.out.println("\n\t\t--SHEEP--\n");
        for (Animal animal : sheep) {
            System.out.println(animal);
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\n"+farm1);
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("\n\t\t--COW--\n");
        for (Animal cows : cow1) {
            System.out.println(cows);
        }
        System.out.println("\n\t\t--HORSE--\n");
        for (Animal horses : horse1) {
            System.out.println(horses);
        }
        System.out.println("\n\t\t--SHEEP--\n");
        for (Animal animal : sheep1) {
            System.out.println(animal);
        }



    }}
