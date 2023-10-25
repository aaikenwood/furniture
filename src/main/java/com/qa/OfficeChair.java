package com.qa;

import javax.print.attribute.standard.OrientationRequested;

public class OfficeChair extends Chair{
    public OfficeChair(double raceSpeed,double acceleration){
        super();
        this.setFurnitureType("Office Chair");
        this.setRoom(ROOM.westminsterOffice);
        this.setRaceSpeed(raceSpeed);
    }
    private double raceSpeed;
    private double acceleration;
    private double distanceTravelled;

    public double getRaceSpeed() {
        return raceSpeed;
    }
    public void setRaceSpeed(double raceSpeed) {
        this.raceSpeed = raceSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }
    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    private double calculateRaceDistance(double time) {
        this.distanceTravelled = this.raceSpeed * time + 0.5 * this.acceleration * time * time;
        return this.distanceTravelled;
    }

    public static String chairRaceDistance(OfficeChair player1Chair, OfficeChair player2Chair, double time) {
        double player1Distance = player1Chair.calculateRaceDistance(time);
        double player2Distance = player2Chair.calculateRaceDistance(time);

        if(player1Distance == player2Distance){
            return "Draw";
        }
        return player1Distance > player2Distance ? "Player 1" : "Player 2";
//        get distance travelled for each chair
//        double distance1 = oc1.calDistance(time);
//        double distance2 = oc2.calDistance(time);
//        if (distance1 > distance2) {
//            return "the first player wins!";
//        }
//        else if (distance1 == distance2) {
//            return "there's a draw";
//        }
//        else {
//            return "the second player wins!";
//        }
    }
}
