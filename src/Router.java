public class Router {
    Semaphore availableConnections; // number of available connections
    Router(int n){
        availableConnections = new Semaphore(n);
    }
    public void connect(Device d){
        availableConnections.P();
        Logger.printAndLog(d.getDeviceName() + "(" + d.getDeviceType() + ")" + " is connected");
    }
    public void disconnect(Device d){
        availableConnections.V();
        Logger.printAndLog(d.getDeviceName() + "(" + d.getDeviceType() + ")" + " is disconnected");
    }
    public synchronized void perform(Device d){
        Logger.printAndLog(d.getDeviceName() + "(" + d.getDeviceType() + ")" + " is performing online activity");
    }

}
