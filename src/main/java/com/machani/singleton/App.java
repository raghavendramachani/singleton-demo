package com.machani.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){

        // eagerly initialized singleton
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        IvoryTower ivoryTower2 = IvoryTower.getInstance();
        LOGGER.info("ivoryTower1={}", ivoryTower1);
        LOGGER.info("ivoryTower2={}", ivoryTower2);

        // enum singleton
        EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
        LOGGER.info("enumIvoryTower1={}",enumIvoryTower1);
        LOGGER.info("enumIvoryTower2={}",enumIvoryTower2);

        // double checked locking
        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking1 = ThreadSafeDoubleCheckLocking.getInstance();
        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking2 = ThreadSafeDoubleCheckLocking.getInstance();
        LOGGER.info("threadSafeDoubleCheckLocking1={}", threadSafeDoubleCheckLocking1);
        LOGGER.info("threadSafeDoubleCheckLocking2={}", threadSafeDoubleCheckLocking2);
        System.out.println(String.format("First Items is %s1 and Second items is %s2", "FIRST", "SECOND"));

    }
}
