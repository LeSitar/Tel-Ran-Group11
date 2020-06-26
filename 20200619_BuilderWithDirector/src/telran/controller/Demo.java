package telran.controller;

import telran.data.CheapComputerBuilder;
import telran.data.Computer;
import telran.data.ComputerBuilder;
import telran.data.Director;


import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();
        director.setComputerBuilder(cheapComputerBuilder);
        director.constructComputer();
        Computer computer = director.getComputer();

        System.out.println(computer);

        List list = new ArrayList();
        list.add(1);
        list.add("aa");





    }
}
