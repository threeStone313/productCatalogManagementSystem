package TCs.Home;

import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class Search_08_ClickingEditButtonWillOpenAEditProductModal extends prepare{
  @Test
  public void openEditModal() {
	  autoMan.getElement(HomePage.searchButton1).click();
	  autoMan.getElements(HomePage.editIcon,0).click();
	  autoMan.textEquals("Edit Product/Component",autoMan.getElement(basicInfo.header1).getText());
  }
}
