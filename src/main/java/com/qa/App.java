package com.qa;

import com.qa.exceptions.InvalidToggleException;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
//        kyleArchie();
        katieArchie();
    }

    private static void kyleArchie() {
        ArrayList<Furniture> royalBanquetFurniture = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            Chair chair = new Chair(true,Math.random()*100);
            royalBanquetFurniture.add(chair);
        }
        Table banquetTable = new Table(MATERIAL.Plastic, ROOM.diningRoom, 1);
        royalBanquetFurniture.add(banquetTable);

        for (Furniture furniture : royalBanquetFurniture){
            System.out.println("This " + furniture.getFurnitureType() + " is in the " + furniture.getRoom());
            System.out.println(furniture.assemble());
            furniture.move(ROOM.diningRoom);
            System.out.println("This " + furniture.getFurnitureType() + " is now in the " + furniture.getRoom());
        }
    }

    private static void katieArchie() {
        Lamp smallLamp = new Lamp(500.00);
        Speaker smallSpeaker = new Speaker(123.321);
        ArrayList<ISwitchable> electronics = new ArrayList<>();
        electronics.add(smallLamp);
        electronics.add(smallSpeaker);

        for(ISwitchable device : electronics){
            try {
                System.out.println(device.switchOn());
            }
            catch(InvalidToggleException e) {
                System.err.println(e.getMessage());
            }
            finally {
                System.out.println("you attempted to turn on the devices");
            }
        }

        OfficeChair player1 = new OfficeChair(12.23, 12);
        OfficeChair player2 = new OfficeChair(10.51, 14);
        
        System.out.println(OfficeChair.chairRaceDistance(player1, player2, 122));

        for(ISwitchable device : electronics){
            try{
                System.out.println(device.switchOn());
            }catch(InvalidToggleException e){
                System.err.println(e.getMessage());
            }
        }

    }
}
