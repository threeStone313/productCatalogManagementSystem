package TCs.basicInfo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_17_VerifyAddAExistedVariantTypesWillGiveAPrompt extends prepare{
  @Test
  public void AddAVariantTypes() {
	  autoMan.getElement(HomePage.addNew).click();
	  autoMan.getElement(basicInfo.variantType).click();
	  autoMan.getElement(basicInfo.addNewInVariantType).click();
	  autoMan.getElement(basicInfo.NewVariantTypeField).sendKeys("charitY");
	  autoMan.getElement(basicInfo.ConfirmOnAddNewVariantType).click();
	  autoMan.textEquals("Variant type exists.", autoMan.getElement(By.xpath("//input[@id='VariantType_Description']/../../p[1]")).getText());
	  autoMan.getElement(basicInfo.CancelOnAddNewVariantType).click();
	  autoMan.sleep(1000);
	  autoMan.getElement(basicInfo.variantType).click();
	  autoMan.getElement(basicInfo.selectVariantType).click();
	  autoMan.getElement(basicInfo.GoInVariantSection).click();
	  autoMan.getElement(basicInfo.addVariant).click();
	  autoMan.getElement(basicInfo.DesignDropDown).click();
	  autoMan.getElement(basicInfo.addNewInDesignDropDown).click();
	  autoMan.getElement(basicInfo.NewVariantTypeValueField).sendKeys("Red");
	  autoMan.getElement(basicInfo.ConfirmOnAddNewVariantType).click();
	  autoMan.textEquals("Variant type value exists.", autoMan.getElement(By.xpath("//input[@id='VariantTypeValue_Description']/../../p[1]")).getText());
  }
}
