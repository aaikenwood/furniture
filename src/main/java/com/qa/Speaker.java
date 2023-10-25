package com.qa;

public class Speaker extends Furniture implements ISwitchable{
    public Speaker(double maxVolume){
        super();
        this.maxVolume = maxVolume;
        setVolume(0);
        this.setFurnitureType("Speaker");
        this.setMaterial(MATERIAL.Wood);
    }

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        if (volume >= 0 && volume <= this.getMaxVolume()) {
            this.volume = volume;
        }
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    private double volume;
    private double maxVolume;

    @Override
    public String assemble() {
        return "Already assembled";
    }

    @Override
    public String switchOn() {
        setVolume(maxVolume);
        return String.format("This %s has been turned on and the brightness is %.2f", this.getFurnitureType(), this.getVolume());
    }

    @Override
    public String switchOff() {
        setVolume(0);
        return String.format("This %s has been turned off and the brightness is %.2f", this.getFurnitureType(), this.getVolume());
    }

    @Override
    public String pluggedIn() {
        return String.format("The %s %s is being charged", this.getMaterial(), this.getFurnitureType());
    }
}
