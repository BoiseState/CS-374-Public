package week4.w4_test;
import static org.junit.Assert.*;

import org.junit.Test;
import week4.w4_code.Person;

public class PersonTest {

    @Test
    public void test1() {
        Person p1 = new Person("Chris");
        p1.addKgs(81);
        assertTrue(p1.getWeight() == 81);
    }

    @Test
    public void test2() {
        Person p1 = new Person("Chris");
        p1.addKgs(-81);
        assertTrue(p1.getWeight() == 0);
    }
}
