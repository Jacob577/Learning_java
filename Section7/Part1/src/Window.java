public class Window {
    private int height;
    private int width;
    private String color;
    private String handleType;

    public Window(int height, int width, String color, String handleType) {
        this.height = height;
        this.width = width;
        this.color = color;
        this.handleType = handleType;
    }

    public void enterRoom(){
        System.out.println("Sun is shining in your face");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public String getHandleType() {
        return handleType;
    }
}
