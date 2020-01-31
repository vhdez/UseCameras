package org.sla;

import java.util.Random;

public class UseCameras {

    public static void main(String[] args) {
	// write your code here

        Camera[] cameras = new Camera[5];
        cameras[0] = new Camera(120, 60, "Sal");
        cameras[1] = new Camera(20, "HD4GB", "Jack");

        for (int recordOpportunities = 0; recordOpportunities < 15; recordOpportunities++ ) {
            for (int cameraIndex = 0; cameraIndex < 2; cameraIndex++) {
                Random randomGenerator = new Random();
                int recordLength = randomGenerator.nextInt(10);
                if (!cameras[cameraIndex].recordVideo(recordLength)) {
                    System.out.println(cameras[cameraIndex].owner + " recording failed");
                }
            }
        }
    }
}
