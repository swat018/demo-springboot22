package me.swat018.demospringboot22;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyConfigTest {

    @Autowired
    MyConfig myConfig;

    @Test
    void myBean() {
        System.out.println(myConfig.myBean());
        System.out.println(myConfig.myBean());
        System.out.println(myConfig.myBean());
        System.out.println(myConfig.myBean());
        System.out.println(myConfig.myBean());
        System.out.println(myConfig.myBean());
    }

}