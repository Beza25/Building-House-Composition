package House;

public class Window {
    private int numWindow;
    private String typeWindow;

    public Window(){
        this.numWindow = 0;
        this.typeWindow = "";
    }
    public Window(int numWindow, String typeWindow){
        this.numWindow = numWindow;
        this.typeWindow = typeWindow;
    }



    public int getNumWindow() {
        return numWindow;
    }

    public void setNumWindow(int numWindow) {
        this.numWindow = numWindow;
    }

    public String getTypeWindow() {
        return typeWindow;
    }

    public void setTypeWindow(String typeWindow) {
        this.typeWindow = typeWindow;
    }
}
