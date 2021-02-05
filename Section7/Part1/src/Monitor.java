public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nariveResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nariveResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nariveResolution = nariveResolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNariveResolution() {
        return nariveResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y);
    }
}
