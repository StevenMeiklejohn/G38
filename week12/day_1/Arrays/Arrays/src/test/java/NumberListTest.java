import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    private NumberList myNumbers;

    @Before
    public void before(){
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        testNumbers.add(5);
        myNumbers = new NumberList(testNumbers);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(5, myNumbers.getNumberCount());
    }

    @Test
    public void canAddNumberToList(){
        myNumbers.addNumber(12);
        assertEquals(6, myNumbers.getNumberCount());
    }

    @Test
    public void canGetFirstNumber(){
        myNumbers.addNumber(12);
        assertEquals(1, myNumbers.getNumberAtIndex(0));
    }

    @Test
    public void canGetTotal(){
        myNumbers.addNumber(1);
        myNumbers.addNumber(2);
        myNumbers.addNumber(3);
        myNumbers.addNumber(4);
        myNumbers.addNumber(5);
        assertEquals(30, myNumbers.getTotal());

    }
}
