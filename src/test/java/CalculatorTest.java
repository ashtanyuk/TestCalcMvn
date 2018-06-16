import static org.junit.Assert.*;

/**
 * Created by anton on 24.01.18.
 */
public class CalculatorTest {
    @org.junit.Test
    public void add() throws Exception {
        assertEquals(4,Calculator.add(2,2));
    }

    @org.junit.Test
    public void sub() throws Exception {
        assertEquals(0,Calculator.sub(2,2));

    }

    @org.junit.Test
    public void mul() throws Exception {
        assertEquals(4,Calculator.mul(2,2));

    }

    @org.junit.Test
    public void div() throws Exception {
        assertEquals(1,Calculator.div(2,2));

    }
    
    @org.junit.Test (timeout = 10)
    public void divTime() throws Exception {
        int z;
        for(int i =0; i<10; i++) {
            z = Calc.div(1 * i, 1);
            System.out.println(z);
        }
    }

}
