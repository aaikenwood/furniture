package com.qa;

import com.qa.exceptions.InvalidToggleException;

public class Lamp extends Furniture implements ISwitchable{
    public Lamp(double maxBrightness){
        super();
        this.setFurnitureType("Lamp");
        this.maxBrightness = maxBrightness;
        this.isOn = false;
    }
    private boolean isOn;
    private double brightness;
    private double maxBrightness;

    public double getBrightness() {
        return brightness;
    }
    public void setBrightness(double brightness) {
        if (brightness >= 0 && brightness <= this.getMaxBrightness()) {
            this.brightness = brightness;
        }
    }

    public double getMaxBrightness() {
        return maxBrightness;
    }
    public void setMaxBrightness(double maxBrightness) {
        this.maxBrightness = maxBrightness;
    }

    @Override
    public String assemble() {
        return "Attach light bulb to lamp and attach lamp shade";
    }

    @Override
    public String switchOn() throws InvalidToggleException {
        if (this.isOn) {
            throw new InvalidToggleException(String.format("You can't turn the %s on because it is already on", this.getFurnitureType()));
        }
        else {
            this.isOn = true;
            this.setBrightness(this.maxBrightness);
            return String.format("This %s has been turned on and the brightness is %.2f", this.getFurnitureType(), this.getBrightness());
        }
    }

    @Override
    public String switchOff() throws InvalidToggleException {
        if (!this.isOn) {
            throw new InvalidToggleException(String.format("You can't turn the %s off because it is already off", this.getFurnitureType()));
        }
        else {
            this.isOn = false;
            this.setBrightness(0);
            return String.format("This %s has been turned off and the brightness is %.2f", this.getFurnitureType(), this.getBrightness());
        }
    }

    @Override
    public String pluggedIn() {
        return null;
    }
}
