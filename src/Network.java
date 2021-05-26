import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Network {
    public static void clearLogs(){
        try(FileWriter writer = new FileWriter("logs.txt", false)) {
            writer.append("");
        }catch (IOException e){
            //
        }
    }
    public static void main(String[] args) throws InterruptedException {
        clearLogs();
        Scanner scan = new Scanner(System.in);
        int n; // Number of connections
        int tc; // Number of devices
        Device[] devices;
        System.out.println("What is number of Connections?");
        n = scan.nextInt();
        Router router = new Router(n);
        System.out.println("What is number of devices Clients want to connect?");
        tc = scan.nextInt();
        devices = new Device[tc];
        for (int i = 0; i < tc; i++) {
            scan = new Scanner(System.in);
            System.out.println("What is the device name?");
            String deviceName = scan.nextLine();
            System.out.println("What is the device type?");
            String deviceType = scan.nextLine();
            devices[i] = new Device(deviceName, deviceType, router);
        }
        for(int i=0; i<tc; i++){
            devices[i].start();
        }

    }
}