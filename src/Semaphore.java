public class Semaphore {
    protected int value = 0 ;
    protected Semaphore(int initial) { value = initial ; }
    public synchronized void P() {
        value-- ;
        if (value < 0) {
            try {
                Logger.printAndLog("Waiting");
                wait();
            } catch (InterruptedException e) {
                Logger.printAndLog("Interruption Exception");
            }
        }
    }
    public synchronized void V() {
        value++ ;
        if (value <= 0) {
            Logger.printAndLog("Continued");
            notify() ;
        }
    }
}