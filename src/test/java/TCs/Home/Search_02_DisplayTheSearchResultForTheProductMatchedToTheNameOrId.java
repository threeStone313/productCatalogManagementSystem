package TCs.Home;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.prepare;

public class Search_02_DisplayTheSearchResultForTheProductMatchedToTheNameOrId extends prepare {
  @Test
  public void SearchResult() {
	  HomePage.searchByInput("to2014072318");
	  autoMan.textEquals("5826",autoMan.getElement(HomePage.resultProdId).getText());
	  autoMan.getElement(By.id("searchByNameOrId")).clear();
	  HomePage.searchByInput("5582");
	autoMan.textEquals("Auto07101811\n11",autoMan.getElement(HomePage.resultName).getText());
  }
}

