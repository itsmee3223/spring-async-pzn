package belajar.spring.async;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@Slf4j
@SpringBootTest
public class ScheduleTest {
    @Autowired
    private Job job;

    @Test
    void scheduleJob() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        Assertions.assertEquals(2L, job.getValue());
    }
}
