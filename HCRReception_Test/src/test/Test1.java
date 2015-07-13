package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.HCR.Client.TestNGListeners;

//@Listeners(Utility.HCR.Client.TestNGListeners.class)
@Listeners(Utility.HCR.Client.TestNGListener.class)
public class Test1 extends TestNGListeners{

	@Test
	public void testM1(){
		
		Assert.assertEquals(1, 1);
		
	}
	
	@Test
	public void testM2(){
		
		Assert.assertEquals(1, 2);
	}
	
	@Test(skipFailedInvocations=true)
	public void testM3(){
		
		Assert.assertEquals(1, 2);
	}
}
