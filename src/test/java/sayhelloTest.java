import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 2/25/14.
 */
public class sayhelloTest {
    @Test
    public void should_say_hello_name(){
        sayhello sh = new sayhello();
        String helloGang = sh.say("Gang");
        assertEquals("helloGang", helloGang);
    }
}
