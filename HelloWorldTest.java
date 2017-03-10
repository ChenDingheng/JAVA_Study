import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017/3/10.
 */
public class HelloWorldTest {
    private HelloWorld helloWorld;
    @Before
    public void setUp() throws Exception {
        helloWorld=new HelloWorld();

    }

    @Test
    public void sayHello() throws Exception {
        assertEquals("Hello",helloWorld.sayHello());

    }

}