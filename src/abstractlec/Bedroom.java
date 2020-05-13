package abstractlec;

public class Bedroom extends Room {
    private boolean isMaster = false;
    public Bedroom(double length, double width, Door[] doors, Light[] lights, boolean isMaster) {
        super(length, width, doors, lights);
        this.isMaster = isMaster;
    }
}
