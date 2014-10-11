package TCs.Home;

import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.prepare;

public class Search_04_DisplayTheSearchResultForTheComponentMatchedToTheVendorAndStatusAndPrimaryCategoryAndSecondaryCategory extends prepare{
  @Test
  public void resultMatching() {
	  autoMan.getElement(HomePage.valueBox).click();
	  autoMan.getElement(HomePage.selectValueOfVendor).click();
	  autoMan.getElement(HomePage.firstPlus).click();
	  autoMan.getElement(HomePage.filterList2).click();
	  autoMan.getElement(HomePage.listOfstatus2).click();
	  autoMan.getElement(HomePage.valueBox2).click();
	  autoMan.getElement(HomePage.selectValueOfstatus).click();
	  autoMan.getElement(HomePage.firstPlus).click();
	  autoMan.getElement(HomePage.filterList3).click();
	  autoMan.getElement(HomePage.listOfprimary).click();
	  autoMan.getElement(HomePage.valueBox3).click();
	  autoMan.getElement(HomePage.selectValueOfprimary).click();
	  autoMan.getElement(HomePage.firstPlus).click();
	  autoMan.getElement(HomePage.filterList4).click();
	  autoMan.getElement(HomePage.listOfsecondary).click();
	  autoMan.getElement(HomePage.valueBox4).click();
	  autoMan.getElement(HomePage.selectValueOfsecondary).click();
	  autoMan.getElement(HomePage.searchButton2).click();
	  autoMan.textEquals("5829", autoMan.getElement(HomePage.resultProdId).getText());
	 
  }
}
