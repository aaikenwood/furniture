package com.qa;

import com.qa.exceptions.DangerousSpeedException;
import com.qa.exceptions.InvalidTimeException;

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

    private double calculateRaceDistance(double time) throws DangerousSpeedException {
        if (this.getRaceSpeed() > 30) throw new DangerousSpeedException("The speed of the office chair is too DANGEROUS!");
        this.distanceTravelled = this.raceSpeed * time + 0.5 * this.acceleration * time * time;
        return this.distanceTravelled;
    }

    public static String chairRaceDistance(OfficeChair player1Chair, OfficeChair player2Chair, double time)
            throws InvalidTimeException {
        if (time < 0) throw new InvalidTimeException("You can't have negative time!");
        try {
            double player1Distance = player1Chair.calculateRaceDistance(time);
            double player2Distance = player2Chair.calculateRaceDistance(time);
            if(player1Distance == player2Distance){
                return "Draw";
            } else {
                return player1Distance > player2Distance ? "Player 1 wins" : "Player 2 wins";
            }
        }
        catch (DangerousSpeedException e) {
            System.err.println(e.getMessage());
            return "The race was cancelled";
        }
    }
}
