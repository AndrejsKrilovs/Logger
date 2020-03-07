package lv.sda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        try {
            throw new RuntimeException("error");
        } catch (RuntimeException e) {
            log.error("Runtime exception!!!", e);
        }

        log.info("Java7 Maven project!");
        log.debug("Java7 Maven project!");
        log.trace("Java7 Maven project!");
        log.warn("Java7 Maven project!");
    }
}
