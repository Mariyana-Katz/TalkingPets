package io.zipcoder.polymorphism;

public class Dog extends Pet{



    public Dog(String name) {
       super(name);
    }

    public Dog(){
        super();
    }
    @Override
    public String speak() {
        //System.out.println("Bark");
        return "Bark";
    }


}
