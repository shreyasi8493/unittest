import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdditionTest {

  Addition myAddition = new Addition(10,15);

  @Test
  public void testGetSum() {
    assertEquals(25,myAddition.getSum());
  }

  @Test
  public void testNum1() {
    assertEquals(10, myAddition.num1);
  }

  @Test
  public void testNum2() {
    assertEquals(15, myAddition.num2);
  }

}
