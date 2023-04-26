package src;

import java.util.ArrayList;

public  class Room {
    public String name;
    public Room prevRoom;
    public Room[] nextRoom;
    public int doorCount;
    public ArrayList<Entity> entities = new ArrayList<>();

}
