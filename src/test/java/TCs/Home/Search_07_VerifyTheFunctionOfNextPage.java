package TCs.Home;

import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.prepare;
public class Search_07_VerifyTheFunctionOfNextPage extends prepare{
  @Test
  public void nextPage() {
	  autoMan.getElement(HomePage.searchButton1).click();
	  autoMan.getElement(HomePage.pageOfTwo).click();
	  autoMan.textEquals("Showing 1 - 40 of 18709",autoMan.getElement(HomePage.resultTips).getText() );
  }
}
