package com.machani.singleton;

public final class ThreadSafeDoubleCheckLocking {

    private static volatile ThreadSafeDoubleCheckLocking instance;

    private ThreadSafeDoubleCheckLocking(){
        // to prevent instantiating by Reflection call
        if (instance != null)
            throw new IllegalStateException("Already Initiated.");
    }

    public static ThreadSafeDoubleCheckLocking getInstance(){

        // local variable increases performance by 25 percent
        ThreadSafeDoubleCheckLocking result = instance;

        if (result == null){
            synchronized (ThreadSafeDoubleCheckLocking.class){
                result = instance;
                if (result == null)
                    instance = result = new ThreadSafeDoubleCheckLocking();
            }
        }
        return result;
    }

}
