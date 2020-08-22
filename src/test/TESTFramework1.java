
package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.AutoConstant;
import generics.BaseTest;
import pom.POMFramework;
import pom.POMFramework1;

public class TESTFramework1 extends BaseTest
{
	 @Test
	 public void signupfacebook() throws IOException
	 {
		 POMFramework1 f1=new POMFramework1(driver);
		 f1.signupfacebook();
	 }
}
 
