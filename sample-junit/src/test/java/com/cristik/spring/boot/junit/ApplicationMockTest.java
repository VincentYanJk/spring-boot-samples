package com.cristik.spring.boot.junit;

import com.cristik.spring.boot.TestConfigurations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by cristik
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@TestConfiguration()
public class ApplicationMockTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void exampleTest() {
        logger.info("this is china");
    }

}