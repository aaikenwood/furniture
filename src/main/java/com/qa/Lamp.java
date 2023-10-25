package com.qa;

public class Lamp extends Furniture implements ISwitchable{
    public Lamp(double maxBrightness){
        super();
        this.setFurnitureType("Lamp");
        this.maxBrightness = maxBrightness;
    }

    public double getBrightness() {
        return brightness;
    }

    public void setBrightness(double brightness) {
        if (brightness >= 0 && brightness <= this.getMaxBrightness()) {
            this.brightness = brightness;
        }
    }

    private double brightness;

    public double getMaxBrightness() {
        return maxBrightness;
    }

    public void setMaxBrightness(double maxBrightness) {
        this.maxBrightness = maxBrightness;
    }

    private double maxBrightness;
    @Override
    public String assemble() {
        return "Attach light bulb to lamp and attach lamp shade";
    }

    @Override
    public String switchOn() {
        this.setBrightness(this.maxBrightness);
        return String.format("This %s has been turned on and the brightness is %.2f", this.getFurnitureType(), this.getBrightness());
    }

    @Override
    public String switchOff() {
        this.setBrightness(0);
        return String.format("This %s has been turned off and the brightness is %.2f", this.getFurnitureType(), this.getBrightness());
    }

    @Override
    public String pluggedIn() {
        return null;
    }
}
