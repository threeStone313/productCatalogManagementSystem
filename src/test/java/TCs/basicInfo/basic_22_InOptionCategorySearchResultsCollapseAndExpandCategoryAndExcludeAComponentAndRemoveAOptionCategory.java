package TCs.basicInfo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_22_InOptionCategorySearchResultsCollapseAndExpandCategoryAndExcludeAComponentAndRemoveAOptionCategory extends prepare{
  @Test
  public void OptionCategorySearchResults() {
	  basicInfo.addNewItem(false, null, true);
	  autoMan.getElement(basicInfo.FilterByOptionCategoryField).sendKeys("Auto07301219");
	  autoMan.getElement(basicInfo.searchFilterButton).click();
	  autoMan.getElement(basicInfo.AddInOptionCategorySearchResults).click();
	  autoMan.getElement(basicInfo.saveButton).click();
	  autoMan.sleep(1000);
	  autoMan.getElement(basicInfo.OptionCategoryExpandIcon).click();
	  autoMan.trueEquals(By.xpath("//table[@class='table table-bordered component-table']/tbody/tr[2][@class='cc-row open']"));
	  autoMan.getElement(basicInfo.OptionCategoryExcludeIcon).click();
	  autoMan.getElement(basicInfo.OptionCategoryIncludeIcon).click();
	  autoMan.trueEquals(By.xpath("//table[@class='table table-bordered component-table']/tbody/tr[2][@class='cc-row open']"));
	  autoMan.getElement(basicInfo.OptionCategoryRemoveIcon).click();
	  autoMan.getElement(basicInfo.saveButton).click();
	  autoMan.textEquals("No Components or Option Categories.",autoMan.getElement(By.xpath("//tr[@class='j_empty']//p")).getText());
  }
}
