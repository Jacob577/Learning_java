public class Main {
    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20,20,5);
//        Case theCase = new Case("220B","Dell","240",dimensions);
//
//        Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540,1440));
//
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",4,6,"v2.44");
//        PC thePC = new PC(theCase,theMonitor,theMotherboard);
//        thePC.powerUP();
        Chair chair = new Chair(4,"Polyuretane",false);
        Desk desk = new Desk(3,"Pine",true,"white");
        Window window = new Window(2,1,"blue","Crach bar");
        Room room = new Room(chair,window,desk);
        room.enterRoom();
        desk.enterRoomDesk();
        window.enterRoom();
        room.getWindow().enterRoom();
    }
}
