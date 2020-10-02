
import java.io.Serializable;

public class Singleton{

    private static Singleton s;

    private Singleton () {

    }

    public static Singleton get() throws InterruptedException {
        synchronized (Singleton.class) {
            if (s == null) {
                Thread.sleep(2000);
                s = new Singleton();
            }
        }
        return s;
    }

    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

}