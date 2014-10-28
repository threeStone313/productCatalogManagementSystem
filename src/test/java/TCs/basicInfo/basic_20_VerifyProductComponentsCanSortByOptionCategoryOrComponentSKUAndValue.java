package TCs.basicInfo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_20_VerifyProductComponentsCanSortByOptionCategoryOrComponentSKUAndValue extends prepare{
  @Test
  public void SortByOptionCategoryOrComponentSKUAndValue() {
	  autoMan.getElement(HomePage.searchBox).sendKeys("Auto07291718");
	  autoMan.getElement(HomePage.searchButton1).click();
	  autoMan.getElement(HomePage.editIcon).click();
	  autoMan.getElement(basicInfo.valueInComponents).click();
	  autoMan.textEquals("BAuto07291742", autoMan.getElement(By.xpath("//table[@class='table table-bordered component-table']//tr[3]/td[3]")).getText());
	  autoMan.getElement(basicInfo.skuInComponents).click();
	  autoMan.textEquals("DCS00012000N", autoMan.getElement(By.xpath("//table[@class='table table-bordered component-table']//tr[3]/td[2]")).getText());
	  autoMan.getElement(basicInfo.optionCategoryInComponents).click();
	  autoMan.textEquals("Auto07291742", autoMan.getElement(By.xpath("//table[@class='table table-bordered component-table']//tr[3]/td[1]")).getText());
  }
}
