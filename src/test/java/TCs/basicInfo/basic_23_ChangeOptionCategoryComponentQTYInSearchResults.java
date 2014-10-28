package TCs.basicInfo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_23_ChangeOptionCategoryComponentQTYInSearchResults extends prepare{
  @Test
  public void changeQTY() {
	  basicInfo.addNewItem(false, null, true);
	  autoMan.getElement(basicInfo.FilterByOptionCategoryField).sendKeys("Auto07301219");
	  autoMan.getElement(basicInfo.searchFilterButton).click();
	  autoMan.getElement(basicInfo.QTYInSearchResults).sendKeys("234567890");
	  autoMan.getElement(basicInfo.AddInOptionCategorySearchResults).click();
	  autoMan.getElement(basicInfo.searchComponentsField).sendKeys("o07301045");
	  autoMan.getElement(basicInfo.searchComponentsButton).click();
	  autoMan.getElement(basicInfo.QTYInSearchResults).sendKeys("987654");
	  autoMan.getElement(basicInfo.AddInOptionCategorySearchResults).click();
	  autoMan.trueEquals(By.xpath("//td[contains(text(),'1987654')]"));
	  autoMan.getElement(basicInfo.OptionCategoryExpandIcon).click();
	  autoMan.trueEquals(By.xpath("//td[contains(text(),'1234567890')]"));
  }
}
