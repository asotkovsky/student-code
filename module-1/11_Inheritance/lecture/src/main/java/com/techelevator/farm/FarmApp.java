package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class FarmApp {

    public static void main(String[] args) {
       FarmAnimal farmAnimalOne = new Cow();
       FarmAnimal farmAnimalTwo = new Chicken();

       List<FarmAnimal> animals = new ArrayList<FarmAnimal>();
        animals.add(farmAnimalOne);
        animals.add(farmAnimalTwo);

        for (FarmAnimal currentAnimal : animals) {
            System.out.println("The " + currentAnimal.getName() + " says " + currentAnimal.getSound());
        }

    }
}
