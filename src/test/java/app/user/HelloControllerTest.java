package app.user;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloControllerTest {


    @Test
    public void getHello() throws Exception {
        HelloController helloController = new HelloController();
        String result = helloController.index();
        assertEquals(result,"Hello world");
    }
}