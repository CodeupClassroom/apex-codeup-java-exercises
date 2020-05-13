package abstractlec;

public class House {
    private String address;
    private String foundation;
    private Room[] rooms;

    public House(String address, String foundation, Room[] rooms) {
        this.address = address;
        this.foundation = foundation;
        this.rooms = rooms;
    }

    public void switchEverythingOn() {
        for (Room room: this.rooms) {
            room.switchEverythingOn();
        }
    }

    public void switchEverythingOff() {
        for (Room room: this.rooms) {
            room.switchEverythingOff();
        }
    }

    public double getSquareFeet() {
        double total = 0;
        for (Room room: rooms) {
            total += room.getArea();
        }

        return total;
    }
}
