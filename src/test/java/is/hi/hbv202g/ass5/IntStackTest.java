package is.hi.hbv202g.ass5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntStackTest {
    IntStack stack;

    @Before
    public void createEmptyStack() {
        stack = new IntStack();
    }

    @Test
    public void testFullStackIsFull() {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

}
