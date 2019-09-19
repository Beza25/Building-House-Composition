package House;

import java.text.DecimalFormat;


public class House {

    private Floor floors;
    private Window windows;
    private Door doors;
    private int sqFt;
    private double salesPrice;
    //---------------------Constructors-------------------------------------
    public House(){
        this.floors = new Floor(0, "null");
        this.windows = new Window(0,"null");
        this.doors = new Door(0,"null");
        this.sqFt = 0;
        this.salesPrice = 0;
    }

    public House(Floor floors, Window windows, Door doors, int sqFt, double salesPrice) {

        this.floors = floors;

        this.windows = windows;
        this.doors = doors;
        this.sqFt = sqFt;
        this.salesPrice = salesPrice;
    }

    //---------------------------Methods--------------------------------------------



    public String toString(){
        return  getFloors().getNumFloor()+ " " + getFloors().getTypeFloor() + " floors " +
                getWindows().getNumWindow() + " " + getWindows().getTypeWindow() + " windows " +
                getDoors().getNumDoor() + " " + getDoors().getTypeDoor() + " doors. It is " +
                getSqFt() + " sq ft and worth $" +
                getSalesPrice() + "." ;
    }

    //-----------------------Getters and Setters-----------------------

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }
    public String getSalesPrice() {
        DecimalFormat df2 = new DecimalFormat("#.00");
        return df2.format(salesPrice);
    }
    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Floor getFloors() {
        return floors;
    }

    public void setFloors(Floor floors) {
        this.floors = floors;
    }

    public Window getWindows() {
        return windows;
    }

    public void setWindows(Window windows) {
        this.windows = windows;
    }

    public Door getDoors() {
        return doors;
    }

    public void setDoors(Door doors) {
        this.doors = doors;
    }
}
