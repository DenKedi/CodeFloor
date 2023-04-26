package src.entities;

import src.Entity;
import src.Room;

public class Door extends Entity {
    public boolean locked;
    public Room[] connectedRooms = new Room[2];
    public String direction;

}
