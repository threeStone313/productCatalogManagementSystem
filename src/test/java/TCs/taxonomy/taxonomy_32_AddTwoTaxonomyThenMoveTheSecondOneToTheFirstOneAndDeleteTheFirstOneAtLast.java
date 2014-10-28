package TCs.taxonomy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.prepare;
import basePrepare.taxonomy;

public class taxonomy_32_AddTwoTaxonomyThenMoveTheSecondOneToTheFirstOneAndDeleteTheFirstOneAtLast extends prepare{
  @Test
  public void f() {
	  autoMan.SQLconnect("Delete from Category where Description like 'CTC190%'");
	  autoMan.getUrl("http://pcm.theknot.com/api/basicdata/resetall");
	  autoMan.sleep(3000);
	  autoMan.getElement(taxonomy.taxonomyTab).click();
	  autoMan.rightClick(taxonomy.taxonomyName1);
	  autoMan.getElement(taxonomy.addAfterRightClick).click();
	  autoMan.getElement(taxonomy.catagoryNameField).sendKeys("CTC19001");
	  autoMan.getElement(taxonomy.catagoryCodeField).sendKeys("CCTC19001");
	  autoMan.getElement(taxonomy.confirmOnModal).click();
	  autoMan.sleep(1000);
	  autoMan.rightClick(taxonomy.taxonomyName1);
	  autoMan.getElement(taxonomy.addAfterRightClick).click();
	  autoMan.getElement(taxonomy.catagoryNameField).sendKeys("CTC19002");
	  autoMan.getElement(taxonomy.catagoryCodeField).sendKeys("CCTC19002");
	  autoMan.getElement(taxonomy.confirmOnModal).click();
	  autoMan.sleep(1000);
	  autoMan.rightClick(By.xpath("//span[text()='CTC19002']"));
	  autoMan.getElement(taxonomy.editAfterRightClick).click();
	  autoMan.getElement(taxonomy.catagoryNameField).clear();
	  autoMan.getElement(taxonomy.catagoryNameField).sendKeys("CTC19002Updated");
	  autoMan.getElement(taxonomy.catagoryCodeField).clear();
	  autoMan.getElement(taxonomy.catagoryCodeField).sendKeys("CCTC19002Updated");
	  autoMan.getElement(By.xpath("//div[@id='Taxonomy_ParentCategoryId']//span[text()='CTC19001']")).click();
	  autoMan.getElement(taxonomy.confirmOnModal).click();
	  autoMan.getElement(taxonomy.searchField).sendKeys("CTC19002Updated");
	  autoMan.getElement(taxonomy.goSearchButton).click();
	  autoMan.rightClick(By.xpath("//span[text()='CTC19001']"));
	  autoMan.getElement(taxonomy.delAfterRightClick).click();
	  autoMan.getElement(taxonomy.confirmToDelete).click();
	  autoMan.sleep(1000);
	  autoMan.getElement(taxonomy.searchField).clear();
	  autoMan.getElement(taxonomy.searchField).sendKeys("CTC19001");
	  autoMan.getElement(taxonomy.goSearchButton).click();
	  autoMan.trueEquals(By.xpath("//div[text()='Find no result.']"));
	  
  }
}
