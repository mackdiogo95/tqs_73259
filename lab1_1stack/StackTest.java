import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;


public abstract class StackTest {
    public Stack s;

    private Stack stackTest;

    @BeforeEach
    public void setUp(int size){
        this.stackTest = new Stack(size);
    }

    @AfterEach
    public void tearDown() {
        this.stackTest = null;
    }

    // a)
    @Test
    @DisplayName("Tests if the the stack is empty on construction")
    public void testNewStackIsEmpty() {
        assertTrue(s.isEmpty());
    }

    // b)
    @Test
    @DisplayName("Tests if the stack has size 0 on construction")
    public void  testsNewStackSizeZero() {
        assertEquals(s.size(), 0);
    }


    // c)
    @Test
    @DisplayName("N pushes to an empty stack, the stack is not empty and its size is n")
    public void testPushes() {
        int n = 10;
        for (int i =  0 ; i < n ; i++) {
            s.push("smt");
        }
        assertFalse(s.isEmpty());
        assertEquals(s.size(), n);
    }


    // d)
    @Test
    @DisplayName("Tests pushing and them popping an element")
    public void testPushAndPop() {
        String elem = "smt";
        s.push(elem);
        assertEquals(s.pop(), elem);
    }

    // e)
    @Test
    @DisplayName("Tests if the stack pushing an element and then peeking")
    public void testPushAndPeek() {
        String elem = "smt";
        s.push(elem);
        int size = s.size();
        assertEquals(s.peek(), elem);
        assertEquals(s.size(), size);
    }


    // f)
    @Test
    @DisplayName("Tests popping every element of the stack")
    public void testAfterNPops() {

        int size = s.size();

        for (int i = 0; i < size; i++) {
            s.pop();
        }
        assertTrue(s.isEmpty());
        assertEquals(s.size(), 0);
    }

    // g)
    @Test(expected = NoSuchElementException.class)
    @DisplayName("Tests throw of exception after poping on empty stack")
    public void testPopOnEmptyStack() {
        assertTrue(s.isEmpty());
        s.pop();
    }
    // h)
    @Test(expected = NoSuchElementException.class)
    @DisplayName("Tests throw of exception after peeking on empty stack")
    public void testPeekOnEmptyStack() {
        assertTrue(s.isEmpty());
        s.peek();
    }

}

// Ex 2d
// Se user add 1 elem que ainda lá não está deve armazenar
// Devemos receber uma exceção ao add 1 elem mais que uma vez
// Testar size
// Testar func intersect either true ou false se tiverem ou não elementos em comum