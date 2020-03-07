package lv.sda.cuncurrency;

import lv.sda.repository.Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StopWatchThread extends Thread {
    private final static Logger log = LoggerFactory.getLogger(Application.class);
    private String name;

    public StopWatchThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                log.info(String.format("prefix: %d", i));
                Thread.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
