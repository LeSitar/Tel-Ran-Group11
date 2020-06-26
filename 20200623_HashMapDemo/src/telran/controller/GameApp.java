package telran.controller;

import telran.data.Command;
import telran.data.DuckHunting;
import telran.data.Football;
import telran.data.Hockey;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Map<Integer, Command> gamesMap = new HashMap<>();
        //Map<String, List<String>>

        Football football = new Football();

        gamesMap.put(football.getNumber(), football);
        gamesMap.put(2,new Hockey());
        gamesMap.put(3, new DuckHunting());

        System.out.println("Choice game, enter number");
        System.out.println("1 - Football, 2 - Hockey, 3 - DuckHunting");

        game(gamesMap);

    }

    public static void game(Map<Integer, Command> gameMap){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if(gameMap.containsKey(number)){
            gameMap.get(number).execute();
        }else{
            System.out.println("wrong game number");
        }
        scanner.close();
    }
}
