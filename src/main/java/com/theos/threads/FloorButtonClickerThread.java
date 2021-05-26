package com.theos.threads;

import com.theos.building.floor.Button;
import com.theos.building.floor.Floor;

import static com.theos.building.floor.ButtonState.DOWN;
import static com.theos.building.floor.ButtonState.UP;


public class FloorButtonClickerThread extends Thread {

    private Floor floor;
    private final Button button = new Button();

    public FloorButtonClickerThread(Floor floor) {
        this.floor = floor;
        start();
    }

    public void run() {
        while(!floor.getQueueDown().isEmpty() || !floor.getQueueUp().isEmpty()) {
            if (!floor.getQueueDown().isEmpty()) {
                button.clicked(DOWN);
            }
            if (!floor.getQueueUp().isEmpty()) {
                button.clicked(UP);
            }
        }
    }

}
