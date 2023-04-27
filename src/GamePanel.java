package src;

import java.util.ArrayList;
import java.util.Scanner;

public class GamePanel {
    public int difficulty;
    public ArrayList<Floor> floorList = new ArrayList<>();

    public void start() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Select 1 to start the game");
        if (scan.nextInt()==1){
            System.out.println("Select Difficulty 1-3 (1= Easy, 2 = Medium, 3 = Hard)");
            difficulty = scan.nextInt();
            System.out.println("Difficulty set to " + difficulty);
            generateMap(difficulty);
        }
    }

    private void generateMap(int difficulty) {
        int floorNumber;
        switch (difficulty){
            case 1:
                floorNumber = 10;
                break;
            case 2:
                floorNumber = 15;
                break;
            case 3:
                floorNumber = 20;
                break;
            default:
                floorNumber = 0;
                break;
        }
        for (int i = 0; i < floorNumber; i++) {
            Floor floor = new Floor();
            floorList.add(floor);
        }
    }
}
