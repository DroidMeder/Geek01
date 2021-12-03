package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Dog extends Pet {
    private String name;
    private String breed;
    private ArrayList<String> commands;

    public Dog() {
    }

    public Dog(String name, String breed, EnumColor color, Shelter shelter, ArrayList<String> commands) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
        this.commands = commands;

    }

    public Dog(String name, String breed, ArrayList<String> commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    @Override
    public String getInfo() {
        String s = super.getInfo();
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommand: " + commands.toString();
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void makeVoice(String voice, int count) {
        for (int i = 0; i < count; i++) {

            System.out.println(voice);
        }
    }
}
