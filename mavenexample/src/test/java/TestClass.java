import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {


    Sample s=new Sample();
    @Test
    public void add() {

        assertEquals(7,s.add(3,4));
    }
    @Test
    public void check(){

        assertEquals("s",s.show());
    }


}