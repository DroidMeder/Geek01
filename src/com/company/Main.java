package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("SIT");
        commands.add("Eat");
        commands.add("Lay");
        Dog dog = new Dog("Limo", "Doberman", commands);
        Dog dog1 = new Dog("Popsy", "Pitbull", EnumColor.WHITE, new Shelter("New house", "New-York"), commands);
	// write your code here
        System.out.println(dog.getInfo());
        System.out.println(dog1.getInfo());
        dog.makeVoice("Gav, GUf");
        dog1.makeVoice("Ugaf vaf", 3);
    }
}

