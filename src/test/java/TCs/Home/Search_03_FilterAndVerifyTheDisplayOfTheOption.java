package TCs.Home;

import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.prepare;

public class Search_03_FilterAndVerifyTheDisplayOfTheOption extends prepare{
  @Test
  public void verifyTheFilter() {
	  autoMan.getElement(HomePage.filterList).click();
	  autoMan.getElement(HomePage.listOfstatus).click();
	  autoMan.getElement(HomePage.valueBox).click();
	  autoMan.trueEquals(HomePage.textInValueBox);
	  
  }
}
