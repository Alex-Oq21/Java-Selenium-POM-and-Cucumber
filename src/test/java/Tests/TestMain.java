package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMain {
    @BeforeEach
    public void beforeScenario(){

    }

    @Test
    public void testA(){
        System.out.println("Tes A");
    }

    @Test
    public void testB(){
        System.out.println("Test B");
    }

    @Test
    public void testC(){
        System.out.println("Test C");
    }

    @AfterEach
    public void afterScenario(){

    }

}
