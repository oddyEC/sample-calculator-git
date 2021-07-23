package ec.edu.epn.git.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;
    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }
    @Before
    public void setUp() {
        System.out.println("setUp()");
        c = new Calculator();
    }
    @Test
    public void given_two_integers_when_add_then_ok(){
        System.out.println("Test 1");
        assertEquals(9, c.addition(6,3));
    }
    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        System.out.println("Test 2");
        assertEquals(2, c.substraction(9,7));
    }
    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception() {
        System.out.println("Test 3");
        assertEquals(1,c.division(1,0),0);
    }
    @Test(timeout = 150)
    public void given_a_time_when_timeout_then_exception(){
        System.out.println("Test 4");
        c.timeout(100);
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setAnswer(0);
    }
    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }
}