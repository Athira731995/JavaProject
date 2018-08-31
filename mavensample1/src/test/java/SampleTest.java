import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SampleTest {

    SampleClass s;
    @Test
    public void testAdd(){

        Assert.assertEquals(8,s.add(3,5));

    }

    @Before
    public void test(){


    s=new SampleClass();


    }





}
