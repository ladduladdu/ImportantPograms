package Tests;
import org.testng.Assert;
import org.testng.annotations.Test;
public class myTest 
{
@Test(retryAnalyzer=javaProggrams.RetryAnalyzer.class)
public void testt1()
{
	Assert.assertEquals(false, true);
}
@Test
public void testt2()
{
	Assert.assertEquals(false, true);
}	
@Test
public void testt3()
{
	Assert.assertEquals(true, true);
}
}
