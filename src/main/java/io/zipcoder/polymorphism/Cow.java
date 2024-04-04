package io.zipcoder.polymorphism;

public class Cow extends Pet{

    public Cow(){
        super();
    }
    public Cow(String name) {
      super(name);
    }

    @Override
    public String speak() {
        System.out.println("Moo");
        return "Moo";
    }

}
