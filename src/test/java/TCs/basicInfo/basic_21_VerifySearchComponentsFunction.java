package TCs.basicInfo;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_21_VerifySearchComponentsFunction extends prepare {
  @Test
  public void SearchComponentsFunction () {
	  autoMan.getElement(HomePage.addNew).click();
	  autoMan.getElement(basicInfo.PersField).click();
	  autoMan.getElement(basicInfo.selectPers).click();
	  autoMan.getElement(basicInfo.searchComponentsField).sendKeys("5908");
	  autoMan.getElement(basicInfo.searchComponentsButton).click();
	  autoMan.trueEquals(By.xpath("//*[text()='Auto07301033']"));
	  autoMan.getElement(basicInfo.searchComponentsField).clear();
	  autoMan.getElement(basicInfo.searchComponentsField).sendKeys("o07301045");
	  autoMan.getElement(basicInfo.searchComponentsButton).click();
	  autoMan.trueEquals(By.xpath("//*[text()='Auto07301045']"));
	  autoMan.getElement(basicInfo.filterByComponentType).click();
	  autoMan.getElement(basicInfo.selectMaterialComponentType).click();
	  autoMan.getElement(basicInfo.searchFilterButton).click();
	  Assert.assertEquals(false, autoMan.isTextPresent("td","DCS"));
	  Assert.assertEquals(false, autoMan.isTextPresent("td","ACS"));
	  autoMan.getElement(basicInfo.filterByComponentType).click();
	  autoMan.getElement(basicInfo.selectServiceComponentType).click();
	  autoMan.getElement(basicInfo.searchFilterButton).click();
	  Assert.assertEquals(false, autoMan.isTextPresent("td","DCM"));
	  Assert.assertEquals(false, autoMan.isTextPresent("td","ACM"));
	  autoMan.getElement(basicInfo.filterByComponentType).click();
	  autoMan.getElement(basicInfo.selectNoneComponentType).click();
	  autoMan.getElement(basicInfo.FilterByOptionCategoryField).sendKeys("o07291742");
	  autoMan.getElement(basicInfo.searchFilterButton).click();
	  autoMan.trueEquals(By.xpath("//*[text()='Auto07291742']"));
  }
}
