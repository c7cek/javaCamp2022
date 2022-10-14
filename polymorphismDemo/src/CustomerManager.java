import javax.xml.crypto.Data;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;


public class CustomerManager {
    private List<BaseLogger> loggers;

    public CustomerManager(List<BaseLogger> loggers) {
//        AtomicReference<Integer> b = new AtomicReference<>();
//        this.loggers = loggers;
//        loggers.forEach(a -> {
//            a.log("Log message :");
//            b.set(5);
//        });
        for (BaseLogger a : loggers) {
            a.log("Log message :");
        }


    }

    public void add() {
        System.out.println("Customer added");

    }

}
