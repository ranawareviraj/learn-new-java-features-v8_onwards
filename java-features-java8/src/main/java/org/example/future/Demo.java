package org.example.future;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertTrue;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        LocalDateTime start = LocalDateTime.now();

        CompletableFuture<String> future1
                = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hello";
        });

        CompletableFuture<String> future2
                = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Beautiful";
        });

        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(() ->
        {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "World";
        });

        CompletableFuture<String> future4
                = CompletableFuture.supplyAsync(() ->
        {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "World";
        });

        CompletableFuture<Void> combinedFuture
                = CompletableFuture.allOf(future1, future2, future3, future4);

        combinedFuture.get();
        System.out.println("All tasks completed in: " + (LocalDateTime.now().getSecond() - start.getSecond()) + " seconds");
        assertTrue(future1.isDone());
        assertTrue(future2.isDone());
        assertTrue(future3.isDone());
    }
}
