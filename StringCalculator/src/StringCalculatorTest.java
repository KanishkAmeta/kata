
import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
@Test
public void Stringempty() {
	Assert.assertEquals(0,StringCalculator.Add("")); //inputs empty string
}
@Test
public void onenumber() {
	Assert.assertEquals(1,StringCalculator.Add("1")); // inputs single integer in string
}
}
