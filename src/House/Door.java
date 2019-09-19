package House;

public class Door {
    private int numDoor;
    private String typeDoor;

    public Door(){
        this.numDoor = 0;
        this.typeDoor = "";
    }
    public Door(int numDoor, String typeDoor){
        this.numDoor = numDoor;
        this.typeDoor = typeDoor;
    }

    public int getNumDoor() {
        return numDoor;
    }

    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }

    public String getTypeDoor() {
        return typeDoor;
    }

    public void setTypeDoor(String typeDoor) {
        this.typeDoor = typeDoor;
    }
}
