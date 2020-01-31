package org.sla;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Camera {
    // Fields
    int batteryRemaining;
    int minutesLeft;
    boolean blackWhite;
    String owner;

    // Constructors

    Camera(int batteryLife, int maxMinutes, String person) {
        batteryRemaining = batteryLife;
        minutesLeft = maxMinutes;
        blackWhite = false;
        owner = person;
    }

    Camera(int batteryLife, int maxMinutes, boolean bw) {
        batteryRemaining = batteryLife;
        minutesLeft = maxMinutes;
        blackWhite = bw;
    }


    Camera(int batteryLife, String memoryType, String person) {
        batteryRemaining = batteryLife;
        if (memoryType.equalsIgnoreCase("HD4GB")) {
            minutesLeft = 30;
        } else {
            minutesLeft = 0;
        }
        blackWhite = false;
        owner = person;

    }

    // Methods
    boolean recordVideo(int minutes) {
        if ((batteryRemaining < minutes) || (minutesLeft < minutes)){
            return false;
        }

        for (int i = 1; i <= minutes; i++ ) {
            System.out.println(owner + " recording video minute " + i);
        }

        batteryRemaining = batteryRemaining - minutes;
        minutesLeft = minutesLeft - minutes;

        return true;
    }
}
