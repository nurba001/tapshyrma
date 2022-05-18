package com.company;

public abstract  class  Animal {
    private Sheep[] sheep;
    private Horse[] horse;
    private Cow[] cow;
    private int weight;
    private int age;
    private  String gender;
    private String nickName;

    public Animal(int weight,int age,String gender,String nickName) {
       this.weight = weight;
        this.age=age;
        this.gender=gender;
        this.nickName=nickName;
    }

    public Animal(Sheep[] sheep,Horse[] horse,Cow[] cow) {
        this.cow=cow;
        this.horse=horse;
        this.sheep=sheep;
    }

    public Animal() {

    }


    public  String toString() {

        return  weight+"kg | "+age+"year old |"+" gender: "
                +gender+"| name "+nickName;
    }}

