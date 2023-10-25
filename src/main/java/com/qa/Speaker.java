package com.qa;

import com.qa.exceptions.InvalidToggleException;

public class Speaker extends Furniture implements ISwitchable {
    public Speaker(double maxVolume) {
        super();
        this.maxVolume = maxVolume;
        setVolume(0);
        this.setFurnitureType("Speaker");
        this.setMaterial(MATERIAL.Wood);
        isOn = false;
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

    private boolean isOn;
    private double volume;
    private double maxVolume;

    @Override
    public String assemble() {
        return "Already assembled";
    }

    @Override
    public String switchOn() throws InvalidToggleException {
        if (isOn) throw new InvalidToggleException(String.format("You can't turn the %s on because it is already on", this.getFurnitureType()));
        isOn = true;
        setVolume(getMaxVolume());
        return String.format("This %s has been turned on and the brightness is %.2f", this.getFurnitureType(), this.getVolume());
    }
    @Override
    public String switchOff() throws InvalidToggleException {
        if (!isOn) throw new InvalidToggleException(String.format("You can't turn the %s off because it is already off", this.getFurnitureType()));
        isOn = false;
        setVolume(0);
        return String.format("This %s has been turned off and the brightness is %.2f", this.getFurnitureType(), this.getVolume());
    }

    @Override
    public String pluggedIn() {
        return String.format("The %s %s is being charged", this.getMaterial(), this.getFurnitureType());
    }

}
