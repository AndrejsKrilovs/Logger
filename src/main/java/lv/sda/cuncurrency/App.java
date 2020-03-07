package lv.sda.cuncurrency;

import lv.sda.repository.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private final static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws InterruptedException {
        log.info("Main thread starts");

        for (int i = 0; i < 100; i++) {
            StopWatchThread t = new StopWatchThread("SW"+i);
            t.start();
            log.info(String.format("Thread %s started", t.getName()));
            Thread.sleep((long) (Math.random()*10000));
        }

        log.info("Main thread ends");
    }
}
