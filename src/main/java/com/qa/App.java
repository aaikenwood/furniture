package com.qa;

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
            try{
                System.out.println(device.switchOn());
            }catch(Exception e){
                System.out.println(e);
            }
        }
        for(ISwitchable device : electronics){
            try{
                System.out.println(device.switchOn());
            }catch(Exception e){
                System.out.println(e);
            }
        }
//        for(ISwitchable device : electronics){
//            try{
//                System.out.println(device.switchOff());
//            }catch(Exception e){
//                System.out.println(e);
//            }
//
//        }


    }
}
