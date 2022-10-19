package lab6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Lab6Test {
  @Test
  public void testAdd() {
    int result = Lab6.add(1, 2);
    System.out.println(result);
    assertEquals(2, result);
    // assertTrue(true);
  }
}