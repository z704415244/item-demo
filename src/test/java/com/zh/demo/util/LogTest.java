package com.zh.demo.util;

import com.zh.demo.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class LogTest {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void print() {
        log.info("info");
        log.error("error");
    }
}
