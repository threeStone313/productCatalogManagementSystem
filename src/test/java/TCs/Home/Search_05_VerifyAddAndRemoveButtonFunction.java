package TCs.Home;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.prepare;

public class Search_05_VerifyAddAndRemoveButtonFunction extends prepare{
  @Test
  public void AddAndRemove() {
	  autoMan.getElement(HomePage.firstPlus).click();
	  autoMan.trueEquals(HomePage.secondPlus);
	  int a=autoMan.getElements(By.xpath("//button[@class='btn bbf-add btn-info']")).size();
	  autoMan.getElement(HomePage.firstDel).click();
	  int b=autoMan.getElements(By.xpath("//button[@class='btn bbf-add btn-info']")).size();
	  autoMan.numberEquals(a-1, b);
	 
  }
}
