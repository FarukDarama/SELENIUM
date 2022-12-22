package day05_Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {
    @Before
    public void setup(){
        System.out.println("Her Test Methodundan once calısır");
    }
    @After
    public void tearDown(){
        System.out.println("Her Test Methodundan sonra çalısır");
    }

    @Test
    public void test01(){
        System.out.println("İlk test");
    }
    @Test
    public void test02(){
        System.out.println("İkinci test");
    }
}
