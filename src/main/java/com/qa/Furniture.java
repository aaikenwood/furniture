package com.qa;

public abstract class Furniture { //flatpack

    public Furniture(){
        this(MATERIAL.Wood,ROOM.Shed,0, "furniture");
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    private String furnitureType;

    public Furniture(MATERIAL material, ROOM room, int serialNumber, String furnitureType){
        this.setRoom(room);
        this.setMaterial(material);
        this.setSerialNumber(serialNumber);
        this.furnitureType = furnitureType;
    }

    public MATERIAL getMaterial() {
        return material;
    }

    public void setMaterial(MATERIAL material) {
        this.material = material;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ROOM getRoom() {
        return room;
    }

    public void setRoom(ROOM room) {
        this.room = room;
    }

    private MATERIAL material;
    private int serialNumber;
    private int numberOfScrews;
    private ROOM room;

    public void move(ROOM room) {
        setRoom(room);
    }

    public abstract String assemble();


}
