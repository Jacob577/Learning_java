public class Desk {
    private int legs;
    private String material;
    private boolean drawer;
    private String color;

    public Desk(int legs, String material, boolean drawer, String color) {
        this.legs = legs;
        this.material = material;
        this.drawer = drawer;
        this.color = color;
    }
    public void enterRoomDesk(){
        System.out.println("The pen falls off the table");
    }

    public int getLegs() {
        return legs;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isDrawer() {
        return drawer;
    }

    public String getColor() {
        return color;
    }
}
