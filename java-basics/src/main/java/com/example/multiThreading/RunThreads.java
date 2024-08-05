package com.example.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunThreads {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        // Thread pool will close threads after all jobs are done
        threadPool.execute(() -> runJob("Job 1"));
        threadPool.execute(() -> runJob("Job 2"));

        // We need to close the thread pool, so that
        // the pool can empty its job queue and shut down all of its threads to free up system resources.
        // Alternatively, we can use try with resources to automatically close the thread pool.
        // After shutdown, the thread pool will not accept any new jobs.
        threadPool.shutdown();
    }

    private static void runJob(String jobName) {
        for (int i = 0; i < 25; i++) {
            System.out.println("Running " + jobName + " in thread " + Thread.currentThread().getName());
        }
    }
}
