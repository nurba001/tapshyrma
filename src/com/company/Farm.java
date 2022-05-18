package com.company;

public class Farm extends Animal {
    private String adressFarm;
   private Sheep[] sheep;
    private Horse[] horse;
    private Cow[] cow;
    private String ownerName;


    public Farm(String adressFarm,Sheep[] sheep,Horse[] horse,Cow[] cow,String ownerName) {

     this.horse=horse;
      this.cow=cow;
    this.sheep=sheep;
     this.ownerName=ownerName;
    this.adressFarm=adressFarm;
    }
    public Farm(){

    }

 @Override
 public String toString() {
  return "Ower:  "+ownerName+" | adress: "+adressFarm+" | Horse: "+horse.length+"| Cow: "+cow.length+"| Sheep: "+sheep.length;
 }
}
