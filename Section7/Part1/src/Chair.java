public class Chair {
    private int legs;
    private String material;
    private boolean armrest;

    public Chair(int legs, String material, boolean armrest) {
        this.legs = legs;
        this.material = material;
        this.armrest = armrest;
    }

    public void sitDown(){
        System.out.println("Squeeq");
    }

    public int getLegs() {
        return legs;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isArmrest() {
        return armrest;
    }
}
