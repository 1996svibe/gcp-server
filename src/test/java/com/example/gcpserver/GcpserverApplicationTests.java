package com.example.gcpserver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GcpserverApplicationTests {

    @Test
    void test() {
        Assertions.assertEquals(1+2, 3);
    }

}
