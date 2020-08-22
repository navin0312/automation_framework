package pom;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;
public class POMFramework1  extends BasePage  implements AutoConstant
{
 @FindBy(xpath="//input[@name='firstname']")
 private WebElement firstnameTextfield;
 @FindBy(xpath="//input[@name='lastname']")
 private WebElement surnameTextfield;
 @FindBy(xpath="//input[@aria-label='Mobile number or email address']")
 private WebElement mobilenooremailTextfield;
 @FindBy(xpath="//input[@aria-label='New password']")
 private WebElement newpasswordTextfield;
 @FindBy(id="day")
 private WebElement dayDropDownList;
 @FindBy(id="month")
 private WebElement monthDropDownList;
 @FindBy(id="year")
 private WebElement yearDropDownList;
 @FindBy(xpath="(//input[@type='radio'])[1]")
 private WebElement femaleRadioButton;
 @FindBy(xpath="(//input[@type='radio'])[2]")
 private WebElement maleRadioButton;
 @FindBy(xpath="(//input[@type='radio'])[3]")
 private WebElement customeRadioButton;
 @FindBy(id="js_1ue")
 private WebElement pronunDropDownList;
 @FindBy(xpath="(//button[@type='submit'])[1]")
 private WebElement signupButton;
 public POMFramework1(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void signupfacebook() throws IOException
 {
	 firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 0));
	
	 surnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 1));
	
	 mobilenooremailTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 2));
	
	 newpasswordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 4));
	 
	 
	 selectbyvisibletext(dayDropDownList, "15");
	 
	 selectbyvisibletext(monthDropDownList, "Aug");
	 
	 selectbyvisibletext(yearDropDownList, "2003");
	 
	 maleRadioButton.click();
	 
	 signupButton.click();
	 
	 System.out.println("account get successfully created");
	 
 }
}
