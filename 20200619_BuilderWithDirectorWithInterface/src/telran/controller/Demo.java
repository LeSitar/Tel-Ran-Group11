package telran.controller;

import telran.data.*;


import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        Builder cheapComputerBuilder = new CheapComputerBuilder();
        director.setComputerBuilder(cheapComputerBuilder);
        director.constructComputer();
        Computer computer = director.getComputer();

        System.out.println(computer);






    }
}
