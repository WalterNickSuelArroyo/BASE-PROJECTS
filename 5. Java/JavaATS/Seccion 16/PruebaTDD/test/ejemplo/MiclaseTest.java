
package ejemplo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MiclaseTest {
    public MiclaseTest() {
    }
    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
    }
    @Test
    public void testNumero_mayor_caso1() {
        System.out.println("numero_mayor");
          int a = 5;
          int b = 3;
          int c = 7;
          Miclase instance = new Miclase();
          int expResult = 7;
          int result = instance.numero_mayor(a, b, c);
          assertEquals(expResult, result);
    }
    @Test
    public void testNumero_mayor_caso2() {        
        int a = 5;
        int b = 3;
        int c = 4;
        Miclase instance = new Miclase();
        int expResult = 5;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testNumero_mayor_caso3() {        
        int a = 5;
        int b = 7;
        int c = 6;
        Miclase instance = new Miclase();
        int expResult = 7;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testNumero_mayor_caso4() {        
        int a = 5;
        int b = 7;
        int c = 9;
        Miclase instance = new Miclase();
        int expResult = 9;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);        
    }
}


