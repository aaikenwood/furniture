package com.qa;

public class Chair extends Furniture {
    Chair() {
        super();
        this.setFurnitureType("Chair");
    }

    Chair(boolean personSatOn,double cushionDepth){
        super();
        this.personSatOn = personSatOn;
        this.cushionDepth = cushionDepth;
        this.setFurnitureType("Chair");
    }



    @Override
    public String assemble() {
        return String.format("Legs attached to base and cushion with depth %.2f mm", this.getCushionDepth());
    }


    private boolean personSatOn;

    public boolean isPersonSatOn() {
        return personSatOn;
    }

    public void setPersonSatOn(boolean personSatOn) {
        this.personSatOn = personSatOn;
    }

    public double getCushionDepth() {
        return cushionDepth;
    }

    public void setCushionDepth(double cushionDepth) {
        this.cushionDepth = cushionDepth;
    }

    private double cushionDepth;
}
