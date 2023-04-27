package src;

import java.util.*;

public class Floor {
    public ArrayList<Room> roomList = new ArrayList<>();
    public String name; //z.B.

    public Floor() {
        generateFloor();
    }

    private void generateFloor() {
        //get random Floor from list
        Random random = new Random();
        int floorNumber = random.nextInt(3);

    }
}
