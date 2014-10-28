package TCs.basicInfo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.prepare;

public class basic_24_IfAnOptionCategoryWhichIsAttachedToAproductIsDeletedWillNotDisplayThisOptionCategoryInComponentListForThisProduct extends prepare{
  @Test
  public void AnOptionCategoryWhichIsAttachedToAproductIsDeleted() {
	  String sql1="Delete from [PCM_TEST].[dbo].[ProductOptionCategory] where ProductID='5940'; Delete from [PCM_TEST].[dbo].[OptionCategory] where Name = 'Auto07301757'";
	  String sql2="Insert into [PCM_TEST].[dbo].[OptionCategory] (Name,Description,AllowsMultipleSelection) values('Auto07301757','Auto07301757',0)";  
	  String sql3="Insert into [PCM_TEST].[dbo].[ProductOptionCategory] (ProductId,ComponentQuantity,OptionCategoryId) Values(5940,1,(select OptionCategoryID from [PCM_TEST].[dbo].[OptionCategory] where Name = 'Auto07301757'))";
	  autoMan.SQLconnect(sql1);
	  autoMan.SQLconnect(sql2);
	  autoMan.SQLconnect(sql3);
	  autoMan.sleep(3000);
	  autoMan.getElement(HomePage.ComponentTab).click();
	  autoMan.getElement(HomePage.searchFieldInComponentTab).sendKeys("Auto07301757");
	  autoMan.getElement(HomePage.searchButtonInComponentTab).click();
	  autoMan.rightClick(HomePage.OptionCategoryDescription);
	  autoMan.getElement(HomePage.deleteOptionIcon).click();
	  autoMan.getElement(HomePage.confirmInDeleteOption).click();
	  autoMan.sleep(3000);
	  autoMan.getElement(HomePage.HomeTab).click();
	  HomePage.searchByInput("5940");
	  autoMan.getElement(HomePage.editIcon).click();
	  autoMan.textEquals("No Components or Option Categories.",autoMan.getElement(By.xpath("//tr[@class='j_empty']//p")).getText());
  }
}
