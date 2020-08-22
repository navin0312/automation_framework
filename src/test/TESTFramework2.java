package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMFramework2;

public class TESTFramework2 extends BaseTest
{
 @Test
 public void getthePrice()
 {
	 POMFramework2 f=new POMFramework2(driver);
	 f.gettheimagePrice();
 }
}
