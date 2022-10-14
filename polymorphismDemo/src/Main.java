import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<BaseLogger> loggers=new ArrayList<>();
            loggers.add(new DatabaseLogger());
            loggers.add(new FileLogger());

        CustomerManager customerManager= new CustomerManager(loggers);
        customerManager.add();




//        BaseLogger[] loggers = new BaseLogger[]{new ConsoleLogger(), new FileLogger(), new EmailLogger(), new DatabaseLogger()};
//        for (BaseLogger logger : loggers) {
//            logger.log("log message");
//
//        }
    }
}