package com.qa;

import com.qa.exceptions.InvalidTimeException;
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
//        Lamp smallLamp = new Lamp(500.00);
//        Speaker smallSpeaker = new Speaker(123.321);
//        ArrayList<ISwitchable> electronics = new ArrayList<>();
//        electronics.add(smallLamp);
//        electronics.add(smallSpeaker);
//
//        for(ISwitchable device : electronics){
//            try {
//                System.out.println(device.switchOn());
//            }
//            catch(InvalidToggleException e) {
//                System.err.println(e.getMessage());
//            }
//            finally {
//                System.out.println("you attempted to turn on the devices");
//            }
//        }

        OfficeChair katie = new OfficeChair(19, 100);
        OfficeChair archie = new OfficeChair(29, 14);

        try{
            System.out.println(OfficeChair.chairRaceDistance(katie, archie, 100));
        }catch(Exception e){
            System.err.println(e.getMessage());
        }







//        for(ISwitchable device : electronics){
//            try {
//                System.out.println(device.switchOff());
//            }
//            catch(Exception e) {
//                System.out.println(e.getMessage());
//            }
//            finally {
//                System.out.println("you attempted to turn off the devices");
//            }
//        }
//

//        for(ISwitchable device : electronics){
//            try{
//                System.out.println(device.switchOn());
//            }catch(InvalidToggleException e){
//                System.err.println(e.getMessage());
//            }
//        }

    }
}
