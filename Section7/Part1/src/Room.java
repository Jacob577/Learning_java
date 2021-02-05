public class Room {
    private Chair chair;
    private Window window;
    private Desk desk;

    public Room(Chair chair, Window window, Desk desk) {
        this.chair = chair;
        this.window = window;
        this.desk = desk;
    }

    public void enterRoom(){
        window.enterRoom();
        somethingFalling();
    }
    private void somethingFalling(){
        desk.enterRoomDesk();
    }

    public Chair getChair() {
        return chair;
    }

    public Window getWindow() {
        return window;
    }

    public Desk getDesk() {
        return desk;
    }
}
