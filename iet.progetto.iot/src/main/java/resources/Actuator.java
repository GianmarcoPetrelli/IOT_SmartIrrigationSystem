package resources;

public class Actuator extends CoapResource {

    private boolean isActive;

    public Actuator(String nodeAddress, String resourceName, boolean isActive) {
        super(nodeAddress, resourceName);
        this.isActive = isActive;
    }

    public boolean GetState() {
        return isActive;
    }

    public void SetState(boolean state) {
        isActive = state;
    }
}
