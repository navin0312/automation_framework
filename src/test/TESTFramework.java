package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMFramework;

public class TESTFramework extends BaseTest 
{
 @Test
 public void navin() throws IOException 
 {
	 POMFramework f=new POMFramework(driver);
	 f.enterDetails();
 }
}
