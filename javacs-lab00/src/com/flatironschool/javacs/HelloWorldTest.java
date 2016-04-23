package com.flatironschool.javacs;

import static org.junit.Assert.assertTrue;

/**
 * Created by pletcher on 3/10/16.
 */
public class HelloWorldTest {

    @org.junit.Test
    public void testGetVersion() throws Exception {
        HelloWorld main = new HelloWorld();
        //System.out.println(main.getVersion());
        Double ver = main.getVersion();
        //System.out.println(ver);
        //System.out.println(1.8);
        assertTrue(ver >= 1.7);
    }
}
