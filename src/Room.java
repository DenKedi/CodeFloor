package src;

import java.util.ArrayList;

public  class Room {
    public String name;
    public Room prevRoom;
    public Room[] nextRoom;
    public int doorCount;
    public ArrayList<Entity> entities = new ArrayList<>();
    public String roomType; //for example Elevator(Start)!, Elevator(End)!, Puzzle!, Normal!, Shop!, Treasure!, Fight/Hostile

}
