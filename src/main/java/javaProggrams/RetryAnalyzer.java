package javaProggrams;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class RetryAnalyzer implements IRetryAnalyzer
	{
		int counter=0;
		int maxcount=3;
		public  boolean retry(ITestResult result)
		{
			if (counter<maxcount) 
			{
				counter++;
				return true;
			}
			return false;
		}
		}

