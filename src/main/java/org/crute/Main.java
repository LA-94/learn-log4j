package org.crute;

import org.apache.log4j.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        int i = 0;
        logger.trace(i + " It is trace\n");
        logger.debug(i + " It is debug\n");
        logger.info(i + " It is info\n");
        logger.warn(i + " It is warn\n");
        logger.error(i + " It is error\n");
        logger.fatal(i + " It is fatal\n");
        new Super().hello();

    }

    private static class Super {
        public void hello() {
            logger.fatal("HELLO");
            int i = 1;
            logger.trace(i + " It is trace\n");
            logger.debug(i + " It is debug\n");
            logger.info(i + " It is info\n");
            logger.warn(i + " It is warn\n");
            logger.error(i + " It is error\n");
            logger.fatal(i + " It is fatal\n");

        }
    }
}
