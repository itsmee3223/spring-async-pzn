package belajar.spring.async;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Slf4j
@Component
public class HelloAsync {

    @Async
    @SneakyThrows
    public void hello(){
        Thread.sleep(Duration.ofSeconds(2));
        log.info("run hello after 2 seconds : {}", Thread.currentThread());
    }

    @Async
    @SneakyThrows
    public Future<String> helloFuture(final String name){
        CompletableFuture<String> future = new CompletableFuture<>();
        Thread.sleep(Duration.ofSeconds(2));
        future.complete("Hello " + name  + " from thread " + Thread.currentThread());
        return future;
    }
}
