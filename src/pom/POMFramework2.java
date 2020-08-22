package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;


public class POMFramework2  implements AutoConstant
{
 
 @FindBy(xpath="(//h4[contains(text(),'Men Analogue Watch')])[1]/../..//span[@class='product-discountedPrice']")
 private WebElement fossilmenimage;
 public POMFramework2(WebDriver driver)
  {
	 PageFactory.initElements(driver, this);
  }
 public void gettheimagePrice()
 {
	 
	 System.out.println(fossilmenimage.getText());
	 System.out.println("operation gets completed");
	 
 }
 
}
