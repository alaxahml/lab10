package com.cherkasov.lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        System.out.print("Road length: ");
        double length = in.nextDouble();
        System.out.print("Car amount: ");
        int amount = in.nextInt();
        for(int i = 0;i < amount;++i){
            cars.add(new Car());
            System.out.println(i + " car: ");
            System.out.print("speed: ");
            cars.get(i).setSpeed(in.nextDouble());
            System.out.print("initial position: ");
            cars.get(i).setInitial_position(in.nextDouble());
        }

        int counter = 0;
        for(int i = 0;i < cars.size();++i){
            for(int j = 0;j < cars.size();++j){
                if(cars.get(i).getInitial_position() > cars.get(j).getInitial_position() &&
                        ((length - cars.get(i).getInitial_position())/cars.get(i).getSpeed()) > ((length - cars.get(j).getInitial_position())/cars.get(j).getSpeed())){
                    ++counter;
                }
            }
        }
         System.out.println(counter+ " overtakings");

    }
}
