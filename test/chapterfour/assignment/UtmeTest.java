package chapterfour.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtmeTest {

    @Test
    public void copies1to4Test(){
        Utme jambTest = new Utme();
        int copies = jambTest.testDriller(10);
        assertEquals(16000,copies);

    }
    @Test
    public void copies5To9Test(){
        Utme jambTest = new Utme();
        int copies = jambTest.testDriller(5);
        assertEquals(9000,copies);
    }
    @Test
    public void copies10To29Test(){
        Utme jambTest = new Utme();
        int copies = jambTest.testDriller(10);
        assertEquals(16000,copies);
    }
    @Test
    public void copies30To49Test(){
        Utme jambTest = new Utme();
        int copies = jambTest.testDriller(32);
        assertEquals(48000,copies);
    }
    @Test
    public void copies50To99Test(){
        Utme jambTest = new Utme();
        int copies = jambTest.testDriller(52);
        assertEquals(67600,copies);
    }
    @Test
    public  void copies100To199Test(){
        Utme jambTest = new Utme();
        int copies = jambTest.testDriller(110);
        assertEquals(132000,copies);
    }
    @Test
    public void copies200To499Test(){
        Utme jambTest = new Utme();
        int copies = jambTest.testDriller(200);
        assertEquals(220000,copies);
    }
    @Test
    public void copies500AndAboveTest(){
        Utme jambTest = new Utme();
        int copies = jambTest.testDriller(599);
        assertEquals(599000,copies);


    }
}