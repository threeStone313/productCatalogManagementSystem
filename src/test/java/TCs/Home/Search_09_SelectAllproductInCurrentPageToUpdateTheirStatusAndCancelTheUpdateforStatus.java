package TCs.Home;

import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.prepare;

public class Search_09_SelectAllproductInCurrentPageToUpdateTheirStatusAndCancelTheUpdateforStatus extends prepare{
  @Test
  public void updateStatus() {
	  autoMan.SQLconnect("update [PCM_TEST].[dbo].[Product] set ProductStatusId=1 where ProductID=5856;update [PCM_TEST].[dbo].[Product] set ProductStatusId=3 where ProductID=5857 ;update [PCM_TEST].[dbo].[Product] set ProductStatusId=4 where ProductID=5858");
	  HomePage.searchByInput("Auto07281036");
	  autoMan.getElement(HomePage.updateStatus).click();
	  autoMan.textEquals("please select at least one product!", autoMan.getElement(HomePage.tipsOnPopUp).getText());
	  autoMan.getElement(HomePage.confirmOnPopUp).click();
	  autoMan.sleep(1000);
	  autoMan.getElement(HomePage.selectAll).click();
	  autoMan.getElement(HomePage.updateStatus).click();
	  autoMan.getElement(HomePage.statusBox).click();
	  autoMan.getElement(HomePage.selectStatus).click();
	  autoMan.getElement(HomePage.confirmOnPopUp).click();
	  autoMan.sleep(1000);
	  autoMan.textEquals("Live",autoMan.getElement(HomePage.productStatus).getText());
	  autoMan.getElement(HomePage.updateStatus).click();
	  autoMan.getElement(HomePage.cancelOnPopUp).click();
	  autoMan.sleep(1000);
	  autoMan.textEquals("Live",autoMan.getElement(HomePage.productStatus).getText());
	  
	  
  }
}
