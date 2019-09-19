package House;

public class HouseApp {
    public static void main(String[] args) {

        //public House(Floor floors, Window windows, Door doors, int sqFt, double salesPrice)
        House presentHome = new House(new Floor(3, "hard wood"), new Window(4, "big"),
                new Door(3, "white"), 2000, 30000);

        System.out.println("My present home has " + presentHome.toString());

        House futureHose = new House(new Floor(4, "hard wood"), new Window(8, "open"),
                new Door(10, "hard wood"), 50000, 150000);

        System.out.println("My future house is going to have " + futureHose.toString());
    }





    }
