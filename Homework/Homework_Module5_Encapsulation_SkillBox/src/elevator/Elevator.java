package elevator;

public class Elevator {

    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        currentFloor = 1;
    }

    public void moveDown() {
        currentFloor--;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void move(int floor) {
        if (currentFloor == floor) {
            return;
        }

        for (int i = minFloor; i <= maxFloor; i++) {

            if (currentFloor == floor) {
                break;
            }

            if (floor < minFloor || floor > maxFloor) {
                System.out.println("Этаж указан не верно");
                break;
            }

            if (currentFloor < floor) {
                moveUp();
            } else {
                moveDown();
            }

            if (currentFloor != 0) {
                System.out.println(currentFloor + " этаж");
            }
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
