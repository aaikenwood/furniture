package com.qa;

public class Table extends Furniture {
    Table(){
        super();
        this.setFurnitureType("Chair");
    }
    Table(MATERIAL material, ROOM room, int serialNumber){
        super(material,room,serialNumber,"Table");
    }

    @Override
    public String assemble() {
        return "Legs attached to table top";
    }

}
