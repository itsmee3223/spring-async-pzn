package belajar.spring.async;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@Slf4j
@SpringBootTest
public class HelloAsyncTest {
    @Autowired
    private HelloAsync helloAsync;

    @Test
    void helloAsync() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            helloAsync.hello();
            log.info("running hello {}", i);
        }

        log.info("after call hello async");
        Thread.sleep(Duration.ofSeconds(2));
    }
}
