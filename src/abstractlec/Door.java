package abstractlec;

public class Door implements Switchable {
    private String type;
    private boolean isOpen = false;

    public Door(String type) {
        this.type = type;
    }

    public boolean getState() {
        return isOpen;
    }

    public void switchOn() {
        System.out.println(this.type + " door is being opened.");
        this.isOpen = true;
    }

    public void switchOff() {
        System.out.println(this.type + " door is being closed.");
        this.isOpen = false;
    }
}
