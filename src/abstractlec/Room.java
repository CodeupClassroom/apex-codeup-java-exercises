package abstractlec;

import shapes.Rectangle;

public abstract class Room extends Rectangle {
    private Door[] doors;
    private Light[] lights;

    public Room(double length, double width, Door[] doors, Light[] lights) {
        super(length, width);
        this.doors = doors;
        this.lights = lights;
    }

    public void switchEverythingOn() {
        //Open all the doors.
        for (Switchable item: doors) {
            item.switchOn();
        }
        //Turn on all the lights.
        for (Switchable item: lights) {
            item.switchOn();
        }
    }

    public void switchEverythingOff() {
        //Open all the doors.
        for (Switchable item: doors) {
            item.switchOff();
        }
        //Turn on all the lights.
        for (Switchable item: lights) {
            item.switchOff();
        }
    }
}
