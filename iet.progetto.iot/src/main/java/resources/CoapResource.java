package resources;

public class CoapResource {
    private String nodeAddress;
    private String resourceName;

    public CoapResource(String nodeAddress, String resourceName){
        this.nodeAddress = nodeAddress;
        this.resourceName = resourceName;
    }

    public String getNodeAddress() {
        return nodeAddress;
    }
    public void setNodeAddress(String nodeAddress) {
        this.nodeAddress = nodeAddress;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}