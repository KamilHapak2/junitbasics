package pl.com.britenet.junit.junit4;

import org.junit.Before;
import org.junit.Test;
import pl.com.britenet.junit.testbase.Configuration;

import static org.junit.Assume.assumeTrue;

public class TimeConsumingTest {

    @Before
    public void init() {
        assumeTrue(Configuration.isTimeConsumingTestsEnabled());
    }

    @Test
    public void test1() throws Exception {
        Thread.sleep(10000);
    }

    @Test
    public void test2() throws Exception {
        Thread.sleep(10000);
    }

    @Test
    public void test3() throws Exception {
        Thread.sleep(10000);
    }
}
