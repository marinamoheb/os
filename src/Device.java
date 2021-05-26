public class Device extends Thread{
    private final String deviceName;
    private final String deviceType;
    private final Router router;
    public String getDeviceName() {
        return deviceName;
    }
    public String getDeviceType() {
        return deviceType;
    }
    Device(String name, String type, Router router){
        this.deviceName = name;
        this.deviceType = type;
        this.router = router;
    }
    public void run() {
        router.connect(this);
        router.perform(this);
        router.disconnect(this);
    }
}