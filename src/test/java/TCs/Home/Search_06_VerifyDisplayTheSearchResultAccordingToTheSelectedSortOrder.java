package TCs.Home;

import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.prepare;

public class Search_06_VerifyDisplayTheSearchResultAccordingToTheSelectedSortOrder extends prepare{
  @Test
  public void sortOrder() {
	  autoMan.getElement(HomePage.searchBox).sendKeys("Auto07251257");
	  autoMan.getElement(HomePage.searchButton1).click();
	  autoMan.getElement(HomePage.sortById).click();
	  autoMan.textEquals("5834", autoMan.getElement(HomePage.resultProdId).getText());
	  autoMan.getElement(HomePage.sortByName).click();
	  autoMan.textEquals("AAuto07251257\nAAUTOTEST07251257",autoMan.getElement(HomePage.resultName).getText());
	  autoMan.getElement(HomePage.sortByVendor).click();
	  autoMan.textEquals("vendor-1",autoMan.getElement(HomePage.resultVendor).getText());
  }
}
