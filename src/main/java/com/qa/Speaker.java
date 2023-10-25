package com.qa;

public class Speaker extends Furniture implements ISwitchable{

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    private double volume;
    private double maxVolume;
    public Speaker(double maxVolume){
        super();
        setMaxVolume(maxVolume);
        setVolume(0);
        this.setFurnitureType("Speaker");

    }

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
        return String.format("This %s has been turned on and the brightness is %.2f", this.getFurnitureType(), this.getVolume());
    }

    @Override
    public String pluggedIn() {
        return null;
    }
}
