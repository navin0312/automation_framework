
package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POMFramework extends BasePage  implements AutoConstant
{
 @FindBy(xpath="(//input[@type='text'])[1]")
 private WebElement firstnameTextfield;
 @FindBy(xpath="(//input[@type='text'])[2]")
 private WebElement lastnameTextfield;
 @FindBy(xpath="(//input[@type='text'])[3]")
 private WebElement usernameTextfield;
 @FindBy(xpath="//input[@type='password']")
 private WebElement passwordTextfield;
 @FindBy(xpath="(//input[@type='text'])[4]")
 private WebElement emailIdTextfield;
 @FindBy(xpath="//input[@type='radio'][1]")
 private WebElement maleRadioButton;
 @FindBy(xpath="//input[@type='radio'][2]")
 private WebElement femaleRadioButton;
 @FindBy(xpath="//input[@type='checkbox']")
 private WebElement remembermeCheckBox;
 @FindBy(xpath="//select[@name='countrycode']")
 private WebElement countrycodeDropDownLst;
 @FindBy(xpath="(//input[@type='text'])[5]")
 private WebElement mobilenoTextfield;
 @FindBy(xpath="//textarea[.='']")
 private WebElement addressTextArea;
 @FindBy(xpath="//input[@type='button']")
 private WebElement saveButton;
 public POMFramework(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void enterDetails() throws IOException
 {
	 firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheetname,1,0));
	 
	 lastnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1,1));
	 
	 usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 2));
	 
	 passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 3));
	 
	 emailIdTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 4));
	 
	 maleRadioButton.click();
	 
	 remembermeCheckBox.click();
	 
	 selectbyvisibletext(countrycodeDropDownLst,"+91");
	 
	 mobilenoTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname,1,5));
	 
	 addressTextArea.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname,1,6));
	 
	 saveButton.click();
	 
	 System.out.println("it clicked on save button");
 }
}