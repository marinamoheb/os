import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public static void printAndLog(String msg){
        System.out.println(msg);
        try(FileWriter writer = new FileWriter("logs.txt", true)) {
            writer.append(msg).append(String.valueOf('\n'));
        }catch (IOException e){
            //
        }
    }
}
