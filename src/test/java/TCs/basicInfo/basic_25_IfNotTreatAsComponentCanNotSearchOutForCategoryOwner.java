package TCs.basicInfo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_25_IfNotTreatAsComponentCanNotSearchOutForCategoryOwner extends prepare{
  @Test
  public void NotTreatAsComponent() {
	  autoMan.getElement(HomePage.addNew).click();
	  autoMan.getElement(basicInfo.PersField).click();
	  autoMan.getElement(basicInfo.selectPers).click();
	  autoMan.getElement(basicInfo.searchComponentsField).sendKeys("5939");
	  autoMan.getElement(basicInfo.searchComponentsButton).click();
	  autoMan.trueEquals(By.xpath("//p[contains(text(),'We could not find any match')]"));
  }
}
