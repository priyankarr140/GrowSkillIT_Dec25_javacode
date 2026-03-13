package testcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer{

	static int count=2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count>0)
		{
			count--;
			return true;
		}
		else
		return false;
	}

}
