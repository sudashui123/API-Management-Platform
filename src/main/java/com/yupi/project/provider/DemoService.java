package com.yupi.project.provider;

import java.util.concurrent.CompletableFuture;

public interface DemoService {
    String sayHello(String name);
    String sayHello2(String name);
    default CompletableFuture<String> sayhalleoAsync(String name){
        return CompletableFuture.completedFuture(sayHello(name));
    }
}
