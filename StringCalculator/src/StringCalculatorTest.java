
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
@Test 
public void twonumber() {
	Assert.assertEquals(3,StringCalculator.Add("1,2"));
	Assert.assertEquals(4,StringCalculator.Add("1,3"));
	Assert.assertEquals(2,StringCalculator.Add("1,1"));
}
@Test
public void threenumbers() {
	Assert.assertEquals(6,StringCalculator.Add("1,2,3"));
	Assert.assertEquals(3,StringCalculator.Add("1,1,1"));
	Assert.assertEquals(1,StringCalculator.Add("1,0,0"));
}
}
