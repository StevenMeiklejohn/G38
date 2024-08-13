import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before(){
        person = new Person("Dierdre Barlow", "G38");
    }

    @Test
    public void hasName(){
        assertEquals("Dierdre Barlow", person.getName());
    }
}
