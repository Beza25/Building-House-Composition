package House;

public class Floor {
    private int numFloor;
    private String typeFloor;

    public Floor(){
        this.numFloor = 0;
        this.typeFloor = "";
    }
    public Floor(int numFloor, String typeFloor){
        this.numFloor = numFloor;
        this.typeFloor = typeFloor;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

    public String getTypeFloor() {
        return typeFloor;
    }

    public void setTypeFloor(String typeFloor) {
        this.typeFloor = typeFloor;
    }
}
